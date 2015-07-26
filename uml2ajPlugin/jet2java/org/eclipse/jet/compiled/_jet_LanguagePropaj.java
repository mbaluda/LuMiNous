package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_LanguagePropaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_LanguagePropaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_11_9 = new TagInfo("c:get", //$NON-NLS-1$
            11, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_8 = new TagInfo("c:get", //$NON-NLS-1$
            13, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_15 = new TagInfo("c:get", //$NON-NLS-1$
            16, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_49 = new TagInfo("c:get", //$NON-NLS-1$
            16, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$propName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_57 = new TagInfo("c:get", //$NON-NLS-1$
            21, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_86 = new TagInfo("c:get", //$NON-NLS-1$
            21, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$propName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_replaceAll_23_45 = new TagInfo("f:replaceAll", //$NON-NLS-1$
            23, 45,
            new String[] {
                "value", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            },
            new String[] {
                "\\", //$NON-NLS-1$
                "\\\\", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_89 = new TagInfo("c:get", //$NON-NLS-1$
            23, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$regexp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_47 = new TagInfo("c:get", //$NON-NLS-1$
            25, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_76 = new TagInfo("c:get", //$NON-NLS-1$
            25, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$propName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString()); 
aop=aop.concat("_").concat(context.getVariable("propName").toString().replace('[',' ').replace(']',' ').replaceAll(" ","").replaceAll("name=",""));
context.setVariable("aopxml",aop.concat("_Language\"/>\n")); 

        out.write("//This code is generate automatically, DO NOT MODIFY!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_9.setRuntimeParent(null);
        _jettag_c_get_11_9.setTagInfo(_td_c_get_11_9);
        _jettag_c_get_11_9.doStart(context, out);
        _jettag_c_get_11_9.doEnd();
        out.write(".aspects;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_8.setRuntimeParent(null);
        _jettag_c_get_13_8.setTagInfo(_td_c_get_13_8);
        _jettag_c_get_13_8.doStart(context, out);
        _jettag_c_get_13_8.doEnd();
        out.write(".*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.logging.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public aspect ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_15.setRuntimeParent(null);
        _jettag_c_get_16_15.setTagInfo(_td_c_get_16_15);
        _jettag_c_get_16_15.doStart(context, out);
        _jettag_c_get_16_15.doEnd();
        out.write("_");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_49.setRuntimeParent(null);
        _jettag_c_get_16_49.setTagInfo(_td_c_get_16_49);
        _jettag_c_get_16_49.doStart(context, out);
        _jettag_c_get_16_49.doEnd();
        out.write("_Language{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Checks if an attribute is set matching a given regexp");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tbefore(Object arg): !cflow(adviceexecution()) && set(* ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_57.setRuntimeParent(null);
        _jettag_c_get_21_57.setTagInfo(_td_c_get_21_57);
        _jettag_c_get_21_57.doStart(context, out);
        _jettag_c_get_21_57.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_86.setRuntimeParent(null);
        _jettag_c_get_21_86.setTagInfo(_td_c_get_21_86);
        _jettag_c_get_21_86.doStart(context, out);
        _jettag_c_get_21_86.doEnd();
        out.write(") && args(arg) {");  //$NON-NLS-1$        
        out.write(NL);         
        // in the regexp backslashes are escaped 
        out.write("\t\tif (arg==null || !arg.toString().matches(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_f_replaceAll_23_45 = context.getTagFactory().createRuntimeTag(_jetns_f, "replaceAll", "f:replaceAll", _td_f_replaceAll_23_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_replaceAll_23_45.setRuntimeParent(null);
        _jettag_f_replaceAll_23_45.setTagInfo(_td_f_replaceAll_23_45);
        _jettag_f_replaceAll_23_45.doStart(context, out);
        JET2Writer _jettag_f_replaceAll_23_45_saved_out = out;
        while (_jettag_f_replaceAll_23_45.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_23_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_89); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_89.setRuntimeParent(_jettag_f_replaceAll_23_45);
            _jettag_c_get_23_89.setTagInfo(_td_c_get_23_89);
            _jettag_c_get_23_89.doStart(context, out);
            _jettag_c_get_23_89.doEnd();
            _jettag_f_replaceAll_23_45.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_23_45_saved_out;
        _jettag_f_replaceAll_23_45.doEnd();
        out.write("\")){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\"Language mismatch when setting attribute ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_47.setRuntimeParent(null);
        _jettag_c_get_25_47.setTagInfo(_td_c_get_25_47);
        _jettag_c_get_25_47.doStart(context, out);
        _jettag_c_get_25_47.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_76); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_76.setRuntimeParent(null);
        _jettag_c_get_25_76.setTagInfo(_td_c_get_25_76);
        _jettag_c_get_25_76.doStart(context, out);
        _jettag_c_get_25_76.doEnd();
        out.write("\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
