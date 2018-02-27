/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.Generic;
class GenericWildcards_C<T> {
	private T type;
	public GenericWildcards_C(T type) {
		this.type = type;
	}
	public void display() {
		System.out.println("type = " + type.toString());
	}
}

class GenericWildcards_Wildcards {
	public static void extendsNumber(GenericWildcards_C<? extends Number> src) {
		//Number를 상속받는 클래스
		src.display();
	}
	public static void superNumber(GenericWildcards_C<? super Number> src) {
		//Number보다 상위클래스
		src.display();
	}
	public static void unbounded(GenericWildcards_C<?> src) {
		//입력하는 타입에 따라
		src.display();
	}
}

public class GenericWildcards {
	public static void main(String[] ar) {
		Integer x = new Integer(100);
		GenericWildcards_C<Integer> myType_01 = new GenericWildcards_C<>(x);
		
		Double y = new Double(200);
		GenericWildcards_C<Number> myType_02 = new GenericWildcards_C<>(y);
		
		StringBuilder z = new StringBuilder("Hello Generic!");
		GenericWildcards_C<StringBuilder> myType_03 = new GenericWildcards_C<>(z);
		
		GenericWildcards_Wildcards.extendsNumber(myType_01);
		GenericWildcards_Wildcards.extendsNumber(myType_02);
		//GenericWildcards_Wildcards.extendsNumber(myType_03); 
		// Compile Error (X) -> Number를 상속받는 클래스가 아님
		
		//GenericWildcards_Wildcards.superNumber(myType_01); 
		// Compile Error (X) -> Number보다 상위클래스가 아님
		GenericWildcards_Wildcards.superNumber(myType_02);
		//GenericWildcards_Wildcards.superNumber(myType_03); 
		// Compile Error (X) -> Number보다 상위클래스가 아님
		
		GenericWildcards_Wildcards.unbounded(myType_01);
		GenericWildcards_Wildcards.unbounded(myType_02);
		GenericWildcards_Wildcards.unbounded(myType_03);
	}
}
