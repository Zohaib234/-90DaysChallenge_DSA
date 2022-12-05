

public class Main2 {
    public static void main(String[] args) {

        //Insertion sorting
        int [] arr3 = {2,60,3,78,46,12};
        for(int i=1;i<arr3.length;i++){
        int current=arr3[i];
        int j=i-1;
        while (j>=0&&current<arr3[j]){
            arr3[j+1]=arr3[j];
            j--;
        }
        arr3[j+1]=current;
        }
   for (int i:arr3) System.out.println(i);

    }
}
