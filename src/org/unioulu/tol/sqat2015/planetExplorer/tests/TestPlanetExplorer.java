package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestPlanetExplorer {
	
	public org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer PlanetExplorer;
	public org.unioulu.tol.sqat2015.planetExplorer.Coordinates ExploreCoordinates;
	public final org.unioulu.tol.sqat2015.planetExplorer.Direction direction= org.unioulu.tol.sqat2015.planetExplorer.Direction.NORTH;
	public org.unioulu.tol.sqat2015.planetExplorer.Point x;
	public org.unioulu.tol.sqat2015.planetExplorer.Point y;
	public List<org.unioulu.tol.sqat2015.planetExplorer.Obstacle>obstacles;

	@Before
	public void beforePlanetExplaneTest(){
		x=new org.unioulu.tol.sqat2015.planetExplorer.Point(1,9);
		y=new org.unioulu.tol.sqat2015.planetExplorer.Point(2,9);
		obstacles=new ArrayList<org.unioulu.tol.sqat2015.planetExplorer.Obstacle>();
		ExploreCoordinates=new org.unioulu.tol.sqat2015.planetExplorer.Coordinates(x,y,direction,obstacles);
		PlanetExplorer=new org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer(ExploreCoordinates);
	}
	@Test
	public void newtest1(){
		//new instance should set rover coordinates and direction
		//assertEquals(PlanetExplorer.getCoordinates()).isEqualToComparingFieldByField(PlanetExplorer);
	}

	@Test
	public void newtest2() {
		//receive single command should move forward when command is f
		fail("Not yet implemented");
	}
}
