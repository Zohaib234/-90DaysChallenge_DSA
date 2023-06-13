public class Test_Fibonacci_Recurrsion{
    long fab(int n){
        if(n<1){
            return 0;
        }
        if(n<3){
            return 1;
        }
        return (fab(n-1)+fab(n-2));
    }
    public long fab2(int n){
        if(n<2){
            return n;
        }
        long f0=0,f1=1,f2=1;
        for(int i=2;i<n;i++){
            f0=f1;
            f1=f2;
            f2=(f1+f0);
        }
        return f2;
    }
    public static void main(String[] args) {
        Test_Fibonacci_Recurrsion a=new Test_Fibonacci_Recurrsion();

        for(int i=30;i<=40;i++){
            long t0 =System.currentTimeMillis();
            long m=a.fab(i);
            long t1=System.currentTimeMillis();
            System.out.println(t1-t0);
        }
    }
}