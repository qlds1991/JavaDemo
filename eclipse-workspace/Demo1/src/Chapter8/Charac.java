package Chapter8;

public class Charac {
	
	public static void main(String[] args) {
		
		// 取数字的十进制表示
		String str1 = Integer.toString(456);
		// 取数字的二进制表示
		String str2 = Integer.toBinaryString(456);
		// 取数字的十六进制表示
		String str3 = Integer.toHexString(456);
		// 取数字的八进制表示
		String str4 = Integer.toOctalString(456);
		
		System.out.println("456的十进制表示是：" + str1);
		System.out.println("456的二进制表示是：" + str2);
		System.out.println("456的十六进制表示是：" + str3);
		System.out.println("456的八进制表示是：" + str4);
	}
}
