/*******************************************************************************
 * Copyright (c) 2008 - Jochen Wuttke.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jochen Wuttke - initial API and implementation
 ********************************************************************************
 *
 * Created: Nov 7, 2008 by Jochen Wuttke
 * Last changed: $Id$
 */
 

package testModel.aspects;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;
import testModel.*;

import ch.unisi.inf.luminous.UniqueCollectionTracker;

/**
 * @author <a href="&#109;&#97;&#105;&#108;&#116;&#111;&#58;&#119;&#117;&#116;&#116;&#107;&#101;&#106;&#64;&#108;&#117;&#46;&#117;&#110;&#105;&#115;&#105;&#46;&#99;&#104;">Jochen Wuttke</a>
 *
 */
public privileged aspect Composite_Unique {

	//private Object unqiueProperty;

	//for now we assume the assignment to the collection variable is made only once
	//This might well be specific to the case at hand.
	before (Collection<?> collection ): set(* Composite.children ) && args(collection) {
		if (collection != null ) {
			UniqueCollectionTracker.addCollection( collection );
		}
	}
		
	/**
	 * Single element add operation
	 * @param collection
	 */
	pointcut addElement(Component param): target(Collection+) && call( * add(..) ) && args( param );

	before(Collection collection, Component param): addElement(param) && target(collection) && !this(UniqueCollectionTracker+){
		assertUnique( collection, param );
	}

	
	private void assertUnique( Collection collection, Component param ) {
		//is "collection" a tracked collection?
		if ( UniqueCollectionTracker.contains( collection ) ) {	
			if ( contains( collection, param ) ) {
				Logger.getLogger("ch.unisi.inf.luminous").log(Level.SEVERE,
					"unique property violated on Composite.children: " +  param.hashCode() + " on " + param.hashCode() + ":" + getDuplicate(collection, param).hashCode(),
					new Throwable());
			}
		}
	}
	
	private Object getDuplicate( Collection collection, Component object ) {
		for( Object comp : collection ) {
			Component component = (Component)comp;
			if ( component != object && component.equals( object ) )
				return comp;
		}
		return null;
	}
	
	private boolean contains( Collection c, Component object) {
		for( Object comp : c ) {
			Component component = (Component)comp;
			if ( component != object && component.getId().equals( object.getId() ) )
				return true;
			
		}
		return false;
	}

}
