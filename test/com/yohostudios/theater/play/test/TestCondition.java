package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.Condition;
import com.yohostudios.theater.util.FileUtils;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class TestCondition {

    /** */
    private Condition condition;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        condition = new Condition();
        xmlString = FileUtils.getFileContentAsString("test/data/TestCondition.xml");
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Condition#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on a Condition.
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        condition.initFromXML(xmlString);
        assertEquals(1L, condition.getId());
        assertEquals("1999", condition.getTargetObjectId());
        assertEquals("Actor", condition.getTargetObjectType());
        assertEquals("currentFrame", condition.getParamName());
        assertEquals(Operator.EQUALS, condition.getParamOperator());
        assertEquals("36", condition.getParamValue());
    }

    /**
     * 
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on a Condition.
     */
    @Test(expected = XMLParsingException.class)
    public final void testUnsupportedOperatorException()
            throws XMLParsingException {

        String xmlString = "<Condition id=\"1\" targetObjectId=\"1999\" targetObjectType=\"Actor\""
                + " paramName=\"currentFrame\" paramOperator=\"zz\" paramValue=\"36\"></Condition>";

        condition.initFromXML(xmlString);

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Condition#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Condition#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Condition#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Condition#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Condition#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
