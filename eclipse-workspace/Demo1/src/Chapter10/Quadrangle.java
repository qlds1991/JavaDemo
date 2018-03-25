package Chapter10;

/**
 * 四边形类
 * @author dongfangjinyuql
 */
public class Quadrangle {
	
	// 实例化保存四边形对象的数组
	private Quadrangle[] qTest = new Quadrangle[6];
	private int nextIndex = 0;
	
	public void draw(Quadrangle q) {
		if(nextIndex<qTest.length) {
			qTest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		Quadrangle q = new Quadrangle();
		// 以正方形对象为参数调用draw方法
		q.draw(new Square());
		// 以平行四边形对象为参数调用draw方法
		q.draw(new Parallelogramgle());
	}
}
