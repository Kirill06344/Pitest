package com.classes;

import java.util.Arrays;
import java.util.List;

public class IntegerToRoman {

    private List<Character> units;
    private List<Character> fives;

    private int getRank(int num, int rank) {
        return (int)(num / Math.pow(10, rank - 1)) % 10;
    }


    public IntegerToRoman() {
        units = Arrays.asList('I','X','C','M');
        fives = Arrays.asList('V', 'L','D');
    }

    public String intToRoman(int num) {
        if (num >= 1 && num <= 3999) {
            int ranks = Integer.toString(num).length();
            String result = "";
            for (int i = ranks; i > 0; --i) {
                int digit = getRank(num, i);
                if (digit == 4 || digit == 9) {
                    result += units.get(i - 1);
                    result += (digit == 4) ? fives.get(i - 1) : units.get(i);
                } else {
                    if (digit != 0) {
                       if (digit >= 5) {
                           result += fives.get(i - 1);
                       }
                       int amount = digit % 5;
                       for (int j = 0; j < amount; ++j) {
                           result += units.get(i - 1);
                       }
                    }
                }
            }
            return result;
        }
        return "The function correctly work with numbers beetween 1 and 3999";
    }
}

