package Chapter7;

/**
 * 1、两个对象的比较
 * @author dongfangjinyuql
 */
public class Compare {
	public static void main(String[] args) {
		String c1 = new String("abc");
		String c2 = new String("abc");
		String c3 = c1;
		
		System.out.println("c2 == c3的运算结果为：" + (c2 == c3));
		System.out.println("c2.equal(c3)的运算结果为：" + (c2.equals(c3)));
	}
}

