public class Main {
    enum E {
        A,
        B,
        C
    }

    enum E2 {
        A("a", 1), B("b", 2), C("c", 3);
        String name;
        int index;
        private E2(String s, int i) {
            name = s;
            index = i;
        }
    }

    public static void main(String[] args) {
        StreamTest st = new StreamTest();
        st.testStream();
        st.testStreamEarly();
        st.testStreamLazy();
        st.testCollect();
        st.testMap();
        st.testFlatMap();
        st.testMin();
        st.testReduce();

        testInterface();
        testEnum();
        testStatic();
    }

    private static void testInterface() {
        Bar bar = new Bar();
        System.out.println("Bar is Bar:" + (bar instanceof Bar));
        System.out.println("Bar is Foo:" + (bar instanceof Foo));
        System.out.println("Bar is IApple:" + (bar instanceof IApple));
        bar.whoAmI();
    }

    private static void testEnum() {
        System.out.println("enum E.A:" + E.A);
        System.out.println("enum E.A:" + E.A.ordinal());
        System.out.println("enum E2.A:" + E2.A.name);
        System.out.println("enum E2.A:" + E2.A.index);
        System.out.println("enum E2.A:" + E2.A);
        System.out.println("enum E2.A:" + E2.A.ordinal());
    }

    private static void testStatic() {
        new StaticTest();
//        new StaticTest();
//        StaticTest.dump();
//        StaticTest.dump();
    }
}
