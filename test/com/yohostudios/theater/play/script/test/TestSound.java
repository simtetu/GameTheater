package com.yohostudios.theater.play.script.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.script.Sound;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestSound {

    private Sound sound;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        sound = new Sound();
        xmlString = FileUtils.getFileContentAsString("test/data/TestSound.xml");
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on a Sound.
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        sound.initFromXML(xmlString);
        assertEquals("Testing sound id", 1, sound.getId());
        assertTrue("Testing sound volume is 1.25", (sound.getVolume() == 1.25f));
        assertTrue("Testing sound pitch is 1.00", (sound.getPitch() == 1.0f));
        assertEquals("Testing sound resourceId", 2, sound.getResourceId());
        assertEquals("Testing sound isLooping", true, sound.isLooping());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sound#load(int)}.
     */
    @Test
    public final void testLoad() {
        fail("Not yet implemented"); // TODO
    }

}
