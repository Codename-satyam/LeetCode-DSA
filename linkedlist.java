class linkedlist {

    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static linkedlist insert(linkedlist list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void print(linkedlist list) {
        Node currnode = list.head;
        while (currnode != null) {
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
        }
    }

    public static void main(String args[]) {
        linkedlist list = new linkedlist();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        System.out.println("Linked List:");
        print(list);
    }
}