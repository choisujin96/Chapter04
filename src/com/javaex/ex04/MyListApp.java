package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//포인트 리스트에 포인트(주소)를 넣는다.
		//메모리를 낭비없이 관리한다
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		Point p = pList.get(0); //0번째 주소 줘
		System.out.println(p.toString());
	
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.toString());
		
		//원 관리////////////////////
		//원 리스트

		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		Circle c01 = new Circle(20);
		Circle c02 = new Circle(30);
		Circle c03 = new Circle(40);
		
		
		System.out.println("-----------------");
		//원 리스트에 원(주소)을 넣는다.
		//메모리를 낭비없이 관리한다
		//원 리스트 포인트 주소 추가하면 안된다

		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		Circle c = cList.get(0);
		System.out.println(c.toString());
		
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("-----------------");
		
		////3번방 추가하기
		Circle c04 = new Circle(50);
		cList.add(c04);
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("-----------------");
		////1번방 삭제하기
		cList.remove(1);
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("-----------------");
		System.out.println(cList.toString());
		
	
	}

}
