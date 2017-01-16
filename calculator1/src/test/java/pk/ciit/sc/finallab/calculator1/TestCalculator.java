package pk.ciit.sc.finallab.calculator1;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCalculator {
     Calculator calculator  = new Calculator();
	
	
			@Test
			public void square(){
			  assertEquals(4,calculator.square(2));
			}
		
			
			
			@Test
			public void cube(){
				assertEquals(8, calculator.cube(2));
			}
			
		
			
			@Test
			public void findMax(){
				assertEquals(4,calculator.findMax(3,4,3));
			}
			
			
		
			
			
		
			}
			
			
	
	

