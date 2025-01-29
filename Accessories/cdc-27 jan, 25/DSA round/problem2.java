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

class problem2 {

    public static Node create(Integer[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        int i = 0;
        while(arr[i]==0){
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

    public static Node reverse(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1,5,6};
        Integer[] arr2 = {9,9,8};
        Node root1 = create(arr1);
        Node root2 = create(arr2);
        traverse(root1);
        traverse(root2);

        root1 = reverse(root1);
        root2 = reverse(root2);


        Node ans = null;

        int carry = 0;

        while (root1 != null && root2 != null) {
            int sum = root1.val + root2.val + carry;
            if (sum < 10) {
                carry = 0;
                Node temp = new Node(sum);
                temp.next = ans;
                ans = temp;
            } else {
                carry = 1;
                Node temp = new Node(sum%10);
                temp.next = ans;
                ans = temp;
            }
            root1 = root1.next;
            root2 = root2.next;
        }

        while (root1 != null) {
            int sum = root1.val + carry;
            if (sum < 10) {
                carry = 0;
                Node temp = new Node(sum);
                temp.next = ans;
                ans = temp;
            } else {
                carry = 1;
                Node temp = new Node(sum%10);
                temp.next = ans;
                ans = temp;
            }
            root1 = root1.next;
        }

        while (root2 != null) {
            int sum = root2.val + carry;
            if (sum < 10) {
                carry = 0;
                Node temp = new Node(sum);
                temp.next = ans;
                ans = temp;
            } else {
                carry = 1;
                Node temp = new Node(sum%10);
                temp.next = ans;
                ans = temp;
            }
            root2 = root2.next;
        }

        if(carry==0)
            traverse(ans);
        else{
            Node temp = new Node(carry);
            temp.next = ans;
            ans = temp;
            traverse(ans);
        }

    }
}