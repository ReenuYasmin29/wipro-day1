ALL DIGITS COUNT

public class AllDigitsCount {
    public static int allDigitsCount(int input1) {
        return String.valueOf(input1).length();
    }
}

NON-REPEATED DIGITS

import java.util.ArrayList;
import java.util.Collections;
public class NonRepeatedDigitsCount {
    public static int nonRepeatedDigitsCount(int input1) {
        int count = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        while(input1 != 0){
            int digit = input1 % 10;
            nums.add(digit);
            input1 /= 10;
        }

        for (int num : nums)
            if (Collections.frequency(nums, num) == 1) count++;

        return count;
    }
}

NUMBERS OF PRIMES IN A SPECIFIED RANGE

public class NoOfPrimesInRange {
    public static int noOfPrimesInRange(int input1, int input2) {
        int primeCount = 0;

        while (input1 <= input2) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(input1); i++)
                if (input1 % i == 0)
                    isPrime = false;

            if (isPrime)
                primeCount++;

            input1++;
        }
        return primeCount;
    }
}

UNIQUE DIGITS COUNT

import java.util.ArrayList;
public class UniqueDigitsCount {
    public static int uniqueDigitsCount(int input1) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (input1 != 0){
            int digit = input1 % 10;
            if (!nums.contains(digit)) nums.add(digit);
            input1 /= 10;
        }
        return nums.size();
    }
}
