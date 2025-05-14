package com.javaex.ex10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		//HashMap 준비 ---> key(String)와 value 2가지를 정해줘야한다.
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		
		//포인트
		Point p01 = new Point(2,4);
		Point p02 = new Point(2,4);
		Point p03 = new Point(45,86);
		
		//Map에 포인트(주소) 넣기 --> 키를 중복되지 않게 정해준다.
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		//갯수
		System.out.println(pMap.size());
		
		
		//toString()
		System.out.println("------------------------");
		//pMap.toString()
		System.out.println(pMap.toString());
		
		System.out.println("------------------------");
		//박명수의 toString()
		System.out.println(pMap.get("박명수").toString());
		System.out.println(pMap.get("박명수").getX());
		
		System.out.println("------------------------");
		//박명수를 삭제
		pMap.remove("박명수"); //박명수 포인트 삭제
		System.out.println(pMap.toString());
		
		
		Point p04 = new Point(100,150);
		pMap.put("서장훈", p04);   //사장훈 포인트(주소) 추가
		System.out.println(pMap.toString());
		
		
		System.out.println("-------------------");
		
		
		Point p05 = new Point(90,80);
		pMap.put("이효리", p05); //"이효리"를 넣었을 때 (이미 존재함)
		System.out.println(pMap.toString()); //나중에 넣은 주소값으로 변경됨
		//원래값을 수정한다.
		
		
		System.out.println("-------------------");
		//전체출력
		
		//1.키세트를 달라고 한다.
		Set<String> Keys = pMap.keySet();
		
		//2.키세트의 키값을 1개씩 꺼내서 해당 키값의 정보를 출력한다.
		for( String name : Keys) {
			System.out.println(pMap.get(name).toString());
		}
		
		System.out.println("-------------------");
		
		Map<String, String> boardMap = new HashMap<String, String>();
		
		
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("date", "2025-05-14");
		boardMap.put("id", "jus");
		boardMap.put("content", "게시판 글 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		System.out.println(boardMap.get("date"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
