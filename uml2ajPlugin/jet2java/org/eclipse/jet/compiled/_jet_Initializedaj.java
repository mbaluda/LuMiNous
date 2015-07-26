package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Initializedaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Initializedaj() {
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
    private static final TagInfo _td_c_if_26_6 = new TagInfo("c:if", //$NON-NLS-1$
            26, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($op) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_16 = new TagInfo("c:get", //$NON-NLS-1$
            27, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opClassPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_55 = new TagInfo("c:get", //$NON-NLS-1$
            27, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opClassName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_45 = new TagInfo("c:get", //$NON-NLS-1$
            28, 45,
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
context.setVariable("aopxml",aop.concat("_Initialized\"/>\n")); 

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
            out.write("_Initialized pertarget(target(%class)){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    //A boolean variable local to the aspect");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    private boolean initialized = false;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    /*");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Matches any methods allowed to initialize an Initialized object");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Marks the object as initialized");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t */");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    pointcut initMethod(): target(%class) ");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_26_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_26_6.setRuntimeParent(_jettag_c_replaceStrings_8_1);
            _jettag_c_if_26_6.setTagInfo(_td_c_if_26_6);
            _jettag_c_if_26_6.doStart(context, out);
            while (_jettag_c_if_26_6.okToProcessBody()) {
                out.write("    \t&& call(* ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_16.setRuntimeParent(_jettag_c_if_26_6);
                _jettag_c_get_27_16.setTagInfo(_td_c_get_27_16);
                _jettag_c_get_27_16.doStart(context, out);
                _jettag_c_get_27_16.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_55); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_55.setRuntimeParent(_jettag_c_if_26_6);
                _jettag_c_get_27_55.setTagInfo(_td_c_get_27_55);
                _jettag_c_get_27_55.doStart(context, out);
                _jettag_c_get_27_55.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_45); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_45.setRuntimeParent(_jettag_c_if_26_6);
                _jettag_c_get_28_45.setTagInfo(_td_c_get_28_45);
                _jettag_c_get_28_45.doStart(context, out);
                _jettag_c_get_28_45.doEnd();
                out.write("(..))");  //$NON-NLS-1$        
                _jettag_c_if_26_6.handleBodyContent(out);
            }
            _jettag_c_if_26_6.doEnd();
            out.write(";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tafter() returning: !cflow(adviceexecution()) && initMethod(){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tinitialized=true;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t/*");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Matches any non-initializing method");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Checks if the target object is null or not initialized");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t */");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpointcut blockedMethods(): target(%class) ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t&& !cflow(initMethod()) ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t&& !cflow(call(*.new(..)))");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t&& call(* *(..))");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t&& !call(* java.lang.Object.getClass(..)); ; ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tbefore(): !cflow(adviceexecution()) &&  blockedMethods() {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif (!initialized){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\"Accessing a non Initialized object of type %class\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
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
