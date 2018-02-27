/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Generic;

class GenericRestrictExtends_C<T extends Number> { 
    //extends 를 통해 T의 type은 숫자만 가능하다.
	private T data;
	public GenericRestrictExtends_C(T data){
		this.data = data;
	}
	public void display(){
		System.out.println(data.getClass().getTypeName()+ " : "+ data);
	}
}
 
public class GenericRestrictExtends {
	public static void main(String[] ar) {
		//GenericRestrictExtends_C<Boolean> a = new GenericRestrictExtends_C<>(10);
		// Compile Error(X) -> <Boolean> 즉 Type의 정의가 Number이 아니다.
		
		//GenericRestrictExtends_C b = new GenericRestrictExtends_C<>(true);
		// Compile Error(X) -> Type의 정의가 Number이 아니다.
		
		GenericRestrictExtends_C<Integer> c = new GenericRestrictExtends_C<>(10);
		c.display();
	}
}
