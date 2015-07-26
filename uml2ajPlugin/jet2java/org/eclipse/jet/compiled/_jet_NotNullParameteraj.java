package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_NotNullParameteraj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_NotNullParameteraj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_12_9 = new TagInfo("c:get", //$NON-NLS-1$
            12, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_8 = new TagInfo("c:get", //$NON-NLS-1$
            14, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_15 = new TagInfo("c:get", //$NON-NLS-1$
            17, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_49 = new TagInfo("c:get", //$NON-NLS-1$
            17, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_75 = new TagInfo("c:get", //$NON-NLS-1$
            17, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 9,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$op/ownedParameter/@name", //$NON-NLS-1$
                "par", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_86 = new TagInfo("c:get", //$NON-NLS-1$
            22, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$par", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_131 = new TagInfo("c:get", //$NON-NLS-1$
            22, 131,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_160 = new TagInfo("c:get", //$NON-NLS-1$
            22, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$op/ownedParameter/@name", //$NON-NLS-1$
                "par", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_84 = new TagInfo("c:get", //$NON-NLS-1$
            23, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$par", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_7 = new TagInfo("c:get", //$NON-NLS-1$
            24, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_48 = new TagInfo("c:get", //$NON-NLS-1$
            26, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$parName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString()); 
aop=aop.concat("_").concat(context.getVariable("opName").toString().replace('[',' ').replace(']',' ').replaceAll(" ","").replaceAll("name=","")); 
aop=aop.concat("_").concat(context.getVariable("parName").toString().replace('[',' ').replace(']',' ').replaceAll(" ","").replaceAll("name=",""));
context.setVariable("aopxml",aop.concat("_NotNullParameter\"/>\n")); 

        out.write("//This code is generate automatically, DO NOT MODIFY!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_9.setRuntimeParent(null);
        _jettag_c_get_12_9.setTagInfo(_td_c_get_12_9);
        _jettag_c_get_12_9.doStart(context, out);
        _jettag_c_get_12_9.doEnd();
        out.write(".aspects;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_8.setRuntimeParent(null);
        _jettag_c_get_14_8.setTagInfo(_td_c_get_14_8);
        _jettag_c_get_14_8.doStart(context, out);
        _jettag_c_get_14_8.doEnd();
        out.write(".*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.logging.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public aspect ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_15.setRuntimeParent(null);
        _jettag_c_get_17_15.setTagInfo(_td_c_get_17_15);
        _jettag_c_get_17_15.doStart(context, out);
        _jettag_c_get_17_15.doEnd();
        out.write("_");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_49.setRuntimeParent(null);
        _jettag_c_get_17_49.setTagInfo(_td_c_get_17_49);
        _jettag_c_get_17_49.doStart(context, out);
        _jettag_c_get_17_49.doEnd();
        out.write("_");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_75.setRuntimeParent(null);
        _jettag_c_get_17_75.setTagInfo(_td_c_get_17_75);
        _jettag_c_get_17_75.doStart(context, out);
        _jettag_c_get_17_75.doEnd();
        out.write("_NotNullParameter{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    /*");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Checks if a method parameter is Null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */\t\t\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tbefore(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_22_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_9.setRuntimeParent(null);
        _jettag_c_iterate_22_9.setTagInfo(_td_c_iterate_22_9);
        _jettag_c_iterate_22_9.doStart(context, out);
        while (_jettag_c_iterate_22_9.okToProcessBody()) {
            out.write("Object ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_22_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_86); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_86.setRuntimeParent(_jettag_c_iterate_22_9);
            _jettag_c_get_22_86.setTagInfo(_td_c_get_22_86);
            _jettag_c_get_22_86.doStart(context, out);
            _jettag_c_get_22_86.doEnd();
            _jettag_c_iterate_22_9.handleBodyContent(out);
        }
        _jettag_c_iterate_22_9.doEnd();
        out.write("): call(* ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_131); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_131.setRuntimeParent(null);
        _jettag_c_get_22_131.setTagInfo(_td_c_get_22_131);
        _jettag_c_get_22_131.doStart(context, out);
        _jettag_c_get_22_131.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_160); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_160.setRuntimeParent(null);
        _jettag_c_get_22_160.setTagInfo(_td_c_get_22_160);
        _jettag_c_get_22_160.doStart(context, out);
        _jettag_c_get_22_160.doEnd();
        out.write("(..))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    && args(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_23_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_14.setRuntimeParent(null);
        _jettag_c_iterate_23_14.setTagInfo(_td_c_iterate_23_14);
        _jettag_c_iterate_23_14.doStart(context, out);
        while (_jettag_c_iterate_23_14.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_23_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_84); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_84.setRuntimeParent(_jettag_c_iterate_23_14);
            _jettag_c_get_23_84.setTagInfo(_td_c_get_23_84);
            _jettag_c_get_23_84.doStart(context, out);
            _jettag_c_get_23_84.doEnd();
            _jettag_c_iterate_23_14.handleBodyContent(out);
        }
        _jettag_c_iterate_23_14.doEnd();
        out.write("){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_7.setRuntimeParent(null);
        _jettag_c_get_24_7.setTagInfo(_td_c_get_24_7);
        _jettag_c_get_24_7.doStart(context, out);
        _jettag_c_get_24_7.doEnd();
        out.write("==null){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\"Null value detected for parameter named ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_48); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_48.setRuntimeParent(null);
        _jettag_c_get_26_48.setTagInfo(_td_c_get_26_48);
        _jettag_c_get_26_48.doStart(context, out);
        _jettag_c_get_26_48.doEnd();
        out.write("\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
