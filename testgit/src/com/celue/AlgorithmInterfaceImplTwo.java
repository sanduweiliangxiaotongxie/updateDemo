package com.celue;
/**
 * 第二种算法
 * @author szw
 *20w-30w收取百分之4
 */
public class AlgorithmInterfaceImplTwo implements AlgorithmInterface {

	@Override
	public double getCommission(double jine) {
		// TODO Auto-generated method stub
		System.out.println("算法二被调用");
		//计算第一范围内的金额
		double jine1=new AlgorithmInterfaceImpl().getCommission(200000);//调用10w-20w的算法，返回那个范围内的返点
		//计算第二范围内的金额
		double jine2=(jine-200000)*0.04;		
		return jine1+jine2;
	}

}
