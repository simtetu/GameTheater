/**
 * 
 */
package com.yohostudios.theater.play.script.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.play.script.Sentence;

/**
 * @author simon
 * 
 */
public class TestSentence {

    private Sentence sentence;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        sentence = new Sentence();
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#initFromXML(java.lang.String)}
     * .
     */
    @Test
    public final void testInitFromXML() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#completelyShown()}.
     */
    @Test
    public final void testCompletelyShown() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.script.Sentence#getIncrementalSentence()}
     * .
     */
    @Test
    public final void testGetIncrementalSentence() {
        
        // Make sure each call of getIncrementalSentence shows more of the sentence.
        sentence.setSentence("Hello");
        assertEquals("H", sentence.getIncrementalSentence());
        assertEquals("He", sentence.getIncrementalSentence());
        assertEquals("Hel", sentence.getIncrementalSentence());
        assertEquals("Hell", sentence.getIncrementalSentence());
        assertEquals("Hello", sentence.getIncrementalSentence());
        // Try to exceed the boundaries of the sentence 
        assertEquals("Hello", sentence.getIncrementalSentence());
        
        // Test again with 3 chars at a time
        sentence.setCharAmountShown(0);
        sentence.setCharAmountIncrement(3);
        assertEquals("Hel", sentence.getIncrementalSentence());
        assertEquals("Hello", sentence.getIncrementalSentence());
        
        // Test to get all the sentence at once
        sentence.setCharAmountShown(0);
        sentence.setCharAmountIncrement(20);
        assertEquals("Hello", sentence.getIncrementalSentence());
    }

}
