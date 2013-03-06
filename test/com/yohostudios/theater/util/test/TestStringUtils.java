package com.yohostudios.theater.util.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.util.StringUtils;

public class TestStringUtils {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public final void testGetParamInParentheses() {
        
        // Test with a value
        String result = StringUtils.getParamInParentheses("(300)");
        assertEquals("300", result);
        
        // Test with missing parenthesis
        result = StringUtils.getParamInParentheses("(");
        assertEquals("", result);
        
        // Test with an empty string
        result = StringUtils.getParamInParentheses("");
        assertEquals("", result);
        
        // Test with null
        result = StringUtils.getParamInParentheses(null);
        assertEquals("", result);

    }
    
    @Test
    public final void testTokenize() {
        
        List<String> tokens = new ArrayList<String>();
        String input = "Monday, Tuesday, Wednesday";
        tokens = StringUtils.tokenize(input, ", ");
        assertEquals("Monday", tokens.get(0));
        assertEquals("Tuesday", tokens.get(1));
        assertEquals("Wednesday", tokens.get(2));
    }
    
    @Test public final void testIsNumeric() {
        
        assertFalse(StringUtils.isNumeric("abcde"));
        assertFalse(StringUtils.isNumeric("123456789a"));
        assertFalse(StringUtils.isNumeric(".200"));
        assertFalse(StringUtils.isNumeric("200..00"));
        assertTrue(StringUtils.isNumeric("200.00"));
        assertTrue(StringUtils.isNumeric("200"));
    }

}
