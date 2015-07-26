package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_aopxml implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_aopxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_1 = new TagInfo("c:get", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aopxml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<aspectj>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<aspects>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_1.setRuntimeParent(null);
        _jettag_c_get_3_1.setTagInfo(_td_c_get_3_1);
        _jettag_c_get_3_1.doStart(context, out);
        _jettag_c_get_3_1.doEnd();
        out.write(NL);         
        out.write("\t</aspects>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<weaver options=\"-verbose -showWeaveInfo -Xset:weaveJavaxPackages=true\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<exclude within=\"org.apache.juli..*\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<exclude within=\"org.apache.log4j..*\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<exclude within=\"org.apache.commons.logging..*\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<exclude within=\"org.aspectj..*\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</weaver>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</aspectj>");  //$NON-NLS-1$        
    }
}
