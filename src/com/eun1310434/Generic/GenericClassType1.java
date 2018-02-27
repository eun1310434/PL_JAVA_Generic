/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;

class GenericClassType1_class<K, V> {
	/*
	 * E : �÷��� ������ ��ũ ���� ǥ��(List. Map)
	 * K : Key�� ����, ������ �̷���� ����<key, value>�� ���
	 * V : Value�� ����, ������ �̷���� ����<key, value>�� ���
	 * T : Type�� ����, �Ϲ����� ���
	 * N : Number�� ����
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
