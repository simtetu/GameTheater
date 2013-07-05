/**
 * 
 */
package com.yohostudios.theater.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.UnsupportedOperatorException;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class TestXMLObject {

    /**
     * @throws java.lang.Exception an exception.
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Testing the compare method.
     */
    @Test
    public final void testCompare() {

        // 10 == 10
        int integerEqualsTen = 10;
        assertTrue(AbstractXMLObject.compare(integerEqualsTen, Operator.EQUALS, "10"));

        // 10 == 10
        long longEqualsTen = 10;
        assertTrue(AbstractXMLObject.compare(longEqualsTen, Operator.EQUALS, "10"));

        // 10 == 10
        assertTrue(AbstractXMLObject.compare("10", Operator.EQUALS, "10"));

        // 9 < 10
        int intLtTen = 9;
        assertTrue(AbstractXMLObject.compare(intLtTen, Operator.LOWER_THAN, "10"));

        // 9.8 < 9.9
        double dblLtNinePtNine = 9.8;
        assertTrue(AbstractXMLObject.compare(dblLtNinePtNine, Operator.LOWER_THAN,
                "9.9"));

        // 9.8 < 9.9
        float fltLtNinePtNine = 9.8f;
        assertTrue(AbstractXMLObject.compare(fltLtNinePtNine, Operator.LOWER_THAN,
                "9.9"));

        // 9 <= 10
        int intLtEqTen = 9;
        assertTrue(AbstractXMLObject.compare(intLtEqTen, Operator.LOWER_THAN_OR_EQUALS,
                "10"));

        // 10 <= 10 and ignoring the operator string case
        assertTrue(AbstractXMLObject.compare("10", Operator.LOWER_THAN_OR_EQUALS, "10"));

        // 10 > 9
        int intGtNine = 10;
        assertTrue(AbstractXMLObject.compare(intGtNine, Operator.GREATER_THAN, "9"));

        // 10 >= 10 and ignoring the operator string case
        assertTrue(AbstractXMLObject.compare("10", Operator.GREATER_THAN_OR_EQUALS,
                "10"));

        // Compares two strings lexicographically with different operators
        // (similar to String.compareTo method)
        assertTrue(AbstractXMLObject.compare("abc", Operator.LOWER_THAN, "cde"));
        assertTrue(AbstractXMLObject.compare("abc", Operator.LOWER_THAN_OR_EQUALS,
                "abc"));
        assertTrue(AbstractXMLObject.compare("abc", Operator.EQUALS, "abc"));
        assertTrue(AbstractXMLObject.compare("abc", Operator.GREATER_THAN_OR_EQUALS,
                "abc"));
        assertTrue(AbstractXMLObject.compare("cde", Operator.GREATER_THAN_OR_EQUALS,
                "abc"));
        assertTrue(AbstractXMLObject.compare("cde", Operator.GREATER_THAN, "abc"));

    }

    /**
     * @throws UnsupportedOperatorException if the operator is not supported.
     * 
     */
    @Test(expected = UnsupportedOperatorException.class)
    public final void testCompareNumericalValuesWithBadOperator()
            throws UnsupportedOperatorException {
        try {
            AbstractXMLObject.compare("10", Operator.getOperator("zz"), "10");
        } catch (UnsupportedOperatorException uoe) {
            throw uoe;
        }

    }

}
