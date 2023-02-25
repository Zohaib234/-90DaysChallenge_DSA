public class genirc {
    public static void main(String[] args) {
        // wrappr class of the data type will be given
        // hell<Integer> obj=new hell<Integer>();
        // obj.setdata(12);
        // hell<String> obj1=new hell<String>();

        // obj1.setdata("mehar");
        // System.out.println(obj.getdata());
        // System.out.println(obj1.getdata());
    student<String, Integer> name= new student<>() ;
    student<String, Integer> gpa=new student<>();
    student<String, Integer> sem=new student<>();
    student<String, Integer> roll=new student<>();

    name.setdata("mehar");
    gpa.setgpa(3);
System.out.println( " name is  "+name.getname());    
  System.out.println( " gpa is "+gpa.getgpa());  
  gpa.setgpa(3);
//   System.out.println(name.getname()); 
  sem.setsem(" fisrt semester");
  System.out.println(sem.getsem()); 
  roll.setroll(58);
  System.out.println( " roll number is  "+roll.getroll()); 

    }
    
}
//genric classs 
class hell<T>{
    private T data;
    public void setdata(T data){
        this.data=data;
    }
    public T getdata(){
        return data;
    }
}
class student<N,G>{
    private N name;
    private G gpa;
    private N sem;
    private    G roll;
     
   
    public void setdata(N name){
        this.name=name;
        // this.gpa=gpa;
    }
    public void setgpa(G gpa){
        this.gpa=gpa;
    }
    public void setsem(N sem){
        this.sem=sem;
    }
    public void setroll(G roll){
        this.roll=roll;
    }
    public  N getname(){
        return name;
    }
    public G getgpa(){
        return gpa;
    }
    public N getsem(){
        return sem;
    }
    public G getroll(){
        return roll;
    }
}
