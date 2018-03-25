package Chapter9;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	
	// 使用实例化对象时设置格式化模式
	static public void SimgleFormat(String pattern,double value) {
		
		// 实例化DecimalFormat对象
		DecimalFormat myFormat = new DecimalFormat(pattern);
		// 将数字进行格式化
		String outPut = myFormat.format(value);
		
		System.out.println(value + " " + pattern + " " + outPut);
	}
	
	// 使用applyPattern()方法对数字进行格式化
	static public void UseApplyPatternMethodFormat(String pattern,double value) {
		// 实例化DecimalFormat对象
		DecimalFormat myFormat = new DecimalFormat();
		
		// 调用applyPattern()方法设置格式化模板
		myFormat.applyPattern(pattern);
		System.out.println(value + " " + pattern + " " + myFormat.format(value));
	}
	
	public static void main(String[] args) {
		
		// 调用静态 SimgleFormat 方法
		SimgleFormat("###,###.###", 123456.789);
		
		// 在数字后加上单位
		SimgleFormat("00000000.###kg", 123456.789);
		
		// 按照格式化模板格式化数字不存在的位以0显示
		SimgleFormat("000000.000", 123.78);
		
		// 调用静态UseApplyPatternMethodFormat()
		UseApplyPatternMethodFormat("#.###%", 0.789);
		
		// 将小数点后格式化为两位
		UseApplyPatternMethodFormat("###.##", 123456.79);
		
		// 将数字转化为千分位形式
		UseApplyPatternMethodFormat("0.00\u2030", 0.789);
		
		// 实例化DecimalFormat类对象
		DecimalFormat myformat = new DecimalFormat();
		// 设置将数字分组的大小
		myformat.setGroupingSize(2);
		// 设置是否支持分组
		myformat.setGroupingUsed(false);
		
	}
}
