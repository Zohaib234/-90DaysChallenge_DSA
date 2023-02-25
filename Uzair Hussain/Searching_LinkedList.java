
class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
    }

    public static boolean search(Node start, int n) {
        Node p = start;
        if (start == null) {
            return false;
        }
        if (start.data == n) {
            return false;
        }
        int count = 1;
        for (p = start; p != null; p = p.next) {
            if (p.next.data == n) {
                return true;
            }
            if (p.next == null) {
                return false;
            }
            count++;
        }
        return false;
    }
}

public class Searching_LinkedList {
    public static void main(String[] args) {
        Node start = new Node(2);
        Node p = start;

        for (int i = 4; i <= 100; i += 2) {
            p.next = new Node(i);
            p = p.next;
        }
        System.out.println(Node.search(start, 44));

    }
}
