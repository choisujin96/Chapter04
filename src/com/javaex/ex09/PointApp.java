package com.javaex.ex09;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		//<hashCode()로 중복제거 >
		
		//중복체크가 필요할 때 set을 사용
		Set<Point> pSet = new HashSet<Point>();		
		
		
		//주소 x+y  (진짜 주소는 아님) --> 주소 만드는 공식을 잘 만들면 횟수를 줄일 수 있다.
		Point p01 = new Point(1,2);      // 111111--> 3
		Point p02 = new Point(10,20);    // 222222 --> 30
		Point p03 = new Point(2,1);      // 333333 --> 3
		Point p04 = new Point(1,2);      // 444444 --> 3
		Point p05 = new Point(0,3);      // 555555 --> 3  //x*y 라고 하면
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		System.out.println("-------------------------");
		System.out.println(pSet.toString());
		System.out.println("-------------------------");
		
		
		
		// **방번호(순서) 개념이 없다** --> 일반적 for문을 사용할 수 없다.
		//(하나씩꺼냄 : //전체에서)
		for(Point p : pSet) { //향상된 for문
			//System.out.println(p.getX());
			System.out.println(p.hashCode()); //주소가 출력됨. 그치만 진짜 주소는 아님.
			System.out.println(p.toString());
		
		}
		
		System.out.println(p01 == p03);
		System.out.println(p01.equals(p03));
		
		

	}

}
