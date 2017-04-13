package com.celue;

import java.util.Scanner;

/**
 * 10w-20w范围调用算法一 20w-30w范围调用算法二 30w以上范围调用算法三 10w一下不在计算范围之内
 * 
 * @author szw
 *
 */
public class Client {
	public static void main(String[] args) {

		AlgorithmInterface algorithmInterface = null;
		for (int i = 1; i < 5; i++) {
			System.out.println("请输入第" + i + "个金额");
			Scanner sc = new Scanner(System.in);
			double money = sc.nextDouble();
			algorithmInterface = UtilsExtend.getTypeExtend(money);
			if (algorithmInterface != null)// 表明在计算返点的条件之内
			{
				Context context = new Context(algorithmInterface);
				System.out.println("返点金额为:" + context.getCommission(money));

			} else {
				System.out.println("没有达到收取返点的标准");
			}
		}

	}

}
