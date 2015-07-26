
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyImmInitType_NotNullInitialized{

	pointcut blockedMethods(): target(MyImmInitType) 
    	&& !cflow(call(* testModel.MyImmInitType.init(..)))
		&& !cflow(call(*.new(..))) 
		&& call(* *.*(..));

    /*
	 * Checks if an object is Null when target
	 */					
	before(Object t):!cflow(adviceexecution()) &&  blockedMethods() && target(t) && if (t==null){
	    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"Accessing a Null object of type MyImmInitType",
				new Throwable());
	}
}
