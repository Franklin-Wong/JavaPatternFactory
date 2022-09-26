public class TestString {

    int anInt;

    TestString(int anInt) {
//        anInt = 1;
        this.anInt = anInt;
    }
    String s1 = "s";
    String s2 = "s,a";
    String s3 = s1 + ",a";
    String s4 = "abc";
    String s5 = new String("abc");

    int a = 100;
    int b = 100;
    Integer c = 10;

    private void print() {
        System.out.println("anInt = " + anInt);
        System.out.print("s2.equals(s3): ");
        System.out.println(s2.equals(s3));
        System.out.print("s2 == s3: ");
        System.out.println(s2 == s3);
        System.out.print("s4.equals(s5):");
        System.out.println(s4.equals(s5));
        System.out.print("s4 == s5: ");
        System.out.println(s4 == s5);
        System.out.print("a == b: ");
        System.out.println(a==b);
        System.out.print("a == c: ");
        c = 100;
        System.out.println(a == c);
   }
    public static void main(String[] args) {
        new TestString(99).print();

        TestString t1 = new TestString(1);
        TestString t2 = new TestString(1);
        System.out.print("t1==t2: ");
        System.out.println(t1==t2);
        System.out.print("t1.equals(t2): ");
        System.out.println(t1.equals(t2));

        StringBuffer buffer = new StringBuffer("123");
        StringBuilder builder = new StringBuilder("123");
        System.out.println("builder equals buffer :" + builder.equals(buffer));
    }

    class Inner{

        public void getOuter(int a){
            anInt = 0;
        }
    }
}
