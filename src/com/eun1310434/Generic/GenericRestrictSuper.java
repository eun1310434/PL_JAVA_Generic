/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.Generic;

import java.util.ArrayList;
import java.util.List;

class GenericRestrictSuper_C_a {
	public static void display(List<? super Integer> list){
		//<? super Integer> -> Integer 타입보다 큰것만 출력하고 싶습니다. 
		for(int i = 0 ; i < list.size(); ++i){
			Object obj = list.get(i);
			System.out.println(i +" : "+obj);
		}
	} 	
}

public class GenericRestrictSuper {
	public static void main(String[] ar) {
		List<Integer> list_a = new ArrayList<>();
		list_a.add(1);
		list_a.add(2);
		list_a.add(3);
		GenericRestrictSuper_C_a.display(list_a);
		
		
		List<Double> list_b = new ArrayList<>();
		list_b.add(1.1);
		list_b.add(1.2);
		list_b.add(1.3);
		//GenericRestrictSuper_C_a.display(list_b);
		// Compile Error(X) ->  Double 타입은 Integer 타입보다 작기에 출력 불가. 
		
		List<Object> list_c = new ArrayList<>();
		list_c.add(new Object());
		list_c.add(new Object());
		list_c.add(new Object());
		GenericRestrictSuper_C_a.display(list_c);
		// Compile ->  Object 타입은 모든 클래스의 최상위 클래스이기에 출력 가능.
	}
}
