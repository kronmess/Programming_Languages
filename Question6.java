import java.util.Scanner;
import java.util.Arrays;
public class Question6 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int arr6[] = new int[5];
		int reverse[] = new int[5];
			for (int i = 0; i < arr6.length; i++){
			arr6[i] = ohyeah.nextInt();
}
			for (int i = arr6.length -1; i >= 0; i--)
			{
				reverse[i]=arr6[arr6.length-1-i];
					
				}
			
			
		System.out.println(Arrays.toString(arr6).equals(Arrays.toString(reverse)));
		System.out.println(Arrays.toString(arr6));
		System.out.println(Arrays.toString(reverse));
}

}
