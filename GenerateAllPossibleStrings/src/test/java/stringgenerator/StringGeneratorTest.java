package stringgenerator;

import org.junit.Assert;
import org.junit.Test;


public class StringGeneratorTest {

	/*
	 * Given, a moving char, a fixed char, and a number, generate all possible
	 * strings With : A, n, 4 We will have Annn, nAnn, nnAn,nnnA With : 0, 1, 5 We
	 * will have 01111, 10111, 11011, 11101, 11110
	 */

	@Test
	public final void whenan4IsUsedThenReturnValueAllValues() {
		Assert.assertEquals("[Annn, nAnn, nnAn, nnnA]", StringGenerator.GeneratePattern('A', 'n', 4).toString());
	}
	
	@Test
	public final void whenan4IsUsedThenReturnValueAllValues2() {
		Assert.assertEquals("[01111, 10111, 11011, 11101, 11110]", StringGenerator.GeneratePattern('0', '1', 5).toString());
	}
}
