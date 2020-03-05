import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		int x[] = {1,2,3,4,5};
		int y[] = new int[5];
		for (int i = x.length-1; i >= 0 ; i-- ) {
			y[i]=x[x.length-1-i];
			
		}
		
		System.out.println(Arrays.toString(y));
	}
}

