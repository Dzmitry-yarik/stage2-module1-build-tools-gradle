package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String s: args) {
            if (!isPositiveNumber(s))
                return false;
        }
        return true;
    }

    public static boolean isPositiveNumber(String str) {
        if (str == null)
            return false;
        try {
            if(Double.parseDouble(str) > 0)
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
