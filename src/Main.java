import LinkedList.DoublyLinkedList;
import LinkedList.Node;
import LinkedList.SinglyLinkedList;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.printList();

        System.out.println();

        Node treeRoot = list.dllToBST(list.head);
        list.preOrder(treeRoot);
    }
}