package testModel;




/**
 * Description of the class MyUnique.
 *
 *
 */
public class MyUnique {

	private int value;

	/**
	 * Description of the constructor MyUnique.
	 *
	 * @param par.
	 */
	public MyUnique(int par) {
		value=par;
	}

	/**
	 * Description of the method hashCode.
	 *
	 * @return return
	 */
	public int hashCode() {
		return value;
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