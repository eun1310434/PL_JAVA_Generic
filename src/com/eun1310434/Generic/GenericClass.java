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
		
		//GenericType을 통해 호출하는 쪽에서 Type을 정함
		
		System.out.println("GenericClass_a<T> - 1 : <String>");
		GenericClass_a<String> str= new GenericClass_a<>();
		//CommonData<T>에서 T는 String 
		str.set("String str");
		System.out.println("getData() = " + str.getData() + "\n");
		

		System.out.println("GenericClass_a<T> - 2 : <StringBuilder>");
		GenericClass_a<StringBuilder> strBuild = new GenericClass_a<>();
		//CommonData<T>에서 T는 StringBuilder
		strBuild.set(new StringBuilder("StringBuilder str"));
		System.out.println("getData() = " + strBuild.getData() + "\n");
		

		System.out.println("GenericClass_b<T1, T2> - 1 : <String, Integer>");
		GenericClass_b<String, Integer> multiTypeA = new GenericClass_b<>();
		//CommonData<T1, T2>에서 T1는 String을 T2에는 Integer
		multiTypeA.set("String str", 10000);
		System.out.println("getDataA() = " + multiTypeA.getDataA());
		System.out.println("getDataB() = " + multiTypeA.getDataB() + "\n");

		
		System.out.println("GenericClass_b<T1, T2> - 2 : <GenericClass_a<String>, Integer>");
		GenericClass_b<GenericClass_a<String>, Integer> multiTypeB = new GenericClass_b<>();
		//CommonData<T1, T2>에서 T1는 String을 T2에는 Integer
		multiTypeB.set(str , 10000);
		System.out.println("getDataA() = " + multiTypeB.getDataA().getData());
		System.out.println("getDataB() = " + multiTypeB.getDataB());
	}
}





