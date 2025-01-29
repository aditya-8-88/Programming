class LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Create a linked list from an array
    public void createFromArray(int[] arr) {
        if (arr == null || arr.length == 0) return;

        head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
    }

    // Traverse the linked list
    public void traverse() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node by value
    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a linked list from an array
        int[] arr = {1, 2, 3, 4, 5};
        list.createFromArray(arr);

        // Display the linked list
        list.traverse();

        // Insert a new node at the end
        list.insertAtEnd(6);
        System.out.println("After inserting 6:");
        list.traverse();

        // Delete a node with value 3
        list.deleteByValue(3);
        System.out.println("After deleting 3:");
        list.traverse();
    }
}
