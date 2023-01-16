interface stack{
    void push(Object obj);
    Object peak();
    Object pop();
    int size();
}
public class stackss implements stack {
    private Object arr[];
    private int size=0;
    public stackss(int capacity){
        arr=new Object(capacity);
    }
    public static void main(String[] args) {
        
    }
}
