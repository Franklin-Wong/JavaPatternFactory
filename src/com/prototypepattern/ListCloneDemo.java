package com.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class ListCloneDemo {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList cloneList = null;
        for (int i = 0; i < 10; i++) {
            cloneList = (ArrayList) list.clone();
            System.out.println(list == cloneList);
            cloneList.add(i);
            System.out.println("cloneList = " + cloneList.size());
            System.out.println("cloneList.hashCode() = " + cloneList.hashCode());

        }
        System.out.println("out cloneList = " + cloneList.size());
        System.out.println("out cloneList.hashCode() = " + cloneList.hashCode());
    }
}
