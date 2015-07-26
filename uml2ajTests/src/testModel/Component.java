package testModel;




/**
 * Description of the class Component.
 *
 *
 */
public class Component {

	protected String Id;

	/**
	 * Description of the constructor Component.
	 *
	 */
	public Component() {
		Id = "";
	}
	/**
	 * Description of the constructor Component.
	 *
	 * @param id.
	 */
	public Component(String id) {
		Id = id;
	}

	/**
	 * Description of the method getId.
	 *
	 * @return return
	 */
	public String getId() {
		return Id; 
	}

	/**
	 * Description of the method setId.
	 *
	 * @param i
	 */
	public void setId(String i) {
		Id = i;
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
		return o instanceof Component; 
	}


}