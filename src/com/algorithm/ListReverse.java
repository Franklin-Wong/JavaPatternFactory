package com.algorithm;

import java.util.Stack;

public class ListReverse {
        public void reverseList(ListNode listNode){

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

}

class ListNode{
    ListNode head;
    public ListNode(){}
}


