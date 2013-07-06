/**
 * 
 */
package com.yohostudios.theater.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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

        // Assume str is numeric.
        boolean strIsNumeric = true;

        // if str is empty, it's obviously not numeric.
        if (str == null || str.isEmpty()) {
            strIsNumeric = false;
        } else {

            int periodPosition = -1;
            int periodCount = 0;

            for (int i = 0; i < str.length(); i++) {

                char currentChar = str.charAt(i);

                if (currentChar == '.') {
                    periodCount++;
                    periodPosition = i;
                }
                // if str is not numeric.
                if (Character.isLetter(currentChar)
                        && !Character.isDigit(currentChar)
                        && currentChar != '.') {
                    strIsNumeric = false;
                    break;
                }
            }
            // if str is not a proper floating point number it's not numeric.
            if (periodCount > 1 || periodPosition == 0
                    || periodPosition == str.length() - 1) {
                strIsNumeric = false;
            }
        }

        return strIsNumeric;

    }

    /**
     * Returns a list of tokens as strings from a source string. 
     * @param str the string to tokenize.
     * @param token separates the string.
     * @return a list of tokens.
     */
    public static List<String> tokenize(String str, String token) {

        List<String> tokenList = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(str, token);
        while (tokenizer.hasMoreTokens()) {
            tokenList.add(tokenizer.nextToken());
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

        if (str != null && !str.isEmpty()) {
            int startIndex = str.indexOf('(', 0);
            int endIndex = str.indexOf(')', 0);
            if (startIndex >= 0 && endIndex > 0) {
                return new String(str.substring(startIndex + 1, endIndex));
            }
        }
        return "";
    }

}
