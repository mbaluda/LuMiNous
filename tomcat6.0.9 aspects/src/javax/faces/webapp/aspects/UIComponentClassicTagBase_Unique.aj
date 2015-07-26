
	
		

//This code is generate automatically, DO NOT MODIFY!
package javax.faces.webapp.aspects;

import ch.unisi.inf.luminous.AssertionViolatedException;
import javax.faces.webapp.aspects.UIComponentClassicTagBase_UniqueContainer;
import javax.faces.webapp.*;
import java.util.logging.*;

public aspect UIComponentClassicTagBase_Unique pertarget( instanceCreation(UIComponentClassicTagBase) || setUniqueProperty(UIComponentClassicTagBase) ) {

	private boolean lumi_uniquePropertySet = false;
	private Object uniqueProperty = null;
	
	pointcut instanceCreation(UIComponentClassicTagBase _consumer): this(_consumer) && execution( UIComponentClassicTagBase+.new(..) );
		
	after(UIComponentClassicTagBase _consumer) : instanceCreation( _consumer ) {
		safeAddObject( _consumer );
	}
	
			
	
	pointcut setUniqueProperty( UIComponentClassicTagBase _consumer ): target(_consumer) &&
		call( * UIComponentClassicTagBase+.setJspId(..) );
	
	before( UIComponentClassicTagBase _consumer ): setUniqueProperty( _consumer ) {
		if ( lumi_uniquePropertySet ) { 
			uniqueProperty = _consumer.getJspId();
		}
	}
	
	after( UIComponentClassicTagBase _consumer ): setUniqueProperty( _consumer ) {
		if ( propertyHasChanged( uniqueProperty, _consumer.getJspId() ) ) {
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
	
	private void updateContainer( Object oldKey, UIComponentClassicTagBase updatedObject ) {
		UIComponentClassicTagBase_UniqueContainer.removeElement(oldKey, updatedObject);
		safeAddObject( updatedObject );
	}
	
	private void safeAddObject( UIComponentClassicTagBase newValue ) {
		//grab the element, dump it into the static container, catch the exception		
		try {
			UIComponentClassicTagBase_UniqueContainer.<UIComponentClassicTagBase>addElement( newValue.getJspId(), newValue );
		} catch (AssertionViolatedException exception ) {
				UIComponentClassicTagBase_UniqueContainer.<UIComponentClassicTagBase>forcedAdd( newValue.getJspId(), newValue );
				Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
					exception.getMessage() + ": trying to add key \"" + newValue.getJspId() + "\" for type " +  newValue.getClass(),
					new Throwable());
				UIComponentClassicTagBase_UniqueContainer.<UIComponentClassicTagBase>forcedAdd( newValue.getJspId(), newValue );
		} 
	}
}
