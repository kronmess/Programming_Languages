import java.util.Scanner;
import java.util.Arrays;
public class Question2 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr2[] = new int[10];
		for (int i = 0; i < arr2.length; i++){
			arr2[i] = ohyeah.nextInt();
			
		}
		System.out.println(Arrays.toString(arr2));

		int input = ohyeah.nextInt();
		for (int i : arr2) {
			if (i == input) {
				System.out.println("It is inside the array");
				break;
			}
				
			
		}
			
		
	}

}
