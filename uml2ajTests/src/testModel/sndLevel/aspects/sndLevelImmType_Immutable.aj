
//This code is generate automatically, DO NOT MODIFY!
package testModel.sndLevel.aspects;

import testModel.sndLevel.*;
import java.util.logging.*;

public aspect sndLevelImmType_Immutable{
    /*
	 * Checks if an Immutable type object is modified
	 */
	before(): !cflow(adviceexecution()) && set(* sndLevelImmType.*) 
			&& !cflow(call(sndLevelImmType.new(..))){
		Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
			"Modifying an <<Immutable>> Object of type sndLevelImmType",
			new Throwable());
	}
}
