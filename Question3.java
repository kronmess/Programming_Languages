import java.util.Scanner;
import java.util.Arrays;
public class Question3 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 20 numbers");
		int arr3[] = new int[20];
		for (int i = 0; i < arr3.length; i++){
			arr3[i] = ohyeah.nextInt();
			
		}
		System.out.println(Arrays.toString(arr3));
		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i]>=0) {
				positive += 1;
			}else {
				negative += 1;
			}
			if (arr3[i] % 2 == 0) {
				even += 1;
			}else {
				odd += 1;
			}
	}
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(even);
		System.out.println(odd);
	}
	}
	
