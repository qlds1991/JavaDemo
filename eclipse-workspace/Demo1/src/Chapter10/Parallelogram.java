package Chapter10;

/**
 * 平行四边形类
 * @author dongfangjinyuql
 */
public class Parallelogram extends Quadrangle {
	
	/**
	 * 10.11 多态案例
	 */
//	public void draw(Parallelogram p) {
//		// ...绘图语句
//	}
	
	public static void main(String[] args) {
		
		/** 
		 * 10.3.2 向下转型案例
		 */ 
//		draw(new Parallelogram());
//		// 将平行四边形类对象看做是四边形类对象，称为向上转型操作
//		Quadrangle q = new Parallelogram();
////		Parallelogram p = q;
//		// 将父类对象赋予子类对象，这种写法错误
//		// 将父类对象强转为子类对象赋值给子类对象
//		Parallelogram p = (Parallelogram)q;
		
		/**
		 * 10.4 instanceof 案例
		 */
//		Quadrangle q = new Quadrangle();
//		// 判断父类对象是不是Parallelogram子类对象的实例
//		if(q instanceof Parallelogram) {
//			Parallelogram p = (Parallelogram)q; // 向下转型操作
//			System.out.println(p.getClass().toString());
//		}
//		
//		// 判断父类对象是不是Square子类的对象的实例
//		if(q instanceof Square) {
//			Square s = (Square)q;
//			System.out.println(s.getClass().toString());
//		}
		
		// 由于q对象不为Anything类的对象，所以不能执行向下转型操作
//		System.out.println(q instanceof AnyThing);
	}
}
