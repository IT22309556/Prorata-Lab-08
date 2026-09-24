import java.util.Scanner;
public class IT22309556Lab8Q1A {
	public static void main(String[] args) {
	
	int[] myArray = new int[5];
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 5 Numbers:");
	
	for(int  count =0; count < myArray.length ; count ++)
		{
		System.out.print("Enter Number " +(count+1) + ": ");
		myArray[count] = input.nextInt();
		}
		
		//printing in reverse order
		System.out.println();
		System.out.println("Array in Reverse Order:");
		
		for(int c = myArray.length -1; c >=0 ; c--)
		{
			System.out.print(myArray[c] + " ");
		}
		System.out.println();
	}
}