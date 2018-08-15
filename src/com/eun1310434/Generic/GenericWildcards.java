/*==================================================================================================
□ INFORMATION
  ○ Data : 15.08.2018
  ○ Mail : eun1310434@naver.com
  ○ WebPage : https://eun1310434.github.io/
  ○ Reference
     - Hello Java Programming
     
□ FUNCTION
  ○ 
   
□ Study
  ○ Upper Bounded WildCard
    - <? extends "ClassName" OR "InterfaceName" OR "TypeParameter">

  ○ Lower Bounded WildCard
    - <? super "ClassName" OR "InterfaceName" OR "TypeParameter">

  ○ Unbounded WildCard
    - <?>
    
==================================================================================================*/

package com.eun1310434.Generic;
class GenericWildcards_Class<T> {
	private T type;
	public GenericWildcards_Class(T type) {
		this.type = type;
	}
	public void display() {
		System.out.println("type = " + type.toString());
	}
}

class GenericWildcards_Wildcards {
	public static void extendsNumber(GenericWildcards_Class<? extends Number> src) {
		//Number를 상속받는 클래스
		src.display();
	}
	public static void superNumber(GenericWildcards_Class<? super Number> src) {
		//Number보다 상위클래스
		src.display();
	}
	public static void unbounded(GenericWildcards_Class<?> src) {
		//입력하는 타입에 따라
		src.display();
	}
}

public class GenericWildcards {
	public static void main(String[] ar) {
		Integer x = new Integer(100);
		Double y = new Double(200);
		StringBuilder z = new StringBuilder("Hello Generic!");
		
		GenericWildcards_Class<Integer> myType_01 = new GenericWildcards_Class<>(x);
		GenericWildcards_Class<Number> myType_02 = new GenericWildcards_Class<>(y);
		GenericWildcards_Class<StringBuilder> myType_03 = new GenericWildcards_Class<>(z);

		System.out.println("1.extendsNumber");
		GenericWildcards_Wildcards.extendsNumber(myType_01);
		GenericWildcards_Wildcards.extendsNumber(myType_02);
		//GenericWildcards_Wildcards.extendsNumber(myType_03); 
		//Compile Error (X) -> Number를 상속받는 클래스가 아님
		System.out.println("");
		

		System.out.println("2.superNumber");
		//GenericWildcards_Wildcards.superNumber(myType_01); 
		//Compile Error (X) -> Number보다 상위클래스가 아님
		GenericWildcards_Wildcards.superNumber(myType_02);
		//GenericWildcards_Wildcards.superNumber(myType_03); 
		//Compile Error (X) -> Number보다 상위클래스가 아님
		System.out.println("");
		

		System.out.println("3.unbounded");
		GenericWildcards_Wildcards.unbounded(myType_01);
		GenericWildcards_Wildcards.unbounded(myType_02);
		GenericWildcards_Wildcards.unbounded(myType_03);
		System.out.println("");

	}
}
