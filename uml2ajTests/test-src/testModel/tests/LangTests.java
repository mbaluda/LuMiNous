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
 * Last changed: $Id: LangTests.java 209 2008-12-10 12:16:48Z baluda $
 */

/**
 * @author mauro
 *
 */
public class LangTests {
	//flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	//both email address match ^\\S+@\\S+$
	@Test
	public void LangPar01() {
		(new MyLanguage()).sendEmail("test@test.org","test","me@me.it");

		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//address does not match ^\\S+@\\S+$
	@Test
	public void LangPar02() {
		(new MyLanguage()).sendEmail("test.org","test","me@me.it");

		assertTrue(testHelper.getOutput().equals("Language mismatch for parameter named address"));
	}
	
	//sender does not match ^\\S+@\\S+$
	@Test
	public void LangPar03() {
		(new MyLanguage()).sendEmail("me@test.org","test","me.it");

		assertTrue(testHelper.getOutput().equals("Language mismatch for parameter named sender"));
	}
	
	//address and sender do not match ^\\S+@\\S+$
	@Test
	public void LangPar04() {
		(new MyLanguage()).sendEmail("me","test","me.it");
		
		assertTrue(testHelper.getOutput().equals("Language mismatch for parameter named senderLanguage mismatch for parameter named address"));
	}
	
	//address is null
	@Test
	public void LangPar05() {
		(new MyLanguage()).sendEmail(null,"test","me@me.it");
		
		assertTrue(testHelper.getOutput().equals("Language mismatch for parameter named address"));
	}
	
	//url is valid
	@Test
	public void LangProp01() {
		MyLanguageProperty lan = new MyLanguageProperty("http://inf.unisi.ch");
		assertTrue(testHelper.getOutput().isEmpty());
		
		//valid url is read
		lan.getUrl();	
		assertTrue(testHelper.getOutput().isEmpty());
		
		//new url is valid
		lan.setUrl("http://inf.unisi.hh");		
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//url is valid
	@Test
	public void LangProp02() {
		new MyLanguageProperty("https://mail.google.com/mail/?hl=it");
		
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//url is valid
	@Test
	public void LangProp03() {
		new MyLanguageProperty("http://www.msn.com/");
		
		assertTrue(testHelper.getOutput().isEmpty());
	}
	
	//url is invalid
	@Test
	public void LangProp04() {
		new MyLanguageProperty("http://hh-1hallo. msn.blablabla.com:80800/test/test.aspx?dd=dd&id=dki");
		
		assertTrue(testHelper.getOutput().equals("Language mismatch when setting attribute MyLanguageProperty.url"));
	}
	
	//url is invalid
	@Test
	public void LangProp05() {
		new MyLanguageProperty("http://unisi");
		
		assertTrue(testHelper.getOutput().equals("Language mismatch when setting attribute MyLanguageProperty.url"));
	}
		
	//url is invalid
	@Test
	public void LangProp06() {
		MyLanguageProperty lan = new MyLanguageProperty("http://hh");
		
		//invalid url is read
		lan.getUrl();		
		
		//new url is invalid
		lan.setUrl("htt");		
		assertTrue(testHelper.getOutput().equals("Language mismatch when setting attribute MyLanguageProperty.url"+
				                                 "Language mismatch when setting attribute MyLanguageProperty.url"));
	}
	
	//url is invalid
	@Test
	public void LangProp07() {
		new MyLanguageProperty("http:://www.unisi.ch");
		
		assertTrue(testHelper.getOutput().equals("Language mismatch when setting attribute MyLanguageProperty.url"));
	}
	
	//url is null
	@Test
	public void LangProp08() {
		String prop=null;
		new MyLanguageProperty(prop);
		
		assertTrue(testHelper.getOutput().equals("Language mismatch when setting attribute MyLanguageProperty.url"));
	}
}
