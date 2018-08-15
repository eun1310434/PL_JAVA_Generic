/*==================================================================================================
¡à INFORMATION
  ¡Û Data : 13.08.2018
  ¡Û Mail : eun1310434@naver.com
  ¡Û WebPage : https://eun1310434.github.io/
  ¡Û Reference
     - Hello Java Programming
     
¡à FUNCTION
  ¡Û 
   
¡à Study
  ¡Û Comparable<T>
    - t1.compareTo(t2) > 0 ---> t1 > t2
    - t1.compareTo(t2) == 0 ---> t1 == t2

==================================================================================================*/

package com.eun1310434.Generic;

class GenericComparableClass <T extends Comparable<T>> {
	public T bigger (T t1, T t2) {
		if(t1.compareTo(t2) > 0) return t1;
		else return t2;
	}
}


class ItemClass implements Comparable<ItemClass>{
	private int num;
	private String str;

	public ItemClass(int _num, String _str){
		this.num = _num;
		this.str = _str;
	}
	
	public int getNum() { return num; }
	public String getStr() { return str;}

	@Override
	public int compareTo(ItemClass another) {
		
		if(this.num == another.num && this.str.equals(another.str)) 
			return 0;//Same
		
		else if(this.num == another.num) 
			return this.str.compareTo(another.str); //String Compare
		
		else 
			return this.num - another.num; //Number Compare
	}
}


public class GenericComparable {
	public static void main(String[] ar) {
		
		GenericComparableClass<Integer> numComparable = new GenericComparableClass<>();
		System.out.println("numComparable = " + numComparable.bigger(1, 2));
		System.out.println("");
		
		GenericComparableClass<String> strComparable = new GenericComparableClass<>();
		System.out.println("strComparable = " + strComparable.bigger("a","b"));
		System.out.println("");
		
		GenericComparableClass<ItemClass> classComparable = new GenericComparableClass<>();
		ItemClass itemA = new ItemClass(1,"a");
		ItemClass itemB = new ItemClass(2,"a");
		ItemClass itemC = new ItemClass(3,"a");
		ItemClass itemD = new ItemClass(1,"b");
		
		System.out.println("classComparable1 = " 
				+ ((ItemClass) classComparable.bigger(itemA,itemB)).getNum()+","
				+ ((ItemClass) classComparable.bigger(itemA,itemB)).getStr());
		
		System.out.println("classComparable2 = " 
				+ ((ItemClass) classComparable.bigger(itemA,itemC)).getNum()+","
				+ ((ItemClass) classComparable.bigger(itemA,itemC)).getStr());
		
		System.out.println("classComparable3 = " 
				+ ((ItemClass) classComparable.bigger(itemA,itemD)).getNum()+","
				+ ((ItemClass) classComparable.bigger(itemA,itemD)).getStr());	
	}
}




