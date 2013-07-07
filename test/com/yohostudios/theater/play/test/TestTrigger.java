/**
 * 
 */
package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.Trigger;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestTrigger {

    private Trigger trigger;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {

        trigger = new Trigger();
        xmlString = FileUtils
                .getFileContentAsString("test/data/TestTrigger.xml");

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Trigger#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on an Trigger.
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        trigger.initFromXML(xmlString);
        assertEquals("Testing trigger id", 1, trigger.getId());
        assertEquals("Testing trigger type", "onTouch", trigger.getType());
        assertEquals("Testing trigger params", "foobar", trigger.getParams());
        assertEquals("Testing the trigger's list of action size", 1, trigger
                .getActions().size());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Trigger#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Trigger#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Trigger#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Trigger#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Trigger#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
