/*==================================================================================================
�� INFORMATION
  �� Data : 13.08.2018
  �� Mail : eun1310434@naver.com
  �� WebPage : https://eun1310434.github.io/
  �� Reference
     - Hello Java Programming
     
�� FUNCTION
  �� 
   
�� Study
  �� Generic
   - A type or method to operate on objects of various types while providing compile-time type safety.
     ex) List<ClassName> list = new ArrayList<>();


  �� Generic Type Class
   - E : Element�� ����, �÷��� ������ ��ũ�� ����� �� �� ��ü�� ��Ī�ϴ� �ǹ̷� ���.
   - K : Key�� ����, Ű�� ���̶�� ������ �̷���� ���¿��� 'Ű'�� �ǹ̷� ���
   - V : Value�� ����, Ű�� ���̶�� ������ �̷���� ���¿��� '��'�� �ǹ̷� ���
   - T : Type�� ����, �ڷ����̳� Ŭ�������� �ǹ̷� ���, 
                ���׸������� �⺻ �ڷ���(boolean, byte, char, int��)�� Ÿ������ ����� �� ��� 
                ���⼭ �ڷ����� ����(Wrapper) Ŭ������ �ǹ�
   - N : Number�� ����, ��ġ �迭�� �ǹ̷� ���, ���� ���� ����� �� �� Ÿ�� �Ű� ���� �ڿ� 2,3,4���� ���ڸ� �ٿ� ���
==================================================================================================*/
package com.eun1310434.Generic;

class GenericClass_a<T> {

	private T data;

	public void set(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}

class GenericClass_b<T1, T2> {

	private T1 dataA;
	private T2 dataB;

	public void set(T1 dataA,T2 dataB) {
		this.dataA = dataA;
		this.dataB = dataB;
	}
	
	public T1 getDataA() {
		return this.dataA;
	}
	
	public T2 getDataB() {
		return this.dataB;
	}
}

public class GenericClass {
	public static void main(String[] ar) {
		
		//GenericType�� ���� ȣ���ϴ� �ʿ��� Type�� ����
		
		System.out.println("GenericClass_a<T> - 1 : <String>");
		GenericClass_a<String> str= new GenericClass_a<>();
		//CommonData<T>���� T�� String 
		str.set("String str");
		System.out.println("getData() = " + str.getData() + "\n");
		

		System.out.println("GenericClass_a<T> - 2 : <StringBuilder>");
		GenericClass_a<StringBuilder> strBuild = new GenericClass_a<>();
		//CommonData<T>���� T�� StringBuilder
		strBuild.set(new StringBuilder("StringBuilder str"));
		System.out.println("getData() = " + strBuild.getData() + "\n");
		

		System.out.println("GenericClass_b<T1, T2> - 1 : <String, Integer>");
		GenericClass_b<String, Integer> multiTypeA = new GenericClass_b<>();
		//CommonData<T1, T2>���� T1�� String�� T2���� Integer
		multiTypeA.set("String str", 10000);
		System.out.println("getDataA() = " + multiTypeA.getDataA());
		System.out.println("getDataB() = " + multiTypeA.getDataB() + "\n");

		
		System.out.println("GenericClass_b<T1, T2> - 2 : <GenericClass_a<String>, Integer>");
		GenericClass_b<GenericClass_a<String>, Integer> multiTypeB = new GenericClass_b<>();
		//CommonData<T1, T2>���� T1�� String�� T2���� Integer
		multiTypeB.set(str , 10000);
		System.out.println("getDataA() = " + multiTypeB.getDataA().getData());
		System.out.println("getDataB() = " + multiTypeB.getDataB());
	}
}





