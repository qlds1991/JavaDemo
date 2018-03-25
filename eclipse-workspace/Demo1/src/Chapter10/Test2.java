package Chapter10;

class Test2 extends Test {
	public Test2() {
		super(); // 调用父类构造方法
		super.doSomeThing(); // 调用父类成员方法
	}
	
	public void doSomeThingNew() { // 新增方法
		// SomeSentence
	}
	
	public void doSomeThing() { // 重写父类方法
		// SomeNewSentence
	}
	
	protected Test2 doIt() { // 重写父类方法，方法返回值类型为Test2类型
		return new Test2();
	}
}
