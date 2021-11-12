/**
 * Created by Administion on 2021/9/10.
 */
public class StaticTest {

    private static int staticInt = 2;//��̬����
    private int random = 2;//ʵ������

    public  StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

//        StaticTest test = new StaticTest();
//        StaticTest test2 = new StaticTest();
    }
}
