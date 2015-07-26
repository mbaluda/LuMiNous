package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_uniqueAnalysis implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_uniqueAnalysis() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueApplication/@UniquenessProperty", //$NON-NLS-1$
                "uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueApplication/@base_Class", //$NON-NLS-1$
                "application_classId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($application_classId) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($application_classId) > 0", //$NON-NLS-1$
                "isClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "-1 > 0", //$NON-NLS-1$
                "isAssociation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$application_classId]", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_14_5 = new TagInfo("c:log", //$NON-NLS-1$
            14, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_14_40 = new TagInfo("c:get", //$NON-NLS-1$
            14, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$class/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_16_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            16, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_5 = new TagInfo("c:include", //$NON-NLS-1$
            17, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_20_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueApplication/@base_Association", //$NON-NLS-1$
                "application_associationId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_1 = new TagInfo("c:if", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($application_associationId) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_23_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "-1 > 0", //$NON-NLS-1$
                "isClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($application_associationId) > 0", //$NON-NLS-1$
                "isAssociation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$application_associationId]", //$NON-NLS-1$
                "association", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_26_5 = new TagInfo("c:log", //$NON-NLS-1$
            26, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_26_46 = new TagInfo("c:get", //$NON-NLS-1$
            26, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$association/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_29_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            29, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "substring-after($association/@memberEnd[1], ' ')", //$NON-NLS-1$
                "ownedEndId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedEnd[@id=$ownedEndId]/@type", //$NON-NLS-1$
                "ownedEndType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_31_5 = new TagInfo("c:if", //$NON-NLS-1$
            31, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ownedEndType) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_32_6 = new TagInfo("c:setVariable", //$NON-NLS-1$
            32, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "substring-before($association/@memberEnd[1], ' ')", //$NON-NLS-1$
                "ownedEndId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_6 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedEnd[@id=$ownedEndId]/@type", //$NON-NLS-1$
                "ownedEndType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_35_5 = new TagInfo("c:log", //$NON-NLS-1$
            35, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_35_22 = new TagInfo("c:get", //$NON-NLS-1$
            35, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//ownedEnd[@id=$ownedEndId]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_83 = new TagInfo("c:get", //$NON-NLS-1$
            35, 83,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ownedEndType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$ownedEndType]", //$NON-NLS-1$
                "containerClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_37_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            37, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "substring-before($association/@memberEnd[1], ' ')", //$NON-NLS-1$
                "ownedAttributeId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_38_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            38, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedAttribute[@id=$ownedAttributeId]/@type", //$NON-NLS-1$
                "ownedAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_5 = new TagInfo("c:if", //$NON-NLS-1$
            39, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ownedAttributeType) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_40_6 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "substring-after($association/@memberEnd[1], ' ')", //$NON-NLS-1$
                "ownedAttributeId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_41_6 = new TagInfo("c:setVariable", //$NON-NLS-1$
            41, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedAttribute[@id=$ownedAttributeId]/@type", //$NON-NLS-1$
                "ownedAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_43_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            43, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$ownedAttributeType]", //$NON-NLS-1$
                "containedClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_44_5 = new TagInfo("c:log", //$NON-NLS-1$
            44, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_44_24 = new TagInfo("c:get", //$NON-NLS-1$
            44, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$association/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_79 = new TagInfo("c:get", //$NON-NLS-1$
            44, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containerClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_137 = new TagInfo("c:get", //$NON-NLS-1$
            44, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//ownedAttribute[@id=$ownedAttributeId]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_226 = new TagInfo("c:get", //$NON-NLS-1$
            44, 226,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedAttribute[@id=$ownedAttributeId]/@name", //$NON-NLS-1$
                "containerAttributeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$containerClass", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_48_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            48, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_49_5 = new TagInfo("c:include", //$NON-NLS-1$
            49, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // Get the name of the property that makes elements unique 
        RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_3_1.setRuntimeParent(null);
        _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
        _jettag_c_setVariable_3_1.doStart(context, out);
        _jettag_c_setVariable_3_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // First determine whether its a class or an association application 
        RuntimeTagElement _jettag_c_setVariable_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_7_1.setRuntimeParent(null);
        _jettag_c_setVariable_7_1.setTagInfo(_td_c_setVariable_7_1);
        _jettag_c_setVariable_7_1.doStart(context, out);
        _jettag_c_setVariable_7_1.doEnd();
        RuntimeTagElement _jettag_c_if_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_1.setRuntimeParent(null);
        _jettag_c_if_8_1.setTagInfo(_td_c_if_8_1);
        _jettag_c_if_8_1.doStart(context, out);
        while (_jettag_c_if_8_1.okToProcessBody()) {
            // it is a class 
            RuntimeTagElement _jettag_c_setVariable_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_10_2.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_setVariable_10_2.setTagInfo(_td_c_setVariable_10_2);
            _jettag_c_setVariable_10_2.doStart(context, out);
            _jettag_c_setVariable_10_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_11_2.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_setVariable_11_2.setTagInfo(_td_c_setVariable_11_2);
            _jettag_c_setVariable_11_2.doStart(context, out);
            _jettag_c_setVariable_11_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_13_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_13_5.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_setVariable_13_5.setTagInfo(_td_c_setVariable_13_5);
            _jettag_c_setVariable_13_5.doStart(context, out);
            _jettag_c_setVariable_13_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_14_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_14_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_14_5.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_log_14_5.setTagInfo(_td_c_log_14_5);
            _jettag_c_log_14_5.doStart(context, out);
            JET2Writer _jettag_c_log_14_5_saved_out = out;
            while (_jettag_c_log_14_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Stereotype applied to CLASS ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_14_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_40.setRuntimeParent(_jettag_c_log_14_5);
                _jettag_c_get_14_40.setTagInfo(_td_c_get_14_40);
                _jettag_c_get_14_40.doStart(context, out);
                _jettag_c_get_14_40.doEnd();
                _jettag_c_log_14_5.handleBodyContent(out);
            }
            out = _jettag_c_log_14_5_saved_out;
            _jettag_c_log_14_5.doEnd();
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_16_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_16_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_16_5.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_setVariable_16_5.setTagInfo(_td_c_setVariable_16_5);
            _jettag_c_setVariable_16_5.doStart(context, out);
            _jettag_c_setVariable_16_5.doEnd();
            RuntimeTagElement _jettag_c_include_17_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_17_5.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_include_17_5.setTagInfo(_td_c_include_17_5);
            _jettag_c_include_17_5.doStart(context, out);
            _jettag_c_include_17_5.doEnd();
            _jettag_c_if_8_1.handleBodyContent(out);
        }
        _jettag_c_if_8_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_20_1.setRuntimeParent(null);
        _jettag_c_setVariable_20_1.setTagInfo(_td_c_setVariable_20_1);
        _jettag_c_setVariable_20_1.doStart(context, out);
        _jettag_c_setVariable_20_1.doEnd();
        RuntimeTagElement _jettag_c_if_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_1.setRuntimeParent(null);
        _jettag_c_if_21_1.setTagInfo(_td_c_if_21_1);
        _jettag_c_if_21_1.doStart(context, out);
        while (_jettag_c_if_21_1.okToProcessBody()) {
            // it is an association 
            RuntimeTagElement _jettag_c_setVariable_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_23_2.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_23_2.setTagInfo(_td_c_setVariable_23_2);
            _jettag_c_setVariable_23_2.doStart(context, out);
            _jettag_c_setVariable_23_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_24_2.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_24_2.setTagInfo(_td_c_setVariable_24_2);
            _jettag_c_setVariable_24_2.doStart(context, out);
            _jettag_c_setVariable_24_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_25_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_25_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_25_5.setTagInfo(_td_c_setVariable_25_5);
            _jettag_c_setVariable_25_5.doStart(context, out);
            _jettag_c_setVariable_25_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_26_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_26_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_26_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_log_26_5.setTagInfo(_td_c_log_26_5);
            _jettag_c_log_26_5.doStart(context, out);
            JET2Writer _jettag_c_log_26_5_saved_out = out;
            while (_jettag_c_log_26_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Stereotype applied to ASSOCIATION ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_46.setRuntimeParent(_jettag_c_log_26_5);
                _jettag_c_get_26_46.setTagInfo(_td_c_get_26_46);
                _jettag_c_get_26_46.doStart(context, out);
                _jettag_c_get_26_46.doEnd();
                _jettag_c_log_26_5.handleBodyContent(out);
            }
            out = _jettag_c_log_26_5_saved_out;
            _jettag_c_log_26_5.doEnd();
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            // we assume that the assoc has an ownedEnd referencing the association itself 
            RuntimeTagElement _jettag_c_setVariable_29_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_29_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_29_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_29_5.setTagInfo(_td_c_setVariable_29_5);
            _jettag_c_setVariable_29_5.doStart(context, out);
            _jettag_c_setVariable_29_5.doEnd();
            RuntimeTagElement _jettag_c_setVariable_30_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_30_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_30_5.setTagInfo(_td_c_setVariable_30_5);
            _jettag_c_setVariable_30_5.doStart(context, out);
            _jettag_c_setVariable_30_5.doEnd();
            RuntimeTagElement _jettag_c_if_31_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_31_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_31_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_if_31_5.setTagInfo(_td_c_if_31_5);
            _jettag_c_if_31_5.doStart(context, out);
            while (_jettag_c_if_31_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_32_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_32_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_32_6.setRuntimeParent(_jettag_c_if_31_5);
                _jettag_c_setVariable_32_6.setTagInfo(_td_c_setVariable_32_6);
                _jettag_c_setVariable_32_6.doStart(context, out);
                _jettag_c_setVariable_32_6.doEnd();
                RuntimeTagElement _jettag_c_setVariable_33_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_33_6.setRuntimeParent(_jettag_c_if_31_5);
                _jettag_c_setVariable_33_6.setTagInfo(_td_c_setVariable_33_6);
                _jettag_c_setVariable_33_6.doStart(context, out);
                _jettag_c_setVariable_33_6.doEnd();
                _jettag_c_if_31_5.handleBodyContent(out);
            }
            _jettag_c_if_31_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_35_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_35_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_35_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_log_35_5.setTagInfo(_td_c_log_35_5);
            _jettag_c_log_35_5.doStart(context, out);
            JET2Writer _jettag_c_log_35_5_saved_out = out;
            while (_jettag_c_log_35_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Owned end ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_22.setRuntimeParent(_jettag_c_log_35_5);
                _jettag_c_get_35_22.setTagInfo(_td_c_get_35_22);
                _jettag_c_get_35_22.doStart(context, out);
                _jettag_c_get_35_22.doEnd();
                out.write(" has type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_83 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_83); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_83.setRuntimeParent(_jettag_c_log_35_5);
                _jettag_c_get_35_83.setTagInfo(_td_c_get_35_83);
                _jettag_c_get_35_83.doStart(context, out);
                _jettag_c_get_35_83.doEnd();
                _jettag_c_log_35_5.handleBodyContent(out);
            }
            out = _jettag_c_log_35_5_saved_out;
            _jettag_c_log_35_5.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_36_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_36_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_36_5.setTagInfo(_td_c_setVariable_36_5);
            _jettag_c_setVariable_36_5.doStart(context, out);
            _jettag_c_setVariable_36_5.doEnd();
            RuntimeTagElement _jettag_c_setVariable_37_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_37_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_37_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_37_5.setTagInfo(_td_c_setVariable_37_5);
            _jettag_c_setVariable_37_5.doStart(context, out);
            _jettag_c_setVariable_37_5.doEnd();
            RuntimeTagElement _jettag_c_setVariable_38_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_38_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_38_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_38_5.setTagInfo(_td_c_setVariable_38_5);
            _jettag_c_setVariable_38_5.doStart(context, out);
            _jettag_c_setVariable_38_5.doEnd();
            RuntimeTagElement _jettag_c_if_39_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_39_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_if_39_5.setTagInfo(_td_c_if_39_5);
            _jettag_c_if_39_5.doStart(context, out);
            while (_jettag_c_if_39_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_40_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_40_6.setRuntimeParent(_jettag_c_if_39_5);
                _jettag_c_setVariable_40_6.setTagInfo(_td_c_setVariable_40_6);
                _jettag_c_setVariable_40_6.doStart(context, out);
                _jettag_c_setVariable_40_6.doEnd();
                RuntimeTagElement _jettag_c_setVariable_41_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_41_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_41_6.setRuntimeParent(_jettag_c_if_39_5);
                _jettag_c_setVariable_41_6.setTagInfo(_td_c_setVariable_41_6);
                _jettag_c_setVariable_41_6.doStart(context, out);
                _jettag_c_setVariable_41_6.doEnd();
                _jettag_c_if_39_5.handleBodyContent(out);
            }
            _jettag_c_if_39_5.doEnd();
            RuntimeTagElement _jettag_c_setVariable_43_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_43_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_43_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_43_5.setTagInfo(_td_c_setVariable_43_5);
            _jettag_c_setVariable_43_5.doStart(context, out);
            _jettag_c_setVariable_43_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_log_44_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_44_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_log_44_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_log_44_5.setTagInfo(_td_c_log_44_5);
            _jettag_c_log_44_5.doStart(context, out);
            JET2Writer _jettag_c_log_44_5_saved_out = out;
            while (_jettag_c_log_44_5.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("Association ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_24.setRuntimeParent(_jettag_c_log_44_5);
                _jettag_c_get_44_24.setTagInfo(_td_c_get_44_24);
                _jettag_c_get_44_24.doStart(context, out);
                _jettag_c_get_44_24.doEnd();
                out.write(" is owned by class ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_79.setRuntimeParent(_jettag_c_log_44_5);
                _jettag_c_get_44_79.setTagInfo(_td_c_get_44_79);
                _jettag_c_get_44_79.doStart(context, out);
                _jettag_c_get_44_79.doEnd();
                out.write(" through attribute ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_137); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_137.setRuntimeParent(_jettag_c_log_44_5);
                _jettag_c_get_44_137.setTagInfo(_td_c_get_44_137);
                _jettag_c_get_44_137.doStart(context, out);
                _jettag_c_get_44_137.doEnd();
                out.write(" and has ownedEnd of type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_226 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_226); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_226.setRuntimeParent(_jettag_c_log_44_5);
                _jettag_c_get_44_226.setTagInfo(_td_c_get_44_226);
                _jettag_c_get_44_226.doStart(context, out);
                _jettag_c_get_44_226.doEnd();
                _jettag_c_log_44_5.handleBodyContent(out);
            }
            out = _jettag_c_log_44_5_saved_out;
            _jettag_c_log_44_5.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_45_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_45_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_45_5.setTagInfo(_td_c_setVariable_45_5);
            _jettag_c_setVariable_45_5.doStart(context, out);
            _jettag_c_setVariable_45_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_47_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_47_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_47_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_47_5.setTagInfo(_td_c_setVariable_47_5);
            _jettag_c_setVariable_47_5.doStart(context, out);
            _jettag_c_setVariable_47_5.doEnd();
            RuntimeTagElement _jettag_c_setVariable_48_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_48_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_48_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_setVariable_48_5.setTagInfo(_td_c_setVariable_48_5);
            _jettag_c_setVariable_48_5.doStart(context, out);
            _jettag_c_setVariable_48_5.doEnd();
            RuntimeTagElement _jettag_c_include_49_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_49_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_49_5.setRuntimeParent(_jettag_c_if_21_1);
            _jettag_c_include_49_5.setTagInfo(_td_c_include_49_5);
            _jettag_c_include_49_5.doStart(context, out);
            _jettag_c_include_49_5.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            // Find a potential container association for the elements 
            // This is a safety check, disabled and not working 
            //	<c:iterate select="//packagedElement[@type='uml:Association']" var="association">
            //		
            //			<c:setVariable select="$owningAttribute/upperValue" var="upperBound"/>
            //			<c:if test="$upperBound/@type='uml:LiteralUnlimitedNatural' or $upperBound/@type='uml:LiteralInteger' and $upperBound/@value>1">
            //				<c:log>
            //Detected container class <c:get select="$owningClass/@name"/> for <c:get select="$ownedEndType/@name"/>	</c:log>
            //			</c:if>
            //	</c:iterate> 
            _jettag_c_if_21_1.handleBodyContent(out);
        }
        _jettag_c_if_21_1.doEnd();
        out.write(NL);         
        out.write(NL);         
    }
}
