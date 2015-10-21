package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.List;

public class Coordinates {
	public Point x;
	public void setX(Point value){
		x=value;
	}
	public Point getX(){
		return x;
	}
	
	public Point y;
	public void setY(Point value){
		y=value;
	}
	public Point getY(){
		return y;
	}
	
	public Direction direction;
	public void setDirection(Direction value){
		direction =value;
	}
	public Direction getdirection(){
		return direction;
	}
	public List<Obstacle> obstacle;
	public void setObstacle(List<Obstacle> value){
		obstacle=value;
	}
	public List<Obstacle> getObstacle(){
		return obstacle;
	}
	
	public boolean foundObstacle= false;
	
	public Coordinates(Point xValue, Point yValue, Direction directionValue, List<Obstacle> obstaclesValue) {
		// TODO Auto-generated constructor stub
		setX(xValue);
		setY(yValue);
		setDirection(directionValue);
		setObstacle(obstaclesValue);
	}
	protected boolean move(Direction directionValue){
	}


}
