package com.doheum.star;

public class FireBat extends AttackUnit implements Cureable {
	
	public FireBat() {
		this.max_hp = 50;
		this.hp = this.max_hp;
		this.powerOfAttack = 8;
		this.speedMoving = 5;
	}	
	
	@Override
	public String toString() {
		return "(파이어뱃) " + super.toString();
	}

	@Override
	public void rest() {
		System.out.println("ㅍㅍㅍㅍ");		
	}
}
