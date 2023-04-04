package com.algorithm;

import java.util.LinkedList;
import java.util.Stack;

public class ListReverse {
        public static void reverseList(ListNode listNode){

            Stack<ListNode> stack = new Stack();
            if(listNode != null){
                stack.push(listNode);
            }
            while(listNode.head != null){
                stack.push(listNode.head);
            }

            ListNode last = null;
            while(!stack.empty()){
                ListNode node = stack.pop();
                last.head = node;
                last = node;
            }

            last.head = null;
            System.out.println(last);

        }

    public static void main(String[] args) {
        LinkedList<ListNode> listNodes = new LinkedList<>();
        reverseList(new ListNode());
    }
}

class ListNode{
    ListNode head;
    int index;

}


