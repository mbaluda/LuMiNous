package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_NotNullReturnaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_NotNullReturnaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_9_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            9, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%class,%package,%operation", //$NON-NLS-1$
                "{$className},{$classPackageName},{$opName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_26 = new TagInfo("c:get", //$NON-NLS-1$
            18, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString());
aop=aop.concat("_").concat(context.getVariable("opName").toString().replace('[',' ').replace(']',' ').replaceAll(" ","").replaceAll("name=","")); 
context.setVariable("aopxml",aop.concat("_NotNullReturn\"/>\n")); 

        RuntimeTagElement _jettag_c_replaceStrings_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_9_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_9_1.setTagInfo(_td_c_replaceStrings_9_1);
        _jettag_c_replaceStrings_9_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_9_1_saved_out = out;
        while (_jettag_c_replaceStrings_9_1.okToProcessBody()) {
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
            out.write("public privileged aspect ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_26); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_26.setRuntimeParent(_jettag_c_replaceStrings_9_1);
            _jettag_c_get_18_26.setTagInfo(_td_c_get_18_26);
            _jettag_c_get_18_26.doStart(context, out);
            _jettag_c_get_18_26.doEnd();
            out.write("_%operation_NotNullReturn{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    /*");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Checks if a method returns Null");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t */\t\t\t\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tafter() returning(Object retVal): !cflow(adviceexecution()) && call(* *.%operation(..)) && target(%class){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif(retVal==null){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t    Logger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t    \t\"Null object returned calling %class.%operation\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_9_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_9_1_saved_out;
        _jettag_c_replaceStrings_9_1.doEnd();
    }
}
