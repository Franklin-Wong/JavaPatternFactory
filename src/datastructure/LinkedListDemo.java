package datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListDemo {


    public static void main(String[] args) {

        LinkedList<ListNode> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            ListNode node = new ListNode("node:" + i);
            linkedList.add(node);
        }
        for (int i = 0; i < 10; i++) {

            System.out.println(reverseList(linkedList.get(i)).node);
            System.out.println(reverseList(linkedList.get(i)).next);

        }
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        stack.push(head);
        while (head.next != null) {
            stack.push(head.next);
            System.out.println("head = " + head.next.node);
        }
        //反转链表,第一个元素
        ListNode listNode = stack.pop();
        ListNode lastNode = listNode;
        //遍历下一个节点
        while (!stack.isEmpty()) {
            ListNode item = stack.pop();
            lastNode.next = item;
            lastNode = item;
        }
        // 把最后的指针置null
        lastNode.next = null;

        System.out.println("listNode = " + listNode.node);
        return listNode;

    }


}

class ListNode {
    String node;
    ListNode next;

    public ListNode(String node) {
        this.node = node;
    }
}