/**
 * 
 */
package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.Actor;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestActor {

    private Actor actor;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {

        actor = new Actor();
        xmlString = FileUtils.getFileContentAsString("test/data/TestActor.xml");
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#initFromXML(java.lang.String)}.
     * @throws XMLParsingException if an error occurred while invoking
     *             initFromXML on an Actor.
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        actor.initFromXML(xmlString);
        assertEquals("Widget", actor.getName());
        assertEquals(1, actor.getId());
        assertEquals(2, actor.getX());
        assertEquals(3, actor.getY());
        assertEquals(4, actor.getZ());
        assertEquals(5, actor.getWidth());
        assertEquals(6, actor.getHeight());
        assertEquals(7, actor.getCurrentFrame());
        assertEquals(8, actor.getSequenceIndex());
        assertTrue(actor.isAnimated());
        assertEquals(9, actor.getAnimFrameDelay());
        assertEquals(10, actor.getCurrentDialogueId());
        assertFalse(actor.isTalking());
        assertEquals(11, actor.getAnimDelayCounter());
        assertFalse(actor.isLoopAnimation());
        assertFalse(actor.isVisible());

        assertEquals(1, actor.getSprites().size());
        assertEquals(2, actor.getSounds().size());
        assertEquals(1, actor.getTexts().size());
        assertEquals(1, actor.getDialogues().size());
        assertEquals(1, actor.getTriggers().size());
        assertEquals(1, actor.getProperties().size());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
