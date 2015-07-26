package testModel.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import testModel.MySequenceType;

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
 * Last changed: $Id: SequenceTests.java 193 2008-11-20 19:01:54Z baluda $
 */

/**
 * @author mauro
 *
 */
public class SequenceTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//MyCompType is Comparable and implements compareTo()
	@Test
	public void Seq01() {
		MySequenceType.method1();
		MySequenceType.method2();
		assertTrue(testHelper.getOutput().isEmpty());
	}
		
	//CompChild is Comparable and doesn't implement compareTo()
	@Test
	public void Seq02() {
		MySequenceType.method2();
		//assertTrue(testHelper.getOutput().equals("class does'n implement directly the method \"int compareTo(Object)\""));
		MySequenceType.method1();
		MySequenceType.method2();
		assertTrue(testHelper.getOutput().isEmpty());
	}
}
