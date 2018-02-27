/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;

import java.util.ArrayList;
import java.util.List;

class GenericRestrictSuper_C_a {
	public static void display(List<? super Integer> list){
		//<? super Integer> -> Integer Ÿ�Ժ��� ū�͸� ����ϰ� �ͽ��ϴ�. 
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
		// Compile Error(X) ->  Double Ÿ���� Integer Ÿ�Ժ��� �۱⿡ ��� �Ұ�. 
		
		List<Object> list_c = new ArrayList<>();
		list_c.add(new Object());
		list_c.add(new Object());
		list_c.add(new Object());
		GenericRestrictSuper_C_a.display(list_c);
		// Compile ->  Object Ÿ���� ��� Ŭ������ �ֻ��� Ŭ�����̱⿡ ��� ����.
	}
}
