/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.Generic;
class GenericMethod_class {
	public <K, V> boolean compare(K a_key, V a_value, K b_key, V b_value) {
		if(a_key.equals(a_key) && b_value.equals(b_value)){
			//메모리의 주소비교가 아니라 같은 타입인지를 확인
			return true;
		}else{
			return false;
		}
	}
	
	public <K, V> K returnKey(K key, V value) {
		return key;
	}
	
	public <K, V> V returnValue(K key, V value) {
		return value;
	}
}
public class GenericMethod {
	public static void main(String[] ar) {
		GenericMethod_class gm = new GenericMethod_class();
		
		System.out.println("check-A = " + gm.<Integer, Double>compare(2, 2.4, 2, 2.4));
		
		System.out.println("check-B = " + gm.compare(1, "A", 1, "A"));
		//<>를 사용하지 않고 직접 값(1, "A", 1, "A")을 입력하면 입력되는 타입에 맞춰서 자동설정
		
		System.out.println("check-C = " + gm.<Integer, Object>compare(4, new Object(), 4, new Object()));
		//new Object() 선언을 통해 메모리의 주소비교가 아니라 같은 타입인지를 확인하는 것임
		
		System.out.println("check-D = " + gm.compare(3, true, 3, true));
		//<>를 사용하지 않고 직접 값(3, true, 3, true)을 입력하면 입력되는 타입에 맞춰서 자동설정
		
		System.out.println("returnKey = " + gm.returnKey(1, "A"));
		System.out.println("returnValue = " + gm.returnValue(1, "A"));
		
		
	}
}
