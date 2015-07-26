
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyLanguage_sendEmail_address_Language{

    /*
	 * Checks if a method parameters matches a given regexp
	 * We extract from UML all the method's parameters names
	 */					
	before(Object address, Object subject, Object sender): call(* MyLanguage.sendEmail(..))
	    && args(address, subject, sender){
		if (address==null || !address.toString().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")){
		    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"Language mismatch for parameter named address",
				new Throwable());
		}
	}
}
