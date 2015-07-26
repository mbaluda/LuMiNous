package testModel;




/**
 * Description of the class MyCompType.
 *
 *
 */
public class MyCompType implements Comparable{



	/**
	 * Description of the method compareTo.
	 *
	 * @param o
	 * @return return
	 */
	public int compareTo(Object o) {
		if((o == null) || (o.getClass() != this.getClass()))
			throw new java.lang.ClassCastException();
		return 0;
	}

	/**
	 * Description of the method hashCode.
	 *
	 * @return return
	 */
	public int hashCode() {
		return 0;
	}

	/**
	 * Description of the method equals.
	 *
	 * @param o
	 * @return return
	 */
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if((o == null) || (o.getClass() != this.getClass()))
			return false;
		return hashCode()==o.hashCode();
	}


}