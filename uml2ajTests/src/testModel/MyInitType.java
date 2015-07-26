package testModel;




/**
 * Description of the class MyInitType.
 *
 *
 */
public class MyInitType {

	protected String s = null;

	/**
	 * Description of the constructor MyInitType.
	 *
	 */
	public MyInitType() {
		s="";
	}

	/**
	 * Description of the method getS.
	 *
	 * @return return
	 */
	public String getS() {
		return s;
	}

	/**
	 * Description of the method setS.
	 *
	 * @param newS
	 */
	public void setS(String newS) {
		s = newS;
	}

	/**
	 * Description of the method init.
	 *
	 * @param par
	 */
	public void init(String par) {
		s=par;
	}


}