MOST FREQUENT DIGIT

import java.util.Arrays;
public class MostFrequentDigit {
    public int getMostFrequestDigit(int input1, int input2, int input3, int input4) {
String allNo = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] digitFrequency = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 0-9
		
		for (int i = 0; i < allNo.length(); i++) {
			digitFrequency[Integer.parseInt(String.valueOf(allNo.charAt(i)))]++;
		}
		
		int mostFrequentDigit = 0;
		
		for (int i = 0; i <= 9; i++) {
			mostFrequentDigit 	= digitFrequency[i] >= digitFrequency[mostFrequentDigit] ? i : mostFrequentDigit;
		}
		
		return mostFrequentDigit;
    }
}

RETURN SECOND WORD IN UPPERCASE

public class SecondWordInUppercase {
    public String secondWordInUppercase(String input1) {
        if (input1.equals("")) return "LESS";
        StringBuffer sb = new StringBuffer(input1.trim());

        try {
            int startIndex = sb.indexOf(" ");
            if (startIndex == -1) return "LESS";
            try {
                int endIndex = sb.indexOf(" ", startIndex+1) + 1;
                return sb.substring(startIndex+1, endIndex).toUpperCase().trim();
            } catch (StringIndexOutOfBoundsException e) {
                return sb.substring(startIndex+1).toUpperCase().trim();
            }
        } catch (StringIndexOutOfBoundsException e) {
            return "LESS";
        }
    }
}

IS PALINDROME(STRING)
  
  public class IsPalindromeString {
    public static int getIsPalindromeString(String input1) {
        input1 = input1.toLowerCase();
        int digitCount = input1.length();
        boolean isPalindrome = true;

        int range = digitCount / 2;
        if (digitCount % 2 == 0) range--;

        for (int i = 0; i <= range; i++) {
            if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
        }

        if (isPalindrome == true) return 2;
        else return 1;
    }
}

WEIGHT OF STRING

public class WeightOfString {
    public int weightOfString(String input1, int input2) {
        int weight = 0;
        for (int i = 0; i < input1.length(); i++) {
            char letter = input1.charAt(i);

            if (input2 == 0) {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
                    letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                    continue;
            }

            if (letter >= 65 && letter <= 90) weight += letter - 64;
            else if (letter >= 97 && letter <= 122) weight += letter - 96;
        }
        return weight;
    }
}
