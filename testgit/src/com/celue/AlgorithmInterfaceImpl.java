package com.celue;
/**
 * 第一种算法  
 * @author szw
 *10w-20w收取 百分之3
 */
public class AlgorithmInterfaceImpl implements AlgorithmInterface {
	
	@Override
	public double getCommission(double jine) {
		// TODO Auto-generated method stub
		//算法省略
		System.out.println("算法一被调用");
		return jine*0.03;//这只是做一个演示，计算金额不一定会特别准确
	}

}
