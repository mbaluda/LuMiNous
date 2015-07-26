package testModel.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import testModel.MyLanguage;

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
 * Last changed: $Id: NotNullParameterTest.java 193 2008-11-20 19:01:54Z baluda $
 */

/**
 * @author mauro
 *
 */
public class NotNullParameterTest {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//
	@Test
	public void test01() {
		(new MyLanguage()).sendEmail("a@a.it","test","a@a.it");
		
		assertTrue(testHelper.getOutput().isEmpty());
	}	
	
	//
	@Test
	public void test02() {
		(new MyLanguage()).sendEmail("a@a.it",null,"a@a.it");
		
		assertTrue(testHelper.getOutput().equals("Null value detected for parameter named subject"));
	}	
}
