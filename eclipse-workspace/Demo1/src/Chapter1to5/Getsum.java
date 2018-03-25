package Chapter1to5;

public class Getsum {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		while (x<=10) {
			sum += x;
			x++;
		}
		System.out.println("sum = " + sum);
	}
}
