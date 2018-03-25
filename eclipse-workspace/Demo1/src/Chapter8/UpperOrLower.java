package Chapter8;

public class UpperOrLower {

	public static void main(String[] args) {
//		Character mychar1 = new Character('A');
		Character mychar1 = Character.valueOf('A');
//		Character mychar2 = new Character('a');
		Character mychar2 = Character.valueOf('a');
		
		System.out.println("A是大写字母吗？" + Character.isUpperCase(mychar1));
		System.out.println("a是小写字母吗？" + Character.isLowerCase(mychar2));		
		
	}
}
