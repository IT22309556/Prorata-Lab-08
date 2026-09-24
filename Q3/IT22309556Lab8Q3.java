import java.util.Scanner;

public class IT22309556Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                arr[count] = num;
                count++;
            }
        }

        System.out.println();
        System.out.println("Array Contents:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // find maximum
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);

        sc.close();
    }
}