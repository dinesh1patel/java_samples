package stringgenerator;

import org.junit.Assert;
import org.junit.Test;


public class StringGeneratorTest2 {

	/*
	 * Given, a moving char, a fixed char, and a number, generate all possible
	 * strings With : A, n, 4 We will have Annn, nAnn, nnAn,nnnA With : 0, 1, 5 We
	 * will have 01111, 10111, 11011, 11101, 11110
	 */

	@Test
	public final void whenan4IsUsedThenReturn1stValue() {
		Assert.assertEquals("[Annn]", StringGenerator2.GeneratePattern('A', 'n', 4, 1).toString());
	}
	
	@Test
	public final void whenan4IsUsedThenReturnValue2ndValue() {
		Assert.assertEquals("[Annn, nAnn]", StringGenerator2.GeneratePattern('A', 'n', 4, 2).toString());
	}
	
	@Test
	public final void whenan4IsUsedThenReturnValue3rdValue() {
		Assert.assertEquals("[Annn, nAnn, nnAn]", StringGenerator2.GeneratePattern('A', 'n', 4, 3).toString());
	}
	
	@Test
	public final void whenan4IsUsedThenReturnValueAllValues() {
		Assert.assertEquals("[Annn, nAnn, nnAn, nnnA]", StringGenerator2.GeneratePattern('A', 'n', 4, 4).toString());
	}
}
