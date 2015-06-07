package core;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class PrimeNumberCheckerTest {
	private PrimeNumberChecker pn;
	
	 @Before
	 public void initialize() {
		 pn = new PrimeNumberChecker();
	 }
	 
	 @Parameter(value = 0)
	 public Integer inputNumber;
	 
	 @Parameter(value = 1)
	 public Boolean expectedResult;
	 
	 @Parameters(name = "Iteration # {index}: Number: {0}; isPrime? {1}")
	 public static Collection<Object[]> primeNumbers() {
		 Object[][] data = new Object[100][2];
		 for (int i = 0; i < data.length; i++) {
             data[i][0] = i;
             data[i][1] = new PrimeNumberChecker().validate(i);
		}
		 
		 
		 return Arrays.asList(data);
		 
	 }
	 
	 @Test
	 
	 public void testPrimeNumberChecker() {
		 System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
		 assertEquals(expectedResult, pn.validate(inputNumber));
		 }
	 }

