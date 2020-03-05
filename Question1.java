import java.util.Scanner;
import java.util.Arrays;
public class Question1 {
	
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr1[] = new int [10];
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = ohyeah.nextInt();
			
		}
		System.out.println(Arrays.toString(arr1));
	}

}
