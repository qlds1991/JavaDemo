package Chapter1to5;

public class Gess {
	public static void main(String[] args) {
		
		char word = 'd', word2 = '@'; // 定义char型变量
		int p = 23045, p2 = 45213;
		System.out.println("d在unicode表中的顺序位置是：" + (int)word);
		System.out.println("@在unicode表中的顺序位置是：" + (int)word2);
		System.out.println("Unicode表中的第23045位是：" + (char)p);
		System.out.println("Unicode表中的第45213位是：" + (char)p2);
		
		/**
		 * 转意字符
		 */
		char c1 = '\\';
		char char1 = '\u2605';
		System.out.println(c1);
		System.out.println(char1);
		
		/**
		 * boolean 类型
		 */
		boolean b;
		boolean b1,b2;
		boolean b3 = true;
	}
}
