package tests;
import static org.junit.Assert.assertTrue;
import javax.servlet.jsp.*;

import org.junit.After;
import org.junit.Test;

public class Bug40820Test{
    //flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}
	
	@Test
    public void contextInitialized() {
		try{
			JspFactory.getDefaultFactory().getEngineInfo();
		} catch (NullPointerException Ex){}
        
        assertTrue(testHelper.getOutput().equals("Accessing a Null object of type JspFactory"));
    }
}

