package com.celue;
//算法三，大于30w的收取百分之7；
public class AlgorithmInterfaceImplThree implements AlgorithmInterface {

	@Override
	public double getCommission(double jine) {
		System.out.println("算法三被调用");
		//计算30w范围内的金额返点
		double jine1=new AlgorithmInterfaceImplTwo().getCommission(300000);//30w个范围内的返点
		//计算30w以上范围金额返点
		double jine2=(jine-300000)*0.07;		
		return jine1+jine2;

	}

}
