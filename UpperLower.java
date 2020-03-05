
public class UpperLower {
	public static void main(String[] args) {
			//uppercase to lowercase
			int mask1 = '\u0020';
			int uc1 = '\u0041';
			int lc1 = uc1 | mask1;
			System.out.printf("%c",lc1);
			//lowercase to uppercase
			int mask2 = '\u00DF';
			int lc2 = '\u0061';
			int uc2 = lc2 &	mask2;
			System.out.printf("%c",uc2);
}			
}