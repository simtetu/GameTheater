/**
 * 
 */
package com.yohostudios.theater.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * @author simon
 * 
 */
public final class StringUtils {

    /**
     * Private constructor to prevent instances of this class.
     */
    private StringUtils() {

    }

    /**
     * Traverses a string to determine if it is numeric. A numeric string
     * contains a sequence of digits with or without a single period used as a
     * decimal. Example of numeric strings:
     * 
     * "034" "12345" "0.75" "20.000"
     * 
     * Note: Regular expressions were not used because they are much slower to
     * execute than iterating through characters.
     * @param str the string to check.
     * @return true if the string is numeric, otherwise false.
     */
    public static boolean isNumeric(final String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        int periodPosition = -1;
        int periodCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == '.') {
                periodCount++;
                periodPosition = i;
            }
            if (Character.isLetter(c) && !Character.isDigit(c) && c != '.') {
                return false;
            }
        }

        if (periodCount == 0 || (periodCount == 1 && periodPosition > 0)) {
            return true;
        }

        return false;

    }

    /**
     * @param str
     * @param propertyValue
     * @return a list of tokens.
     */
    public static final List<String> tokenize(String str, String tokenizer) {

        List<String> tokenList = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(str, tokenizer);
        while (st.hasMoreTokens()) {
            tokenList.add(st.nextToken());
        }
        return tokenList;
    }

    /**
     * Returns the value between parentheses in a string.
     * @param str the string to extract the value from.
     * @return the value found between parentheses if any, otherwise an empty
     *         string.
     */
    public static String getParamInParentheses(String str) {

        String result = "";

        if (str != null && !str.isEmpty()) {
            int startIndex = str.indexOf("(", 0);
            int endIndex = str.indexOf(")", 0);
            if (startIndex >= 0 && endIndex > 0) {
                result = str.substring(startIndex + 1, endIndex);
            }
        }
        return new String(result);
    }

}
