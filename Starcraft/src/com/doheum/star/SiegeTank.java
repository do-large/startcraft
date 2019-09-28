package com.doheum.star;

public class SiegeTank extends AttackUnit {
	int powerOfSiegeMode = 75;
	boolean isSiegeMode = false;
	
	public SiegeTank() {
		this.max_hp = 150;
		this.hp = this.max_hp;
		this.powerOfAttack = 30;
		this.speedMoving = 3;
	}
	
	void changeMode() {		
		this.isSiegeMode = !this.isSiegeMode;
	}
	
	@Override
	void attack(Unit enemy) {
		if(isSiegeMode) {
			enemy.hp -= this.powerOfSiegeMode;
		} else {
			enemy.hp -= this.powerOfAttack;
		}
	}
}





