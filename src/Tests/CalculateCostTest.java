package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateCostTest {


	@Test
	public void test() {
		assertEquals(true, Start.calculateCost(2.4, 20)==48);
	}

}
