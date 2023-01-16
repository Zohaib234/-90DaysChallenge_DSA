// import newN.node;

public class node_generic {
    
}
 class Node<T>{
     T data;
    Node<T> nexNode;
    Node( T data){
this.data=data;
this.nexNode=null;

    }
}
class linkedlist<L>{
int size; 
Node<L> head;
linkedlist(){
    this.size=0;

    head=null;
}
public void insertatfirst(L data){
    if(size==0)System.out.println("List is empty");
    else{
        Node<L> newNode=new Node<>(data);
        newNode.nexNode=head;
        head=newNode;
    }
    
    
}

 

}