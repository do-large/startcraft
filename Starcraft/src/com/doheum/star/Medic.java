package com.doheum.star;

public class Medic extends Unit implements Cureable {
	
	public Medic() {
		this.max_hp = 40;
		this.hp = max_hp;
		this.speedMoving = 6;
	}
	/*
	void cure(Cureable cureable) {
		Unit unit = (Unit)cureable;		
		if(unit.hp < unit.max_hp) {
			while(unit.hp < unit.max_hp) {
				unit.hp++;
			}
		}
	}
	*/
	
	void cure(Unit unit) {
		if(unit instanceof Cureable) {
			if(unit.hp < unit.max_hp) {
				while(unit.hp < unit.max_hp) {
					unit.hp++;
				}
			}	
		} else {
			System.out.println("치료할 수 없습니다.");
		}
	}	
	
	@Override
	public String toString() {
		return "(메딕) " + super.toString();
	}
	
	@Override
	public void rest() {
		System.out.println("메딕딕딕!");		
	}
}










