package com.ramana.corejava.general.practice.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ramana.corejava.general.practice.HellWorld;

/**
 * 
 */

/**
 * @author RamanaGorle
 *
 */
public class HellWorldTest {

	private HellWorld hellWorld;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		hellWorld = new HellWorld();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		hellWorld = null;
	}

	@Test
	public void test() {
		assertEquals(50, hellWorld.cal(20, 30));
	}

}
