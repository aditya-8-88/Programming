class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class problem22 {

    public static Node create(Integer[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        int i = 0;
        while (arr[i] == 0) {
            i++;
            continue;
        }

        Node head = new Node(arr[i]);
        Node curr = head;

        // i=1;
        i++;
        while (i < arr.length) {
            curr.next = new Node(arr[i++]);
            curr = curr.next;
        }
        curr.next = null;

        return head;
    }

    public static void traverse(Node head) {
        Node current = head;
        // System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node add(Node head, Node root1, Node root2, int carry){
        if(root1.next!=null && root2.next!=null){
            add(head, root1.next, root2.next ,0);
        }
        else if(root1.next==null && root2.next!=null){
            add(head, root1, root2.next, carry);
        }
        else if(root1.next!=null && root2.next==null){
            add(head, root1.next, root2, carry);
        }

        int sum = root1.val + root2.val + carry;
        Node temp;
        if(sum<10)
            temp = new Node(sum);
        else
            temp = new Node(sum%10);
        temp.next = head;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 9, 0 };
        Integer[] arr2 = { 2, 5 };

        Node root1 = create(arr1);
        Node root2 = create(arr2);

        traverse(root1);
        traverse(root2);

        Node head = null;
        add(head , root1, root2, 0);
        traverse(head.next);

    }
}