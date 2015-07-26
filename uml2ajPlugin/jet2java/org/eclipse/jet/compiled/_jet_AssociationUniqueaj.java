package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_AssociationUniqueaj implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_AssociationUniqueaj() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_23_9 = new TagInfo("c:get", //$NON-NLS-1$
            23, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_8 = new TagInfo("c:get", //$NON-NLS-1$
            28, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_26 = new TagInfo("c:get", //$NON-NLS-1$
            36, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_44 = new TagInfo("c:get", //$NON-NLS-1$
            42, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_77 = new TagInfo("c:get", //$NON-NLS-1$
            42, 77,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containerAttributeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_22 = new TagInfo("c:get", //$NON-NLS-1$
            52, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_54_32 = new TagInfo("c:get", //$NON-NLS-1$
            54, 32,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_59_52 = new TagInfo("c:get", //$NON-NLS-1$
            59, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_35 = new TagInfo("c:get", //$NON-NLS-1$
            64, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_68 = new TagInfo("c:get", //$NON-NLS-1$
            64, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containerAttributeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_54 = new TagInfo("c:get", //$NON-NLS-1$
            70, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_4 = new TagInfo("c:get", //$NON-NLS-1$
            72, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_57 = new TagInfo("c:get", //$NON-NLS-1$
            72, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_42 = new TagInfo("c:get", //$NON-NLS-1$
            79, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_4 = new TagInfo("c:get", //$NON-NLS-1$
            81, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_57 = new TagInfo("c:get", //$NON-NLS-1$
            81, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$containedClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_82_3 = new TagInfo("c:if", //$NON-NLS-1$
            82, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "cardinality($uniqueProperty, '0') = true()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_85_3 = new TagInfo("c:if", //$NON-NLS-1$
            85, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "cardinality($uniqueProperty, '0') = false()", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_45 = new TagInfo("c:get", //$NON-NLS-1$
            86, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_99 = new TagInfo("c:get", //$NON-NLS-1$
            86, 99,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$uniqueProperty", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/*******************************************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright (c) 2008 - Jochen Wuttke.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * All rights reserved. This program and the accompanying materials");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * are made available under the terms of the Eclipse Public License v1.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * which accompanies this distribution, and is available at");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://www.eclipse.org/legal/epl-v10.html");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Contributors:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *    Jochen Wuttke - initial API and implementation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ********************************************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Created: Nov 7, 2008 by Jochen Wuttke");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Last changed: $Id$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
 //generating the corresponding aspect in aop.xml	
String aop=context.getVariable("aopxml").toString();
aop=aop.concat("<aspect name=\"").concat(context.getVariable("classPackageName").toString()); 
aop=aop.concat(".aspects.").concat(context.getVariable("classFileName").toString()); 
context.setVariable("aopxml",aop.concat("_Unique\"/>\n")); 

        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_9.setRuntimeParent(null);
        _jettag_c_get_23_9.setTagInfo(_td_c_get_23_9);
        _jettag_c_get_23_9.doStart(context, out);
        _jettag_c_get_23_9.doEnd();
        out.write(".aspects;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.Collection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.logging.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_8.setRuntimeParent(null);
        _jettag_c_get_28_8.setTagInfo(_td_c_get_28_8);
        _jettag_c_get_28_8.doStart(context, out);
        _jettag_c_get_28_8.doEnd();
        out.write(".*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ch.unisi.inf.luminous.UniqueCollectionTracker;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * @author <a href=\"&#109;&#97;&#105;&#108;&#116;&#111;&#58;&#119;&#117;&#116;&#116;&#107;&#101;&#106;&#64;&#108;&#117;&#46;&#117;&#110;&#105;&#115;&#105;&#46;&#99;&#104;\">Jochen Wuttke</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public privileged aspect ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_26.setRuntimeParent(null);
        _jettag_c_get_36_26.setTagInfo(_td_c_get_36_26);
        _jettag_c_get_36_26.doStart(context, out);
        _jettag_c_get_36_26.doEnd();
        out.write("_Unique {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t//private Object unqiueProperty;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t//for now we assume the assignment to the collection variable is made only once");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t//This might well be specific to the case at hand.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tbefore (Collection<?> collection ): set(* ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_44); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_44.setRuntimeParent(null);
        _jettag_c_get_42_44.setTagInfo(_td_c_get_42_44);
        _jettag_c_get_42_44.doStart(context, out);
        _jettag_c_get_42_44.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_77 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_77); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_77.setRuntimeParent(null);
        _jettag_c_get_42_77.setTagInfo(_td_c_get_42_77);
        _jettag_c_get_42_77.doStart(context, out);
        _jettag_c_get_42_77.doEnd();
        out.write(" ) && args(collection) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (collection != null ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tUniqueCollectionTracker.addCollection( collection );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Single element add operation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * @param collection");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpointcut addElement(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_22.setRuntimeParent(null);
        _jettag_c_get_52_22.setTagInfo(_td_c_get_52_22);
        _jettag_c_get_52_22.doStart(context, out);
        _jettag_c_get_52_22.doEnd();
        out.write(" param): target(Collection+) && call( * add(..) ) && args( param );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tbefore(Collection collection, ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_54_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_54_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_54_32.setRuntimeParent(null);
        _jettag_c_get_54_32.setTagInfo(_td_c_get_54_32);
        _jettag_c_get_54_32.doStart(context, out);
        _jettag_c_get_54_32.doEnd();
        out.write(" param): addElement(param) && target(collection) && !this(UniqueCollectionTracker+){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tassertUnique( collection, param );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate void assertUnique( Collection collection, ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_59_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_59_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_59_52.setRuntimeParent(null);
        _jettag_c_get_59_52.setTagInfo(_td_c_get_59_52);
        _jettag_c_get_59_52.doStart(context, out);
        _jettag_c_get_59_52.doEnd();
        out.write(" param ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//is \"collection\" a tracked collection?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ( UniqueCollectionTracker.contains( collection ) ) {\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif ( contains( collection, param ) ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.SEVERE,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\"unique property violated on ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_64_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_35); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_35.setRuntimeParent(null);
        _jettag_c_get_64_35.setTagInfo(_td_c_get_64_35);
        _jettag_c_get_64_35.doStart(context, out);
        _jettag_c_get_64_35.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_64_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_68.setRuntimeParent(null);
        _jettag_c_get_64_68.setTagInfo(_td_c_get_64_68);
        _jettag_c_get_64_68.doStart(context, out);
        _jettag_c_get_64_68.doEnd();
        out.write(": \" +  param.hashCode() + \" on \" + param.hashCode() + \":\" + getDuplicate(collection, param).hashCode(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tnew Throwable());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate Object getDuplicate( Collection collection, ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_70_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_70_54.setRuntimeParent(null);
        _jettag_c_get_70_54.setTagInfo(_td_c_get_70_54);
        _jettag_c_get_70_54.doStart(context, out);
        _jettag_c_get_70_54.doEnd();
        out.write(" object ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor( Object comp : collection ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_72_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_72_4.setRuntimeParent(null);
        _jettag_c_get_72_4.setTagInfo(_td_c_get_72_4);
        _jettag_c_get_72_4.doStart(context, out);
        _jettag_c_get_72_4.doEnd();
        out.write(" component = (");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_72_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_72_57.setRuntimeParent(null);
        _jettag_c_get_72_57.setTagInfo(_td_c_get_72_57);
        _jettag_c_get_72_57.doStart(context, out);
        _jettag_c_get_72_57.doEnd();
        out.write(")comp;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif ( component != object && component.equals( object ) )");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn comp;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate boolean contains( Collection c, ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_79_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_42.setRuntimeParent(null);
        _jettag_c_get_79_42.setTagInfo(_td_c_get_79_42);
        _jettag_c_get_79_42.doStart(context, out);
        _jettag_c_get_79_42.doEnd();
        out.write(" object) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor( Object comp : c ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_81_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_81_4.setRuntimeParent(null);
        _jettag_c_get_81_4.setTagInfo(_td_c_get_81_4);
        _jettag_c_get_81_4.doStart(context, out);
        _jettag_c_get_81_4.doEnd();
        out.write(" component = (");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_81_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_81_57.setRuntimeParent(null);
        _jettag_c_get_81_57.setTagInfo(_td_c_get_81_57);
        _jettag_c_get_81_57.doStart(context, out);
        _jettag_c_get_81_57.doEnd();
        out.write(")comp;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_82_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_82_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_82_3.setRuntimeParent(null);
        _jettag_c_if_82_3.setTagInfo(_td_c_if_82_3);
        _jettag_c_if_82_3.doStart(context, out);
        while (_jettag_c_if_82_3.okToProcessBody()) {
            out.write("\t\t\tif ( component != object && component.equals( object ) )");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_82_3.handleBodyContent(out);
        }
        _jettag_c_if_82_3.doEnd();
        RuntimeTagElement _jettag_c_if_85_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_85_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_85_3.setRuntimeParent(null);
        _jettag_c_if_85_3.setTagInfo(_td_c_if_85_3);
        _jettag_c_if_85_3.doStart(context, out);
        while (_jettag_c_if_85_3.okToProcessBody()) {
            out.write("\t\t\tif ( component != object && component.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_86_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_45.setRuntimeParent(_jettag_c_if_85_3);
            _jettag_c_get_86_45.setTagInfo(_td_c_get_86_45);
            _jettag_c_get_86_45.doStart(context, out);
            _jettag_c_get_86_45.doEnd();
            out.write("().equals( object.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_86_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_99); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_99.setRuntimeParent(_jettag_c_if_85_3);
            _jettag_c_get_86_99.setTagInfo(_td_c_get_86_99);
            _jettag_c_get_86_99.doStart(context, out);
            _jettag_c_get_86_99.doEnd();
            out.write("() ) )");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_85_3.handleBodyContent(out);
        }
        _jettag_c_if_85_3.doEnd();
        out.write("\t\t\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
