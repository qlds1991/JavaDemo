package Chapter7;

public class AnyThing {
	
	// 定义无参构造方法
	public AnyThing() {
		this("this调用有参构造方法");
		System.out.println("无惨构造方法");
	}
	
	public AnyThing(String name) {
		System.out.println("有参够惨方法");
	}
	
	public static void main(String[] args) {
		System.out.println("主方法");
	}
}
