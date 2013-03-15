/**
 * 
 */
package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
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

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        actor = new Actor();
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Actor#initFromXML(java.lang.String)}.
     */
    @Test
    public final void testInitFromXML() {
        // fail("Not yet implemented"); // TODO
        String xmlString = "<Sprite></Sprite><Sound></Sound><Sound></Sound>"
                + "<Text></Text><Dialogue></Dialogue><Trigger></Trigger><Property></Property>";
        actor.initFromXML(xmlString);
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
