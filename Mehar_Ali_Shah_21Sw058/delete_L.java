import java.util.HexFormat;
import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.xml.transform.Templates;

public class delete_L {
    static class node{
        int data ;
        node next;
        node(int data){
            this.data=data;
            // this.next=next;
        }
    }
    Scanner s=new Scanner(System.in);
    node head =null;
    void createNode(){
        int x;
        do{
            System.out.println("enter data");
            int data=s.nextInt();
            // node newnode=new node(data)
            node newnode=new node(data);
            if(head!=null)
                newnode.next=head;
                head=newnode;
                System.out.println("do u wanna enter more data press 1 ");
                 x=s.nextInt();
           
             
        }while(x==1);


    }
    void showd(){
        node temp=head;
        if(temp==null){
            System.out.println("l_lsit does not exist");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    void delete(){
        node temp=head;
        head=temp.next;
    }
    void delet_last(){
        node temp=head;
        node temp1=temp.next;
        if(temp==null){
            System.out.println("node dose not exist");
        }
       else{
        node t1=head;
        node t2=t1.next;
        while(t2.next!=null){
            t1=t2;
            t2=t1.next;
        }
        t1.next=null;
       }
    }
    void delet_pp(){
        node t1=head;
        node t2=head.next;
        System.out.println("enter the position to delete the data");
        int position=s.nextInt();
         for(int i=2; i<position; i++){
            t1=t2;
            t2=t1.next;

         }
         t1.next=t2.next;
    }
    public static void main(String[] args) {
        delete_L obj=new delete_L();
        obj.createNode();
        obj.showd();
        // obj.delete();
        // obj.delet_last();
        obj.delet_pp();
        System.out.println("after deleting  at last");
        obj.showd();
    }
    
}
