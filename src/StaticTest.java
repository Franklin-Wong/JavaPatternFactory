/**
 * Created by Administion on 2021/9/10.
 */
public class StaticTest {

    private static int staticInt = 2;//静态变量
    private int random = 2;//实例变量

    public  StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        StaticTest test2 = new StaticTest();
    }
}
