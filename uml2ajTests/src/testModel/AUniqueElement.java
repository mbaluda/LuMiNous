package testModel;




/**
 * Description of the class AUniqueElement.
 *
 *
 */
public class AUniqueElement {

	private int _hashCode = 0;

	/**
	 * Description of the constructor AUniqueElement.
	 *
	 * @param i.
	 */
	public AUniqueElement(int i) {
		_hashCode = i;
	}

	/**
	 * Description of the method equals.
	 *
	 * @param obj
	 * @return return
	 */
	public boolean equals(Object obj) {
		return obj instanceof AUniqueElement && this.hashCode() == obj.hashCode();
	}

	/**
	 * Description of the method hashCode.
	 *
	 * @return return
	 */
	public int hashCode() {
		return _hashCode;
	}


}