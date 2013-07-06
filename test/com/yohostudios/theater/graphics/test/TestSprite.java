/**
 * 
 */
package com.yohostudios.theater.graphics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLTagNotFoundException;
import com.yohostudios.theater.graphics.Sprite;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestSprite {

    private Sprite sprite;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        sprite = new Sprite();
        xmlString = FileUtils.getFileContentAsString("test/data/TestSprite.xml");
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#initFromXML(java.lang.String)}
     * .
     * @throws XMLTagNotFoundException when the XML tag is not found.
     * @throws NumberFormatException when a conversion error occurs.
     */
    @Test
    public final void testInitFromXML() throws NumberFormatException,
            XMLTagNotFoundException {

        sprite.initFromXML(xmlString);

        assertEquals(1, sprite.getId());
        assertEquals(2, sprite.getWidth());
        assertEquals(3, sprite.getHeight());
        assertEquals(4, sprite.getAlpha());
        assertEquals(5, sprite.getFrames());
        assertEquals(6, sprite.getResourceId());

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#setTexture(int, int, int, int)}
     * .
     */
    @Test
    public final void testSetTexture() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#nextAlpha()}.
     */
    @Test
    public final void testNextAlpha() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.graphics.Sprite#fillRectangle(android.graphics.Rect, android.graphics.Color)}
     * .
     */
    @Test
    public final void testFillRectangle() {
        fail("Not yet implemented"); // TODO
    }

}
