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
 * Last changed: $Id: ImmTests.java 193 2008-11-20 19:01:54Z baluda $
 */

/**
 * @author mauro
 */
public class ImmTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//a field of an Immutable-type object is modified by the constructor
	@Test
	public void ImmType01() {
		new MyImmType();
	    
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//a field of an Immutable-type object is modified outside costructors
	@Test
	public void ImmType02() {
		(new MyImmType()).init("");
	    
		assertTrue(testHelper.getOutput().equals("Modifying an <<Immutable>> Object of type MyImmType"));
	}
	
	//a field of an Immutable-type object is modified outside costructors
	@Test
	public void ImmType03() {
		(new MyImmType()).setS("");
		
		assertTrue(testHelper.getOutput().equals("Modifying an <<Immutable>> Object of type MyImmType"));
	}
	
	//a field of an ImmutableInitialized-type object is modified
	//Immutable exception risen
	@Test
	public void ImmInitType01() {
		(new MyImmInitType()).init("");
	    
		assertTrue(testHelper.getOutput().equals("Modifying an <<Immutable>> Object of type MyImmInitType"));
	}
}
