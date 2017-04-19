package service;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RandomLineImplTest {

	@Test
	public void randomLine() {
		RandomLineImpl rl = new RandomLineImpl();
		String testString = rl.createLine();
		int length = testString.length();
		
		assertTrue(
				testString instanceof String && length <= 75 && length != 0 
				&& (testString.charAt(length - 2) == '.') 
				&& Character.isUpperCase(testString.charAt(0)));
	}
}
