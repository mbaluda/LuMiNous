//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import testModel.*;
import java.util.logging.*;

public aspect MyNonComparable_Comparable{
	/*
	 * Matches Comparable subclass
	 */
	after(): !cflow(adviceexecution()) && staticinitialization(MyNonComparable){
		try{
			MyNonComparable.class.getDeclaredMethod("hashCode",new Class[] {});
		}
		catch (NoSuchMethodException e) {
			Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"MyNonComparable doesn't implement the method \"hashCode()\" directly",
				new Throwable());
		}
		try{
			MyNonComparable.class.getDeclaredMethod("equals",new Class[] {Object.class});
		}
		catch (NoSuchMethodException e) {
			Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
				"MyNonComparable doesn't implement the method \"equals(Object)\" directly",
				new Throwable());
		}		
	}
}