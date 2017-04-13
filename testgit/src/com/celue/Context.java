package com.celue;

public class Context {
			//持有算法接口
			private AlgorithmInterface algorithmInterface;
			public Context(AlgorithmInterface algorithmInterface) {
				// TODO Auto-generated constructor stub
				this.algorithmInterface=algorithmInterface;
			}
			
			public double getCommission(double jine){
				System.out.println("Context与算法接口中签名一样的方法被调用");
				return algorithmInterface.getCommission(jine);
			}
			
}
