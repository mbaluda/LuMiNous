
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public privileged aspect MyNotNullReturn_InnerIterator_next_NotNullReturn{

    /*
	 * Checks if a method returns Null
	 */					
	after() returning(Object retVal): !cflow(adviceexecution()) && call(* *.next(..)) && target(MyNotNullReturn.InnerIterator){
		if(retVal==null){
		    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
		    	"Null object returned calling MyNotNullReturn.InnerIterator.next",
				new Throwable());
		}
	}
}
