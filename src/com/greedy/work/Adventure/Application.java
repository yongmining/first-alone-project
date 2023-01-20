package com.greedy.work.Adventure;

import java.util.Scanner;

public class Application {

	/* '볼다이크' */
	/* 모험가가 사냥을 하면 몬스터마다 각각의 골드와 경험치가 나오며 그것을 통한,
	 * 레벨 업과 무기 강화를 하는 프로그램 입니다. */
	
	/* 요구사항 */
	/* 모험가의 현재 레벨, 보유 경험치, 보유 골드를 볼 수 있어야하며, 
	 * 몬스터 사냥을 하면 경험치, 골드를 흭득할 수 있어야 하고,
	 * 모험가가 사냥해서 경험치가 꽉차면 레벨이 오르고,
	 * 보유한 골드로 정비소에 강화를 하면 공격력과 HP 수치가 올라간다..
	 * 무기는 강화가 높아질 수록 확률이 낮아져야 한다.
	 * */
	
	public static void main(String[] args) {
		System.out.println("'볼다이크'에 오신 것을 환영합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("자신의 닉네임을 정해주세요~");
		System.out.print("닉네임 : ");
		String Name = sc.nextLine();
		Information ifm = new Information(Name);
		Gate gt = new Gate();
		hamering hm = new hamering();
		
		while(true) {
			System.out.println("------- 어떤 것을 하시겠습니까? --------");
			System.out.println("1. 캐릭터 정보보기");
			System.out.println("2. 몬스터 사냥하기");
			System.out.println("3. 대장간 들어가기");
			System.out.println("9. 프로그램 종료");
			
			int no = sc.nextInt();
			
		switch (no) {
			case 1 : 
				ifm.getInformation();
				break;
			case 2 : 
				gt.gate(ifm);
				break;
			case 3 : 
				hm.hamer(ifm);
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 눌러주세요.");
				break;
		}
	
		
		}
	}
		
}

