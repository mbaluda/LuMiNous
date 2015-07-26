package testModel.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import testModel.*;

/*******************************************************************************
 * Copyright (c) 2008 - Mauro Baluda.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Mauro Baluda - initial API and implementation
 ********************************************************************************
 *
 * Created: 02/ott/2008 by Mauro Baluda
 * Last changed: $Id: UniqueTests.java 253 2009-01-07 14:50:17Z Jochen $
 */

/**
 * @author mauro
 */
public class UniqueTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//a field of an Immutable-type object is modified by the constructor
	@Test
	public void Unique01() {
		MyUnique u1=new MyUnique(1);
		MyUnique u2=new MyUnique(2);
	    
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//a field of an Immutable-type object is modified by the constructor
	@Test
	public void Unique02() {
		MyUnique u1=new MyUnique(1);
		MyUnique u2=new MyUnique(1);	

		assertTrue(testHelper.getOutput().equals("Assertion violated: unique: trying to add key \"1\" for type class testModel.MyUnique"));
	}
	
	//simple elements with default unique property
	@Test
	public void UniqueAssocHashCodeNoError() {
		AUniqueContainer container = new AUniqueContainer();
		
		container.aUniqueElement.add( new AUniqueElement( 1 ) );
		container.aUniqueElement.add( new AUniqueElement( 2 ) );		

		assertTrue( testHelper.getOutput().isEmpty() );
	}
	
	@Test
	public void UniqueAssocHashCodeWithError() {
		AUniqueContainer container = new AUniqueContainer();
		
		container.aUniqueElement.add( new AUniqueElement( 1 ) );
		container.aUniqueElement.add( new AUniqueElement( 1 ) );
		
		assertFalse( testHelper.getOutput().isEmpty() );
		assertTrue(testHelper.getOutput().equals("unique property violated on AUniqueContainer.aUniqueElement: 1 on 1:1"));

	}
	
	@Test
	public void UniqueAssocIdNoError() {
		Composite composite = new Composite();
		
		composite.children.add( new Leaf() );
		Leaf leaf2 = new Leaf();
		leaf2.setId( "test" );
		composite.children.add( leaf2 );
		
		assertTrue( testHelper.getOutput().isEmpty() );
	}
	
	@Test
	public void UniqueAssocIdWithError() {
		Composite composite = new Composite();
		
		composite.children.add( new Leaf() );
		Leaf leaf2 = new Leaf();
		composite.children.add( leaf2 );
		
		assertFalse( testHelper.getOutput().isEmpty() );		
		assertTrue(testHelper.getOutput().equals("unique property violated on Composite.children: 0 on 0:0"));

	}
	
	@Test
	public void UniqueAssocNestedNoError() {
		Composite c1 = new Composite();
		Composite c2 = new Composite();
		
		c1.children.add( new Leaf() );
		c2.children.add( new Leaf() );
		c2.setId( "Container 2" );
		c1.children.add( c2 );

		assertTrue( testHelper.getOutput().isEmpty() );
	}
	
	@Test
	public void UniqueAssocNestedWithError() {
		Composite c1 = new Composite();
		Composite c2 = new Composite();
		
		c1.children.add( new Leaf() );
		c2.children.add( new Leaf() );
		c2.setId( "Container 2" );
		c1.children.add( c2 );

		assertTrue( testHelper.getOutput().isEmpty() );
		
		c2.children.add( new Composite() );

		assertFalse( testHelper.getOutput().isEmpty() );

	}

}
