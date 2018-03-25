package Chapter10;

class Subroutine extends SubParent {
	public Subroutine() {
		System.out.println("调用子类的Subroutine()构造方法");
	}
	
	public static void main(String[] args) {
		Subroutine s = new Subroutine();
	}
}
