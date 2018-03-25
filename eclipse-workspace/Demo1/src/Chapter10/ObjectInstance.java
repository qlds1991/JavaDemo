package Chapter10;

public class ObjectInstance {
	@Override
	public String toString() {
		
		return "在" + getClass().getName() + "类中重写toString方法";
	}
	
	public static void main(String[] args) {
		
		// 打印ObjectInstancwe时会自动调用toString方法
		System.out.println(new ObjectInstance());
	}
}
