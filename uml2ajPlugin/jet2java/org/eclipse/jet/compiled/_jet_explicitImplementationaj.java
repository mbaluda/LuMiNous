package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_explicitImplementationaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_explicitImplementationaj() {
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
                "%class,%package,%interface,%intPackage", //$NON-NLS-1$
                "{$className},{$classPackageName},{$interfaceName},{$interfacePackageName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_15 = new TagInfo("c:get", //$NON-NLS-1$
            18, 15,
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
aop=aop.concat("_implements_").concat(context.getVariable("interfaceFileName").toString()); 
context.setVariable("aopxml",aop.concat("_explicitly\"/>\n")); 

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
            out.write("import java.lang.reflect.Method;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("import java.util.logging.*;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("public aspect ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_15.setRuntimeParent(_jettag_c_replaceStrings_9_1);
            _jettag_c_get_18_15.setTagInfo(_td_c_get_18_15);
            _jettag_c_get_18_15.doStart(context, out);
            _jettag_c_get_18_15.doEnd();
            out.write("_implements_%interface_explicitly {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tafter(): !cflow(adviceexecution()) && staticinitialization(%package.%class){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tClass<?> aClass=%package.%class.class;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tClass<?> anInterface=%intPackage.%interface.class;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t//aClass implements directly all the methods declared in anInterface");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tfor (Method m: anInterface.getDeclaredMethods()){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\ttry{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\taClass.getDeclaredMethod(m.getName(), m.getParameterTypes());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tcatch (NoSuchMethodException e) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t\"%package.%class.\"+m.getName()+\" is not implemented explicitly\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t}");  //$NON-NLS-1$        
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
