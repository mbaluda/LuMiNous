package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_NotNullInitializedaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_NotNullInitializedaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_8_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            8, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%class,%package", //$NON-NLS-1$
                "{$className},{$classPackageName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_15 = new TagInfo("c:get", //$NON-NLS-1$
            17, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_2 = new TagInfo("c:if", //$NON-NLS-1$
            20, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($op) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_23 = new TagInfo("c:get", //$NON-NLS-1$
            21, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opClassPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_62 = new TagInfo("c:get", //$NON-NLS-1$
            21, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_55 = new TagInfo("c:get", //$NON-NLS-1$
            22, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString()); 
context.setVariable("aopxml",aop.concat("_NotNullInitialized\"/>\n")); 

        RuntimeTagElement _jettag_c_replaceStrings_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_8_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_8_1.setTagInfo(_td_c_replaceStrings_8_1);
        _jettag_c_replaceStrings_8_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_8_1_saved_out = out;
        while (_jettag_c_replaceStrings_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("//This code is generate automatically, DO NOT MODIFY!");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("package %package.aspects;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("import %package.*;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import java.util.logging.*;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("public aspect ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_17_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_17_15.setRuntimeParent(_jettag_c_replaceStrings_8_1);
            _jettag_c_get_17_15.setTagInfo(_td_c_get_17_15);
            _jettag_c_get_17_15.doStart(context, out);
            _jettag_c_get_17_15.doEnd();
            out.write("_NotNullInitialized{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\tpointcut blockedMethods(): target(%class) ");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_20_2.setRuntimeParent(_jettag_c_replaceStrings_8_1);
            _jettag_c_if_20_2.setTagInfo(_td_c_if_20_2);
            _jettag_c_if_20_2.doStart(context, out);
            while (_jettag_c_if_20_2.okToProcessBody()) {
                out.write("    \t&& !cflow(call(* ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_23.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_get_21_23.setTagInfo(_td_c_get_21_23);
                _jettag_c_get_21_23.doStart(context, out);
                _jettag_c_get_21_23.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_62); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_62.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_get_21_62.setTagInfo(_td_c_get_21_62);
                _jettag_c_get_21_62.doStart(context, out);
                _jettag_c_get_21_62.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_55.setRuntimeParent(_jettag_c_if_20_2);
                _jettag_c_get_22_55.setTagInfo(_td_c_get_22_55);
                _jettag_c_get_22_55.doStart(context, out);
                _jettag_c_get_22_55.doEnd();
                out.write("(..)))");  //$NON-NLS-1$        
                _jettag_c_if_20_2.handleBodyContent(out);
            }
            _jettag_c_if_20_2.doEnd();
            out.write(NL);         
            out.write("\t\t&& !cflow(call(*.new(..))) ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t&& call(* *.*(..));");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    /*");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Checks if an object is Null when target");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t */\t\t\t\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tbefore(Object t):!cflow(adviceexecution()) &&  blockedMethods() && target(t) && if (t==null){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t    Logger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\"Accessing a Null object of type %class\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_8_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_8_1_saved_out;
        _jettag_c_replaceStrings_8_1.doEnd();
    }
}
