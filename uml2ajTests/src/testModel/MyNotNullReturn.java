package testModel;

import java.util.Iterator;



/**
 * Description of the class MyNotNullReturn.
 *
 *
 */
public class MyNotNullReturn {


	// Inner class InnerIterator.
	private final class InnerIterator implements Iterator<Object>{



		/**
		 * Description of the method hasNext.
		 *
		 * @return return
		 */
		public boolean hasNext() {
			return true;

		}

		/**
		 * Description of the method next.
		 *
		 * @return return
		 */
		public Object next() {
			return null;

		}

		/**
		 * Description of the method remove.
		 *
		 */
		public void remove() {

		}


	}

	/**
	 * Description of the method getFeatureDescriptors.
	 *
	 * @return return
	 */
	public Iterator getFeatureDescriptors() {
		return new InnerIterator();
	}

	/**
	 * Description of the method next.
	 *
	 * @return return
	 */
	public Object next() {
		return null;
	}


}