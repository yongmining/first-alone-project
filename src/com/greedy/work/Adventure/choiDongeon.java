package com.greedy.work.Adventure;

import java.util.Scanner;

public class choiDongeon {

	public void choidongeon() {

		int Hp = 600;
		int At = 10;
		System.out.println("명건초이 던전에 들어오셨습니다. 싸우세요!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Hp : " + Hp);
		System.out.println("At : " + At );


		while(true) {
			System.out.println("------- Monster --------");
			System.out.println("1. 공격하기");
			System.out.println("2. 포션먹기");
			System.out.println("9. 도망치기");

			int no = sc.nextInt();

			switch (no) {
			case 1 : 

				break;
			case 2 : 

				break;
			case 9 : 
				System.out.println("도망칩니다.");
				return;
			default :
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 눌러주세요.");
				break;
			}

		}
	}
}
