package com.greedy.work.Adventure;

public class hamer {

	private int n = 100;
	private int gd = 10;
	

	public void weapon(Information ifm) {
		if(ifm.getGold() < gd) {
			System.out.println("강화할 골드가 부족합니다.");
			return;
		}
		int Random = (int)(Math.random() * 100);
		ifm.setGold(ifm.getGold()-gd);
		if (Random < n) {
			System.out.println("무기 Lv : " + ifm.WeaPon + ", 공격력 : " + ifm.Armor);
			System.out.println("강화를 성공하셨습니다.");
			gd = gd*2;
			ifm.Armor += 3 ;
			ifm.WeaPon += 1;
		
			n -= 1;
		} else {
			System.out.println("강화를 실패하셨습니다.");
			

		}
	}
	
}
