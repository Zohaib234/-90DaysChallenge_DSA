import java.util.Scanner;

public class ascending_LL {
static class node {
    int data; 
    node next;
    node(int data){
        this.data=data;
    }
}
Scanner s=new Scanner(System.in);
// node head=null;
// int x;
// void createNode(){
//     do{
//     System.out.println("enter the data in your node ");
//     int d=s.nextInt();
//     node newnode=new node(d);
//     if(head!=null){
//         newnode.next=head;
//         head=newnode;
//     }
//     System.out.println("do u wanna add more data ? (y/n)");
//      x=s.nextInt();
// }while(x==1);
// }


    public boolean isAscending(node head){
        
        if(head==null || head.next==null) return true;
      for(node n=head; n.next.next!=n; n=n.next)
      if(n.data>n.next.data)
      return false;
      return true;

    }
    public static void main(String[] args) {
        node head=new node(1);
        node temp =head;
        
        for(node i=temp; i.next.next!=null; i=i.next){
           temp.next=temp;
           temp=temp.next;
        }

        ascending_LL obj=new ascending_LL();
        // obj.createNode();;
        obj.isAscending(head);
    }
    
}
