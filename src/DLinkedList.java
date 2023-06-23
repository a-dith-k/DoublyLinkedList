public class DLinkedList {

    private Node head = null;
    private Node tail = null;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }


    }


    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    public void remove(int data) {
        if (head.data == data) {
            head.next.prev = null;
            head = head.next;

        }
        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void printListReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

}
