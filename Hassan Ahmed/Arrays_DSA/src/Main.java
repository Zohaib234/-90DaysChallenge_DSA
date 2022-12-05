

public class Main {
    public static void main(String[] args) {


        //Time complexity Big O(n^2)

        //Bubble Sorting

        int [] array1 = {2,60,3,78,46,12};
        for(int i=0;i<=array1.length-2;i++){
            for(int j=0;j<=array1.length-2-i;j++){
                if(array1[j]>array1[j+1]){
                    int temp = array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=temp;
                }
            }
        }

        for(int i:array1){
            System.out.println(i);
        }

    }
}
