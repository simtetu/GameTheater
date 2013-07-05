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

import com.yohostudios.theater.play.Actor;

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
        xmlString = new StringBuilder()
                .append("<Actor name=\"Widget\" id=\"1\" x=\"2\" y=\"3\" z=\"4\" width=\"5\" height=\"6\"")
                .append(" currentFrame=\"7\" sequenceIndex=\"8\" animated=\"true\" animFrameDelay=\"9\"")
                .append(" currentDialogueId=\"10\" talking=\"false\" animDelayCounter=\"11\"")
                .append(" loopAnimation=\"false\" visible=\"false\">")
                .append("<Sprite></Sprite>")
                .append("<Sound></Sound>")
                .append("<Sound></Sound>")
                .append("<Text></Text>")
                .append("<Dialogue id=\"1\" nextDialogueId=\"2\" spokenTime=\"5\"></Dialogue>")
                .append("<Trigger></Trigger>").append("<Property></Property>")
                .append("</Actor>").toString();
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#initFromXML(java.lang.String)}.
     */
    @Test
    public final void testInitFromXML() {

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
