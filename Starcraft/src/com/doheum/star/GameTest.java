package com.doheum.star;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
	
	public static void main(String[] args) {
		List<Unit> unitList = new ArrayList();
		
		Barrack barrack = new Barrack();
		unitList.add(barrack.makeUnit(1));
		unitList.add(barrack.makeUnit(1));
		unitList.add(barrack.makeUnit(1));
		unitList.add(barrack.makeUnit(1));
		unitList.add(barrack.makeUnit(2));
		unitList.add(barrack.makeUnit(2));
		unitList.add(barrack.makeUnit(3));
		unitList.add(barrack.makeUnit(3));
		unitList.add(barrack.makeUnit(3));
		
		for(Unit u : unitList) {
			Coordinates location = new Coordinates(10, 20);
			u.move(location);
		}
		
		for(Unit u : unitList) {
			
			//u.rest();
			/*
			Cureable cu = (Cureable)u;
			cu.rest();
			*/
		}
		 		
		
		
	}

}








