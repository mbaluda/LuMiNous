
//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import java.lang.reflect.Method;
import java.util.logging.*;

public aspect CompChild2_implements_Comparable_explicitly {
	after(): !cflow(adviceexecution()) && staticinitialization(testModel.CompChild2){
		Class<?> aClass=testModel.CompChild2.class;
		Class<?> anInterface=java.lang.Comparable.class;
		
		//aClass implements directly all the methods declared in anInterface
		for (Method m: anInterface.getDeclaredMethods()){
			try{
				aClass.getDeclaredMethod(m.getName(), m.getParameterTypes());
			}
			catch (NoSuchMethodException e) {
				Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
					"testModel.CompChild2."+m.getName()+" is not implemented explicitly",
					new Throwable());
			}
		}
	}
}
