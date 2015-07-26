//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyLanguage_sendEmail_subject_NotNullParameter{

    /*
	 * Checks if a method parameter is Null
	 */					
	before(Object address, Object subject, Object sender): call(* MyLanguage.sendEmail(..))
	    && args(address, subject, sender){
		if (subject==null){
			Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
						"Null value detected for parameter named subject",
						new Throwable());
		}
	}
}