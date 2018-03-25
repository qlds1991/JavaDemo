package Chapter7;

public class StaticTest {

	// 在类中定义静态变量
	final static double PI = 3.1415;
	
	// 在类中定义静态变量
	static int id;
	
	public static void method1() {
		// 在类中定义静态方法
		// do Something
	}
	
	public void method2() {
		System.out.println(StaticTest.PI);
		System.out.println(StaticTest.id);
		StaticTest.method1();
	}
	
//	public static StaticTest method3() {
		// 在类中定义一个静态方法
//		method2(); // 静态方法中不能直接调用非静态方法
//		return this; // 静态方法中不能使用this关键字
//	}
}
