//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyLanguageProperty_url_Language{

	/*
	 * Checks if an attribute is set matching a given regexp
	 */			
	before(Object arg): !cflow(adviceexecution()) && set(* MyLanguageProperty.url) && args(arg) {
		if (arg==null || !arg.toString().matches("^((ht|f)tp(s?)\\:\\/\\/|~/|/)?([\\w]+:\\w+@)?([a-zA-Z]{1}([\\w\\-]+\\.)+([\\w]{2,5}))(:[\\d]{1,5})?((/?\\w+/)+|/?)(\\w+\\.[\\w]{3,4})?((\\?\\w+=\\w+)?(&amp;amp;amp;\\w+=\\w+)*)?")){
			Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"Language mismatch when setting attribute MyLanguageProperty.url",
				new Throwable());
		}
	}
}