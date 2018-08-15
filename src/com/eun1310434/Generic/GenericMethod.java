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

class GenericMethod_class {
	
	public <K, V> boolean equalsCheck(K keyA, V valueA, K keyB, V valueB) {
		if(keyA.equals(keyB) && valueA.equals(valueB)) return true;
			//���� ����� ������ Ȯ�� (�޸��� �ּҺ񱳰� �ƴ�)
		else return false;
	}
}

public class GenericMethod {
	public static void main(String[] ar) {		
		GenericMethod_class gm = new GenericMethod_class();
		
		System.out.println("GenericMethod<Integer, Double> - 1 = " 
				+ gm.<Integer, Double>equalsCheck(1, 2.0, 1, 2.0));
		
		System.out.println("GenericMethod<Integer, String> - 2 = " 
				+ gm.equalsCheck(1, "A", 1, "A"));
				//<>�� ������� �ʰ� ���� ���� �Է��ϸ� �ԷµǴ� Ÿ�Կ� ���缭 �ڵ�����
		
		System.out.println("GenericMethod<String, Object> - 3 = " 
				+ gm.<String, Object>equalsCheck("A", new Object(), "A", 2));
		
		System.out.println("GenericMethod<Integer, boolean> - 4  = " 
				+ gm.equalsCheck(1, true, 2, new String()));
				//<>�� ������� �ʰ� ���� ���� �Է��ϸ� �ԷµǴ� Ÿ�Կ� ���缭 �ڵ�����
	}
}





