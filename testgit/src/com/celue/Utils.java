package com.celue;

//一个工具类，根据金额返回具体的算法实例，如果需要加新的条件，集成该类进行扩展
public class Utils {	
		public static AlgorithmInterface getType(double jine){
			System.out.println("工具类被调用，根据金额范围返回不同算法实例");
			if(jine>=100000&&jine<200000)
			{
				return new AlgorithmInterfaceImpl();
			}
			
			if(jine>=200000&&jine<300000)
			{
				return new AlgorithmInterfaceImplTwo();
			}
			return null;
		}
	

}
