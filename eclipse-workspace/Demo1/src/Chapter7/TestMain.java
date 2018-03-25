package Chapter7;

public class TestMain {
	
	

	public static void main(String[] args) {
		
		for (String string : args) {
			System.out.println(string);
		}
		
		StaticTest test1 = new StaticTest();
		test1.method2();
	}

}
