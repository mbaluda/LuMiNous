package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Comparableaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Comparableaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_9_9 = new TagInfo("c:get", //$NON-NLS-1$
            9, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_8 = new TagInfo("c:get", //$NON-NLS-1$
            11, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_15 = new TagInfo("c:get", //$NON-NLS-1$
            14, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_61 = new TagInfo("c:get", //$NON-NLS-1$
            18, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_4 = new TagInfo("c:get", //$NON-NLS-1$
            20, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_6 = new TagInfo("c:get", //$NON-NLS-1$
            24, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_4 = new TagInfo("c:get", //$NON-NLS-1$
            28, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_6 = new TagInfo("c:get", //$NON-NLS-1$
            32, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString()); 
context.setVariable("aopxml",aop.concat("_Comparable\"/>\n")); 

        out.write("//This code is generate automatically, DO NOT MODIFY!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_9.setRuntimeParent(null);
        _jettag_c_get_9_9.setTagInfo(_td_c_get_9_9);
        _jettag_c_get_9_9.doStart(context, out);
        _jettag_c_get_9_9.doEnd();
        out.write(".aspects;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_8.setRuntimeParent(null);
        _jettag_c_get_11_8.setTagInfo(_td_c_get_11_8);
        _jettag_c_get_11_8.doStart(context, out);
        _jettag_c_get_11_8.doEnd();
        out.write(".*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.logging.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public aspect ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_15.setRuntimeParent(null);
        _jettag_c_get_14_15.setTagInfo(_td_c_get_14_15);
        _jettag_c_get_14_15.doStart(context, out);
        _jettag_c_get_14_15.doEnd();
        out.write("_Comparable{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Matches Comparable subclass");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tafter(): !cflow(adviceexecution()) && staticinitialization(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_61.setRuntimeParent(null);
        _jettag_c_get_18_61.setTagInfo(_td_c_get_18_61);
        _jettag_c_get_18_61.doStart(context, out);
        _jettag_c_get_18_61.doEnd();
        out.write("){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_4.setRuntimeParent(null);
        _jettag_c_get_20_4.setTagInfo(_td_c_get_20_4);
        _jettag_c_get_20_4.doStart(context, out);
        _jettag_c_get_20_4.doEnd();
        out.write(".class.getDeclaredMethod(\"hashCode\",new Class[] {});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcatch (NoSuchMethodException e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_6.setRuntimeParent(null);
        _jettag_c_get_24_6.setTagInfo(_td_c_get_24_6);
        _jettag_c_get_24_6.doStart(context, out);
        _jettag_c_get_24_6.doEnd();
        out.write(" doesn't implement the method \\\"hashCode()\\\" directly\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_4.setRuntimeParent(null);
        _jettag_c_get_28_4.setTagInfo(_td_c_get_28_4);
        _jettag_c_get_28_4.doStart(context, out);
        _jettag_c_get_28_4.doEnd();
        out.write(".class.getDeclaredMethod(\"equals\",new Class[] {Object.class});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcatch (NoSuchMethodException e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_6.setRuntimeParent(null);
        _jettag_c_get_32_6.setTagInfo(_td_c_get_32_6);
        _jettag_c_get_32_6.doStart(context, out);
        _jettag_c_get_32_6.doEnd();
        out.write(" doesn't implement the method \\\"equals(Object)\\\" directly\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
