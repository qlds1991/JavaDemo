package Chapter9;

import java.text.DecimalFormat;

public class DecimalMethod {

	public static void main(String[] args) {
		DecimalFormat myformat = new DecimalFormat();
		// 设置将数字分组为2
		myformat.setGroupingSize(2);
		
		String output = myformat.format(123456.789);
		System.out.println("将数字以每两个数字分组" + output);
		// 设置不允许数字进行分组
		myformat.setGroupingUsed(false);
		
		String output2 = myformat.format(123456.789);
		System.out.println("不允许数字分组：" + output2);
	}
	
}
