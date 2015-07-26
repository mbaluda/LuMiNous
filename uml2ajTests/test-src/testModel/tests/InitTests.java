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
 * Last changed: $Id: InitTests.java 234 2008-12-16 16:30:11Z baluda $
 */

/**
 * @author mauro
 *
 */
public class InitTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//using a non-initialized object
	@Test
	public void InitType01() {
		MyInitType obj=new MyInitType();
		obj.setS("test");	
		
		assertTrue(testHelper.getOutput().equals("Accessing a non Initialized object of type MyInitType"));
	}
	
	//using an object after initialization
	@Test
	public void InitType02() {
		MyInitType obj=new MyInitType();
		obj.init("");
		obj.setS("test");	

		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//using sets in init cflow
	@Test
	public void InitType03() {
		MyInitType obj=new MyInitType();
		obj.init("");	

		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//calling a method on a null object
	@SuppressWarnings("null")
	@Test
	public void InitType04() {
		MyInitType obj=new MyInitType();
		obj.init("");	
		obj=null;
		try{
			obj.setS("test");	
		}catch (NullPointerException Ex){}

		assertTrue(testHelper.getOutput().equals("Accessing a Null object of type MyInitType"));
	}	
	
	//Interfering initialized objects
	//
	@Test
	public void InitType05() {
		MyInitType obj=new MyInitType();
		MyInitType obj2=new MyInitType();
		
		obj.init("");	
		
		obj.setS("test");	
		
		obj2.setS("test");	
		assertTrue(testHelper.getOutput().equals("Accessing a non Initialized object of type MyInitType"));
	}
	
	//using introspection
	@Test
	public void InitType06() {
		MyInitType obj=new MyInitType();
		
		//shouldn't rise warnings
		obj.getClass();
		
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//calling a method on a null object
	@SuppressWarnings("null")
	@Test
	public void ImmInitType01() {
		MyImmInitType obj=new MyImmInitType();
		obj=null;
		try{
			obj.setS("test");	
		}catch (NullPointerException Ex){}

		assertTrue(testHelper.getOutput().equals("Accessing a Null object of type MyImmInitType"));
	}	
}
