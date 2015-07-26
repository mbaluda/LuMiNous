
//This code is generate automatically, DO NOT MODIFY!
package javax.servlet.jsp.aspects;

import javax.servlet.jsp.*;
import java.util.logging.*;

public aspect JspFactory_NotNullInitialized{

	pointcut blockedMethods(): target(JspFactory) 
    	&& !cflow(call(* javax.servlet.jsp.JspFactory.getDefaultFactory(..)))
		&& !cflow(call(*.new(..))) 
		&& call(* *.*(..));

    /*
	 * Checks if an object is Null when target
	 */					
	before(Object t):!cflow(adviceexecution()) &&  blockedMethods() && target(t) && if (t==null){
	    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"Accessing a Null object of type JspFactory",
				new Throwable());
	}
}
