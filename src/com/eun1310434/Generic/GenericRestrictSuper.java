/*==================================================================================================
�� INFORMATION
  �� Data : 15.08.2018
  �� Mail : eun1310434@naver.com
  �� WebPage : https://eun1310434.github.io/
  �� Reference
     - Hello Java Programming
     
�� FUNCTION
  �� 
   
�� Study
  �� GenericRestrictSuper
    - class "ClassName" <? super "ClassName" OR "InterfaceName" >
==================================================================================================*/

package com.eun1310434.Generic;

import java.util.ArrayList;
import java.util.List;


class GenericRestrictSuper_method {	
	public static void display(List<? super Integer> list){
		//<? super Integer> -> Integer Ÿ�Ժ��� ū�͸� ����ϰ� �ͽ��ϴ�. 
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
		// Compile ->  integer Ÿ���̱⿡ ��� ����.
		
		List<Double> list_b = new ArrayList<>();
		list_b.add(1.1);
		list_b.add(1.2);
		list_b.add(1.3);
		//GenericRestrictSuper_method.display(list_b);
		// Compile Error(X) ->  Double Ÿ���� Integer Ÿ���� ���� Ŭ������ �ƴϱ⿡ ��� �Ұ���. 
		
		List<Object> list_c = new ArrayList<>();
		list_c.add(new Object());
		list_c.add(new Object());
		list_c.add(new Object());
		GenericRestrictSuper_method.display(list_c);
		// Compile ->  Object Ÿ���� ��� Ŭ������ �ֻ��� Ŭ�����̱⿡ ��� ����.
	}
}


