package com.javaex.ex06;

import java.util.ArrayList;

public class MyListApp {
	public static void main(String[] args) {
	////////////수진 연습/////////
	
		
		ArrayList<Point> pList = new ArrayList<Point>();
		 
		
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.toString() );
		System.out.println("------포인트---------");
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("-------추가--------");
		
		Point p04 = new Point(5,5);
		pList.add(p04);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("-------제거--------");
		
		pList.remove(1);
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		
		
		
		
		////////////////동그라미//////////////////////
		System.out.println("-------동그라미--------");
		
		ArrayList<Circle> cList= new ArrayList<Circle>();
		
		Circle c01 = new Circle(4);
		Circle c02 = new Circle(5);
		Circle c03 = new Circle(6);

		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		System.out.println(cList.toString());
		
	
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("-------추가--------");
		
		Circle c04 = new Circle(8);
		cList.add(c04);
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("-------제거--------");
		
		cList.remove(2);
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		
	}
}
