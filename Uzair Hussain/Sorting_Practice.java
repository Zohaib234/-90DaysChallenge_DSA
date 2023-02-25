import java.util.Arrays;

class Methods{
    public int[] Bubble_Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;i++){
               if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
        return arr;
    }
}

public class Sorting_Practice {
    public static void main(String[] args) {

        int [] arr = {4, -6, 5, 7, 8, 9, 1, 10, -9};
        Methods m = new Methods();

        long before1 = System.nanoTime();
        System.out.println("Bubble Sort()  -->  "+Arrays.toString(m.Bubble_Sort(arr)));
        long after1 = System.nanoTime();

        // sp.Bubble_Sort(arr);
        // System.out.println(Arrays.toString(m.Bubble_Sort(arr)));

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

    }
}
