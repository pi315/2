package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateTotalConsumptionTest {


	@Test
	public void test() {
		assertEquals(true, Start.calculateTotalConsumption(30, 8)==2.4);
	}

}
