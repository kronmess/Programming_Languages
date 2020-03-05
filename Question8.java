import java.util.Arrays;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner ohyeah = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int arr8[] = new int[5];
		int newarr[] = new int[arr8.length+1];
		for (int i = 0; i < arr8.length; i++){
			arr8[i] = ohyeah.nextInt();
			
		}
		int largest = 0;
		int largestIndex=0;
		for (int i = 0; i < arr8.length; i++){
			if(arr8[i]>largest) {
				largest = arr8[i];
				largestIndex = i;
				
			}
			
		}
	    int secondLargest = 0;
	    for (int i = 0; i < arr8.length; i++){
			if(arr8[i] > secondLargest && arr8[i] < largest) {
				secondLargest = arr8[i];
				
			}
	    }
	    boolean reach = false;
	    for (int i = 0; i < newarr.length; i++){
			if(largestIndex==i){
				newarr[i] = secondLargest;
				i++;
				newarr[i] = largest-secondLargest;
				reach = true;
			}else {
				if(reach) newarr[i] = arr8[i-1];
				else newarr[i] = arr8[i];
			}
	    }
	    
		System.out.println(Arrays.toString(arr8));
		System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(Arrays.toString(newarr));

	}

}
