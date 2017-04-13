package zhaungshi;
import java.lang.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 测试类
 * @author re
 *@date 2017年3月28日10:36:20
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Man man = new Man();
		ManDecoratorA md1 = new ManDecoratorA();
		
		md1.setPerson(man);
		md1.eat();
		ManDecoratorB md2 = new ManDecoratorB();
		md2.setPerson(man);
		md2.eat();
		
	}
}
