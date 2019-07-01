/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

public class StackNode<T> implements Stack<T> {public static class __CLR4_3_17p7pjxkaws5v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980583896L,8589935092L,298,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Node<T> last;
    private int size;

    public StackNode() {try{__CLR4_3_17p7pjxkaws5v.R.inc(277); __CLR4_3_17p7pjxkaws5v.R.inc(278);this.last = null; __CLR4_3_17p7pjxkaws5v.R.inc(279);this.size = 0; }finally{__CLR4_3_17p7pjxkaws5v.R.flushNeeded();}}

    public void push(T item) {try{__CLR4_3_17p7pjxkaws5v.R.inc(280);
        __CLR4_3_17p7pjxkaws5v.R.inc(281);Node<T> toAdd = new Node<T>(item, last);
        __CLR4_3_17p7pjxkaws5v.R.inc(282);last = toAdd;
        __CLR4_3_17p7pjxkaws5v.R.inc(283);size++;
    }finally{__CLR4_3_17p7pjxkaws5v.R.flushNeeded();}}

    public void pop() {try{__CLR4_3_17p7pjxkaws5v.R.inc(284);
        __CLR4_3_17p7pjxkaws5v.R.inc(285);if((((last != null)&&(__CLR4_3_17p7pjxkaws5v.R.iget(286)!=0|true))||(__CLR4_3_17p7pjxkaws5v.R.iget(287)==0&false))) {{ __CLR4_3_17p7pjxkaws5v.R.inc(288);last = last.next; __CLR4_3_17p7pjxkaws5v.R.inc(289);size--; }
    }}finally{__CLR4_3_17p7pjxkaws5v.R.flushNeeded();}}

    public T peek() {try{__CLR4_3_17p7pjxkaws5v.R.inc(290);
        __CLR4_3_17p7pjxkaws5v.R.inc(291);if((((last != null)&&(__CLR4_3_17p7pjxkaws5v.R.iget(292)!=0|true))||(__CLR4_3_17p7pjxkaws5v.R.iget(293)==0&false))) {{ __CLR4_3_17p7pjxkaws5v.R.inc(294);return last.value; }
        }__CLR4_3_17p7pjxkaws5v.R.inc(295);return null;
    }finally{__CLR4_3_17p7pjxkaws5v.R.flushNeeded();}}

    public int size() {try{__CLR4_3_17p7pjxkaws5v.R.inc(296);
        __CLR4_3_17p7pjxkaws5v.R.inc(297);return size;
    }finally{__CLR4_3_17p7pjxkaws5v.R.flushNeeded();}}

}

class Node<T> {public static class __CLR4_3_17p8ajxkaws5v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980583896L,8589935092L,304,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;
    Node<T> next;

    public Node(T value) {try{__CLR4_3_17p8ajxkaws5v.R.inc(298);
        __CLR4_3_17p8ajxkaws5v.R.inc(299);this.value = value;
        __CLR4_3_17p8ajxkaws5v.R.inc(300);this.next = null;
    }finally{__CLR4_3_17p8ajxkaws5v.R.flushNeeded();}}

    public Node(T value, Node<T> next) {try{__CLR4_3_17p8ajxkaws5v.R.inc(301);
        __CLR4_3_17p8ajxkaws5v.R.inc(302);this.value = value;
        __CLR4_3_17p8ajxkaws5v.R.inc(303);this.next = next;
    }finally{__CLR4_3_17p8ajxkaws5v.R.flushNeeded();}}
}