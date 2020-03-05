import java.util.Scanner;
import java.util.Arrays;
public class Question10 {

	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int arr10[] = new int[5];
		int n = 5;
		int temp;
			for (int i = 0; i < arr10.length; i++){
			arr10[i] = ohyeah.nextInt();
			}
			
			 for(int i = 0; i < n-1;i++){
			        for (int j = 0; j < (n-1-i); j++){
			        if (arr10[j] > arr10[j+1]){
			            temp = arr10[j];
			            arr10[j] = arr10[j+1];
			            arr10[j+1] = temp;
			        }
			        }
			 }
			
		
		System.out.println(Arrays.toString(arr10));

	}

}
