package com.greedy.work.Adventure;

import java.util.Scanner;

public class Gate {

	public void gate(Information ifm) {
		
		System.out.println("던전 게이트에 오신 것을 환영합니다. 어떤 몬스터를 사냥하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		Dongeon dg = new Dongeon();
			
		
		while(true) {
			System.out.println("------- Monster --------");
			System.out.println("1. 이준성");
			System.out.println("2. 명건초이");
			System.out.println("9. 메뉴로 돌아가기");
			
			int no = sc.nextInt();
			
		switch (no) {
			case 1 : 
				dg.dongeon(new Monster("이준성",10,100,30,1),ifm);
				break;
			case 2 : 
				dg.dongeon(new Monster("명건초이",100,1000,500,10),ifm);
				break;
			case 9 : 
				System.out.println("메뉴로 돌아갑니다.");
				return;
			default :
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 눌러주세요.");
				break;
			}
			
		}
	}
}
