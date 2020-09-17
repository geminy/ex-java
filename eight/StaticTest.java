public class StaticTest {
    static class P {
        P() {
            this("default");
        }

        P(String s) {
            System.out.println("P:" + s);
        }

        {
            System.out.println("xxx P default");
        }

        static {
            System.out.println("xxx P static");
        }
    }

    static class C extends  P {
        C() {
            this("default");
        }

        C(String s) {
            super(s);
            System.out.println("C:" + s);
        }

        {
            System.out.println("xxx C default");
        }

        static {
            System.out.println("xxx C static");
        }
    }

    C c0;

    C c2 = new C("c2");

    {
        System.out.println("default block0");
    }

    C c1;

    C c3 = new C("c3");

    {
        System.out.println("default block1");
    }

    static C s0;

    static C s2 = new C("s2");

    static {
        System.out.println("static block0");
    }

    static C s1;

    static C s3 = new C("s3");

    static {
        System.out.println("static block1");
    }

    public StaticTest() {
        System.out.println("StaticTest c0:" + c0);
        System.out.println("StaticTest c1:" + c1);
        System.out.println("StaticTest c2:" + c2);
        System.out.println("StaticTest c3:" + c3);
        System.out.println("StaticTest s0:" + s0);
        System.out.println("StaticTest s1:" + s1);
        System.out.println("StaticTest s2:" + s2);
        System.out.println("StaticTest s3:" + s3);
    }

    static void dump() {
        System.out.println("dump");
    }
}
