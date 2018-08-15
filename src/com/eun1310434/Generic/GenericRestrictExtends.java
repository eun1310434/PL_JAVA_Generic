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
  ○ Generic Restrict Extends
    - class "Name" <"Type of definition parameter" extends "Class" & "Interface1" & "Interface2" ...>
      * ex1) class a <T extends Number>{...}
      * ex2) class a <T extends java.io.Serializable>{...}
      * ex3) class a <T extends Number & java.io.Serializable>{...}

==================================================================================================*/

package com.eun1310434.Generic;

class GenericRestrictExtends_Number <T extends Number> { 
    //extends 를 통해 T의 type은 숫자만 가능하다.
	private T data;
	public GenericRestrictExtends_Number(T _data){
		this.data = _data;
	}
	
	public void display(){
		System.out.println(data.getClass().getTypeName()+ " = "+ data);
	}
}
 
public class GenericRestrictExtends {
	public static void main(String[] ar) {
		
		GenericRestrictExtends_Number<Integer> A = new GenericRestrictExtends_Number<>(10);
		A.display();

		GenericRestrictExtends_Number<Float> B = new GenericRestrictExtends_Number<>(1.0f);
		B.display();

		GenericRestrictExtends_Number<Double> C = new GenericRestrictExtends_Number<>(1.234);
		C.display();
		
		//GenericRestrictExtends_C<Boolean> D = new GenericRestrictExtends_C<>(10);
		// Compile Error(X) -> <Boolean> 즉 Type의 정의가 Number이 아니다.
				
		//GenericRestrictExtends_C E = new GenericRestrictExtends_C<>(true);
		// Compile Error(X) -> Type의 정의가 Number이 아니다.
				
	}
}



