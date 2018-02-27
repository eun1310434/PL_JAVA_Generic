/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.Generic;

class GenericClassType1_class<K, V> {
	/*
	 * E : 컬렉션 프레임 워크 사용시 표현(List. Map)
	 * K : Key의 약자, 쌍으로 이루어진 형태<key, value>에 사용
	 * V : Value의 약자, 쌍으로 이루어진 형태<key, value>에 사용
	 * T : Type의 약자, 일반적인 사용
	 * N : Number의 약자
	 */
	private K key;
	private V value;
	public GenericClassType1_class(K _key, V _value){
		this.key = _key;
		this.value = _value;
	}
	public void display(){
		System.out.println(key.getClass().getTypeName()+ " : "+ key);
		System.out.println(value.getClass().getTypeName() + " : "+ value);
		System.out.println();
	}
}
public class GenericClassType1 {
	public static void main(String[] ar){
		GenericClassType1_class<Integer, String> a 
		= new GenericClassType1_class<>(1,"a");

		GenericClassType1_class<Double, Boolean> b 
		= new GenericClassType1_class<>(1.2,true);
		
		a.display();
		b.display();
		
		
	}
}
