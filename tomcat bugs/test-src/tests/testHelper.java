package tests;

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
	    String ret=output;
	    output="";	    
	    return ret;
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
