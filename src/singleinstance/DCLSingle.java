package singleinstance;

public class DCLSingle {

    public static void main(String[] args) {
        DCLSingle instance = DCLSingle.getInstance("dcl");
        System.out.println("instance = " + instance.toString());
    }
    private DCLSingle() {
    }
    private static volatile DCLSingle dclSingle;

    public static DCLSingle getInstance(String str) {
        if (dclSingle == null) {
            synchronized (DCLSingle.class) {
                if (dclSingle == null) {
                    dclSingle = new DCLSingle();
                }
            }
        }
        return dclSingle;
    }

}
