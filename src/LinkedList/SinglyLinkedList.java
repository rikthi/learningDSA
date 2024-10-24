package LinkedList;

public class SinglyLinkedList {
    public SinglyListNode head;
    public SinglyListNode tail;

    public SinglyLinkedList(){
        this.head = new SinglyListNode(-1);
        this.tail = head;
    }

    public void insert(int val){
        tail.next = new SinglyListNode(val);
        tail = tail.next;
    }
    public void delete(int index){
        SinglyListNode curr = head;
        for (int i = 0; i < index && curr != null; i++){
            curr = curr.next;
        }

        if(curr != null){
            curr.next = curr.next.next;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SinglyListNode curr = head.next;
        while (curr != null) {
            sb.append(curr.value).append(" -> ");
            curr = curr.next;
        }

        sb.append("\n");
        return sb.toString();
    }
}
