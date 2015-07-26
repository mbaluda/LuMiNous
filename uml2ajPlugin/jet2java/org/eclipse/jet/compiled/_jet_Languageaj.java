package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Languageaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_Languageaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_11_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            11, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%class,%package", //$NON-NLS-1$
                "{$className},{$classPackageName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_15 = new TagInfo("c:get", //$NON-NLS-1$
            20, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_49 = new TagInfo("c:get", //$NON-NLS-1$
            20, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_75 = new TagInfo("c:get", //$NON-NLS-1$
            20, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_9 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 9,
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
    private static final TagInfo _td_c_get_26_86 = new TagInfo("c:get", //$NON-NLS-1$
            26, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$par", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_138 = new TagInfo("c:get", //$NON-NLS-1$
            26, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 14,
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
    private static final TagInfo _td_c_get_27_84 = new TagInfo("c:get", //$NON-NLS-1$
            27, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$par", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_7 = new TagInfo("c:get", //$NON-NLS-1$
            29, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_44 = new TagInfo("c:get", //$NON-NLS-1$
            29, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_replaceAll_29_91 = new TagInfo("f:replaceAll", //$NON-NLS-1$
            29, 91,
            new String[] {
                "value", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            },
            new String[] {
                "\\", //$NON-NLS-1$
                "\\\\", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_135 = new TagInfo("c:get", //$NON-NLS-1$
            29, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$regexp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_44 = new TagInfo("c:get", //$NON-NLS-1$
            31, 44,
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
context.setVariable("aopxml",aop.concat("_Language\"/>\n")); 

        RuntimeTagElement _jettag_c_replaceStrings_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_11_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_11_1.setTagInfo(_td_c_replaceStrings_11_1);
        _jettag_c_replaceStrings_11_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_11_1_saved_out = out;
        while (_jettag_c_replaceStrings_11_1.okToProcessBody()) {
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
            RuntimeTagElement _jettag_c_get_20_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_15.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_20_15.setTagInfo(_td_c_get_20_15);
            _jettag_c_get_20_15.doStart(context, out);
            _jettag_c_get_20_15.doEnd();
            out.write("_");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_20_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_49.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_20_49.setTagInfo(_td_c_get_20_49);
            _jettag_c_get_20_49.doStart(context, out);
            _jettag_c_get_20_49.doEnd();
            out.write("_");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_20_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_75); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_75.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_20_75.setTagInfo(_td_c_get_20_75);
            _jettag_c_get_20_75.doStart(context, out);
            _jettag_c_get_20_75.doEnd();
            out.write("_Language{");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    /*");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * Checks if a method parameters matches a given regexp");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t * We extract from UML all the method's parameters names");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t */\t\t\t\t\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tbefore(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_26_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_26_9.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_iterate_26_9.setTagInfo(_td_c_iterate_26_9);
            _jettag_c_iterate_26_9.doStart(context, out);
            while (_jettag_c_iterate_26_9.okToProcessBody()) {
                out.write("Object ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_86); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_86.setRuntimeParent(_jettag_c_iterate_26_9);
                _jettag_c_get_26_86.setTagInfo(_td_c_get_26_86);
                _jettag_c_get_26_86.doStart(context, out);
                _jettag_c_get_26_86.doEnd();
                _jettag_c_iterate_26_9.handleBodyContent(out);
            }
            _jettag_c_iterate_26_9.doEnd();
            out.write("): call(* %class.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_26_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_138); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_26_138.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_26_138.setTagInfo(_td_c_get_26_138);
            _jettag_c_get_26_138.doStart(context, out);
            _jettag_c_get_26_138.doEnd();
            out.write("(..))");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t    && args(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_27_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_27_14.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_iterate_27_14.setTagInfo(_td_c_iterate_27_14);
            _jettag_c_iterate_27_14.doStart(context, out);
            while (_jettag_c_iterate_27_14.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_27_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_84.setRuntimeParent(_jettag_c_iterate_27_14);
                _jettag_c_get_27_84.setTagInfo(_td_c_get_27_84);
                _jettag_c_get_27_84.doStart(context, out);
                _jettag_c_get_27_84.doEnd();
                _jettag_c_iterate_27_14.handleBodyContent(out);
            }
            _jettag_c_iterate_27_14.doEnd();
            out.write("){");  //$NON-NLS-1$        
            out.write(NL);         
            // in the regexp backslashes are escaped 
            out.write("\t\tif (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_29_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_7.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_29_7.setTagInfo(_td_c_get_29_7);
            _jettag_c_get_29_7.doStart(context, out);
            _jettag_c_get_29_7.doEnd();
            out.write("==null || !");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_29_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_44.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_29_44.setTagInfo(_td_c_get_29_44);
            _jettag_c_get_29_44.doStart(context, out);
            _jettag_c_get_29_44.doEnd();
            out.write(".toString().matches(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_f_replaceAll_29_91 = context.getTagFactory().createRuntimeTag(_jetns_f, "replaceAll", "f:replaceAll", _td_f_replaceAll_29_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_replaceAll_29_91.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_f_replaceAll_29_91.setTagInfo(_td_f_replaceAll_29_91);
            _jettag_f_replaceAll_29_91.doStart(context, out);
            JET2Writer _jettag_f_replaceAll_29_91_saved_out = out;
            while (_jettag_f_replaceAll_29_91.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_29_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_135); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_135.setRuntimeParent(_jettag_f_replaceAll_29_91);
                _jettag_c_get_29_135.setTagInfo(_td_c_get_29_135);
                _jettag_c_get_29_135.doStart(context, out);
                _jettag_c_get_29_135.doEnd();
                _jettag_f_replaceAll_29_91.handleBodyContent(out);
            }
            out = _jettag_f_replaceAll_29_91_saved_out;
            _jettag_f_replaceAll_29_91.doEnd();
            out.write("\")){");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t    Logger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\"Language mismatch for parameter named ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_31_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_31_44.setRuntimeParent(_jettag_c_replaceStrings_11_1);
            _jettag_c_get_31_44.setTagInfo(_td_c_get_31_44);
            _jettag_c_get_31_44.doStart(context, out);
            _jettag_c_get_31_44.doEnd();
            out.write("\",");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_11_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_11_1_saved_out;
        _jettag_c_replaceStrings_11_1.doEnd();
    }
}
