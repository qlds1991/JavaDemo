package Chapter1to5;

import java.util.Date;

public class Class2 {

	public static void main(String[] args) {
		
		// 27、常规类型格式化
//		General();
		
		// 28、正则表达式
//		Judge();
		
		// 29、字符串生成器
		Jerque();
	}
	
	/**
	 * 27、常规类型格式化
	 */
	public static void General() {
		
		// 1、结果已十进制显示
		String s1 = String.format("%d", 400/2);
		// 2、结果已boolean类型显示
		String s2 = String.format("%b", 35);
		// 3、结果已十六进制显示
		String s3 = String.format("%x", 26);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	/**
	 * 28、正则表达式
	 */
	public static void Judge() {
		
		// 定义匹配Email地址的正则表达式
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String s1 = "aaa@";
		String s2 = "aaaaa";
		String s3 = "1111@111ffyu.dfg.com";
		
		// 判断字符串是否与正则表达式匹配
		if(s1.matches(regex))
			System.out.println(s1 + "是一个合法的Email地址格式");
		if(s2.matches(regex))
			System.out.println(s2 + "是一个合法的Email地址格式");
		if(s3.matches(regex))
			System.out.println(s3 + "是一个合法的Email地址格式");
	}
	
	/**
	 * 29、字符串生成器
	 */
	public static void Jerque() {
		String str = "";
		
		// 定义对字符串执行操作的起始时间
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			str+=i;
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("String消耗时间：" + time);
		
		// 字符串生成器追加10000次消耗的时间
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for(int j=0;j<10000;j++) {
			builder.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime - startTime;
		
		System.out.println("StringBuilder消耗时间：" + time);
		
		// 字符串生成器中追加字符串
		StringBuilder bf = new StringBuilder("hello");
		bf.insert(5, "word");
		System.out.println(bf.toString());
		
		// 删除指定位置的字符串
		bf.delete(2, 4);
		System.out.println(bf.toString());
	}
}
