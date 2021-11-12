import java.util.ArrayList;
import java.util.List;

public class GenericsDemo< T extends List> {

    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        List<Object> objects = new ArrayList<Object>();
        objects.add("jkojoj");
//        System.out.println(String.valueOf(objects.get(0).toString()));
//        objects = stringList;
        // 
        final int[] a = {1};
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
//                int a = 0;

                @Override
                public void run() {
                    a[0]++;
                    System.out.println("a = " + a[0]  + ";" + Thread.currentThread().getName());
                }
            }).start();
        }

    }

    public final void aVoid() {

    }
}
