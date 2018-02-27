/**
 * 27.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.Generic;

interface GenericRestrictExtends1_I_a { }
interface GenericRestrictExtends1_I_b { }

class GenericRestrictExtends1_C_a { }

class GenericRestrictExtends1_C_b implements GenericRestrictExtends1_I_a { }
class GenericRestrictExtends1_C_c implements GenericRestrictExtends1_I_b { }

class GenericRestrictExtends1_C_d extends GenericRestrictExtends1_C_a { }
class GenericRestrictExtends1_C_e extends GenericRestrictExtends1_C_a implements GenericRestrictExtends1_I_a, GenericRestrictExtends1_I_b { }

class GenericRestrictExtends1_C_f<T extends GenericRestrictExtends1_C_a & GenericRestrictExtends1_I_a & GenericRestrictExtends1_I_b> { }
                                   //extends class & interface & interface & interface & interface <- Ŭ������ �Ѱ��� ��� ����


public class GenericRestrictExtends1 {
	public static void main(String[] ar) {
		// GenericRestrictExtends1_C_f<GenericRestrictExtends1_C_b> check_01 = new GenericRestrictExtends1_C_f<>(); 
		// Compile Error(X) -> GenericRestrictExtends1_C_b Ŭ������ ����� T�� ��� ���ǰ� ���� X
		
		// GenericRestrictExtends1_C_f<GenericRestrictExtends1_C_c> check_02 = new GenericRestrictExtends1_C_f<>(); 
		// Compile Error(X) -> GenericRestrictExtends1_C_b Ŭ������ ����� T�� ��� ���ǰ� ���� X
		
		// GenericRestrictExtends1_C_f<GenericRestrictExtends1_C_d> check_03 = new GenericRestrictExtends1_C_f<>(); 
		// Compile Error(X) -> GenericRestrictExtends1_C_b Ŭ������ ����� T�� ��� ���ǰ� ���� X
		
		GenericRestrictExtends1_C_f<GenericRestrictExtends1_C_e> check_04 = new GenericRestrictExtends1_C_f<>(); 
		// Compile Success(O)-> GenericRestrictExtends1_C_b Ŭ������ ����� T�� ��� ���ǰ� ����  O
		//  "extends GenericRestrictExtends1_C_a implements GenericRestrictExtends1_I_a , GenericRestrictExtends1_I_b" 
		//=="extends GenericRestrictExtends1_C_a          & GenericRestrictExtends1_I_a & GenericRestrictExtends1_I_b"
	}
}
