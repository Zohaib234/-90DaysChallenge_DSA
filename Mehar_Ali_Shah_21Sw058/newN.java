import java.util.Scanner;

public class newN {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    Scanner s=new Scanner(System.in);
    node head=null;
    int x;
    void createNode(){
        do{
            System.out.println("enter the data");
            int data=s.nextInt();
            node newnode=new node(data);
            if(head!=null)
                newnode.next=head;
                head=newnode;
                System.out.println("press 1 to add more data");
                x=s.nextInt();

            
        }while(x==1);
    }
    void addatlast(){
        node temp=head;
        // System.out.println("enter the value to add at last");
        // node newnode=new node(12);
        if(temp==null){
            System.out.println("node does not exist");
        }
        else {
            System.out.println("enter the data to add at last index");
            int d=s.nextInt();
            node newnode=new node(d);
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void shownode(){

         node temp=head;
         if(temp==null){
            System.out.println("node does not exist");
         }
         else{
            // System.out.println("enter the data to add ad last");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
         }
    }
    public static void main(String[] args) {
        newN obj=new newN();
    
        obj.createNode();
        obj.addatlast();
        obj.shownode();
        
    }
    
}
