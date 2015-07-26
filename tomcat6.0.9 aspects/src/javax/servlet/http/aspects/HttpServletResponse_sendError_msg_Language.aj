
//This code is generate automatically, DO NOT MODIFY!
package javax.servlet.http.aspects;

import javax.servlet.http.*;
import java.util.logging.*;

public aspect HttpServletResponse_sendError_msg_Language{

    /*
	 * Checks if a method parameters matches a given regexp
	 * We extract from UML all the method's parameters names
	 */					
	before(Object sc, Object msg): call(* HttpServletResponse.sendError(..))
	    && args(sc, msg){
		if (msg==null || !msg.toString().matches("[\\p{Print}&&\\p{ASCII}]*")){
		    Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"Language mismatch for parameter named msg",
				new Throwable());
		}
	}
}
