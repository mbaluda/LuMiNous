
	
		

//This code is generate automatically, DO NOT MODIFY!
package testModel.aspects;

import ch.unisi.inf.luminous.AssertionViolatedException;
import testModel.aspects.MyUnique_UniqueContainer;
import testModel.*;
import java.util.logging.*;

public aspect MyUnique_Unique pertarget( instanceCreation(MyUnique) || setUniqueProperty(MyUnique) ) {

	private boolean lumi_uniquePropertySet = false;
	private Object uniqueProperty = null;
	
	pointcut instanceCreation(MyUnique _consumer): this(_consumer) && execution( MyUnique+.new(..) );
		
	after(MyUnique _consumer) : instanceCreation( _consumer ) {
		safeAddObject( _consumer );
		lumi_uniquePropertySet = true;
	}
	
	
				
	pointcut setUniqueProperty( MyUnique _consumer ): target(_consumer) &&
		call( * MyUnique+.set*(..) );
	
	before( MyUnique _consumer ): setUniqueProperty( _consumer ) {
		if ( lumi_uniquePropertySet ) { 
			uniqueProperty = _consumer.hashCode();
		}
	}
	
	after( MyUnique _consumer ): setUniqueProperty( _consumer ) {
		if ( propertyHasChanged( uniqueProperty, _consumer.hashCode() ) ) {
			lumi_uniquePropertySet = true;
			updateContainer( uniqueProperty, _consumer );
		}
	}	
	
	private boolean propertyHasChanged( Object uniqueProperty, Object newPropertyValue ) {
		if ( uniqueProperty == null && newPropertyValue != null ) 
			return true;
		if ( uniqueProperty != null ) {
			return ! uniqueProperty.equals( newPropertyValue );
		}
		return false;
	}
	
	private void updateContainer( Object oldKey, MyUnique updatedObject ) {
		MyUnique_UniqueContainer.removeElement(oldKey, updatedObject);
		safeAddObject( updatedObject );
	}
	
	private void safeAddObject( MyUnique newValue ) {
		//grab the element, dump it into the static container, catch the exception		
		try {
			MyUnique_UniqueContainer.<MyUnique>addElement( newValue.hashCode(), newValue );
		} catch (AssertionViolatedException exception ) {
			MyUnique_UniqueContainer.<MyUnique>forcedAdd( newValue.hashCode(), newValue );
				Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
					exception.getMessage() + ": trying to add key \"" + newValue.hashCode() + "\" for type " +  newValue.getClass(),
					new Throwable());
			MyUnique_UniqueContainer.<MyUnique>forcedAdd( newValue.hashCode(), newValue );
		} 
	}
}
