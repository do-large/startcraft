package com.doheum.star;

public class Unit {
	int max_hp;
	int hp; 
	int speedMoving;
	Coordinates location;
	
	//이동할 수 있음
	void move(Coordinates location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return String.format("나의 위치는 %d, %d이다", this.location.x, this.location.y);
	}
	
	
}
