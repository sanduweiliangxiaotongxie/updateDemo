package zhaungshi;
/**
 * 与ManDecoratorA性质相同
 * @author re
 *@date 2017年3月28日10:36:54 
 */
public class ManDecoratorB extends Decorator {
	  public void eat() {
		   System.out.println("ManDecoratorB类");
		  	afterEat();
	        super.eat();
	        beforeEat();
	    	System.out.println("在不增加子类的情况下，扩展了 饭前运动和饭后运动的功能");
	        
	     
	    }

	@Override
	public void afterEat() {
		// TODO Auto-generated method stub
		System.out.println("ManDecoratorB--饭前");
	}

	@Override
	public void beforeEat() {
		// TODO Auto-generated method stub
		System.out.println("ManDecoratorB--饭后");
	}	  
}
