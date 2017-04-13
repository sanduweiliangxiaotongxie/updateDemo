package com.celue;

//当新加条件是，集成工具类并扩展
public class UtilsExtend extends Utils {
	private static AlgorithmInterface algorithmInterface;

	public static AlgorithmInterface getTypeExtend(double jine) {

		algorithmInterface = getType(jine);

		if (algorithmInterface == null) {
			// 新加的条件 大于三十万的
			System.out.println("在工具类中无法找到金额范围对应的实例，在工具类的扩展类中找--工具扩展类被调用");
			if (jine >=300000) {
				algorithmInterface = new AlgorithmInterfaceImplThree();
			}

		}
		return algorithmInterface;

	}
}
