package zhaungshi;

/**实现了person的接口，现在如果要给person加新功能，需要在接口中增加新方法，然后man来实现
 * 但是，这不符合开闭原则，如果继承man以子类的方式进行扩展，如果功能不定时增加(不是一次性将需要加的功能
 * 全加子类里，而是一段时间加一个，没加一次将产生一个子类)，将会产生非常多的
 * 子类，这是后就用到了装饰模式，给一个对象添加额外的职责，也就是功能，并且是在不修改原来已有代码的基础上
 * 新增。好了，现在以person这个接口为主,为man这个是实现类新增功能.
 * ConcreteComponent 
 * @author re
 *
 */
public class Man implements Person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("程序员吃饭");
	}

}
