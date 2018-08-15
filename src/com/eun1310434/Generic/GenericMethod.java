/*==================================================================================================
□ INFORMATION
  ○ Data : 13.08.2018
  ○ Mail : eun1310434@naver.com
  ○ WebPage : https://eun1310434.github.io/
  ○ Reference
     - Hello Java Programming
     
□ FUNCTION
  ○ 
   
□ Study
  ○ Generic
   - A type or method to operate on objects of various types while providing compile-time type safety.
     ex) List<ClassName> list = new ArrayList<>();


  ○ Generic Type Class
   - E : Element의 약자, 컬렉션 프레임 워크를 사용할 때 각 객체를 지칭하는 의미로 사용.
   - K : Key의 약자, 키와 값이라는 쌍으로 이루어진 형태에서 '키'의 의미로 사용
   - V : Value의 약자, 키와 값이라는 쌍으로 이루어진 형태에서 '값'의 의미로 사용
   - T : Type의 약자, 자료형이나 클래스형의 의미로 사용, 
                제네릭에서는 기본 자료형(boolean, byte, char, int등)을 타입으로 사용할 수 없어서 
                여기서 자료형은 래퍼(Wrapper) 클래스를 의미
   - N : Number의 약자, 수치 계열의 의미로 사용, 여러 개를 사용할 때 각 타입 매개 변수 뒤에 2,3,4등의 숫자를 붙여 사용
==================================================================================================*/

package com.eun1310434.Generic;

class GenericMethod_class {
	
	public <K, V> boolean equalsCheck(K keyA, V valueA, K keyB, V valueB) {
		if(keyA.equals(keyB) && valueA.equals(valueB)) return true;
			//같은 결과값 인지를 확인 (메모리의 주소비교가 아님)
		else return false;
	}
}

public class GenericMethod {
	public static void main(String[] ar) {		
		GenericMethod_class gm = new GenericMethod_class();
		
		System.out.println("GenericMethod<Integer, Double> - 1 = " 
				+ gm.<Integer, Double>equalsCheck(1, 2.0, 1, 2.0));
		
		System.out.println("GenericMethod<Integer, String> - 2 = " 
				+ gm.equalsCheck(1, "A", 1, "A"));
				//<>를 사용하지 않고 직접 값을 입력하면 입력되는 타입에 맞춰서 자동설정
		
		System.out.println("GenericMethod<String, Object> - 3 = " 
				+ gm.<String, Object>equalsCheck("A", new Object(), "A", 2));
		
		System.out.println("GenericMethod<Integer, boolean> - 4  = " 
				+ gm.equalsCheck(1, true, 2, new String()));
				//<>를 사용하지 않고 직접 값을 입력하면 입력되는 타입에 맞춰서 자동설정
	}
}





