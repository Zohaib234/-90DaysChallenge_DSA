class Node{
    int data;
    Node next;

    public Node(){
        data=0;
        next=null;
    }
    public Node(int data){
        data=data;
    }
}


public class Linked_List {

    Node head;
    int size;
    public Linked_List(){
        head=null;
        size=0;
    }
    public void insertAtStart(int data){
        Node n;
        n=new Node();
        n.data=data;
        n.next=head;
        head=n;
        size++;
    }
    static Node insertAtLast(Node start, int data){
        Node n;
        for(n=start;n.next!=null;n=n.next){

        }
        n.next=new Node(data);
        return start;
    }
    public void insertAt(int data,int pos){
        if(pos==1){
            insertAtStart(data);
        }else if(pos==size+1){
            insertAtLast(head,data);
        }
        else if(pos>1 &&pos<=size){
            Node n,t;
            n=new Node(data);
            t=head;
            for(int i=1;i<pos-1;i++){
                t=t.next;
                n.next=t.next;
                t.next=n;
                size++;
            }
        }else{
            System.out.println("Not Possible");
        }
    }
    public void display(Node head){
        Node n;
       for(n=head;n!=null;n=n.next){
        System.out.println(" "+n.data);
       }
    }
    public static void main(String[] args) {

        Linked_List lla=new Linked_List();
        int[] a={3,6,8,13,55,98};
        Node start=new Node(0);
        Node n=start;
        n.next=new Node(12);
        n=n.next;
        n.next=new Node(33);
        n=n.next;
        n.next=new Node(56);
        n=n.next;

        lla.insertAtStart(32);
        for(n=start;n!=null;n=n.next){
            System.out.println(n.data);
        }
        

   
    }
}
