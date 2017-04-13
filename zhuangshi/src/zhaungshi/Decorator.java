package zhaungshi;

/**
 *这里定义一个装饰角色类，持有一个persion。这个person指的是man
 *最好将装饰角色类定义为抽象类（根据具体需求适当改变，没有一定要用），给出指定的抽象方法，让子类去继承实现。
 *这里定义了 beforeEat()这个抽象方法
 * Decorator
 * 
 * @author re
 *
 */
public abstract class Decorator implements Person {
	protected Person person;//这个属性的注入，这里是采用了set注入的方法，也可以建个构造方法进行
	//注入，不过感觉没有使用setPerson()方便
	public void setPerson(Person person) {
		this.person = person;
		System.out.println("Decorator 的set方法被调用，传入一个Person实例");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub	
		person.eat();			
	}
	//定义两个新增的功能
	public abstract void beforeEat();
	public abstract void afterEat();

}
