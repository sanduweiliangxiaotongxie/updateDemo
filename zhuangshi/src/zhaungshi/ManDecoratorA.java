package zhaungshi;
/**
 * 具体装饰角色类，此类实现了装饰角色类，也有一个与 man里的eat()方法相同的Eat()方法，并且
 * 将新增的方法 如beforeEat()加入了 ManDecoratorA的Eat()方法中，eat()调用了
 * ManDecoratorA的父类也就是Decorator中的eat()方法，而Decorator中的eat()方法则是
 * man里的eat（）方法，也就是说完成了对man类的功能扩展
 * @author re
 */
public class ManDecoratorA extends Decorator {
	public void eat() {
		System.out.println("ManDecoratorA类");
		beforeEat();
		super.eat();
		afterEat();	
		System.out.println("在不增加子类的情况下，扩展了 饭前运动和饭后运动的功能");
		System.out.println("====================");
	}

	public void beforeEat(){
		
		System.out.println("ManDecoratorA--饭后运动");
	}
	public void afterEat(){
		
		System.out.println("ManDecoratorA--饭前运动");
	}
}
