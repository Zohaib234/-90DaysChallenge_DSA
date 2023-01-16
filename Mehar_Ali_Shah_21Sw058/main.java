import java.rmi.server.ObjID;
import java.util.EmptyStackException;

interface stack{
    void push(Object obj);
    Object  peak();
    Object pop();
    int size();     
} 
class arrayst implements stack{
    private Object arr[];
    private int size =0;
    public arrayst(int capacity){
        arr=new Object[capacity];
        
        
    }
    // this will be used for the stack overflow exception
    private void resize(){
        Object arr1[]=arr;
        arr=new Object[size*2];
       System.arraycopy(arr1, 0, arr, 0, arr1.length);
    }
    // this will be used when the stack is under flow =means stack is empty
    private boolean  isemplty(){
        return size==0;
    }
     public void push(Object obj){
        if(size==arr.length){
            resize();
        }
        arr[size++]=obj;
        // size++; this will also be done if dont give in index the size ++;

     }
     public Object peak(){
        if(isemplty()){
            throw new EmptyStackException();
        }
        return arr[size-1];
     }
     public Object pop(){// return the first elemet and also also deletes it
        if(isemplty()){
            throw new EmptyStackException();
        }
        Object obj=arr[size-1];// or size-- is also same thing
        arr[size-1]=null;
        size=size-1;
         return obj;

     }
     public int size(){
        return size;
     }



    }






    
    






public class main {
    public static void main(String[] args) {
        stack obj=new arrayst(10);
        
        obj.push("123");
        obj.push("mehar");
        obj.push("ali");
        obj.push("sadar");
        // obj.push();
    //  System.out.println(obj.peak());// output = mehar;
    // for(int i=0; i<size; i++){
    //     System.out.println(obj.pop().toString());
    // }
    int size=obj.size();
    // System.out.println(size);
    // System.out.println(obj.size());
    for(int i=0;i<size;i++)
        
    System.out.println(obj.pop());
    }
}
