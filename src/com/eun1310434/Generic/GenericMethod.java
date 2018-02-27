/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;
class GenericMethod_class {
	public <K, V> boolean compare(K a_key, V a_value, K b_key, V b_value) {
		if(a_key.equals(a_key) && b_value.equals(b_value)){
			//�޸��� �ּҺ񱳰� �ƴ϶� ���� Ÿ�������� Ȯ��
			return true;
		}else{
			return false;
		}
	}
	
	public <K, V> K returnKey(K key, V value) {
		return key;
	}
	
	public <K, V> V returnValue(K key, V value) {
		return value;
	}
}
public class GenericMethod {
	public static void main(String[] ar) {
		GenericMethod_class gm = new GenericMethod_class();
		
		System.out.println("check-A = " + gm.<Integer, Double>compare(2, 2.4, 2, 2.4));
		
		System.out.println("check-B = " + gm.compare(1, "A", 1, "A"));
		//<>�� ������� �ʰ� ���� ��(1, "A", 1, "A")�� �Է��ϸ� �ԷµǴ� Ÿ�Կ� ���缭 �ڵ�����
		
		System.out.println("check-C = " + gm.<Integer, Object>compare(4, new Object(), 4, new Object()));
		//new Object() ������ ���� �޸��� �ּҺ񱳰� �ƴ϶� ���� Ÿ�������� Ȯ���ϴ� ����
		
		System.out.println("check-D = " + gm.compare(3, true, 3, true));
		//<>�� ������� �ʰ� ���� ��(3, true, 3, true)�� �Է��ϸ� �ԷµǴ� Ÿ�Կ� ���缭 �ڵ�����
		
		System.out.println("returnKey = " + gm.returnKey(1, "A"));
		System.out.println("returnValue = " + gm.returnValue(1, "A"));
		
		
	}
}
