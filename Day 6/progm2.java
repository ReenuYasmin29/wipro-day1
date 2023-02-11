MOST FREQUENTLY OCCURRING DIGIT

import java.io.*;
import java.util.*;
class MostFrequentlyOccurringDigit {
    public int mostFrequentlyOccurringDigit(int[] input1,int input2){
        StringBuilder input = new StringBuilder();
        for (int ip : input1) input.append(ip);
        int[] freq = new int[10];
        for (int j = 0; j < input.length(); j++) {
            freq[Integer.parseInt(String.valueOf(input.charAt(j)))]++;
        }
        int maxFreqIndex = 0;
        int maxFreq = 0;
        for (int i = 9; i >= 0; i--) {
            if (freq[i] > maxFreq) {
                maxFreqIndex = i;
                maxFreq = freq[i];
            }
        }
        return maxFreqIndex;
    }
}

DECREASING SEQUENCE

import java.io.*;
import  java.util.*;

class DecreasingSequence {
    public class Result{
        public final int output1;
        public final int output2;

        public Result(int out1, int out2){
            output1 = out1;
            output2 = out2;
        }
    }

    public Result decreasingSeq(int[] input1,int input2){
        int dcrCount = 0;
        int longestLen = 0;
        int spikeCount = 0;
        boolean flag = false;

        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                if (flag == false) {
                    flag = true;
                    spikeCount++;
                }

                dcrCount++;
                longestLen = dcrCount > longestLen ? dcrCount : longestLen; 
            } else {
                if (flag == true) {
                    flag = false;
                    dcrCount = 0;
                }
            }
        }

        if (spikeCount > 0) longestLen++;
        return new Result(spikeCount, longestLen);
    }
}

SIMPLE ENCODED ARRAY

import java.io.*;
import java.util.*;

class SimpleEncodedArray {
    public class Result{
        public final int output1;
        public final int output2;

        public Result(int out1, int out2){
            output1 = out1;
            output2 = out2;
        }
    }

    public Result findOriginalFirstAndSum(int[] input1,int input2){
        int[] out = new int[input1.length];
        out[out.length - 1] = input1[input1.length - 1];

        for (int i = input1.length - 1; i > 0; i--) {
            out[i - 1] = input1[i - 1] - out[i];
        }

        int sum = 0;
        for (int item : out)
            sum += item;

        return new Result(out[0], sum);
    }
}
