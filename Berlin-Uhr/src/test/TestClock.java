package test;
import org.junit.Assert;
import org.junit.Test;

import main.ClockBerlin;

public class TestClock {
	
	@Test
    	public void Pasar_Hora_a_Berlin_Uhr () {
		ClockBerlin time = new ClockBerlin();
	     	String timeEnt = "13:17:01";
	     	String actual = time.ConvertTime(timeEnt);
         	String expected = "O\nRROO\nRRRO\nYYROOOOOOOO\nYYOO\n";
         	Assert.assertEquals(actual, expected);

    	}

}
