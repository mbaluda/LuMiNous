package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_folder_5_1 = new TagInfo("ws:folder", //$NON-NLS-1$
            5, 1,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$org.eclipse.jet.resource.project.name}/src/", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "''", //$NON-NLS-1$
                "aopxml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/Immutable/@base_Class", //$NON-NLS-1$
                "classId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$classId]", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_5 = new TagInfo("c:include", //$NON-NLS-1$
            14, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_15_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            15, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_16_5 = new TagInfo("ws:file", //$NON-NLS-1$
            16, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/Immutable.aj.jet", //$NON-NLS-1$
                "{$classFileName}_Immutable.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/Initialized/@base_Class", //$NON-NLS-1$
                "classId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$classId/..", //$NON-NLS-1$
                "initialized", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$classId]", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_2 = new TagInfo("c:include", //$NON-NLS-1$
            29, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_32_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            32, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedOperation[@id=$initialized/@Initializer]", //$NON-NLS-1$
                "op", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/@name", //$NON-NLS-1$
                "opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/..", //$NON-NLS-1$
                "opClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_37_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            37, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'opClass'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_38_2 = new TagInfo("c:include", //$NON-NLS-1$
            38, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_40_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            40, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_41_5 = new TagInfo("ws:file", //$NON-NLS-1$
            41, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/NotNullInitialized.aj.jet", //$NON-NLS-1$
                "{$classFileName}_NotNullInitialized.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_43_5 = new TagInfo("ws:file", //$NON-NLS-1$
            43, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/Initialized.aj.jet", //$NON-NLS-1$
                "{$classFileName}_Initialized.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_50_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            50, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/Unique", //$NON-NLS-1$
                "uniqueApplication", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_51_2 = new TagInfo("c:log", //$NON-NLS-1$
            51, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_51_53 = new TagInfo("c:get", //$NON-NLS-1$
            51, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueApplication/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_52_2 = new TagInfo("c:include", //$NON-NLS-1$
            52, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/uniqueAnalysis.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_5 = new TagInfo("c:if", //$NON-NLS-1$
            55, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$isClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_56_6 = new TagInfo("ws:folder", //$NON-NLS-1$
            56, 6,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_57_7 = new TagInfo("ws:file", //$NON-NLS-1$
            57, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/GlobalUnique.aj.jet", //$NON-NLS-1$
                "{$classFileName}_Unique.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_59_7 = new TagInfo("ws:file", //$NON-NLS-1$
            59, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/UniqueContainer.java.jet", //$NON-NLS-1$
                "{$classFileName}_UniqueContainer.java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_63_5 = new TagInfo("c:if", //$NON-NLS-1$
            63, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$isAssociation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_64_6 = new TagInfo("ws:folder", //$NON-NLS-1$
            64, 6,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_65_7 = new TagInfo("ws:file", //$NON-NLS-1$
            65, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/AssociationUnique.aj.jet", //$NON-NLS-1$
                "{$classFileName}_Unique.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_71_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            71, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "ch/unisi/inf/luminous", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_72_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            72, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/AssertionViolatedException.java", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "AssertionViolatedException.java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_74_6 = new TagInfo("c:if", //$NON-NLS-1$
            74, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$isAssociation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_75_4 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            75, 4,
            new String[] {
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/UniqueCollectionTracker.java", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "UniqueCollectionTracker.java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_82_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            82, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/Language/@base_Parameter", //$NON-NLS-1$
                "parId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_83_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            83, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$parId/..", //$NON-NLS-1$
                "language", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_85_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            85, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$language/@regexp", //$NON-NLS-1$
                "regexp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_86_2 = new TagInfo("c:if", //$NON-NLS-1$
            86, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($regexp) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_87_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            87, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                " '.*' ", //$NON-NLS-1$
                "regexp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_90_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            90, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedParameter[@id=$parId]", //$NON-NLS-1$
                "par", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_91_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            91, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$par/@name", //$NON-NLS-1$
                "parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_93_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            93, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$par/..", //$NON-NLS-1$
                "op", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_94_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            94, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/@name", //$NON-NLS-1$
                "opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_96_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            96, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/..", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_98_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            98, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_99_5 = new TagInfo("c:include", //$NON-NLS-1$
            99, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_100_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            100, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_101_5 = new TagInfo("ws:file", //$NON-NLS-1$
            101, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/Language.aj.jet", //$NON-NLS-1$
                "{$classFileName}_{$opName}_{$parName}_Language.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_107_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            107, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/Language/@base_Property", //$NON-NLS-1$
                "propId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_108_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            108, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$propId/..", //$NON-NLS-1$
                "language", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_110_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            110, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$language/@regexp", //$NON-NLS-1$
                "regexp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_112_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            112, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedAttribute[@id=$propId]", //$NON-NLS-1$
                "prop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_113_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            113, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$prop/@name", //$NON-NLS-1$
                "propName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_115_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            115, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$prop/..", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_117_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            117, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_118_5 = new TagInfo("c:include", //$NON-NLS-1$
            118, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_119_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            119, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_120_5 = new TagInfo("ws:file", //$NON-NLS-1$
            120, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/LanguageProp.aj.jet", //$NON-NLS-1$
                "{$classFileName}_{$propName}_Language.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_126_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            126, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/NotNull/@base_Operation", //$NON-NLS-1$
                "opId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_128_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            128, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedOperation[@id=$opId]", //$NON-NLS-1$
                "op", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_129_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            129, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/@name", //$NON-NLS-1$
                "opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_131_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            131, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/..", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_133_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            133, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_134_5 = new TagInfo("c:include", //$NON-NLS-1$
            134, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_135_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            135, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_136_5 = new TagInfo("ws:file", //$NON-NLS-1$
            136, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/NotNullReturn.aj.jet", //$NON-NLS-1$
                "{$classFileName}_{$opName}_NotNullReturn.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_142_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            142, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/NotNull/@base_Parameter", //$NON-NLS-1$
                "parId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_144_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            144, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//ownedParameter[@id=$parId]", //$NON-NLS-1$
                "par", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_145_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            145, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$par/@name", //$NON-NLS-1$
                "parName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_147_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            147, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$par/..", //$NON-NLS-1$
                "op", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_148_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            148, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/@name", //$NON-NLS-1$
                "opName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_150_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            150, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$op/..", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_152_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            152, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_153_5 = new TagInfo("c:include", //$NON-NLS-1$
            153, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_154_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            154, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_155_5 = new TagInfo("ws:file", //$NON-NLS-1$
            155, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/NotNullParameter.aj.jet", //$NON-NLS-1$
                "{$classFileName}_{$opName}_{$parName}_NotNullParameter.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_161_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            161, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/explicit/@base_Realization", //$NON-NLS-1$
                "realId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_163_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            163, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interfaceRealization[@id=$realId] | //packagedElement[@id=$realId]", //$NON-NLS-1$
                "realization", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_log_164_2 = new TagInfo("c:log", //$NON-NLS-1$
            164, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_164_9 = new TagInfo("c:get", //$NON-NLS-1$
            164, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$realization", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_167_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            167, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$realization/@client]", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_169_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            169, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_170_5 = new TagInfo("c:include", //$NON-NLS-1$
            170, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_173_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            173, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$realization/@contract]", //$NON-NLS-1$
                "interface", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_175_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            175, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'interface'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_176_2 = new TagInfo("c:include", //$NON-NLS-1$
            176, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_178_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            178, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_179_5 = new TagInfo("ws:file", //$NON-NLS-1$
            179, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/explicitImplementation.aj.jet", //$NON-NLS-1$
                "{$classFileName}_implements_{$interfaceFileName}_explicitly.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_185_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            185, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/XMI/Comparable/@base_Class", //$NON-NLS-1$
                "classId", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_186_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            186, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//packagedElement[@id=$classId]", //$NON-NLS-1$
                "class", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_188_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            188, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "'class'", //$NON-NLS-1$
                "classVar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_189_5 = new TagInfo("c:include", //$NON-NLS-1$
            189, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/setClassPackage.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_191_5 = new TagInfo("ws:folder", //$NON-NLS-1$
            191, 5,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$classFolderName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_192_5 = new TagInfo("ws:file", //$NON-NLS-1$
            192, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/Comparable.aj.jet", //$NON-NLS-1$
                "{$classFileName}_Comparable.aj", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_198_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            198, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "META-INF", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_199_2 = new TagInfo("ws:file", //$NON-NLS-1$
            199, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/aop.xml.jet", //$NON-NLS-1$
                "aop.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // Main entry point for uml2aj 
        out.write(NL);         
        RuntimeTagElement _jettag_ws_folder_5_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_folder_5_1.setRuntimeParent(null);
        _jettag_ws_folder_5_1.setTagInfo(_td_ws_folder_5_1);
        _jettag_ws_folder_5_1.doStart(context, out);
        while (_jettag_ws_folder_5_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_7_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_setVariable_7_1.setTagInfo(_td_c_setVariable_7_1);
            _jettag_c_setVariable_7_1.doStart(context, out);
            _jettag_c_setVariable_7_1.doEnd();
            out.write(NL);         
            // create an aspect for every application of the Immutable property 
            RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_10_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
            _jettag_c_iterate_10_1.doStart(context, out);
            while (_jettag_c_iterate_10_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_11_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_11_5.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_setVariable_11_5.setTagInfo(_td_c_setVariable_11_5);
                _jettag_c_setVariable_11_5.doStart(context, out);
                _jettag_c_setVariable_11_5.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_13_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_13_5.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_setVariable_13_5.setTagInfo(_td_c_setVariable_13_5);
                _jettag_c_setVariable_13_5.doStart(context, out);
                _jettag_c_setVariable_13_5.doEnd();
                RuntimeTagElement _jettag_c_include_14_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_14_5.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_include_14_5.setTagInfo(_td_c_include_14_5);
                _jettag_c_include_14_5.doStart(context, out);
                _jettag_c_include_14_5.doEnd();
                RuntimeTagElement _jettag_ws_folder_15_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_15_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_15_5.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_ws_folder_15_5.setTagInfo(_td_ws_folder_15_5);
                _jettag_ws_folder_15_5.doStart(context, out);
                while (_jettag_ws_folder_15_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_16_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_16_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_16_5.setRuntimeParent(_jettag_ws_folder_15_5);
                    _jettag_ws_file_16_5.setTagInfo(_td_ws_file_16_5);
                    _jettag_ws_file_16_5.doStart(context, out);
                    _jettag_ws_file_16_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_15_5.handleBodyContent(out);
                }
                _jettag_ws_folder_15_5.doEnd();
                _jettag_c_iterate_10_1.handleBodyContent(out);
            }
            _jettag_c_iterate_10_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            // if the class uses the Initialized stereotype 
            RuntimeTagElement _jettag_c_iterate_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_23_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_23_1.setTagInfo(_td_c_iterate_23_1);
            _jettag_c_iterate_23_1.doStart(context, out);
            while (_jettag_c_iterate_23_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_24_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_24_2.setTagInfo(_td_c_setVariable_24_2);
                _jettag_c_setVariable_24_2.doStart(context, out);
                _jettag_c_setVariable_24_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_25_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_25_2.setTagInfo(_td_c_setVariable_25_2);
                _jettag_c_setVariable_25_2.doStart(context, out);
                _jettag_c_setVariable_25_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                // finding the Initializer enclosing class/package 
                RuntimeTagElement _jettag_c_setVariable_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_28_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_28_2.setTagInfo(_td_c_setVariable_28_2);
                _jettag_c_setVariable_28_2.doStart(context, out);
                _jettag_c_setVariable_28_2.doEnd();
                RuntimeTagElement _jettag_c_include_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_29_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_include_29_2.setTagInfo(_td_c_include_29_2);
                _jettag_c_include_29_2.doStart(context, out);
                _jettag_c_include_29_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                // finding the Initializer 
                RuntimeTagElement _jettag_c_setVariable_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_32_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_32_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_32_2.setTagInfo(_td_c_setVariable_32_2);
                _jettag_c_setVariable_32_2.doStart(context, out);
                _jettag_c_setVariable_32_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_33_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_33_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_33_2.setTagInfo(_td_c_setVariable_33_2);
                _jettag_c_setVariable_33_2.doStart(context, out);
                _jettag_c_setVariable_33_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                // finding the Initializer enclosing class/package 
                RuntimeTagElement _jettag_c_setVariable_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_36_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_36_2.setTagInfo(_td_c_setVariable_36_2);
                _jettag_c_setVariable_36_2.doStart(context, out);
                _jettag_c_setVariable_36_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_37_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_setVariable_37_2.setTagInfo(_td_c_setVariable_37_2);
                _jettag_c_setVariable_37_2.doStart(context, out);
                _jettag_c_setVariable_37_2.doEnd();
                RuntimeTagElement _jettag_c_include_38_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_38_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_38_2.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_c_include_38_2.setTagInfo(_td_c_include_38_2);
                _jettag_c_include_38_2.doStart(context, out);
                _jettag_c_include_38_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_ws_folder_40_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_40_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_40_5.setRuntimeParent(_jettag_c_iterate_23_1);
                _jettag_ws_folder_40_5.setTagInfo(_td_ws_folder_40_5);
                _jettag_ws_folder_40_5.doStart(context, out);
                while (_jettag_ws_folder_40_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_41_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_41_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_41_5.setRuntimeParent(_jettag_ws_folder_40_5);
                    _jettag_ws_file_41_5.setTagInfo(_td_ws_file_41_5);
                    _jettag_ws_file_41_5.doStart(context, out);
                    _jettag_ws_file_41_5.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_43_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_43_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_43_5.setRuntimeParent(_jettag_ws_folder_40_5);
                    _jettag_ws_file_43_5.setTagInfo(_td_ws_file_43_5);
                    _jettag_ws_file_43_5.doStart(context, out);
                    _jettag_ws_file_43_5.doEnd();
                    out.write("  ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_40_5.handleBodyContent(out);
                }
                _jettag_ws_folder_40_5.doEnd();
                _jettag_c_iterate_23_1.handleBodyContent(out);
            }
            _jettag_c_iterate_23_1.doEnd();
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            // Checking for uniquesness requires more work. We need to instantiate a single container class
            //tracking the existing unique elements 
            RuntimeTagElement _jettag_c_iterate_50_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_50_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_50_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_50_1.setTagInfo(_td_c_iterate_50_1);
            _jettag_c_iterate_50_1.doStart(context, out);
            while (_jettag_c_iterate_50_1.okToProcessBody()) {
                out.write("\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_log_51_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_51_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_log_51_2.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_log_51_2.setTagInfo(_td_c_log_51_2);
                _jettag_c_log_51_2.doStart(context, out);
                JET2Writer _jettag_c_log_51_2_saved_out = out;
                while (_jettag_c_log_51_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("Processing application of unique stereotype ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_51_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_53); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_51_53.setRuntimeParent(_jettag_c_log_51_2);
                    _jettag_c_get_51_53.setTagInfo(_td_c_get_51_53);
                    _jettag_c_get_51_53.doStart(context, out);
                    _jettag_c_get_51_53.doEnd();
                    _jettag_c_log_51_2.handleBodyContent(out);
                }
                out = _jettag_c_log_51_2_saved_out;
                _jettag_c_log_51_2.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_52_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_52_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_52_2.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_include_52_2.setTagInfo(_td_c_include_52_2);
                _jettag_c_include_52_2.doStart(context, out);
                _jettag_c_include_52_2.doEnd();
                out.write(NL);         
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_if_55_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_55_5.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_if_55_5.setTagInfo(_td_c_if_55_5);
                _jettag_c_if_55_5.doStart(context, out);
                while (_jettag_c_if_55_5.okToProcessBody()) {
                    RuntimeTagElement _jettag_ws_folder_56_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_56_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_56_6.setRuntimeParent(_jettag_c_if_55_5);
                    _jettag_ws_folder_56_6.setTagInfo(_td_ws_folder_56_6);
                    _jettag_ws_folder_56_6.doStart(context, out);
                    while (_jettag_ws_folder_56_6.okToProcessBody()) {
                        out.write("   \t\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_ws_file_57_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_57_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_57_7.setRuntimeParent(_jettag_ws_folder_56_6);
                        _jettag_ws_file_57_7.setTagInfo(_td_ws_file_57_7);
                        _jettag_ws_file_57_7.doStart(context, out);
                        _jettag_ws_file_57_7.doEnd();
                        out.write("   ");  //$NON-NLS-1$        
                        out.write(NL);         
                        out.write("    \t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_ws_file_59_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_59_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_59_7.setRuntimeParent(_jettag_ws_folder_56_6);
                        _jettag_ws_file_59_7.setTagInfo(_td_ws_file_59_7);
                        _jettag_ws_file_59_7.doStart(context, out);
                        _jettag_ws_file_59_7.doEnd();
                        out.write(NL);         
                        _jettag_ws_folder_56_6.handleBodyContent(out);
                    }
                    _jettag_ws_folder_56_6.doEnd();
                    _jettag_c_if_55_5.handleBodyContent(out);
                }
                _jettag_c_if_55_5.doEnd();
                RuntimeTagElement _jettag_c_if_63_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_63_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_63_5.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_c_if_63_5.setTagInfo(_td_c_if_63_5);
                _jettag_c_if_63_5.doStart(context, out);
                while (_jettag_c_if_63_5.okToProcessBody()) {
                    RuntimeTagElement _jettag_ws_folder_64_6 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_64_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_folder_64_6.setRuntimeParent(_jettag_c_if_63_5);
                    _jettag_ws_folder_64_6.setTagInfo(_td_ws_folder_64_6);
                    _jettag_ws_folder_64_6.doStart(context, out);
                    while (_jettag_ws_folder_64_6.okToProcessBody()) {
                        out.write("   \t\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_ws_file_65_7 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_65_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_file_65_7.setRuntimeParent(_jettag_ws_folder_64_6);
                        _jettag_ws_file_65_7.setTagInfo(_td_ws_file_65_7);
                        _jettag_ws_file_65_7.doStart(context, out);
                        _jettag_ws_file_65_7.doEnd();
                        out.write("   ");  //$NON-NLS-1$        
                        out.write(NL);         
                        _jettag_ws_folder_64_6.handleBodyContent(out);
                    }
                    _jettag_ws_folder_64_6.doEnd();
                    _jettag_c_if_63_5.handleBodyContent(out);
                }
                _jettag_c_if_63_5.doEnd();
                out.write(NL);         
                out.write("          ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_ws_folder_71_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_71_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_71_5.setRuntimeParent(_jettag_c_iterate_50_1);
                _jettag_ws_folder_71_5.setTagInfo(_td_ws_folder_71_5);
                _jettag_ws_folder_71_5.doStart(context, out);
                while (_jettag_ws_folder_71_5.okToProcessBody()) {
                    out.write("\t\t");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_copyFile_72_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_72_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_copyFile_72_3.setRuntimeParent(_jettag_ws_folder_71_5);
                    _jettag_ws_copyFile_72_3.setTagInfo(_td_ws_copyFile_72_3);
                    _jettag_ws_copyFile_72_3.doStart(context, out);
                    _jettag_ws_copyFile_72_3.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_if_74_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_74_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_74_6.setRuntimeParent(_jettag_ws_folder_71_5);
                    _jettag_c_if_74_6.setTagInfo(_td_c_if_74_6);
                    _jettag_c_if_74_6.doStart(context, out);
                    while (_jettag_c_if_74_6.okToProcessBody()) {
                        out.write("\t\t\t");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_ws_copyFile_75_4 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_75_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_ws_copyFile_75_4.setRuntimeParent(_jettag_c_if_74_6);
                        _jettag_ws_copyFile_75_4.setTagInfo(_td_ws_copyFile_75_4);
                        _jettag_ws_copyFile_75_4.doStart(context, out);
                        _jettag_ws_copyFile_75_4.doEnd();
                        out.write(NL);         
                        _jettag_c_if_74_6.handleBodyContent(out);
                    }
                    _jettag_c_if_74_6.doEnd();
                    _jettag_ws_folder_71_5.handleBodyContent(out);
                }
                _jettag_ws_folder_71_5.doEnd();
                _jettag_c_iterate_50_1.handleBodyContent(out);
            }
            _jettag_c_iterate_50_1.doEnd();
            out.write(NL);         
            // creating an aspect for every application of the Language property  on an operation
            RuntimeTagElement _jettag_c_iterate_82_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_82_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_82_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_82_1.setTagInfo(_td_c_iterate_82_1);
            _jettag_c_iterate_82_1.doStart(context, out);
            while (_jettag_c_iterate_82_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_83_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_83_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_83_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_83_2.setTagInfo(_td_c_setVariable_83_2);
                _jettag_c_setVariable_83_2.doStart(context, out);
                _jettag_c_setVariable_83_2.doEnd();
                // extracting the regexp 
                RuntimeTagElement _jettag_c_setVariable_85_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_85_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_85_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_85_2.setTagInfo(_td_c_setVariable_85_2);
                _jettag_c_setVariable_85_2.doStart(context, out);
                _jettag_c_setVariable_85_2.doEnd();
                RuntimeTagElement _jettag_c_if_86_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_86_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_86_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_if_86_2.setTagInfo(_td_c_if_86_2);
                _jettag_c_if_86_2.doStart(context, out);
                while (_jettag_c_if_86_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_87_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_87_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_87_3.setRuntimeParent(_jettag_c_if_86_2);
                    _jettag_c_setVariable_87_3.setTagInfo(_td_c_setVariable_87_3);
                    _jettag_c_setVariable_87_3.doStart(context, out);
                    _jettag_c_setVariable_87_3.doEnd();
                    _jettag_c_if_86_2.handleBodyContent(out);
                }
                _jettag_c_if_86_2.doEnd();
                // finding the affected parameter 
                RuntimeTagElement _jettag_c_setVariable_90_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_90_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_90_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_90_2.setTagInfo(_td_c_setVariable_90_2);
                _jettag_c_setVariable_90_2.doStart(context, out);
                _jettag_c_setVariable_90_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_91_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_91_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_91_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_91_2.setTagInfo(_td_c_setVariable_91_2);
                _jettag_c_setVariable_91_2.doStart(context, out);
                _jettag_c_setVariable_91_2.doEnd();
                // finding the containing operation 
                RuntimeTagElement _jettag_c_setVariable_93_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_93_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_93_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_93_2.setTagInfo(_td_c_setVariable_93_2);
                _jettag_c_setVariable_93_2.doStart(context, out);
                _jettag_c_setVariable_93_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_94_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_94_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_94_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_94_2.setTagInfo(_td_c_setVariable_94_2);
                _jettag_c_setVariable_94_2.doStart(context, out);
                _jettag_c_setVariable_94_2.doEnd();
                // finding the containing class 
                RuntimeTagElement _jettag_c_setVariable_96_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_96_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_96_2.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_96_2.setTagInfo(_td_c_setVariable_96_2);
                _jettag_c_setVariable_96_2.doStart(context, out);
                _jettag_c_setVariable_96_2.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_98_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_98_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_98_5.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_setVariable_98_5.setTagInfo(_td_c_setVariable_98_5);
                _jettag_c_setVariable_98_5.doStart(context, out);
                _jettag_c_setVariable_98_5.doEnd();
                RuntimeTagElement _jettag_c_include_99_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_99_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_99_5.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_c_include_99_5.setTagInfo(_td_c_include_99_5);
                _jettag_c_include_99_5.doStart(context, out);
                _jettag_c_include_99_5.doEnd();
                RuntimeTagElement _jettag_ws_folder_100_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_100_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_100_5.setRuntimeParent(_jettag_c_iterate_82_1);
                _jettag_ws_folder_100_5.setTagInfo(_td_ws_folder_100_5);
                _jettag_ws_folder_100_5.doStart(context, out);
                while (_jettag_ws_folder_100_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_101_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_101_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_101_5.setRuntimeParent(_jettag_ws_folder_100_5);
                    _jettag_ws_file_101_5.setTagInfo(_td_ws_file_101_5);
                    _jettag_ws_file_101_5.doStart(context, out);
                    _jettag_ws_file_101_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_100_5.handleBodyContent(out);
                }
                _jettag_ws_folder_100_5.doEnd();
                _jettag_c_iterate_82_1.handleBodyContent(out);
            }
            _jettag_c_iterate_82_1.doEnd();
            out.write(NL);         
            // creating an aspect for every application of the Language property on a UML Property 
            RuntimeTagElement _jettag_c_iterate_107_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_107_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_107_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_107_1.setTagInfo(_td_c_iterate_107_1);
            _jettag_c_iterate_107_1.doStart(context, out);
            while (_jettag_c_iterate_107_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_108_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_108_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_108_2.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_setVariable_108_2.setTagInfo(_td_c_setVariable_108_2);
                _jettag_c_setVariable_108_2.doStart(context, out);
                _jettag_c_setVariable_108_2.doEnd();
                // extracting the regexp 
                RuntimeTagElement _jettag_c_setVariable_110_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_110_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_110_2.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_setVariable_110_2.setTagInfo(_td_c_setVariable_110_2);
                _jettag_c_setVariable_110_2.doStart(context, out);
                _jettag_c_setVariable_110_2.doEnd();
                // finding the affected attribute 
                RuntimeTagElement _jettag_c_setVariable_112_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_112_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_112_2.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_setVariable_112_2.setTagInfo(_td_c_setVariable_112_2);
                _jettag_c_setVariable_112_2.doStart(context, out);
                _jettag_c_setVariable_112_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_113_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_113_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_113_2.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_setVariable_113_2.setTagInfo(_td_c_setVariable_113_2);
                _jettag_c_setVariable_113_2.doStart(context, out);
                _jettag_c_setVariable_113_2.doEnd();
                // finding the containing class 
                RuntimeTagElement _jettag_c_setVariable_115_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_115_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_115_2.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_setVariable_115_2.setTagInfo(_td_c_setVariable_115_2);
                _jettag_c_setVariable_115_2.doStart(context, out);
                _jettag_c_setVariable_115_2.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_117_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_117_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_117_5.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_setVariable_117_5.setTagInfo(_td_c_setVariable_117_5);
                _jettag_c_setVariable_117_5.doStart(context, out);
                _jettag_c_setVariable_117_5.doEnd();
                RuntimeTagElement _jettag_c_include_118_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_118_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_118_5.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_c_include_118_5.setTagInfo(_td_c_include_118_5);
                _jettag_c_include_118_5.doStart(context, out);
                _jettag_c_include_118_5.doEnd();
                RuntimeTagElement _jettag_ws_folder_119_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_119_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_119_5.setRuntimeParent(_jettag_c_iterate_107_1);
                _jettag_ws_folder_119_5.setTagInfo(_td_ws_folder_119_5);
                _jettag_ws_folder_119_5.doStart(context, out);
                while (_jettag_ws_folder_119_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_120_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_120_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_120_5.setRuntimeParent(_jettag_ws_folder_119_5);
                    _jettag_ws_file_120_5.setTagInfo(_td_ws_file_120_5);
                    _jettag_ws_file_120_5.doStart(context, out);
                    _jettag_ws_file_120_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_119_5.handleBodyContent(out);
                }
                _jettag_ws_folder_119_5.doEnd();
                _jettag_c_iterate_107_1.handleBodyContent(out);
            }
            _jettag_c_iterate_107_1.doEnd();
            out.write(NL);         
            // creating an aspect for every application of the NotNull property on operations 
            RuntimeTagElement _jettag_c_iterate_126_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_126_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_126_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_126_1.setTagInfo(_td_c_iterate_126_1);
            _jettag_c_iterate_126_1.doStart(context, out);
            while (_jettag_c_iterate_126_1.okToProcessBody()) {
                // finding the affected parameter 
                RuntimeTagElement _jettag_c_setVariable_128_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_128_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_128_2.setRuntimeParent(_jettag_c_iterate_126_1);
                _jettag_c_setVariable_128_2.setTagInfo(_td_c_setVariable_128_2);
                _jettag_c_setVariable_128_2.doStart(context, out);
                _jettag_c_setVariable_128_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_129_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_129_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_129_2.setRuntimeParent(_jettag_c_iterate_126_1);
                _jettag_c_setVariable_129_2.setTagInfo(_td_c_setVariable_129_2);
                _jettag_c_setVariable_129_2.doStart(context, out);
                _jettag_c_setVariable_129_2.doEnd();
                // finding the containing class 
                RuntimeTagElement _jettag_c_setVariable_131_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_131_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_131_2.setRuntimeParent(_jettag_c_iterate_126_1);
                _jettag_c_setVariable_131_2.setTagInfo(_td_c_setVariable_131_2);
                _jettag_c_setVariable_131_2.doStart(context, out);
                _jettag_c_setVariable_131_2.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_133_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_133_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_133_5.setRuntimeParent(_jettag_c_iterate_126_1);
                _jettag_c_setVariable_133_5.setTagInfo(_td_c_setVariable_133_5);
                _jettag_c_setVariable_133_5.doStart(context, out);
                _jettag_c_setVariable_133_5.doEnd();
                RuntimeTagElement _jettag_c_include_134_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_134_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_134_5.setRuntimeParent(_jettag_c_iterate_126_1);
                _jettag_c_include_134_5.setTagInfo(_td_c_include_134_5);
                _jettag_c_include_134_5.doStart(context, out);
                _jettag_c_include_134_5.doEnd();
                RuntimeTagElement _jettag_ws_folder_135_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_135_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_135_5.setRuntimeParent(_jettag_c_iterate_126_1);
                _jettag_ws_folder_135_5.setTagInfo(_td_ws_folder_135_5);
                _jettag_ws_folder_135_5.doStart(context, out);
                while (_jettag_ws_folder_135_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_136_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_136_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_136_5.setRuntimeParent(_jettag_ws_folder_135_5);
                    _jettag_ws_file_136_5.setTagInfo(_td_ws_file_136_5);
                    _jettag_ws_file_136_5.doStart(context, out);
                    _jettag_ws_file_136_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_135_5.handleBodyContent(out);
                }
                _jettag_ws_folder_135_5.doEnd();
                _jettag_c_iterate_126_1.handleBodyContent(out);
            }
            _jettag_c_iterate_126_1.doEnd();
            out.write(NL);         
            // creating an aspect for every application of the NotNull property on a parameter 
            RuntimeTagElement _jettag_c_iterate_142_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_142_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_142_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_142_1.setTagInfo(_td_c_iterate_142_1);
            _jettag_c_iterate_142_1.doStart(context, out);
            while (_jettag_c_iterate_142_1.okToProcessBody()) {
                // finding the affected parameter 
                RuntimeTagElement _jettag_c_setVariable_144_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_144_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_144_2.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_setVariable_144_2.setTagInfo(_td_c_setVariable_144_2);
                _jettag_c_setVariable_144_2.doStart(context, out);
                _jettag_c_setVariable_144_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_145_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_145_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_145_2.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_setVariable_145_2.setTagInfo(_td_c_setVariable_145_2);
                _jettag_c_setVariable_145_2.doStart(context, out);
                _jettag_c_setVariable_145_2.doEnd();
                // finding the containing operation 
                RuntimeTagElement _jettag_c_setVariable_147_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_147_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_147_2.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_setVariable_147_2.setTagInfo(_td_c_setVariable_147_2);
                _jettag_c_setVariable_147_2.doStart(context, out);
                _jettag_c_setVariable_147_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_148_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_148_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_148_2.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_setVariable_148_2.setTagInfo(_td_c_setVariable_148_2);
                _jettag_c_setVariable_148_2.doStart(context, out);
                _jettag_c_setVariable_148_2.doEnd();
                // finding the containing class 
                RuntimeTagElement _jettag_c_setVariable_150_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_150_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_150_2.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_setVariable_150_2.setTagInfo(_td_c_setVariable_150_2);
                _jettag_c_setVariable_150_2.doStart(context, out);
                _jettag_c_setVariable_150_2.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_152_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_152_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_152_5.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_setVariable_152_5.setTagInfo(_td_c_setVariable_152_5);
                _jettag_c_setVariable_152_5.doStart(context, out);
                _jettag_c_setVariable_152_5.doEnd();
                RuntimeTagElement _jettag_c_include_153_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_153_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_153_5.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_c_include_153_5.setTagInfo(_td_c_include_153_5);
                _jettag_c_include_153_5.doStart(context, out);
                _jettag_c_include_153_5.doEnd();
                RuntimeTagElement _jettag_ws_folder_154_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_154_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_154_5.setRuntimeParent(_jettag_c_iterate_142_1);
                _jettag_ws_folder_154_5.setTagInfo(_td_ws_folder_154_5);
                _jettag_ws_folder_154_5.doStart(context, out);
                while (_jettag_ws_folder_154_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_155_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_155_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_155_5.setRuntimeParent(_jettag_ws_folder_154_5);
                    _jettag_ws_file_155_5.setTagInfo(_td_ws_file_155_5);
                    _jettag_ws_file_155_5.doStart(context, out);
                    _jettag_ws_file_155_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_154_5.handleBodyContent(out);
                }
                _jettag_ws_folder_154_5.doEnd();
                _jettag_c_iterate_142_1.handleBodyContent(out);
            }
            _jettag_c_iterate_142_1.doEnd();
            out.write(NL);         
            // creating an aspect for every application of the explicit realization property 
            RuntimeTagElement _jettag_c_iterate_161_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_161_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_161_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_161_1.setTagInfo(_td_c_iterate_161_1);
            _jettag_c_iterate_161_1.doStart(context, out);
            while (_jettag_c_iterate_161_1.okToProcessBody()) {
                // finding the InterfaceRealization 
                RuntimeTagElement _jettag_c_setVariable_163_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_163_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_163_2.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_setVariable_163_2.setTagInfo(_td_c_setVariable_163_2);
                _jettag_c_setVariable_163_2.doStart(context, out);
                _jettag_c_setVariable_163_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_log_164_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_164_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_log_164_2.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_log_164_2.setTagInfo(_td_c_log_164_2);
                _jettag_c_log_164_2.doStart(context, out);
                JET2Writer _jettag_c_log_164_2_saved_out = out;
                while (_jettag_c_log_164_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_164_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_164_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_164_9.setRuntimeParent(_jettag_c_log_164_2);
                    _jettag_c_get_164_9.setTagInfo(_td_c_get_164_9);
                    _jettag_c_get_164_9.doStart(context, out);
                    _jettag_c_get_164_9.doEnd();
                    _jettag_c_log_164_2.handleBodyContent(out);
                }
                out = _jettag_c_log_164_2_saved_out;
                _jettag_c_log_164_2.doEnd();
                out.write(NL);         
                out.write(NL);         
                // finding the affected Class 
                RuntimeTagElement _jettag_c_setVariable_167_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_167_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_167_2.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_setVariable_167_2.setTagInfo(_td_c_setVariable_167_2);
                _jettag_c_setVariable_167_2.doStart(context, out);
                _jettag_c_setVariable_167_2.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_169_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_169_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_169_5.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_setVariable_169_5.setTagInfo(_td_c_setVariable_169_5);
                _jettag_c_setVariable_169_5.doStart(context, out);
                _jettag_c_setVariable_169_5.doEnd();
                RuntimeTagElement _jettag_c_include_170_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_170_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_170_5.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_include_170_5.setTagInfo(_td_c_include_170_5);
                _jettag_c_include_170_5.doStart(context, out);
                _jettag_c_include_170_5.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                // finding the implemented Interface 
                RuntimeTagElement _jettag_c_setVariable_173_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_173_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_173_2.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_setVariable_173_2.setTagInfo(_td_c_setVariable_173_2);
                _jettag_c_setVariable_173_2.doStart(context, out);
                _jettag_c_setVariable_173_2.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_175_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_175_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_175_5.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_setVariable_175_5.setTagInfo(_td_c_setVariable_175_5);
                _jettag_c_setVariable_175_5.doStart(context, out);
                _jettag_c_setVariable_175_5.doEnd();
                RuntimeTagElement _jettag_c_include_176_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_176_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_176_2.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_c_include_176_2.setTagInfo(_td_c_include_176_2);
                _jettag_c_include_176_2.doStart(context, out);
                _jettag_c_include_176_2.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_ws_folder_178_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_178_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_178_5.setRuntimeParent(_jettag_c_iterate_161_1);
                _jettag_ws_folder_178_5.setTagInfo(_td_ws_folder_178_5);
                _jettag_ws_folder_178_5.doStart(context, out);
                while (_jettag_ws_folder_178_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_179_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_179_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_179_5.setRuntimeParent(_jettag_ws_folder_178_5);
                    _jettag_ws_file_179_5.setTagInfo(_td_ws_file_179_5);
                    _jettag_ws_file_179_5.doStart(context, out);
                    _jettag_ws_file_179_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_178_5.handleBodyContent(out);
                }
                _jettag_ws_folder_178_5.doEnd();
                _jettag_c_iterate_161_1.handleBodyContent(out);
            }
            _jettag_c_iterate_161_1.doEnd();
            out.write(NL);         
            // create an aspect for every application of the Comparable property 
            RuntimeTagElement _jettag_c_iterate_185_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_185_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_185_1.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_c_iterate_185_1.setTagInfo(_td_c_iterate_185_1);
            _jettag_c_iterate_185_1.doStart(context, out);
            while (_jettag_c_iterate_185_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_186_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_186_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_186_5.setRuntimeParent(_jettag_c_iterate_185_1);
                _jettag_c_setVariable_186_5.setTagInfo(_td_c_setVariable_186_5);
                _jettag_c_setVariable_186_5.doStart(context, out);
                _jettag_c_setVariable_186_5.doEnd();
                out.write("        ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_188_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_188_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_188_5.setRuntimeParent(_jettag_c_iterate_185_1);
                _jettag_c_setVariable_188_5.setTagInfo(_td_c_setVariable_188_5);
                _jettag_c_setVariable_188_5.doStart(context, out);
                _jettag_c_setVariable_188_5.doEnd();
                RuntimeTagElement _jettag_c_include_189_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_189_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_189_5.setRuntimeParent(_jettag_c_iterate_185_1);
                _jettag_c_include_189_5.setTagInfo(_td_c_include_189_5);
                _jettag_c_include_189_5.doStart(context, out);
                _jettag_c_include_189_5.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_ws_folder_191_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_191_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_folder_191_5.setRuntimeParent(_jettag_c_iterate_185_1);
                _jettag_ws_folder_191_5.setTagInfo(_td_ws_folder_191_5);
                _jettag_ws_folder_191_5.doStart(context, out);
                while (_jettag_ws_folder_191_5.okToProcessBody()) {
                    out.write("    ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_ws_file_192_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_192_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_ws_file_192_5.setRuntimeParent(_jettag_ws_folder_191_5);
                    _jettag_ws_file_192_5.setTagInfo(_td_ws_file_192_5);
                    _jettag_ws_file_192_5.doStart(context, out);
                    _jettag_ws_file_192_5.doEnd();
                    out.write("   ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_ws_folder_191_5.handleBodyContent(out);
                }
                _jettag_ws_folder_191_5.doEnd();
                _jettag_c_iterate_185_1.handleBodyContent(out);
            }
            _jettag_c_iterate_185_1.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            // aop.xml file. 
            RuntimeTagElement _jettag_ws_folder_198_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_198_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_198_2.setRuntimeParent(_jettag_ws_folder_5_1);
            _jettag_ws_folder_198_2.setTagInfo(_td_ws_folder_198_2);
            _jettag_ws_folder_198_2.doStart(context, out);
            while (_jettag_ws_folder_198_2.okToProcessBody()) {
                out.write("\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_199_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_199_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_199_2.setRuntimeParent(_jettag_ws_folder_198_2);
                _jettag_ws_file_199_2.setTagInfo(_td_ws_file_199_2);
                _jettag_ws_file_199_2.doStart(context, out);
                _jettag_ws_file_199_2.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_ws_folder_198_2.handleBodyContent(out);
            }
            _jettag_ws_folder_198_2.doEnd();
            _jettag_ws_folder_5_1.handleBodyContent(out);
        }
        _jettag_ws_folder_5_1.doEnd();
        out.write(NL);         
    }
}
