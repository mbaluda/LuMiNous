
//This code is generate automatically, DO NOT MODIFY!
package javax.el.aspects;

import javax.el.*;
import java.util.logging.*;

public privileged aspect CompositeELResolver_FeatureIterator_next_NotNullReturn{

    /*
	 * Checks if a method returns Null
	 */					
	after() returning(Object retVal): !cflow(adviceexecution()) && call(* *.next(..)) && target(CompositeELResolver.FeatureIterator){
		if(retVal==null){
		    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
		    	"Null object returned calling CompositeELResolver.FeatureIterator.next",
				new Throwable());
		}
	}
}
