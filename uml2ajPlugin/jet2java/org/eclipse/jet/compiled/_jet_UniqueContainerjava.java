package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_UniqueContainerjava implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_UniqueContainerjava() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_9 = new TagInfo("c:get", //$NON-NLS-1$
            2, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classPackageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_14 = new TagInfo("c:get", //$NON-NLS-1$
            13, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$classFileName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("//This code is generate automatically, DO NOT MODIFY!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_9.setRuntimeParent(null);
        _jettag_c_get_2_9.setTagInfo(_td_c_get_2_9);
        _jettag_c_get_2_9.doStart(context, out);
        _jettag_c_get_2_9.doEnd();
        out.write(".aspects;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.lang.ref.ReferenceQueue;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.lang.ref.WeakReference;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.HashMap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Map;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Map.Entry;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.logging.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import ch.unisi.inf.luminous.AssertionViolatedException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_14.setRuntimeParent(null);
        _jettag_c_get_13_14.setTagInfo(_td_c_get_13_14);
        _jettag_c_get_13_14.doStart(context, out);
        _jettag_c_get_13_14.doEnd();
        out.write("_UniqueContainer{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static Map<Object, Object> consumers = new HashMap<Object, Object>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static ReferenceQueue<Object> references = new ReferenceQueue<Object>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static <T> void addElement( T element) throws AssertionViolatedException {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tremoveGCObjects();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ( consumers.containsKey( element.hashCode() ) )");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthrow new AssertionViolatedException( \"Assertion violated: unique\" );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tputElement( element.hashCode(), element );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static <T> void addElement( Object key, T element) throws AssertionViolatedException {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tremoveGCObjects();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif ( consumers.containsKey( key ) )");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthrow new AssertionViolatedException( \"Assertion violated: unique\" );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tputElement( key, element );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static <T> void forcedAdd( T element ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tremoveGCObjects();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tputElement( element.hashCode(), element );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic static <T> void forcedAdd(Object key, T element ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tremoveGCObjects();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tputElement( key, element );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static <T> T removeElement( T element ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (T)consumers.remove( element.hashCode() );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic static <T> T removeElement( Object key, T element ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (T)consumers.remove( key );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tprivate static <T> void putElement( Object key, T element ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsynchronized(consumers) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tconsumers.put( key, new WeakReference<T>( element, references ) );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate static <T> void removeGCObjects() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSystem.gc();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twhile ( references.poll() != null ) {} //wipe the queue");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsynchronized(consumers) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tMap<Object,Object> copy = (Map<Object, Object>)((HashMap)consumers).clone();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor ( Entry<Object, Object> entry : copy.entrySet()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif ( ((WeakReference<T>)(entry.getValue())).isEnqueued() ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tconsumers.remove( entry.getKey() );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tLogger.getLogger(\"ch.unisi.inf.luminous\").log(Level.INFO, \"Removed \" + entry.getKey());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
