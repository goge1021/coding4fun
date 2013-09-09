
public class IntegerToRoman {

	private static String[] thousand = {"", "M", "MM", "MMM"};
	private static String[] hundred = {"", "C", "CC" ,"CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	private static String[] ten = {"", "X", "XX" ,"XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	private static String[] single = {"", "I", "II" ,"III", "IV", "V", "VI", "VII", "VIII", "IX"};
	
	
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		sb.append(thousand[num/1000]);
		num %= 1000;
		sb.append(hundred[num/100]);
		num %= 100;
		sb.append(ten[num/10]);
		num %= 10;
		sb.append(single[num]);
		return sb.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntegerToRoman i = new IntegerToRoman();
		System.out.println(i.intToRoman(3999));
	}

}
