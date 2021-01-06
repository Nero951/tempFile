package util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            MyLinkedList list = new MyLinkedList();
            Node head = new Node("a");
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
            solution s = new solution();
            s.listReverse(head);
            System.out.println(list.toString());
        }
    }
}
