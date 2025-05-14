package com.javaex.ex07;

import java.util.ArrayList;
import java.util.List;

public class TriangleApp {

	public static void main(String[] args) {

		
		//섞어쓰기
		//인터페이스            //본체
		//책장(비유임)
		List<Triangle> tList = new ArrayList<Triangle>();
		
		//책 3개(이해하기 위해 비유임)
		Triangle t01 = new Triangle(3,3);
		Triangle t02 = new Triangle(4,4);
		Triangle t03 = new Triangle(5,5);
		
		//책장에 넣는 행동(이해하기 위해 비유임)
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		for(int i=0; i<tList.size();i++) {
			System.out.println(tList.get(i));
		}
		
		System.out.println("--------------");
		System.out.println(tList.get(1).getWeight());
		System.out.println(tList.get(1).getHeight());
		System.out.println("--------------");
		
		tList.remove(1);
		System.out.println(tList.toString());
		System.out.println(tList.size());
		System.out.println("--------------");
		
		
		
		//List<Triangle> tList = new ArrayList<Triangle>();
		
		//제네릭을 쓰는 곳에는 기본자료형을 사용할 수 없다. (우리용어로 8개 int, 등등)
		//<주소>만 올 수 있기 때문에
		List<Integer> iList = new ArrayList<Integer>();
		
		/*
		Integer i01 = new Integer(3); 이런식으로 넣어야 하는데
		//기본 자료형은 박싱이 된다
		iList.add(3);
		*/

		iList.add(3); //자동 박싱
		iList.add(6); //자동 박싱
		iList.add(9); //자동 박싱
		
		System.out.println(iList.toString());
		System.out.println("-------------------------");
		
		for(int i=0; i<iList.size();i++) {
			System.out.println(iList.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
