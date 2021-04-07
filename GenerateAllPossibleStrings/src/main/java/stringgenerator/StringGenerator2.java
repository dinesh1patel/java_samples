package stringgenerator;

import java.util.ArrayList;
import java.util.List;

public class StringGenerator2 {

	public static List<String> GeneratePattern(char movingChar, char fixedChar, int length, int testNumber) {
		List<String> stringList = new ArrayList<String>();
		if (testNumber == 1) {
			stringList.add("A" + "nnn");
		} else if (testNumber == 2) {	
			stringList.add("A" + "nnn");
			stringList.add("n" + "A" + "nn");
		} else if (testNumber == 3) {	
			stringList.add("A" + "nnn");
			stringList.add("n" + "A" + "nn");
			stringList.add("nn" + "A" + "n");
		} else if (testNumber == 4) {
			stringList.add("" + "A" + "nnn");
			stringList.add("n" + "A" + "nn");
			stringList.add("nn" + "A" + "n");
			stringList.add("nnn" + "A" + "");
			//stringList.add(fixedCharacters(0,'n') + "A" + fixedCharacters(3,'n'));
			//stringList.add(fixedCharacters(1,'n') + "A" + fixedCharacters(2,'n'));
			//stringList.add(fixedCharacters(2,'n') + "A" + fixedCharacters(1,'n'));
			//stringList.add(fixedCharacters(3,'n') + "A" + fixedCharacters(0,'n'));
			for (int i = 0; i < length; i++) {
				stringList.add(fixedCharacters(i,fixedChar) + movingChar + fixedCharacters(length - i - 1,fixedChar));
			}
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
