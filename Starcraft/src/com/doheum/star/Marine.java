package com.doheum.star;

public class Marine extends AttackUnit implements Cureable {
	
	public Marine() {
		max_hp = 30;
		hp = max_hp;
		powerOfAttack = 5;
		speedMoving = 5;
	}
	
	@Override
	public String toString() {
		return "(마린) " + super.toString();
	}
	
	@Override
	public void rest() {
		System.out.println("마린린린!!ㅁ");		
	}
}