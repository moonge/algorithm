package moong.algorithm.baekjoon;

import java.util.ArrayList;

public class Money0 {

//	10 4200
//	1
//	5
//	10
//	50
//	100
//	500
//	1000
//	5000
//	10000
//	50000
	
	public void countMoney(int n, int k) {
		
		int result = 0;
		
		Integer[] moneyKindArr = {1,5,10,50,100,500,1000,5000,10000,50000}; // 돈 종류
		ArrayList<Integer> currentMoneyKindArr = new ArrayList<Integer>(); // 현재 돈 종류
		
		for(int i=0; i<n; i++) {
			currentMoneyKindArr.add(moneyKindArr[i]);
		}
		
		// k값이 0이 아닌동안 돌기
		while(k != 0) {
			for(int i=0; i<currentMoneyKindArr.size(); i++) {
				
				if(i != 0) {
					int beforeMok = k/currentMoneyKindArr.get(i-1); // 이전에 구한 몫
					int mok = k/currentMoneyKindArr.get(i); // 현재 몫
					
					// 현재 몫이 0이고, 현재 몫이 이전에 구한 몫보다 작은 경우
					if(mok == 0 && mok < beforeMok) {
						result += beforeMok; // result에 이전에 구한 몫값 더하기
						k = k%currentMoneyKindArr.get(i-1); // k값은 k값을 돈 종류 목록에서
						                                    // 이전 몫을 구하기 위해 나눈 값으로 나머지를 구한 값
					}
				}
				
			}
		}
		
		System.out.println(result);
	}
	
}
