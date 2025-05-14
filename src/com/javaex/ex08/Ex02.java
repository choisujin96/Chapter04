package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String[] args) {
		
		
		

		/*
		//로또 번호 프로그램 작성
		
		
		
		int[] no = new int[6];

		for (int i = 0; i < no.length; i++) {  //6개가 될때까지 반복
			no[i] = (int) (Math.random() * 45) + 1;

			//*중복검사 로직은 1개가 아님 --> 다양하게 연구해 볼것
			
			// 중복검사
			// i 는 현재 입력된 방번호 <--중복인지 검사해야됨
			// j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
			// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
			for (int j = 0; j < i; j++) {
				if (no[i] == no[j]) {
					i--;
					break; //가까운 반복문만 탈출
				}
			}
		}

		for (int j = 0; j < no.length; j++) {
			System.out.print(no[j] + "  ");
		}
		 
		
		
		System.out.println("========내가 시도한 거 ㅎㅎ..하하하하 ==============");

		int[] no = new int[6];

		for (int i = 0; i < no.length; i++) {  //6개가 될때까지 반복
			no[i] = (int) (Math.random() * 45) + 1;
		}
			
		Set<Integer> rSet = new HashSet<Integer>();
		
		
		rSet.add(i);
		rSet.add(i);
		rSet.add(i);
		rSet.add(i);
		rSet.add(i);
		
		
		System.out.println(rSet.toString());
		
		
		
		for(Integer i : rSet){ //향상된 for문
			System.out.println(i.toString());
		}
		
		
		System.out.println("========밑에는 정답==============");
		*/
		
		
		//번호 계속 생성
		
		Set<Integer> rSet = new HashSet<Integer>();
		
		while(true) {// rSet에 숫자가 6개면 끝(6개가 될때가지 공이 들어간다.)
			if(rSet.size() == 6) {
				break;
			}
				
			int no = (int)(Math.random()*45)+1;
		 //중복이어도 여기까지 들어오지만 Set이 알아서 걸러준다.
			rSet.add(no);
		
		}
		
		//출력
		for(int no : rSet) {
			System.out.println(no);
		}
		
		
		
		
		
	}
	
	
	
	
	
}
	
		
		
		
		
		

