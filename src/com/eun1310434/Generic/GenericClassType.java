/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;
class GenericClassType_class<T> {
	/*
	 * E : �÷��� ������ ��ũ ���� ǥ��(List. Map)
	 * K : Key�� ����, ������ �̷���� ����<key, value>�� ���
	 * V : Value�� ����, ������ �̷���� ����<key, value>�� ���
	 * T : Type�� ����, �Ϲ����� ���
	 * N : Number�� ����
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
		
		//GenericType�� ���� ȣ���ϴ� �ʿ��� Type�� ����
		
		GenericClassType_class<String> str= new GenericClassType_class<>();
		//CommonData<T>���� T�� String 
		str.set("String str");
		
		GenericClassType_class<StringBuilder> strBuild = new GenericClassType_class<>();
		//CommonData<T>���� T�� StringBuilder
		strBuild.set(new StringBuilder("StringBuilder str"));
		
		System.out.println("str = " + str.get());
		System.out.println("strBuild = " + strBuild.get());
	}
}
