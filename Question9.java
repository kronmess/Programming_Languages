import java.util.Scanner;
import java.util.Arrays;
public class Question9 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int arr9[] = new int[5];
		int n = 1;
			for (int i = 0; i < arr9.length; i++){
			arr9[i] = ohyeah.nextInt();
			}
			
			for (int i= 0; i < n;i++){
				int last = arr9[arr9.length-1];
				 for(int j = arr9.length-1; j > 0; j--){ 
					 arr9[j] = arr9[j-1];  
				 }
				 arr9[0] = last;   
				}
			
			
		
		System.out.println(Arrays.toString(arr9));
		
}

}
