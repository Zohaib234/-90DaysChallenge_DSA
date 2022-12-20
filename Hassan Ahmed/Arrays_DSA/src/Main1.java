

public class Main1 {
    public static void main(String[] args) {
        int [] arr1 = {2,60,3,78,46,12};
       for(int i=0;i< arr1.length-1;i++){
           int minIndex=i;
           for(int j=i+1;j< arr1.length;j++){
               if(arr1[j]<arr1[minIndex]){
                   minIndex=j;
               }
           }
           int temp=arr1[minIndex];
           arr1[minIndex]=arr1[i];
           arr1[i]=temp;
       }
       for (int i:arr1) System.out.println(i);
    }
}
