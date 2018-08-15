/*==================================================================================================
□ INFORMATION
  ○ Data : 15.08.2018
  ○ Mail : eun1310434@naver.com
  ○ WebPage : https://eun1310434.github.io/
  ○ Reference
     - Hello Java Programming
     
□ FUNCTION
  ○ 
   
□ Study
  ○ GenericRestrictSuper
    - class "ClassName" <? super "ClassName" OR "InterfaceName" >
==================================================================================================*/

package com.eun1310434.Generic;

import java.util.ArrayList;
import java.util.List;


class GenericRestrictSuper_method {	
	public static void display(List<? super Integer> list){
		//<? super Integer> -> Integer 타입보다 큰것만 출력하고 싶습니다. 
		for(int i = 0 ; i < list.size(); ++i){
			Object obj = list.get(i);
			System.out.println(i +" : "+obj);
		}
		System.out.println("");
	} 	
}

public class GenericRestrictSuper {
	public static void main(String[] ar) {
		List<Integer> list_a = new ArrayList<>();
		list_a.add(1);
		list_a.add(2);
		list_a.add(3);
		GenericRestrictSuper_method.display(list_a);
		// Compile ->  integer 타입이기에 출력 가능.
		
		List<Double> list_b = new ArrayList<>();
		list_b.add(1.1);
		list_b.add(1.2);
		list_b.add(1.3);
		//GenericRestrictSuper_method.display(list_b);
		// Compile Error(X) ->  Double 타입은 Integer 타입의 상위 클래스가 아니기에 출력 불가능. 
		
		List<Object> list_c = new ArrayList<>();
		list_c.add(new Object());
		list_c.add(new Object());
		list_c.add(new Object());
		GenericRestrictSuper_method.display(list_c);
		// Compile ->  Object 타입은 모든 클래스의 최상위 클래스이기에 출력 가능.
	}
}


