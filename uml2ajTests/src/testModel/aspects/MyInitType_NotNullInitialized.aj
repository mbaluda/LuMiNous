
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyInitType_NotNullInitialized{

	pointcut blockedMethods(): target(MyInitType) 
    	&& !cflow(call(* testModel.MyInitType.init(..)))
		&& !cflow(call(*.new(..))) 
		&& call(* *.*(..));

    /*
	 * Checks if an object is Null when target
	 */					
	before(Object t):!cflow(adviceexecution()) &&  blockedMethods() && target(t) && if (t==null){
	    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"Accessing a Null object of type MyInitType",
				new Throwable());
	}
}
