package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		//HashSet<Integer> iSet = new HashSet<Integer>();  -->체크해볼 것
		Set<Integer> iSet = new HashSet<Integer>();
		
		
						//줄이 그어져 있는 건 조만간 없어질거라고 앟혀주는 것
		Integer i01 = new Integer(3);
		
		//해쉬셋은 add할때 중복체크를 함.
		iSet.add(i01);
		iSet.add(6); //자동박싱
		iSet.add(9);
		
		
		iSet.add(9);  //중복으로 값이 안들어감

		System.out.println("---------------");
		System.out.println(iSet.size());
		System.out.println("---------------");
		
		// **방번호(순서) 개념이 없다** --> 일반적 for문을 사용할 수 없다.
			//(하나씩꺼냄 : //전체에서)
		for(Integer i : iSet){ //향상된 for문
			System.out.println(i.toString());
		}
	
	
	
	
	
	}

}
