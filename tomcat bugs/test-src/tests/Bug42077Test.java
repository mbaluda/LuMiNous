package tests;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.el.ELContext;
import javax.el.CompositeELResolver;
import javax.el.ELResolver;

import org.easymock.IAnswer;
import org.easymock.classextension.EasyMock;
import org.easymock.classextension.IMocksControl;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import tests.testHelper;

/**
 * @author Mathias Broekelmann (latest modification by $Author: baluda $)
 * @version $Revision$ $Date: 2008-12-13 01:05:22 +0100 (sab, 13 dic 2008) $
 */
public class Bug42077Test
{
    private IMocksControl _mocksControl;
    private ELContext _elContext;
    private CompositeELResolver _testImpl;

    @Before
    public void setup()
    {
        _mocksControl = EasyMock.createControl();
        _elContext = _mocksControl.createMock(ELContext.class);
        _testImpl = new CompositeELResolver();
    }
    
    //flushes the thestHelper buffer
	@After
	public void initialize() {
		testHelper.flushOutput();
	}

    @Test
    public void testFeatureDescriptorsIterator()
    {
        ELResolver notnullFDResolver = _mocksControl.createMock(ELResolver.class);
        ELResolver emptyFDResolver = _mocksControl.createMock(ELResolver.class);
        Object base = new Object();

        _testImpl.add(notnullFDResolver);
        _testImpl.add(emptyFDResolver);
        _testImpl.add(notnullFDResolver);

        final List<FeatureDescriptor> fds = new ArrayList<FeatureDescriptor>();
        fds.add(new FeatureDescriptor());
        fds.add(null);
        fds.add(new FeatureDescriptor());
        fds.add(null);
        expect(notnullFDResolver.getFeatureDescriptors(eq(_elContext), eq(base))).andAnswer(
                new IAnswer<Iterator<FeatureDescriptor>>()
                {
                    public Iterator<FeatureDescriptor> answer() throws Throwable
                    {
                        return fds.iterator();
                    }
                }).anyTimes();

        expect(emptyFDResolver.getFeatureDescriptors(eq(_elContext), eq(base))).andReturn(
                Collections.EMPTY_LIST.iterator());

        _mocksControl.replay();

        Iterator<FeatureDescriptor> descriptors = _testImpl.getFeatureDescriptors(_elContext, base);

        assertNotNull(descriptors);
        assertEquals(true, descriptors.hasNext());
        assertEquals(fds.get(0), descriptors.next());
        assertEquals(true, descriptors.hasNext());
        descriptors.next();
 
        assertTrue(testHelper.getOutput().equals("Null object returned calling CompositeELResolver.FeatureIterator.next"));
    }
}