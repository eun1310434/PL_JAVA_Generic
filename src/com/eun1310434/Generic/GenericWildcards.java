/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;
class GenericWildcards_C<T> {
	private T type;
	public GenericWildcards_C(T type) {
		this.type = type;
	}
	public void display() {
		System.out.println("type = " + type.toString());
	}
}

class GenericWildcards_Wildcards {
	public static void extendsNumber(GenericWildcards_C<? extends Number> src) {
		//Number�� ��ӹ޴� Ŭ����
		src.display();
	}
	public static void superNumber(GenericWildcards_C<? super Number> src) {
		//Number���� ����Ŭ����
		src.display();
	}
	public static void unbounded(GenericWildcards_C<?> src) {
		//�Է��ϴ� Ÿ�Կ� ����
		src.display();
	}
}

public class GenericWildcards {
	public static void main(String[] ar) {
		Integer x = new Integer(100);
		GenericWildcards_C<Integer> myType_01 = new GenericWildcards_C<>(x);
		
		Double y = new Double(200);
		GenericWildcards_C<Number> myType_02 = new GenericWildcards_C<>(y);
		
		StringBuilder z = new StringBuilder("Hello Generic!");
		GenericWildcards_C<StringBuilder> myType_03 = new GenericWildcards_C<>(z);
		
		GenericWildcards_Wildcards.extendsNumber(myType_01);
		GenericWildcards_Wildcards.extendsNumber(myType_02);
		//GenericWildcards_Wildcards.extendsNumber(myType_03); 
		// Compile Error (X) -> Number�� ��ӹ޴� Ŭ������ �ƴ�
		
		//GenericWildcards_Wildcards.superNumber(myType_01); 
		// Compile Error (X) -> Number���� ����Ŭ������ �ƴ�
		GenericWildcards_Wildcards.superNumber(myType_02);
		//GenericWildcards_Wildcards.superNumber(myType_03); 
		// Compile Error (X) -> Number���� ����Ŭ������ �ƴ�
		
		GenericWildcards_Wildcards.unbounded(myType_01);
		GenericWildcards_Wildcards.unbounded(myType_02);
		GenericWildcards_Wildcards.unbounded(myType_03);
	}
}
