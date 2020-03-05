import java.util.Scanner;
import java.util.Arrays;
public class Question5 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr5[] = new int[10];
		for (int i = 0; i < arr5.length; i++){
			arr5[i] = ohyeah.nextInt();
			
		}
		int largest = 0;
		int smallest = arr5[0];
		for (int i = 0; i < arr5.length; i++){
			if(arr5[i]>largest) {
				largest = arr5[i];
			}
			if(arr5[i]<smallest) {
				smallest = arr5[i];
			}
		}
	    
	    
		System.out.println(Arrays.toString(arr5));
		System.out.println(largest);
		System.out.println(smallest);

}
}
