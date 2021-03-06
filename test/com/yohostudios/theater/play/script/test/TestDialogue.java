/**
 * 
 */
package com.yohostudios.theater.play.script.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.script.Dialogue;
import com.yohostudios.theater.util.FileUtils;

/**
 * @author simon
 * 
 */
public class TestDialogue {

    private Dialogue dialogue;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        dialogue = new Dialogue();
        xmlString = FileUtils.getFileContentAsString("test/data/TestDialogue.xml");
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Dialogue#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking initFromXML on a Dialogue. 
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        dialogue.initFromXML(xmlString);
        assertEquals(1, dialogue.getId());
        assertEquals(2, dialogue.getNextDialogueId());
        assertEquals(5, dialogue.getSpokenTime());
        assertEquals("Hello", dialogue.getSentences().get(0).getContent());
        assertEquals("World", dialogue.getSentences().get(1).getContent());
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Dialogue#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Dialogue#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Dialogue#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Dialogue#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Dialogue#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
