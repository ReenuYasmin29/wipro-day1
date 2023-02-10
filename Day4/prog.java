DIGIT SUM ODD

public class EvenOddDigitsSum {
    public static int evenOddDigitsSum(int input1, String input2) {
        int evenSum = 0;
        int totalSum = 0;

        while (input1 != 0) {
            int digit = input1 % 10;
            totalSum += digit;
            if (digit % 2 == 0) evenSum += digit;
            input1 /= 10;
        }

        if (input2.equals("even")) return evenSum;
        else return totalSum - evenSum;
    }
}

DIGIT SUM EVEN

public class EvenDigitsSum {
    public int evenDigitsSum(int input1) {
        int sum = 0;

        while (input1 != 0) {
            int digit = input1 % 10;
            if (digit % 2 == 0) sum += digit;
            input1 /= 10;
        }

        return sum;
    }
}

DIGIT SUM OF EVEN OR ODD

public class EvenOddDigitsSum {
    public static int evenOddDigitsSum(int input1, String input2) {
        int evenSum = 0;
        int totalSum = 0;

        while (input1 != 0) {
            int digit = input1 % 10;
            totalSum += digit;
            if (digit % 2 == 0) evenSum += digit;
            input1 /= 10;
        }

        if (input2.equals("even")) return evenSum;
        else return totalSum - evenSum;
    }
}

DIGIT SUM OF ALL DIGITS

public class DigitSum {
    public static int getDigitSum (int input1) {
        int digitCount = String.valueOf(input1).length();
        if (digitCount == 1) return input1;

        int sum = 0;
        int number = input1;
        if (input1 < 0) number *= -1;

        while (digitCount != 1) {
            int currentSum = 0;
            while (number != 0) {
                currentSum += number % 10;
                number /= 10;
            }
            sum = currentSum;
            number = sum;
            digitCount = String.valueOf(sum).length();
        }

        if (input1 < 0) sum *= -1;
        return sum;
    }
}
