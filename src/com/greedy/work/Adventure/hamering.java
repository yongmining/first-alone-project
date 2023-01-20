package com.greedy.work.Adventure;

import java.util.Scanner;

public class hamering {
	public void hamer(Information ifm) {

		System.out.println("대장간에 들어오셨습니다. 강화 할 무기를 선택해주세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("무기 Lv : " + ifm.WeaPon + ", 공격력 : " + ifm.Armor);
		System.out.println();
		hamer hr = new hamer();


		while(true) {
			System.out.println("------- 대장간 --------");
			System.out.println("1. 무기 강화하기 ");
			System.out.println("9. 메뉴로 돌아가기");

			int no = sc.nextInt();

			switch (no) {
			case 1 : 
				hr.weapon(ifm);
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
