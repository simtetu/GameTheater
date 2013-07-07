/**
 * 
 */
package com.yohostudios.theater.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.Play;

/**
 * @author simon
 * 
 */
public class TestPlay {

    private Play play;

    /**
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        play = new Play("test/data/DeveloperPresentation.xml");
    }

    /**
     * Checks if a scene was loaded
     */
    @Test
    public final void testPlay() {
        assertEquals(play.getCurrentSceneId(), 1);
        assertEquals(play.getScenes().size(), 1);

    }

}
