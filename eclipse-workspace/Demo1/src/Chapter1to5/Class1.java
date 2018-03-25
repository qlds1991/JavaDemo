package Chapter1to5;

//import java.sql.Date;
import java.util.Date;

public class Class1 {

	public static void main(String[] args) {
		
		// 1、算数运算符
//		Arith(45.56f, 152);
		
		// 2、逻辑运算符
//		Caculation(2, 5);
		
		// 3、三元运算符
//		ThreeCircle(20, 45);
		
		// 4、for循环语句
//		Circulate();
		
		// 5、比较运算符
//		Compare(4, 5);
		
		// 6、作用域练习
//		Compound();
		
		// 7、隐式转换
//		Conver();
		
		// 8、while和do...while循环
//		Cycle(100, 100);
		
		// 9、foreach语句
//		Repetition();
		
		// 10、循环控制Break
//		BreakTest();
		
		// 11、循环控制Loop标签
//		BreakLoopTest();
		
		// 12、循环控制Continue
//		ContinueTest();
		
		// 13、字符串对象
//		StringTest();
		
		// 14、连接多个字符串
//		Join();
		
		// 15、字符串和其它数据类型连接
//		Link();
		
		// 16、字符串的查找
//		StrSearch();
		
		// 17、字符串去空格
//		Blak();
		
		// 18、字符串的替换
//		newStr();
		
		// 19、判断字符串的首位是否为指定内容
//		StartsOrEnd();
		
		// 20、比较两个字符串是否相等
//		CheckStringEqual(new String("abc"), new String("ABC"));
		
		// 21、按字典顺序比较两个字符串
//		WordBook();
		
		// 22、字符串的分割
//		Division();
		
		// 23、字符串格式化（时间日期格式化）
//		DataTimeFormat();
//		Eval();
		
		// 25、字符串格式化（时间格式化）
//		GetDate();
		
		// 26、格式化常见的日期时间组合
		DateAndTime();
	}

	/**
	 * 1、算数运算符
	 * @param number1
	 * @param number2
	 */
	public static void Arith(float number1,int number2) {
		System.out.println("和为：" +(number1+number2));
		System.out.println("差为：" +(number1-number2));
		System.out.println("积为：" +(number1*number2));
		System.out.println("商为：" +(number1/number2));
	}
	
	/**
	 * 2、逻辑运算符
	 * @param a
	 * @param b
	 */
	public static void Caculation(int a,int b) {
		boolean result1 = ((a>b) && (a!=b));
		boolean result2 = ((a>b) || (a!=b));
		System.out.println(result1);
		System.out.println(result2);
	}
	
	/**
	 * 3、三元运算符
	 * @param a
	 * @param b
	 */
	public static void ThreeCircle(int a,int b) {
		boolean b1 = a<b?true:false;
		System.out.println(b1);
	}
	
	/**
	 * 4、for循环语句
	 */
	public static void Circulate() {
		int sum = 0;
		for(int i=2;i<=100;i+=2) {
			sum+=i;
		}
		System.out.println("2到100之间所有的偶数和为：" + sum);
	}
	
	/**
	 * 5、比较运算符
	 * @param number1
	 * @param number2
	 */
	public static void Compare(int number1,int number2) {
		System.out.println("number1>number2的返回值为：" + (number1>number2));
		System.out.println("number1<number2的返回值为：" + (number1<number2));
		System.out.println("number1==number2的返回值为：" + (number1==number2));
		System.out.println("number1!=number2的返回值为：" + (number1!=number2));
		System.out.println("number1>=number2的返回值为：" + (number1>=number2));
		System.out.println("number1<=number2的返回值为：" + (number1<=number2));
	}
	
	/**
	 * 6、作用域练习
	 */
	public static void Compound() {
		int x = 20;
		{
			int y = 40;
			System.out.println(y);
			int z = 245;
			Boolean b;
			{
				b = y > z;
				System.out.println(b);
			}
		}
		String word = "Hello java";
		System.out.println(word);
		
		int a = 100;
		if(a == 100)
			System.out.println(a);
	}
	
	/**
	 * 7、隐式转换
	 */
	public static void Conver() {
		byte mybyte = 127;
		int myint  = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte类型数据与float类型数据运算结果为：" + (mybyte + myfloat));
		System.out.println("byte类型数据与int类型数据运算结果为：" + (mybyte * myint));
		System.out.println("byte类型数据与char类型数据运算结果为：" + (mybyte / mychar));
		System.out.println("double类型数据与char类型数据运算结果为：" + (mydouble + mychar));
	}
	
	/**
	 * 8、while和do...while循环
	 */
	public static void Cycle(int a,int b) {
		
		while (a == 60) {
			System.out.println("ok1");
			a--;
		}
		
		do {
			System.out.println("ok2");
			b--;
		} while (b==60);
	}
	
	/**
	 * 9、foreach语句
	 */
	public static void Repetition() {
		int arr[] = {7,10,1};
		for (int x : arr) {
			System.out.println(x);
		}
	}
	
	/**
	 * 10、循环控制Break
	 */
	public static void BreakTest() {
		for(int i=0;i<=100;i++) {
			System.out.println(i);
			if(i==6)
				break;
		}
		System.out.println("------end------");
	}
	
	/**
	 * 11、循环控制Loop标签
	 */
	public static void BreakLoopTest() {
		Loop:for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				if(j==4)
					break Loop;
				System.out.println("i = " + i + ",j = " + j);
			}
		}
	}
	
	/**
	 * 12、循环控制Continue
	 */
	public static void ContinueTest() {
		for(int i=0;i<20;i++) {
			if(i%2 == 0)
				continue;
			System.out.println(i);
		}
	}
	
	/**
	 * 13、字符串对象
	 */
	public static void StringTest() {
		// 1、用一个字符数组创建字符串
		char a[] = {'g','o','o','d'};
		String s1 = new String(a);
		System.out.println(s1);
		
		String s2 = new String("good");
		System.out.println(s2);
		
		// 2、截取数组a中的一部分组成一个新的字符串
		String s3 = new String(a,1,3);
		System.out.println(s3);
	}
	
	/**
	 * 14、连接多个字符串
	 */
	public static void Join() {
		String s1 = new String("hello");
		String s2 = new String("word");
		String s = s1 + " " + s2;
		System.out.println(s);
	}
	
	/**
	 * 15、字符串和其它数据类型连接
	 */
	public static void Link() {
		int booktime = 4;
		float practice = 2.5f;
		System.out.println("我每天花费" + booktime + "小时看书；" + practice + "小时上机练习");
	}
	
	/**
	 * 16、字符串的查找
	 */
	public static void StrSearch() {
		String str = "We are student";
		int size1 = str.indexOf("a");
		System.out.println(size1);
		
		int size2 = str.lastIndexOf("");
		System.out.println("空字符在字符串str中的位置是：" + size2);
		System.out.println("字符串str的长度是：" + str.length());
		
		char mychar = str.charAt(7);
		System.out.println(mychar);
		
		String subStr1 = str.substring(3);
		System.out.println(subStr1);
		
		String subStr2 = str.substring(3, 8);
		System.out.println(subStr2);
	}
	
	/**
	 * 17、字符串去空格
	 */
	public static void Blak() {
		String str = " Java class ";
		System.out.println("字符串原来的长度：" + str.length());
		System.out.println("去掉空格后的长度：" + str.trim().length());
	}
	
	/**
	 * 18、字符串的替换
	 */
	public static void newStr() {
		String str = "address";
		String newStr = str.replace("a", "A");
		System.out.println(newStr);
	}
	
	/**
	 * 19、判断字符串的首位是否为指定内容
	 */
	public static void StartsOrEnd() {
		String num1 = "22045612";
		String num2 = "21304578";
		
		Boolean b1 = num1.startsWith("22");
		Boolean b2 = num1.endsWith("78");
		Boolean b3 = num2.startsWith("22");
		Boolean b4 = num2.endsWith("78");
		
		System.out.println("字符串num1是以22开头的吗？" + b1);
		System.out.println("字符串num1是以78开头的吗？" + b2);
		System.out.println("字符串num2是以22开头的吗？" + b3);
		System.out.println("字符串num2是以78开头的吗？" + b4);
	}
	
	/**
	 * 20、比较两个字符串是否相等
	 */
	public static void CheckStringEqual(String str1,String str2) {
//		boolean b = (str1 == str2);
		boolean b = str1.equals(str2);
		System.out.println(b);
		
		boolean c = str1.equalsIgnoreCase(str2);
		System.out.println(c);
	}
	
	/**
	 * 21、按字典顺序比较两个字符串
	 */
	public static void WordBook() {
		
		String s1 = new String("b");
		String s2 = new String("a");
		String s3 = new String("c");
		
		System.out.println(s1 + " compareTo " + s2 + " ：" + s1.compareTo(s2));
		System.out.println(s1 + " compareTo " + s3 + " ：" + s1.compareTo(s3));
	}
	
	/**
	 * 22、字符串的分割
	 */
	public static void Division() {
		
		String str = new String("192.168.0.1");
		
		// 按照"."进行分割，使用转意字符"\\."
		String[] firstArr = str.split("\\.");
		
		for (String string : firstArr) {
			System.out.println(string);
		}
		
		// 按照"."进行两次分割，使用转意字符"\\."
		String[] secondArr = str.split("\\.", 2);
		
		for (String string : secondArr) {
			System.out.println(string);
		}
	}
	
	/**
	 * 23、字符串格式化（时间日期格式化）
	 */
	public static void DataTimeFormat() {
		
		Date date = new Date();
		String s = String.format("%te", date);
		System.out.println(date);
		System.out.println(s);
	}
	
	/**
	 * 24、字符串格式化（日期格式化）
	 */
	public static void Eval() {
		
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		
		System.out.println(year + "-" + month + "-" + day);
	}
	
	/**
	 * 25、字符串格式化（时间格式化）
	 */
	public static void GetDate() {
		Date date = new Date();
		String hour = String.format("%tH", date);
		String min = String.format("%tM", date);
		String sec = String.format("%tS", date);
		
		System.out.println(hour+":"+min+":"+sec);
	}
	
	/**
	 * 26、格式化常见的日期时间组合
	 */
	public static void DateAndTime() {
		
		Date date = new Date();
		String time = String.format("%tc", date);
		String form = String.format("%tF", date);
		
		System.out.println(time);
		System.out.println(form);
	}
}
