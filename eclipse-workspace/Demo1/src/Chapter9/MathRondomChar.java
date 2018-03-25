package Chapter9;

public class MathRondomChar {
	public static char GetRondomChar(char cha1,char cha2) {
		return (char)(cha1 + Math.random()*(cha2-cha1+1));
	}
	
	public static void main(String[] args) {
		// 获取a~z的随机字符
		System.out.println("任意小写字符" + GetRondomChar('a', 'z'));
		// 获取A~Z的随机字符
		System.out.println("任意大写字符" + GetRondomChar('A', 'Z'));
		// 获取0~9的随机字符
		System.out.println("0~9任意数字字符：" + GetRondomChar('0', '9'));
	}
}
