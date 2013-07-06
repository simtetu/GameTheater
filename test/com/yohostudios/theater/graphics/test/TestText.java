/**
 * 
 */
package com.yohostudios.theater.graphics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLTagNotFoundException;
import com.yohostudios.theater.graphics.Text;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestText {

    private Text text;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        text = new Text();
        xmlString = FileUtils.getFileContentAsString("test/data/TestText.xml");

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Text#initFromXML(java.lang.String)}
     * .
     * @throws XMLTagNotFoundException when the XML tag is not found.
     * @throws NumberFormatException when a conversion error occurs.
     */
    @Test
    public final void testInitFromXML() throws NumberFormatException, XMLTagNotFoundException {
        text.initFromXML(xmlString);
        assertEquals(1, text.getId());
        assertEquals(2, text.getX());
        assertEquals(3, text.getY());
        assertEquals("125.00", text.getContent());
        assertEquals("currency", text.getFormat());
        assertEquals(4, text.getFontFrames());
        assertEquals(5, text.getFontResourceId());
        assertEquals(6, text.getFontResourceWidth());
        assertEquals(7, text.getFontResourceHeight());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Text#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Text#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Text#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Text#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Text#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
