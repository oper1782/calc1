package calculatorN;

import static org.junit.Assert.*;

import org.junit.Test;


public class testcalc {
	@Test
	public void testAdd() {
		calc calc = new calc(); 
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
		//fail("Not yet implemented");
	}
	@Test
	public void testsub(){
		calc calc = new calc();
		calc.sub(20,10);
		assertEquals(10,calc.getResult());
	}
	@Test 
	public void testMulti(){
		calc calc = new calc();
		
		calc.multi(10,2);
		assertEquals(20,calc.getResult());
		
	}
	@Test
	public void div(){
		calc calc = new calc();
		
		calc.div(100, 20);
		assertEquals(5,calc.getResult());
	}
	@Test
	public void testinc(){
		calc calc= new calc();
		
		calc.inc(100);
		assertEquals(100,calc.getResult());
		calc.inc(200);
		assertEquals(300,calc.getResult());
		}

}
