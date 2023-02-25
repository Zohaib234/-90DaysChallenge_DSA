
class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
    }

    public boolean search(Node start, int n) {
        Node p = start;
        boolean result = false;
        if (start == null || start.data > n) {
            return false;
        }
        int count = 1;
        for (p = start; p != null; p = p.next) {
            if (p.data == n) {
                result = true;
                break;
            }
            if (p.next == null) {
                break;
            }
            System.out.println("Element at position " + count + " is " + p.data);
            count++;
        }
        if (result == true) {
            return true;
        } else {
            return false;
        }
    }
}

public class Searching_LinkedList2 {
    public static void main(String[] args) {
        Node start = new Node(2);
        Node p = start;

        for (int i = 4; i <= 100; i += 2) {
            p.next = new Node(i);
            p = p.next;
        }
        start.search(start, 24);
    }
}
