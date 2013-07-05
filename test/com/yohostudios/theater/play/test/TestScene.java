package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.play.Actor;
import com.yohostudios.theater.play.Scene;

/**
 * @author simon
 */
public class TestScene {

    /** */
    private Scene scene;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public final void setUp() throws Exception {
        scene = new Scene();
        xmlString =  new StringBuilder()
        .append("<Scene>")
        .append("<Actor name=\"Widget\" id=\"1\" x=\"2\" y=\"3\" z=\"4\" width=\"5\" height=\"6\"")
        .append(" currentFrame=\"7\" sequenceIndex=\"8\" animated=\"true\" animFrameDelay=\"9\"")
        .append(" currentDialogueId=\"10\" talking=\"false\" animDelayCounter=\"11\"")
        .append(" loopAnimation=\"false\" visible=\"false\">")
        .append("<Sprite></Sprite>")
        .append("<Sound></Sound>")
        .append("<Sound></Sound>")
        .append("<Text></Text>")
        .append("<Dialogue id=\"1\" nextDialogueId=\"2\" spokenTime=\"5\"></Dialogue>")
        .append("<Trigger></Trigger>")
        .append("<Property></Property>")
        .append("</Actor>")
        .append("</Scene>").toString();
    }

    @Test
    public final void testIsModifiedAttribute() {
        scene.getModifiedAttributes().add("Zero");
        assertTrue(scene.isAttributeModified("Zero"));

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#initFromXML(java.lang.String)}.
     */
    @Test
    public final void testInitFromXML() {
        scene.initFromXML(xmlString);
        assertEquals(1, scene.getActors().size());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#Scene(java.lang.String)}.
     */
    @Test
    public final void testScene() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link com.yohostudios.theater.play.Scene#loadScene(int)}.
     */
    @Test
    public final void testLoadRoom() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#draw(android.graphics.Canvas)}.
     */
    @Test
    public final void testDraw() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#orderActorsFromZ(boolean)}.
     */
    @Test
    public final void testOrderActorsFromZ() {

        Actor actorA = new Actor();
        actorA.setZ(100);
        Actor actorB = new Actor();
        actorB.setZ(99);
        Actor actorC = new Actor();
        actorC.setZ(98);

        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors.add(actorA);
        actors.add(actorB);
        actors.add(actorC);

        scene.setActors(actors);
        scene.orderActorsFromZ(true);
        assertEquals(98, actors.get(0).getZ());
        assertEquals(99, actors.get(1).getZ());
        assertEquals(100, actors.get(2).getZ());

        scene.orderActorsFromZ(false);
        assertEquals(100, actors.get(0).getZ());
        assertEquals(99, actors.get(1).getZ());
        assertEquals(98, actors.get(2).getZ());

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Scene#findActorById(long)}.
     */
    @Test
    public final void testFindXMLObjectById() {
        List<Actor> actors = new ArrayList<Actor>();
        Actor a100 = new Actor();
        a100.setId(100);
        actors.add(a100);

        Actor a101 = new Actor();
        a101.setId(101);
        actors.add(a101);

        Actor a102 = new Actor();
        a102.setId(102);
        actors.add(a102);

        scene.setActors(actors);

        Actor actorResult = scene.findXMLObjectById(actors, 101);
        assertEquals(a101, actorResult);

    }

}
