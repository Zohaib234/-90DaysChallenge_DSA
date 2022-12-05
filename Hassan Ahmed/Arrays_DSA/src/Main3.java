public class Main3 {
    public static void main(String[] args) {
        //Finding the highest index in an Array

        int [] arr3 = {2,60,3,78,46,12};
        int max =0;
        for(int i=0;i<arr3.length-1;i++){
            if(arr3[i]>arr3[max]){
                max=i;
            }
        }
        System.out.println(arr3[max]);
    }
}
//Algorithm of finding the highest number in the unsorted array
//1) First we compare the first elenent with the 2nd if 2nd is greate the we store in max variable
//2)then we compare the max variable with the next one till the last index of the array am>=ai for all i.
//1 let m=0
//2 repeat the step 3 for i=1 i<=n-1; i++
//3 if ai>am then set m=i