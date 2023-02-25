import java.nio.ShortBuffer;
import java.util.Scanner;

public class basic_ll {
    static class node{
        int data ;
        node next;
        node(int data){
            this.data=data;
        }
    }
    Scanner s=new Scanner(System.in);
    node head=null;
    void createNode(){
        char ch;
        do{
            System.out.println("enter the data in the linkedlist");
            int data=s.nextInt();
            node newNode=new node(data);
            if(head!=null){
                newNode.next=head;
                head=newNode;
            }
            System.out.println("do u want to add more data ? (y/n)");
            ch=s.next().charAt(0);


            
        }while(ch=='y');
        
    }
     void show(){
        node temp=head;
       while(temp != null){
    System.out.println(temp.data);
    temp=temp.next;
       }
    }
    // void add(){
    
    //     System.out.println("enter 1 for adding data at starting \n ");
    //     System.out.println("enter 2 for adding data at end position\n ");
    //     System.out.println("enter 3 for adding data at  any position\n ");
    //     System.out.println();

    //     System.out.println("enter your choice");
    //     int choice=s.nextInt();
    //     System.out.println("enter data");
    //     int data=s.nextInt();
    //     node newnode=new node(data);
    //     switch(choice){
    //         case 1:{
    //         newnode.next=head;
    //         head=newnode;
    //         }
    //       case 2:{
    //         node temp =head;
    //         while(temp.next!=null){
    //          temp=temp.next;

    //         }
    //         temp.next=newnode;
    //       }
    //       case 3:{
    //         System.out.println("enter the position ");
    //         int position=s.nextInt();
    //         if(position==1){
    //             newnode.next=head;
    //             head=newnode;
    //         }
    //         else{
    //         node temp=head;
    //         for(int i=2;i<position;i++)temp=temp.next;
    //         newnode.next=temp.next;
    //         temp.next=newnode;
    //       }
    //     }

    //     }






    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        basic_ll obj=new basic_ll();
        obj.createNode();
     obj.show();
        // obj.add();
        //  do{
            //     System.out.println("press 1 to continue 2 to exit");
            //     obj.add();
            
            //  }while(scan.nextInt()==1);
            //  obj.show();
            
            // }
            
        }

    
}
