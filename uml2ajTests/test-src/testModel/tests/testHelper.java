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
 * Created: 03/ott/2008 by Mauro Baluda
 * Last changed: $Id: testHelper.java 208 2008-12-09 13:42:41Z baluda $
 */
package testModel.tests;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import java.util.logging.*;

/**
 * @author mauro
 */
@Aspect
public class testHelper {
	private static String output="";
	
	// Returns output
	public static String getOutput(){
		return output;
	}
	
	// clears output
	public static void flushOutput(){
	    output="";
	}
	
	// an aspect that matches println in aspects
	// appends the String to output
	@After("call(void Logger.log(Level, String, Throwable)) && cflow(adviceexecution()) && args(level, message, thrown)")
    public void aspectPrinting(Level level, String message, Throwable thrown) {
		 if(level==Level.SEVERE){
			 output=output+message;
		 }
    }
}
