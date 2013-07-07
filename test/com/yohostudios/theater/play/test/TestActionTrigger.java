/**
 * 
 */
package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.ActionTrigger;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestActionTrigger {

    private ActionTrigger actionTrigger;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {

        actionTrigger = new ActionTrigger();
        xmlString = FileUtils
                .getFileContentAsString("test/data/TestActionTrigger.xml");

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.ActionTrigger#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on an ActionTrigger.
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        actionTrigger.initFromXML(xmlString);
        assertEquals("Testing actionTrigger id", 1, actionTrigger.getId());
        assertEquals("Testing actionTrigger type", "onTouch", actionTrigger.getType());
        assertEquals("Testing actionTrigger params", "foobar", actionTrigger.getParams());
        assertEquals("Testing the actionTrigger's list of action size", 1, actionTrigger
                .getActions().size());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.ActionTrigger#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.ActionTrigger#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.ActionTrigger#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.ActionTrigger#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.ActionTrigger#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
