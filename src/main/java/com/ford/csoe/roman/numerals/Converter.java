package com.ford.csoe.roman.numerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class Converter implements RomanNumeralConverter {

    private static final Map<Integer, String> ARABIC_TO_ROMAN = new LinkedHashMap<>();

    static {
        ARABIC_TO_ROMAN.put(1000, "M");
        ARABIC_TO_ROMAN.put(900, "CM");
        ARABIC_TO_ROMAN.put(500, "D");
        ARABIC_TO_ROMAN.put(400, "CD");
        ARABIC_TO_ROMAN.put(100, "C");
        ARABIC_TO_ROMAN.put(90, "XC");
        ARABIC_TO_ROMAN.put(50, "L");
        ARABIC_TO_ROMAN.put(40, "XL");
        ARABIC_TO_ROMAN.put(10, "X");
        ARABIC_TO_ROMAN.put(9, "IX");
        ARABIC_TO_ROMAN.put(6, "VI");
        ARABIC_TO_ROMAN.put(5, "V");
        ARABIC_TO_ROMAN.put(4, "IV");
        ARABIC_TO_ROMAN.put(1, "I");
    }

    @Override
    public String convert(Integer romanNumeral) {
        StringBuilder s = new StringBuilder();
        int remaining = romanNumeral;
        while (remaining > 0) {
            for (Map.Entry<Integer, String> entry : ARABIC_TO_ROMAN.entrySet()) {
                if (entry.getKey() <= remaining) {
                    remaining -= entry.getKey();
                    s.append(entry.getValue());
                    break;
                }
            }
        }
        return s.toString();
    }
}
