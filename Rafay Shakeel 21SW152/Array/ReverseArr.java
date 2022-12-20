public class ReverseArr {
    public static void main(String[] args) {
        int marks[]={100,98,78,55};

        System.out.println("Printing the array normally:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Printing array in reverse order:");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}

//Still knowing nothing about Time & Spaces!
