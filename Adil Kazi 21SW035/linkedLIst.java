public class linkedLIst{


    public static void createNode(Node head , int data){
     
        Node ptr = new Node(data);
        Node p = head;

        p.next=ptr;


    }
    

    public static void main(String[] args) {

        Node head = new Node(1);
        linkedLIst.createNode(head, 2);


        
    }
}

class Node {
    int data;
    Node next;
    public Node( int data){
        this.data= data;
        next=null;
    }
}