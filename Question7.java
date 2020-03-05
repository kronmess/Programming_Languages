import java.util.Scanner;
import java.util.Arrays;
public class Question7 {
	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr7[] = new int[10];
		int newarr1[] = new int[arr7.length/2];
		int newarr2[] = new int[arr7.length/2];
			for (int i = 0; i < arr7.length; i++){
			arr7[i] = ohyeah.nextInt();
			}
			for (int i= 0; i<arr7.length;i++) {
				if(i <= arr7.length/2-1) {
					newarr1[i] = arr7[i];
					
				}else if(i >arr7.length/2-1) {
					newarr2[i-arr7.length/2] = arr7[i];
				}
					
			}
			
			
		
		System.out.println(Arrays.toString(arr7));
		System.out.println(Arrays.toString(newarr1));
		System.out.println(Arrays.toString(newarr2));
}

}
