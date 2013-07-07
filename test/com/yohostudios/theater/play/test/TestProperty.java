package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.Property;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 */
public class TestProperty {

    private Property property;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        property = new Property();
        xmlString = FileUtils
                .getFileContentAsString("test/data/TestProperty.xml");
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Property#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on a Condition.
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        property.initFromXML(xmlString);
        assertEquals("Testing the id", 1, property.getId());
        assertEquals("Testing the name", "age", property.getName());
        assertEquals("Testing the value", "10", property.getValue());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Property#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Property#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Property#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Property#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Property#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
