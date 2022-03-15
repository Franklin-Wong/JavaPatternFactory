package singleinstance;

public class SingleInstance {

    private SingleInstance(){}

    public static SingleInstance getInstance(){
        return SingleInstance.InstanceHolder.SINGLE_INSTANCE;
    }

    static class InstanceHolder{
        public static final SingleInstance SINGLE_INSTANCE = new  SingleInstance();
    }
}
