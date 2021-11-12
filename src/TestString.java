public class TestString {

    final int anInt;

    TestString(int anInt) {
//        anInt = 1;
        this.anInt = anInt;
    }
    String s1 = "s";
    String s2 = "s,a";
    String s3 = s1 + ",a";
    String s4 = "abc";
    String s5 = new String("abc");

    private void print() {
        System.out.println("anInt = " + anInt);
        System.out.println(s2.equals(s3));
        System.out.println(s2 == s3);
        System.out.println(s4.equals(s5));
        System.out.println(s4 == s5);
    }
    public static void main(String[] args) {
        new TestString(99).print();

    }
}
