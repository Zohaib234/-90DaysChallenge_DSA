
// Array in Data structure 
// Array operation 
// Traversing of an array
import java.util.Scanner;

public class ds1 {

    public static void main(String[] args) {
        // here we dclare array
        // programe to store the marks of the students in an array from the user
        // and display it in console

        int n, i;
        try (// loop to take input from the user

                Scanner input = new Scanner(System.in)) {
            System.out.println("enter the number of the students");

            n = input.nextInt();

            int marks[] = new int[n]; // ye array ka size hoga user ki taraf se
            int size = marks.length;
            System.out.println("size of the array is:" + size);

            // using forEach loop
            for (i = 0; i < n; i++) {
                System.out.println("Enter the marks of the students");
                marks[i] = input.nextInt();

            }
            for (i = 0; i < n; i++) {
                System.out.println(marks[i]);
            }

        }

    }
}