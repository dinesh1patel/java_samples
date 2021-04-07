package stringgenerator;

import java.util.ArrayList;
import java.util.List;

public class StringGenerator {

	public static List<String> GeneratePattern(char movingChar, char fixedChar, int length) {
		List<String> stringList = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			stringList.add(fixedCharacters(i,fixedChar) + movingChar + fixedCharacters(length - i - 1,fixedChar));
		}
		return stringList;
	}

	public static String fixedCharacters(int number, char fixedChar) {
		String returnString = ""; 
		for (int i = 0; i < number; i++) {
			returnString += fixedChar;
		}
		return returnString;
	}
}
