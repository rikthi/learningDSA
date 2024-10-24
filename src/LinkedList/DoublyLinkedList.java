package LinkedList;

public class DoublyLinkedList {
    public Node head;


    public Node findMid(Node head){
        if (head == null || head.next == null) return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node dllToBST(Node head){
        if (head == null || head.next == null) return head;

        Node midNode = findMid(head);
        Node back = midNode.prev, front = midNode.next;
        front.prev = midNode.next = midNode.prev = null;
        if(back != null){
            back.next = null;
        }

        Node leftHead = back != null ? head : null;
        Node rightHead = front;
        Node root = midNode;

        root.prev = dllToBST(leftHead);
        root.next = dllToBST(rightHead);
        return root;

    }

    public void push(int new_data)
    {
        /* allocate node */
        Node new_node = new Node(new_data);

        /* since we are adding at the beginning,
           prev is always NULL */
        new_node.prev = null;

        /* link the old list of the new node */
        new_node.next = head;

        /* change prev of head node to new node */
        if (head != null)
            head.prev = new_node;

        /* move the head to point to the new node */
        head = new_node;
    }

    /* Function to print nodes in a given linked list */
    public void printList()
    {
        Node node = head;
        while (node != null)
        {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public void preOrder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.prev);
        preOrder(node.next);
    }

}
