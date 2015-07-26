
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyInitType_Initialized pertarget(target(MyInitType)){
    //A boolean variable local to the aspect
    private boolean initialized = false;
    
    /*
	 * Matches any methods allowed to initialize an Initialized object
	 * Marks the object as initialized
	 */
    pointcut initMethod(): target(MyInitType) 
    	&& call(* testModel.MyInitType.init(..));
	after() returning: !cflow(adviceexecution()) && initMethod(){
		initialized=true;
	}
	
	/*
	 * Matches any non-initializing method
	 * Checks if the target object is null or not initialized
	 */
	pointcut blockedMethods(): target(MyInitType) 
		&& !cflow(initMethod()) 
		&& !cflow(call(*.new(..)))
		&& call(* *(..))
		&& !call(* java.lang.Object.getClass(..)); ; 
		
	before(): !cflow(adviceexecution()) &&  blockedMethods() {
		if (!initialized){
			Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
			"Accessing a non Initialized object of type MyInitType",
			new Throwable());
		}
	}
}
