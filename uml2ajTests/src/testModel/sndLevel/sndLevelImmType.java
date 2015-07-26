package testModel.sndLevel;




/**
 * Description of the class sndLevelImmType.
 *
 *
 */
public class sndLevelImmType {

	protected String s = null;

	/**
	 * Description of the constructor sndLevelImmType.
	 *
	 */
	public sndLevelImmType() {
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