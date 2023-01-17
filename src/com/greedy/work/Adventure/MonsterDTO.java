package com.greedy.work.Adventure;

public class MonsterDTO {
	String Name;
	int Hp;
	int At;

	public MonsterDTO() {}

	public MonsterDTO(String name, int hp, int at) {
		super();
		Name = name;
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
