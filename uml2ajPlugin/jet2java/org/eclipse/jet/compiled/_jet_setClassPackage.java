package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_setClassPackage implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_setClassPackage() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "sort($thisClass/@name | $thisClass/ancestor::*[@type='uml:Class']/@name,'count(ancestor::*)')", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "sort($thisClass/ancestor::*[@type='uml:Package']/@name,'count(ancestor::*)')", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 

String thisClassName=context.getVariable("classVar").toString();
context.setVariable("thisClass",context.getVariable(thisClassName));
String classname="";
String packagename="";

        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_1.setRuntimeParent(null);
        _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
        _jettag_c_iterate_9_1.doStart(context, out);
        while (_jettag_c_iterate_9_1.okToProcessBody()) {
     
    	String p=context.getVariable("p").toString().replaceAll("name=","").replace('.',' ').replaceAll(" ", "");
    	if (classname!="")
    		classname=classname.concat(".");
    	classname=classname.concat(p);
    	
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
        _jettag_c_iterate_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_18_1.setRuntimeParent(null);
        _jettag_c_iterate_18_1.setTagInfo(_td_c_iterate_18_1);
        _jettag_c_iterate_18_1.doStart(context, out);
        while (_jettag_c_iterate_18_1.okToProcessBody()) {
     
    	String p=context.getVariable("p").toString().replaceAll("name=","").replace('.',' ').replaceAll(" ", "");
    	if (packagename!="")
    		packagename=packagename.concat(".");
    	packagename=packagename.concat(p);
    	
            _jettag_c_iterate_18_1.handleBodyContent(out);
        }
        _jettag_c_iterate_18_1.doEnd();
        out.write(NL);         
        out.write(NL);         
 	
context.setVariable(thisClassName.concat("Name"),classname);
classname=classname.replace('.', '_');
context.setVariable(thisClassName.concat("FileName"),classname);

context.setVariable(thisClassName.concat("PackageName"),packagename);
packagename=packagename.replace('.', '/');
context.setVariable(thisClassName.concat("FolderName"),packagename.concat("/aspects")); 

    }
}
