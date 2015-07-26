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
 * Created: Nov 10, 2008 by Jochen Wuttke
 * Last changed: $Id: UniqueCollectionTracker.java 198 2008-11-25 14:07:29Z Jochen $
 */

package ch.unisi.inf.luminous;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * The collection tracker keeps references to all collections that are associated with
 * a unique association.
 * 
 * @author <a href="&#109;&#97;&#105;&#108;&#116;&#111;&#58;&#119;&#117;&#116;&#116;&#107;&#101;&#106;&#64;&#108;&#117;&#46;&#117;&#110;&#105;&#115;&#105;&#46;&#99;&#104;">Jochen Wuttke</a>
 *
 */
public class UniqueCollectionTracker {

	private static List<WeakReference<Collection<?>>> collections = new ArrayList<WeakReference<Collection<?>>>();
	private static ReferenceQueue<Object> references = new ReferenceQueue<Object>();


	public static void addCollection( Collection c ) {
		if ( !contains( c ) ) {
			collections.add( new WeakReference<Collection<?>>(c, references ) );
		}
	}

	public static boolean contains( Collection c ) {

		while ( references.poll() != null ) {} //wipe the queue

		synchronized(collections) {
			List<WeakReference<Collection<?>>> copy = (List<WeakReference<Collection<?>>>)((ArrayList<WeakReference<Collection<?>>>)collections).clone();
			for( WeakReference<Collection<?>> coll : copy ) {

				if ( coll.isEnqueued() ) {
					collections.remove( coll );
				} else if ( c == coll.get() ) {
					//this check is correct, we want to compare references!!!!
					return true;
				}
			}
		}

		return false;
	}

}
