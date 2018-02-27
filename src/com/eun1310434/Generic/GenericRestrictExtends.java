/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.Generic;

class GenericRestrictExtends_C<T extends Number> { 
    //extends �� ���� T�� type�� ���ڸ� �����ϴ�.
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
		// Compile Error(X) -> <Boolean> �� Type�� ���ǰ� Number�� �ƴϴ�.
		
		//GenericRestrictExtends_C b = new GenericRestrictExtends_C<>(true);
		// Compile Error(X) -> Type�� ���ǰ� Number�� �ƴϴ�.
		
		GenericRestrictExtends_C<Integer> c = new GenericRestrictExtends_C<>(10);
		c.display();
	}
}
