package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_GlobalUniqueaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_GlobalUniqueaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_log_9_2 = new TagInfo("c:log", //$NON-NLS-1$
            9, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_34 = new TagInfo("c:get", //$NON-NLS-1$
            9, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_2 = new TagInfo("c:if", //$NON-NLS-1$
            10, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($uniqueProperty) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_11_3 = new TagInfo("c:log", //$NON-NLS-1$
            11, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_11_31 = new TagInfo("c:get", //$NON-NLS-1$
            11, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_2 = new TagInfo("c:if", //$NON-NLS-1$
            13, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($uniqueProperty) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_14_3 = new TagInfo("c:log", //$NON-NLS-1$
            14, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_18_9 = new TagInfo("c:get", //$NON-NLS-1$
            18, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_8 = new TagInfo("c:get", //$NON-NLS-1$
            21, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_53 = new TagInfo("c:get", //$NON-NLS-1$
            21, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_8 = new TagInfo("c:get", //$NON-NLS-1$
            22, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_15 = new TagInfo("c:get", //$NON-NLS-1$
            25, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_84 = new TagInfo("c:get", //$NON-NLS-1$
            25, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_136 = new TagInfo("c:get", //$NON-NLS-1$
            25, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_28 = new TagInfo("c:get", //$NON-NLS-1$
            30, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_100 = new TagInfo("c:get", //$NON-NLS-1$
            30, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_8 = new TagInfo("c:get", //$NON-NLS-1$
            32, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_3 = new TagInfo("c:if", //$NON-NLS-1$
            35, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "cardinality($uniqueProperty, '0') = true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_2 = new TagInfo("c:if", //$NON-NLS-1$
            41, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "cardinality($uniqueProperty, '1M') = true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_42_4 = new TagInfo("c:log", //$NON-NLS-1$
            42, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_42_38 = new TagInfo("c:get", //$NON-NLS-1$
            42, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_30 = new TagInfo("c:get", //$NON-NLS-1$
            44, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_11 = new TagInfo("c:get", //$NON-NLS-1$
            45, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_45 = new TagInfo("c:get", //$NON-NLS-1$
            45, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_10 = new TagInfo("c:get", //$NON-NLS-1$
            47, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_34 = new TagInfo("c:get", //$NON-NLS-1$
            49, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_9 = new TagInfo("c:get", //$NON-NLS-1$
            53, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_57 = new TagInfo("c:get", //$NON-NLS-1$
            54, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_62_2 = new TagInfo("c:if", //$NON-NLS-1$
            62, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "cardinality($uniqueProperty, '0') = true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_63_5 = new TagInfo("c:log", //$NON-NLS-1$
            63, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_64_30 = new TagInfo("c:get", //$NON-NLS-1$
            64, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_11 = new TagInfo("c:get", //$NON-NLS-1$
            65, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_10 = new TagInfo("c:get", //$NON-NLS-1$
            67, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_9 = new TagInfo("c:get", //$NON-NLS-1$
            73, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_90_47 = new TagInfo("c:get", //$NON-NLS-1$
            90, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_3 = new TagInfo("c:get", //$NON-NLS-1$
            91, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_30 = new TagInfo("c:get", //$NON-NLS-1$
            95, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_98_3 = new TagInfo("c:if", //$NON-NLS-1$
            98, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($uniqueProperty) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_4 = new TagInfo("c:get", //$NON-NLS-1$
            99, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_99_55 = new TagInfo("c:get", //$NON-NLS-1$
            99, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_101_3 = new TagInfo("c:if", //$NON-NLS-1$
            101, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($uniqueProperty) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_4 = new TagInfo("c:get", //$NON-NLS-1$
            102, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_55 = new TagInfo("c:get", //$NON-NLS-1$
            102, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_102_109 = new TagInfo("c:get", //$NON-NLS-1$
            102, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_105_4 = new TagInfo("c:if", //$NON-NLS-1$
            105, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($uniqueProperty) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_4 = new TagInfo("c:get", //$NON-NLS-1$
            106, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_55 = new TagInfo("c:get", //$NON-NLS-1$
            106, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_4 = new TagInfo("c:get", //$NON-NLS-1$
            110, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_110_55 = new TagInfo("c:get", //$NON-NLS-1$
            110, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_112_4 = new TagInfo("c:if", //$NON-NLS-1$
            112, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($uniqueProperty) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_5 = new TagInfo("c:get", //$NON-NLS-1$
            113, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_56 = new TagInfo("c:get", //$NON-NLS-1$
            113, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_113_109 = new TagInfo("c:get", //$NON-NLS-1$
            113, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_115_70 = new TagInfo("c:get", //$NON-NLS-1$
            115, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_5 = new TagInfo("c:get", //$NON-NLS-1$
            117, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_56 = new TagInfo("c:get", //$NON-NLS-1$
            117, 56,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$className", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_117_109 = new TagInfo("c:get", //$NON-NLS-1$
            117, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString()); 
context.setVariable("aopxml",aop.concat("_Unique\"/>\n")); 

        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_log_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_9_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_log_9_2.setRuntimeParent(null);
        _jettag_c_log_9_2.setTagInfo(_td_c_log_9_2);
        _jettag_c_log_9_2.doStart(context, out);
        JET2Writer _jettag_c_log_9_2_saved_out = out;
        while (_jettag_c_log_9_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("Generating UNIQUE aspect ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_34.setRuntimeParent(_jettag_c_log_9_2);
            _jettag_c_get_9_34.setTagInfo(_td_c_get_9_34);
            _jettag_c_get_9_34.doStart(context, out);
            _jettag_c_get_9_34.doEnd();
            out.write("_Unique");  //$NON-NLS-1$        
            _jettag_c_log_9_2.handleBodyContent(out);
        }
        out = _jettag_c_log_9_2_saved_out;
        _jettag_c_log_9_2.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_10_2.setRuntimeParent(null);
        _jettag_c_if_10_2.setTagInfo(_td_c_if_10_2);
        _jettag_c_if_10_2.doStart(context, out);
        while (_jettag_c_if_10_2.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_11_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_11_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_11_3.setRuntimeParent(_jettag_c_if_10_2);
            _jettag_c_log_11_3.setTagInfo(_td_c_log_11_3);
            _jettag_c_log_11_3.doStart(context, out);
            JET2Writer _jettag_c_log_11_3_saved_out = out;
            while (_jettag_c_log_11_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Uniqueness Property: ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_11_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_31); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_31.setRuntimeParent(_jettag_c_log_11_3);
                _jettag_c_get_11_31.setTagInfo(_td_c_get_11_31);
                _jettag_c_get_11_31.doStart(context, out);
                _jettag_c_get_11_31.doEnd();
                _jettag_c_log_11_3.handleBodyContent(out);
            }
            out = _jettag_c_log_11_3_saved_out;
            _jettag_c_log_11_3.doEnd();
            out.write(NL);         
            _jettag_c_if_10_2.handleBodyContent(out);
        }
        _jettag_c_if_10_2.doEnd();
        RuntimeTagElement _jettag_c_if_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_13_2.setRuntimeParent(null);
        _jettag_c_if_13_2.setTagInfo(_td_c_if_13_2);
        _jettag_c_if_13_2.doStart(context, out);
        while (_jettag_c_if_13_2.okToProcessBody()) {
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_14_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_14_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_14_3.setRuntimeParent(_jettag_c_if_13_2);
            _jettag_c_log_14_3.setTagInfo(_td_c_log_14_3);
            _jettag_c_log_14_3.doStart(context, out);
            JET2Writer _jettag_c_log_14_3_saved_out = out;
            while (_jettag_c_log_14_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Uniqueness Property: default");  //$NON-NLS-1$        
                _jettag_c_log_14_3.handleBodyContent(out);
            }
            out = _jettag_c_log_14_3_saved_out;
            _jettag_c_log_14_3.doEnd();
            out.write(NL);         
            _jettag_c_if_13_2.handleBodyContent(out);
        }
        _jettag_c_if_13_2.doEnd();
        out.write(NL);         
        out.write("//This code is generate automatically, DO NOT MODIFY!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_9.setRuntimeParent(null);
        _jettag_c_get_18_9.setTagInfo(_td_c_get_18_9);
        _jettag_c_get_18_9.doStart(context, out);
        _jettag_c_get_18_9.doEnd();
        out.write(".aspects;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ch.unisi.inf.luminous.AssertionViolatedException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_8.setRuntimeParent(null);
        _jettag_c_get_21_8.setTagInfo(_td_c_get_21_8);
        _jettag_c_get_21_8.doStart(context, out);
        _jettag_c_get_21_8.doEnd();
        out.write(".aspects.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_53.setRuntimeParent(null);
        _jettag_c_get_21_53.setTagInfo(_td_c_get_21_53);
        _jettag_c_get_21_53.doStart(context, out);
        _jettag_c_get_21_53.doEnd();
        out.write("_UniqueContainer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_8.setRuntimeParent(null);
        _jettag_c_get_22_8.setTagInfo(_td_c_get_22_8);
        _jettag_c_get_22_8.doStart(context, out);
        _jettag_c_get_22_8.doEnd();
        out.write(".*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.logging.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public aspect ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_15.setRuntimeParent(null);
        _jettag_c_get_25_15.setTagInfo(_td_c_get_25_15);
        _jettag_c_get_25_15.doStart(context, out);
        _jettag_c_get_25_15.doEnd();
        out.write("_Unique pertarget( instanceCreation(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_84); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_84.setRuntimeParent(null);
        _jettag_c_get_25_84.setTagInfo(_td_c_get_25_84);
        _jettag_c_get_25_84.doStart(context, out);
        _jettag_c_get_25_84.doEnd();
        out.write(") || setUniqueProperty(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_136); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_136.setRuntimeParent(null);
        _jettag_c_get_25_136.setTagInfo(_td_c_get_25_136);
        _jettag_c_get_25_136.doStart(context, out);
        _jettag_c_get_25_136.doEnd();
        out.write(") ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate boolean lumi_uniquePropertySet = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Object uniqueProperty = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpointcut instanceCreation(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_28.setRuntimeParent(null);
        _jettag_c_get_30_28.setTagInfo(_td_c_get_30_28);
        _jettag_c_get_30_28.doStart(context, out);
        _jettag_c_get_30_28.doEnd();
        out.write(" _consumer): this(_consumer) && execution( ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_30_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_100); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_30_100.setRuntimeParent(null);
        _jettag_c_get_30_100.setTagInfo(_td_c_get_30_100);
        _jettag_c_get_30_100.doStart(context, out);
        _jettag_c_get_30_100.doEnd();
        out.write("+.new(..) );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tafter(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_8.setRuntimeParent(null);
        _jettag_c_get_32_8.setTagInfo(_td_c_get_32_8);
        _jettag_c_get_32_8.doStart(context, out);
        _jettag_c_get_32_8.doEnd();
        out.write(" _consumer) : instanceCreation( _consumer ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsafeAddObject( _consumer );");  //$NON-NLS-1$        
        out.write(NL);         
        //<c:if test="count($uniqueProperty) = 0">
        RuntimeTagElement _jettag_c_if_35_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_35_3.setRuntimeParent(null);
        _jettag_c_if_35_3.setTagInfo(_td_c_if_35_3);
        _jettag_c_if_35_3.doStart(context, out);
        while (_jettag_c_if_35_3.okToProcessBody()) {
            out.write("\t\tlumi_uniquePropertySet = true;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_35_3.handleBodyContent(out);
        }
        _jettag_c_if_35_3.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        //<c:if test="count($uniqueProperty) > 0">
        RuntimeTagElement _jettag_c_if_41_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_41_2.setRuntimeParent(null);
        _jettag_c_if_41_2.setTagInfo(_td_c_if_41_2);
        _jettag_c_if_41_2.doStart(context, out);
        while (_jettag_c_if_41_2.okToProcessBody()) {
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_42_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_42_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_42_4.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_log_42_4.setTagInfo(_td_c_log_42_4);
            _jettag_c_log_42_4.doStart(context, out);
            JET2Writer _jettag_c_log_42_4_saved_out = out;
            while (_jettag_c_log_42_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Uniqueness Property set to ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_42_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_42_38.setRuntimeParent(_jettag_c_log_42_4);
                _jettag_c_get_42_38.setTagInfo(_td_c_get_42_38);
                _jettag_c_get_42_38.doStart(context, out);
                _jettag_c_get_42_38.doEnd();
                _jettag_c_log_42_4.handleBodyContent(out);
            }
            out = _jettag_c_log_42_4_saved_out;
            _jettag_c_log_42_4.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tpointcut setUniqueProperty( ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_44_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_30); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_44_30.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_44_30.setTagInfo(_td_c_get_44_30);
            _jettag_c_get_44_30.doStart(context, out);
            _jettag_c_get_44_30.doEnd();
            out.write(" _consumer ): target(_consumer) &&");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tcall( * ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_45_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_45_11.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_45_11.setTagInfo(_td_c_get_45_11);
            _jettag_c_get_45_11.doStart(context, out);
            _jettag_c_get_45_11.doEnd();
            out.write("+.set");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_45_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_45_45.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_45_45.setTagInfo(_td_c_get_45_45);
            _jettag_c_get_45_45.doStart(context, out);
            _jettag_c_get_45_45.doEnd();
            out.write("(..) );");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tbefore( ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_47_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_47_10.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_47_10.setTagInfo(_td_c_get_47_10);
            _jettag_c_get_47_10.doStart(context, out);
            _jettag_c_get_47_10.doEnd();
            out.write(" _consumer ): setUniqueProperty( _consumer ) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif ( lumi_uniquePropertySet ) { ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tuniqueProperty = _consumer.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_49_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_34); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_49_34.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_49_34.setTagInfo(_td_c_get_49_34);
            _jettag_c_get_49_34.doStart(context, out);
            _jettag_c_get_49_34.doEnd();
            out.write("();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tafter( ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_9.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_53_9.setTagInfo(_td_c_get_53_9);
            _jettag_c_get_53_9.doStart(context, out);
            _jettag_c_get_53_9.doEnd();
            out.write(" _consumer ): setUniqueProperty( _consumer ) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif ( propertyHasChanged( uniqueProperty, _consumer.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_54_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_54_57.setRuntimeParent(_jettag_c_if_41_2);
            _jettag_c_get_54_57.setTagInfo(_td_c_get_54_57);
            _jettag_c_get_54_57.doStart(context, out);
            _jettag_c_get_54_57.doEnd();
            out.write("() ) ) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tlumi_uniquePropertySet = true;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tupdateContainer( uniqueProperty, _consumer );");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_41_2.handleBodyContent(out);
        }
        _jettag_c_if_41_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_62_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_62_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_62_2.setRuntimeParent(null);
        _jettag_c_if_62_2.setTagInfo(_td_c_if_62_2);
        _jettag_c_if_62_2.doStart(context, out);
        while (_jettag_c_if_62_2.okToProcessBody()) {
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_63_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_63_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_63_5.setRuntimeParent(_jettag_c_if_62_2);
            _jettag_c_log_63_5.setTagInfo(_td_c_log_63_5);
            _jettag_c_log_63_5.doStart(context, out);
            JET2Writer _jettag_c_log_63_5_saved_out = out;
            while (_jettag_c_log_63_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Uniqueness Property hashCode  (default)");  //$NON-NLS-1$        
                _jettag_c_log_63_5.handleBodyContent(out);
            }
            out = _jettag_c_log_63_5_saved_out;
            _jettag_c_log_63_5.doEnd();
            out.write(NL);         
            out.write("\tpointcut setUniqueProperty( ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_64_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_30); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_30.setRuntimeParent(_jettag_c_if_62_2);
            _jettag_c_get_64_30.setTagInfo(_td_c_get_64_30);
            _jettag_c_get_64_30.doStart(context, out);
            _jettag_c_get_64_30.doEnd();
            out.write(" _consumer ): target(_consumer) &&");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tcall( * ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_65_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_65_11.setRuntimeParent(_jettag_c_if_62_2);
            _jettag_c_get_65_11.setTagInfo(_td_c_get_65_11);
            _jettag_c_get_65_11.doStart(context, out);
            _jettag_c_get_65_11.doEnd();
            out.write("+.set*(..) );");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tbefore( ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_10.setRuntimeParent(_jettag_c_if_62_2);
            _jettag_c_get_67_10.setTagInfo(_td_c_get_67_10);
            _jettag_c_get_67_10.doStart(context, out);
            _jettag_c_get_67_10.doEnd();
            out.write(" _consumer ): setUniqueProperty( _consumer ) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif ( lumi_uniquePropertySet ) { ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tuniqueProperty = _consumer.hashCode();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\tafter( ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_73_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_73_9.setRuntimeParent(_jettag_c_if_62_2);
            _jettag_c_get_73_9.setTagInfo(_td_c_get_73_9);
            _jettag_c_get_73_9.doStart(context, out);
            _jettag_c_get_73_9.doEnd();
            out.write(" _consumer ): setUniqueProperty( _consumer ) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tif ( propertyHasChanged( uniqueProperty, _consumer.hashCode() ) ) {");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tlumi_uniquePropertySet = true;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\tupdateContainer( uniqueProperty, _consumer );");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t}");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t}\t");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_62_2.handleBodyContent(out);
        }
        _jettag_c_if_62_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate boolean propertyHasChanged( Object uniqueProperty, Object newPropertyValue ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ( uniqueProperty == null && newPropertyValue != null ) ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ( uniqueProperty != null ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn ! uniqueProperty.equals( newPropertyValue );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate void updateContainer( Object oldKey, ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_90_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_90_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_90_47.setRuntimeParent(null);
        _jettag_c_get_90_47.setTagInfo(_td_c_get_90_47);
        _jettag_c_get_90_47.doStart(context, out);
        _jettag_c_get_90_47.doEnd();
        out.write(" updatedObject ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_91_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_91_3.setRuntimeParent(null);
        _jettag_c_get_91_3.setTagInfo(_td_c_get_91_3);
        _jettag_c_get_91_3.doStart(context, out);
        _jettag_c_get_91_3.doEnd();
        out.write("_UniqueContainer.removeElement(oldKey, updatedObject);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsafeAddObject( updatedObject );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate void safeAddObject( ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_95_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_95_30.setRuntimeParent(null);
        _jettag_c_get_95_30.setTagInfo(_td_c_get_95_30);
        _jettag_c_get_95_30.doStart(context, out);
        _jettag_c_get_95_30.doEnd();
        out.write(" newValue ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//grab the element, dump it into the static container, catch the exception\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_98_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_98_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_98_3.setRuntimeParent(null);
        _jettag_c_if_98_3.setTagInfo(_td_c_if_98_3);
        _jettag_c_if_98_3.doStart(context, out);
        while (_jettag_c_if_98_3.okToProcessBody()) {
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_99_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_99_4.setRuntimeParent(_jettag_c_if_98_3);
            _jettag_c_get_99_4.setTagInfo(_td_c_get_99_4);
            _jettag_c_get_99_4.doStart(context, out);
            _jettag_c_get_99_4.doEnd();
            out.write("_UniqueContainer.<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_99_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_99_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_99_55.setRuntimeParent(_jettag_c_if_98_3);
            _jettag_c_get_99_55.setTagInfo(_td_c_get_99_55);
            _jettag_c_get_99_55.doStart(context, out);
            _jettag_c_get_99_55.doEnd();
            out.write(">addElement( newValue.hashCode(), newValue );");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_98_3.handleBodyContent(out);
        }
        _jettag_c_if_98_3.doEnd();
        RuntimeTagElement _jettag_c_if_101_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_101_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_101_3.setRuntimeParent(null);
        _jettag_c_if_101_3.setTagInfo(_td_c_if_101_3);
        _jettag_c_if_101_3.doStart(context, out);
        while (_jettag_c_if_101_3.okToProcessBody()) {
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_102_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_102_4.setRuntimeParent(_jettag_c_if_101_3);
            _jettag_c_get_102_4.setTagInfo(_td_c_get_102_4);
            _jettag_c_get_102_4.doStart(context, out);
            _jettag_c_get_102_4.doEnd();
            out.write("_UniqueContainer.<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_102_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_102_55.setRuntimeParent(_jettag_c_if_101_3);
            _jettag_c_get_102_55.setTagInfo(_td_c_get_102_55);
            _jettag_c_get_102_55.doStart(context, out);
            _jettag_c_get_102_55.doEnd();
            out.write(">addElement( newValue.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_102_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_102_109); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_102_109.setRuntimeParent(_jettag_c_if_101_3);
            _jettag_c_get_102_109.setTagInfo(_td_c_get_102_109);
            _jettag_c_get_102_109.doStart(context, out);
            _jettag_c_get_102_109.doEnd();
            out.write("(), newValue );");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_101_3.handleBodyContent(out);
        }
        _jettag_c_if_101_3.doEnd();
        out.write("\t\t} catch (AssertionViolatedException exception ) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_105_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_105_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_105_4.setRuntimeParent(null);
        _jettag_c_if_105_4.setTagInfo(_td_c_if_105_4);
        _jettag_c_if_105_4.doStart(context, out);
        while (_jettag_c_if_105_4.okToProcessBody()) {
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_106_4.setRuntimeParent(_jettag_c_if_105_4);
            _jettag_c_get_106_4.setTagInfo(_td_c_get_106_4);
            _jettag_c_get_106_4.doStart(context, out);
            _jettag_c_get_106_4.doEnd();
            out.write("_UniqueContainer.<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_106_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_106_55.setRuntimeParent(_jettag_c_if_105_4);
            _jettag_c_get_106_55.setTagInfo(_td_c_get_106_55);
            _jettag_c_get_106_55.doStart(context, out);
            _jettag_c_get_106_55.doEnd();
            out.write(">forcedAdd( newValue.hashCode(), newValue );");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\texception.getMessage() + \": trying to add key \\\"\" + newValue.hashCode() + \"\\\" for type \" +  newValue.getClass(),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_110_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_110_4.setRuntimeParent(_jettag_c_if_105_4);
            _jettag_c_get_110_4.setTagInfo(_td_c_get_110_4);
            _jettag_c_get_110_4.doStart(context, out);
            _jettag_c_get_110_4.doEnd();
            out.write("_UniqueContainer.<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_110_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_110_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_110_55.setRuntimeParent(_jettag_c_if_105_4);
            _jettag_c_get_110_55.setTagInfo(_td_c_get_110_55);
            _jettag_c_get_110_55.doStart(context, out);
            _jettag_c_get_110_55.doEnd();
            out.write(">forcedAdd( newValue.hashCode(), newValue );");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_105_4.handleBodyContent(out);
        }
        _jettag_c_if_105_4.doEnd();
        RuntimeTagElement _jettag_c_if_112_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_112_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_112_4.setRuntimeParent(null);
        _jettag_c_if_112_4.setTagInfo(_td_c_if_112_4);
        _jettag_c_if_112_4.doStart(context, out);
        while (_jettag_c_if_112_4.okToProcessBody()) {
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_113_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_113_5.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_113_5.setTagInfo(_td_c_get_113_5);
            _jettag_c_get_113_5.doStart(context, out);
            _jettag_c_get_113_5.doEnd();
            out.write("_UniqueContainer.<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_113_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_113_56.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_113_56.setTagInfo(_td_c_get_113_56);
            _jettag_c_get_113_56.doStart(context, out);
            _jettag_c_get_113_56.doEnd();
            out.write(">forcedAdd( newValue.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_113_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_113_109); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_113_109.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_113_109.setTagInfo(_td_c_get_113_109);
            _jettag_c_get_113_109.doStart(context, out);
            _jettag_c_get_113_109.doEnd();
            out.write("(), newValue );");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\texception.getMessage() + \": trying to add key \\\"\" + newValue.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_115_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_115_70); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_115_70.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_115_70.setTagInfo(_td_c_get_115_70);
            _jettag_c_get_115_70.doStart(context, out);
            _jettag_c_get_115_70.doEnd();
            out.write("() + \"\\\" for type \" +  newValue.getClass(),");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_117_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_117_5.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_117_5.setTagInfo(_td_c_get_117_5);
            _jettag_c_get_117_5.doStart(context, out);
            _jettag_c_get_117_5.doEnd();
            out.write("_UniqueContainer.<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_117_56 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_56); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_117_56.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_117_56.setTagInfo(_td_c_get_117_56);
            _jettag_c_get_117_56.doStart(context, out);
            _jettag_c_get_117_56.doEnd();
            out.write(">forcedAdd( newValue.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_117_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_117_109); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_117_109.setRuntimeParent(_jettag_c_if_112_4);
            _jettag_c_get_117_109.setTagInfo(_td_c_get_117_109);
            _jettag_c_get_117_109.doStart(context, out);
            _jettag_c_get_117_109.doEnd();
            out.write("(), newValue );");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_112_4.handleBodyContent(out);
        }
        _jettag_c_if_112_4.doEnd();
        out.write("\t\t} ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
