package Chapter9;

import java.math.BigDecimal;

public class BigDecimalDemo {

	static final int location = 10;
	
	/**
	 * 1、定义加加法方法，参数为加数与被加数
	 * @param val1
	 * @param val2
	 * @return
	 */
	public BigDecimal add(double val1,double val2) {
		// 实例化Decimal对象
		BigDecimal b1 = new BigDecimal(Double.toString(val1));
		BigDecimal b2 = new BigDecimal(Double.toString(val2));
		
		return b1.add(b2);
	}
	
	/**
	 * 2、定义减方法，参数为减数和被减数
	 * @param val1
	 * @param val2
	 * @return
	 */
	public BigDecimal sub(double val1,double val2) {
		BigDecimal b1 = new BigDecimal(Double.toString(val1));
		BigDecimal b2 = new BigDecimal(Double.toString(val2));
		
		return b1.subtract(b2);
	}
	
	/**
	 * 3、定义乘法，参数为乘数和被乘数
	 * @param val1
	 * @param val2
	 * @return
	 */
	public BigDecimal mul(double val1,double val2) {
		BigDecimal b1 = new BigDecimal(Double.toString(val1));
		BigDecimal b2 = new BigDecimal(Double.toString(val2));
		
		return b1.multiply(b2);
	}
}
