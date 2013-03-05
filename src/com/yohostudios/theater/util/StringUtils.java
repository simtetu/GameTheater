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
     * Traverses a string to determine if it has a non-digit character in it. We
     * are not using regular expressions for this because it is so much slower.
     * @param str the string to check.
     * @return true if the string has a non-digit character, otherwise false.
     */
    public static boolean hasLettersOrNonNumbers(final String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                return true;
            }
            if (!Character.isDigit(c)) {
                return true;
            }
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
    
}
