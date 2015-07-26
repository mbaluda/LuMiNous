package testModel.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import testModel.MyNotNullReturn;

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
 * Last changed: $Id: NotNullReturnTest.java 177 2008-11-14 15:07:48Z baluda $
 */

/**
 * @author mauro
 *
 */
public class NotNullReturnTest {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//testModel.MyNotNullReturn.InnerIterator.next() returns null
	//adviced by aspect
	@Test
	public void Inner01() {
		(new MyNotNullReturn()).getFeatureDescriptors().next();
		
		assertTrue(testHelper.getOutput().equals("Null object returned calling MyNotNullReturn.InnerIterator.next"));
	}	
	
	//testModel.MyNotNullReturn.next() returns null
	//not adviced
	@Test
	public void Inner02() {
		(new MyNotNullReturn()).next();
		
		assertTrue(testHelper.getOutput().isEmpty());
	}	
}
