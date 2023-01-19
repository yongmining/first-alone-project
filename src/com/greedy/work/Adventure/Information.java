package com.greedy.work.Adventure;

public class Information {
	String Name;
	int Level = 1;
	int WeaPon = 1;
	int Armor = 15;
	int Hp = 10;
	int Exp = 0;
	int Gold = 0;
	
	public Information(){}

	public Information(String name ) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public int getLevel() {
		return Level;
	}

	public int getWeaPon() {
		return WeaPon;
	}

	public int getArmor() {
		return Armor;
	}
	
	public int getHp() {
		return Hp;
	}

	public int getExp() {
		return Exp;
	}

	public int getGold() {
		return Gold;
	}
	
	

	public void setName(String name) {
		Name = name;
	}
	
	
	public void setLevel(int level) {
		Level = level;
	}

	public void setWeaPon(int weaPon) {
		WeaPon = weaPon;
	}
	
	public void setArmor(int armor) {
		Armor = armor;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public void setExp(int exp) {
		Exp = exp;
	}

	public void setGold(int gold) {
		Gold = gold;
	}
	
	
	public void getInformation() {
		System.out.println("닉네임 : " + Name);
		System.out.println("레벨  : " + Level);
		System.out.println("무기  : " + WeaPon);
		System.out.println("공격력 : " + Armor);
		System.out.println("Hp   : " + Hp);
		System.out.println("Exp  : " + Exp);
		System.out.println("Gold : " + Gold);
		
	}
	
	
}
