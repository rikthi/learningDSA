package LinkedList;

public class Node {
    public Node next;
    public Node prev;
    public int value;
    public Node(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
