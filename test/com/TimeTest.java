package com;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {
	Main main=new Main();
	Time time=new Time(main, 1);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetlord() {
		time.setlord(1);
		Point point=new Point();
		assertEquals(80, point.x);
	}

	@Test
	public void testTurnOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCardByName() {
		fail("Not yet implemented");
	}

}
