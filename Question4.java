import java.util.Scanner;
import java.util.Arrays;
public class Question4 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr4[] = new int[10];
		for (int i = 0; i < arr4.length; i++){
			arr4[i] = ohyeah.nextInt();
			
		}
		
		int sum = 0;
		int mult = 1;
	    for (int value : arr4) {
	        sum += value;
	        mult = mult * value;
	    }
	    
	    
		System.out.println(Arrays.toString(arr4));
		System.out.println(sum);
		System.out.println(mult);
		
		
			
		
				
		
		
			
		
	}
}




