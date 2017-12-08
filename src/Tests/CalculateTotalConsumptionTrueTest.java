package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;


public class CalculateTotalConsumptionTrueTest {
	@Test
	public void test() {
		double rast = Start.calculateTotalConsumption(1255, 7);
				 assertTrue(Math.round(rast) == 88);
				 }
			
 }

