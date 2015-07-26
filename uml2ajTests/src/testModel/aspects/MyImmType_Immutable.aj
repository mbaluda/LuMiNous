
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyImmType_Immutable{
    /*
	 * Checks if an Immutable type object is modified
	 */
	before(): !cflow(adviceexecution()) && set(* MyImmType.*) 
			&& !cflow(call(MyImmType.new(..))){
		Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
			"Modifying an <<Immutable>> Object of type MyImmType",
			new Throwable());
	}
}
