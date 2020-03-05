
public class AsciiDecimal {
	public static void main(String[] args) {
		int mask1 = '\u00CF';
		int mask2 = '\u0030';
		int ascii1 = 54;
		int decimal1 = 6;
		//ascii to decimal
		int decimalResult = ascii1 & mask1;
		//decimal to ascii
		int asciiResult = decimal1 | mask2;
		System.out.printf("%d",decimalResult);
		System.out.printf("%d",asciiResult);
	}
}
