package testModel.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import testModel.sndLevel.*;

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
 * Last changed: $Id: sndLevelImmTests.java 177 2008-11-14 15:07:48Z baluda $
 */

/**
 * @author mauro
 *
 */
public class sndLevelImmTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//a field of an Immutable-type object is modified by the constructor
	@Test
	public void sndLevelImmType01() {
		new sndLevelImmType();
	    
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//a field of an Immutable-type object is modified outside costructors
	@Test
	public void sndLevelImmType02() {
		(new sndLevelImmType()).setS("");
		
		assertTrue(testHelper.getOutput().equals("Modifying an <<Immutable>> Object of type sndLevelImmType"));
	}
}
