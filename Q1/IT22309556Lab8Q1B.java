import java.util.Scanner;

public class IT22309556Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenCount = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Find even numbers and store in evenArray
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }
        
        // Fill remaining spots in evenArray with zeros to match expected output format
        for (int i = evenCount; i < 5; i++) {
            evenArray[i] = 0;
        }

        // Print myArray Contents
        System.out.println();
        System.out.println("myArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // Print evenArray Contents
        System.out.println();
        System.out.println("evenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}