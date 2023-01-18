package com.greedy.work.Adventure;

public class MonsterDTO {
	
	private String Name;
	private int exp;
	private int gld;
	private int Hp;
	private int At;

	public MonsterDTO() {}

	

	public MonsterDTO(String name, int exp, int gld, int hp, int at) {
		super();
		Name = name;
		this.exp = exp;
		this.gld = gld;
		Hp = hp;
		At = at;
	}



	public String getName() {
		return Name;
	}

	public int getHp() {
		return Hp;
	}

	public int getAt() {
		return At;
	}

	public int getExp() {
		return exp;
	}

	public int getGld() {
		return gld;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setGld(int gld) {
		this.gld = gld;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public void setAt(int at) {
		At = at;
	}
	
	public void getInformation() {
		System.out.println("보스 : " + Name);
		System.out.println("체력 : " + Hp);
		System.out.println("받는피해 : " + At);
		
	}
}
