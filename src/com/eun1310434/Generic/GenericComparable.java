/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;

class GenericComparable_Number {
	public static <T extends Comparable<T>> String compare(T t1, T t2) {
		
		if(t1.compareTo(t2) > 0){
			return "t1(" + t1 + ") > t2(" + t2 + ")";

		}else if(t1.compareTo(t2) < 0){
			return "t1(" + t1 + ") < t2(" + t2 + ")";			
		}else {
			return "t1(" + t1 + ") == t2(" + t2 + ")";			
		}
		
	}
}
public class GenericComparable {
	public static void main(String[] ar) {
		Integer t1 = 100;
		Integer t2 = 200;
		String result = GenericComparable_Number.compare(t1, t2);
		System.out.println("result = " + result);
		
		
	}
}
