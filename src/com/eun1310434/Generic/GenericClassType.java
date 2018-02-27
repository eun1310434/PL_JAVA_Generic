/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.Generic;
class GenericClassType_class<T> {
	/*
	 * E : 컬렉션 프레임 워크 사용시 표현(List. Map)
	 * K : Key의 약자, 쌍으로 이루어진 형태<key, value>에 사용
	 * V : Value의 약자, 쌍으로 이루어진 형태<key, value>에 사용
	 * T : Type의 약자, 일반적인 사용
	 * N : Number의 약자
	 */
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
}

public class GenericClassType {
	public static void main(String[] ar) {
		
		//GenericType을 통해 호출하는 쪽에서 Type을 정함
		
		GenericClassType_class<String> str= new GenericClassType_class<>();
		//CommonData<T>에서 T는 String 
		str.set("String str");
		
		GenericClassType_class<StringBuilder> strBuild = new GenericClassType_class<>();
		//CommonData<T>에서 T는 StringBuilder
		strBuild.set(new StringBuilder("StringBuilder str"));
		
		System.out.println("str = " + str.get());
		System.out.println("strBuild = " + strBuild.get());
	}
}
