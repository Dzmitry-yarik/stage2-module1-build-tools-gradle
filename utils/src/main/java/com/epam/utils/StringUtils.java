package com.epam.utils;

public class StringUtils {
       public static boolean isPositiveNumber(String str) {
        try {
            if(Double.parseDouble(str) > 0)
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
