package testModel.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
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
 * Last changed: $Id: ComparableTests.java 232 2008-12-16 14:08:50Z baluda $
 */

/**
 * @author mauro
 *
 */
public class ComparableTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//MyCompType explicitly implements Comparable
	@Test
	public void CompType01() {
		new MyCompType().compareTo(new MyCompType());
		assertTrue(testHelper.getOutput().isEmpty());
	}
		
	//CompChild doesn't explicitly implement compareTo()
	@Test
	public void CompType02() {
		new CompChild().compareTo(new CompChild());
		assertTrue(testHelper.getOutput().equals("testModel.CompChild.compareTo is not implemented explicitly"));
	}
	
	//CompChild2 explicitly implements compareTo()
	@Test
	public void CompType03() {
		new CompChild2().compareTo(new CompChild2());
		assertTrue(testHelper.getOutput().isEmpty());
	}	
	
	//MyCompType is <<Comparable>> and implements directly
	//methods equals(Object)
	@Test
	public void CompType04() {
		new MyCompType();
		assertTrue(testHelper.getOutput().isEmpty());
	}	
	
	//MyNonComparable is <<Comparable>> but doesn't implement directly
	//methods equals(Object)
	@Test
	public void CompType05() {
		new MyNonComparable();
		assertTrue(testHelper.getOutput().equals("MyNonComparable doesn't implement the method \"equals(Object)\" directly"));
	}	
}
