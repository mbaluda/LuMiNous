//This code is generate automatically, DO NOT MODIFY!
package javax.faces.webapp.aspects;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.*;

import ch.unisi.inf.luminous.AssertionViolatedException;

public class UIComponentClassicTagBase_UniqueContainer{
	private static Map<Object, Object> consumers = new HashMap<Object, Object>();
	private static ReferenceQueue<Object> references = new ReferenceQueue<Object>();
	
	public static <T> void addElement( T element) throws AssertionViolatedException {
		removeGCObjects();
		if ( consumers.containsKey( element.hashCode() ) )
			throw new AssertionViolatedException( "Assertion violated: unique" );
		putElement( element.hashCode(), element );
	}

	public static <T> void addElement( Object key, T element) throws AssertionViolatedException {
		removeGCObjects();
		if ( consumers.containsKey( key ) )
			throw new AssertionViolatedException( "Assertion violated: unique" );
		putElement( key, element );
	}

	public static <T> void forcedAdd( T element ) {
		removeGCObjects();
		putElement( element.hashCode(), element );
	}

	public static <T> void forcedAdd(Object key, T element ) {
		removeGCObjects();
		putElement( key, element );
	}

	@SuppressWarnings("unchecked")
	public static <T> T removeElement( T element ) {
		return (T)consumers.remove( element.hashCode() );
	}

	@SuppressWarnings("unchecked")
	public static <T> T removeElement( Object key, T element ) {
		return (T)consumers.remove( key );
	}

	private static <T> void putElement( Object key, T element ) {
		synchronized(consumers) {
			consumers.put( key, new WeakReference<T>( element, references ) );
		}
	}

	@SuppressWarnings("unchecked")
	private static <T> void removeGCObjects() {
		System.gc();
		while ( references.poll() != null ) {} //wipe the queue
		synchronized(consumers) {
			Map<Object,Object> copy = (Map<Object, Object>)((HashMap)consumers).clone();
			for ( Entry<Object, Object> entry : copy.entrySet()) {
				if ( ((WeakReference<T>)(entry.getValue())).isEnqueued() ) {
					consumers.remove( entry.getKey() );
					Logger.getLogger("ch.unisi.inf.luminous").log(Level.INFO, "Removed " + entry.getKey());
				}
			}
		}
	}
	
}
