package testModel;

import java.util.HashSet;



/**
 * Description of the class Composite.
 *
 *
 */
public class Composite extends Component {

	public HashSet<Component> children;

	/**
	 * Description of the constructor Composite.
	 *
	 */
	public Composite() {
		children = new HashSet<Component>();
	}


}