package com.greedy.work.Adventure;

	
public class Monster extends MonsterDTO {
//	Information ifm = new Information();
	private int hpp = 0;
	private int temphp = getHp();
	
	public Monster(String name, int exp, int gld, int hp, int at) {
		super(name, exp, gld, hp, at);
		
	}
	
	
	
	
	
	public void attack(Information ifm) {
		if(hpp % 4 == 0) {
		
		System.out.println("몬스터가" + getAt() + "공격합니다.");
		ifm.Hp =ifm.Hp - getAt();
		}
	}
	
	public void hp(Information ifm) {
		
		System.out.println(getName() + "을 공격했습니다.");
		temphp -= ifm.WeaPon; 
		System.out.println(getName() + " : " + temphp);
		System.out.println("Player : " + ifm.Hp);
		System.out.println("당신이 " + ifm.WeaPon + "데미지를 주었습니다.");
		hpp++;
		if (temphp <=0 ) {
			System.out.println("보스가 사망했습니다.");
			System.out.println("경험치를" + getExp() + "흭득 합니다.");
			System.out.println("골드를" + getGld() + "흭득 합니다.");
			temphp = getHp();
			ifm.setExp(this.getExp());
			ifm.setGold(this.getGld());
		}
		attack(ifm);
	}
	}
	

	
	

