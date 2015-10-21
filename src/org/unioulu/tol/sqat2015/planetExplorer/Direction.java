package org.unioulu.tol.sqat2015.planetExplorer;

public enum Direction{
	NORTH(0,'N'),
	EAST(1,'E'),
	SOUTH(2,'S'),
	WEST(3,'W');
	public int value;
	public char shortname;
	Direction(int newvalue, char shortnamedirection){
		value= newvalue;
		shortname=shortnamedirection;
	}
	Direction getBackwardDirection(){
		return values()[(this.getValue()+2)%4];
	}
	public int getValue(){
		return value;
	}
	public char shortname(){
		return shortname;
	}
}
