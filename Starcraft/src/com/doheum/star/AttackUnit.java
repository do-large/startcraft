package com.doheum.star;

public class AttackUnit extends Unit {
	int powerOfAttack;
	
	void attack(Unit enemy) {
		//enemy.hp = enemy.hp - this.powerOfAttack;
		enemy.hp -= this.powerOfAttack;
	}
	
	
}
