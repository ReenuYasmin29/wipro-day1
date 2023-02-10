
IS PALINDROME POSSIBLE?
  
  import java.util.*;
public class PalindromePossible {
    public int palindromePossible(int input1){
    String str = String.valueOf(input1);

    int count[] = new int[256];
    Arrays.fill(count, 0);

    for (int i = 0; i < str.length(); i++)
        count[(int)(str.charAt(i))]++;

    int odd = 0;
    for (int i = 0; i < 256; i++){
        if ((count[i] & 1) == 1) odd++;
        if (odd > 1) return 1;
    }
    return 2;
    }
}

PALINDROME NUMBER

public class PalindromeNumber {
    public int palindromeNumber (int input1) {
        int num = input1, rev = 0;
        while (input1 != 0){
            int digit = input1 % 10;
            rev = rev * 10 + digit;
            input1 /= 10;
        }
        if (num == rev) return 2;
        else return 1;
    }
}

WEIGHT HILL PATTERN

public class PalindromeNumber {
    public int palindromeNumber (int input1) {
        int num = input1, rev = 0;
        while (input1 != 0){
            int digit = input1 % 10;
            rev = rev * 10 + digit;
            input1 /= 10;
        }
        if (num == rev) return 2;
        else return 1;
    }
}

CREATE PIN USING ALPHA,BETA,GAMMA

public class PinGenerator {
    public int pinGenerator(int input1, int input2, int input3) {
        int pin = 0;
        int ip1, ip2, ip3, min, max;

        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(ip1, ip2);
        max = Math.max(max, ip3);
        pin = min;

        input1 /= 10;
        input2 /= 10;
        input3 /= 10;
        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(max, ip1);
        max = Math.max(max, ip2);
        max = Math.max(max, ip3);
        pin = min * 10 + pin;

        input1 /= 10;
        input2 /= 10;
        input3 /= 10;
        ip1 = input1 % 10;
        ip2 = input2 % 10;
        ip3 = input3 % 10;
        min = Math.min(ip1, ip2);
        min = Math.min(min, ip3);
        max = Math.max(max, ip1);
        max = Math.max(max, ip2);
        max = Math.max(max, ip3);
        pin = min * 100 + pin;
        pin = max * 1000 + pin;

        return pin;
    }
}
