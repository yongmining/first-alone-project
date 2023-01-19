package com.greedy.work.Adventure;

	
public class Monster extends MonsterDTO {
//	Information ifm = new Information();
	private int hpp = 0;
	private int temphp = getHp();
	public int eexp = 0;
	public int ggld = 0;
	private int maxexp = 100;
	
	public Monster(String name, int exp, int gld, int hp, int at) {
		super(name, exp, gld, hp, at);
		
	}
	
	public void recovery(Information ifm) {
		ifm.Hp = ifm.Hp + 1;
		System.out.println(getName() + " : " + temphp);
		System.out.println("Player : " + ifm.Hp);
		
	}
	
	
	
	public void death(Information ifm) {
		if(ifm.Hp <= 0) {
			System.out.println("캐릭터가 사망하셨습니다. 경험치가 깎입니다.");

			ifm.setExp(eexp -= this.getExp());
		
			
		}
		
	}
	
	
	public void attack(Information ifm) {
		if(hpp % 4 == 0) {
		
		System.out.println("몬스터가" + getAt() + "공격합니다.");
		ifm.Hp =ifm.Hp - getAt();
		
		}
	}
	
	public void hp(Information ifm) {
		
		System.out.println(getName() + "을 공격했습니다.");
		temphp -= ifm.Armor; 
		System.out.println(getName() + " : " + temphp);
		System.out.println("Player : " + ifm.Hp);
		System.out.println("당신이 " + ifm.Armor + "데미지를 주었습니다.");
		hpp++;
		if (temphp <=0 ) {
			System.out.println("보스가 사망했습니다.");
			System.out.println("경험치를" + getExp() + "흭득 합니다.");
			System.out.println("골드를" + getGld() + "흭득 합니다.");
			ifm.setExp(eexp += this.getExp());
			temphp = getHp();
			ifm.setGold(ggld += this.getGld());
		}
		attack(ifm);
		death(ifm);
		levelUp(ifm);
	
	}
	
	public void levelUp(Information ifm) {
		if (maxexp <= ifm.Exp) {
			ifm.Exp = 0;
			maxexp += (maxexp/2);
			
			ifm.Hp += 5;
			ifm.Level += 1;
			ifm.Armor += 3;
			System.out.println("레벨업 하셨습니다.");
			
		}
	}
	}
	

	
	

