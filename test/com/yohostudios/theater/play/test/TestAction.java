/**
 * 
 */
package com.yohostudios.theater.play.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.play.Action;
import com.yohostudios.theater.util.FileUtils;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class TestAction {

    private Action action;
    private String xmlString;

    /**
     * @throws java.lang.Exception
     * @throws Exception The String for the Exception
     */
    @Before
    public void setUp() throws Exception {
        action = new Action();
        xmlString = FileUtils.getFileContentAsString("test/data/TestAction.xml");
    }
    
    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Action#initFromXML(java.lang.String)}
     * .
     * @throws XMLParsingException if an error occurred while invoking initFromXML on an Action. 
     */
    @Test
    public final void testInitFromXML() throws XMLParsingException {

        action.initFromXML(xmlString);
        assertEquals(1L, action.getId());

        List<String> types = action.getTypes();
        assertTrue(types.get(0).equals("modifyAttribute"));
        assertTrue(types.get(1).equals("modifyAttribute"));
        assertTrue(types.get(2).equals("changeRoom"));

        List<String> targetsIds = action.getTargetObjectIds();
        assertTrue(targetsIds.get(0).equals("3001"));
        assertTrue(targetsIds.get(1).equals("3001"));
        assertTrue(targetsIds.get(2).equals("2000"));

        List<String> targetsTypes = action.getTargetObjectTypes();
        assertTrue(targetsTypes.get(0).equals("Actor"));
        assertTrue(targetsTypes.get(1).equals("Actor"));
        assertTrue(targetsTypes.get(2).equals("Actor"));

        List<String> paramNames = action.getParamNames();
        assertTrue(paramNames.get(0).equals("currentFrame"));
        assertTrue(paramNames.get(1).equals("visible"));
        assertTrue(paramNames.get(2).equals("room"));

        List<Operator> paramOperators = action.getParamOperators();
        assertEquals(paramOperators.get(0), Operator.ADD_ASSIGN);
        assertEquals(paramOperators.get(1), Operator.ASSIGN);
        assertEquals(paramOperators.get(2), Operator.ASSIGN);

        List<String> paramValues = action.getParamValues();
        assertTrue(paramValues.get(0).equals("0"));
        assertTrue(paramValues.get(1).equals("true"));
        assertTrue(paramValues.get(2).equals("1005"));

    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Action#modifyAttribute(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testModifyAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Action#getAttribute(java.lang.String)}
     * .
     */
    @Test
    public final void testGetAttribute() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Action#callMethod(java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCallMethod() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Action#compareProperty(java.lang.String, java.lang.String, java.lang.String)}
     * .
     */
    @Test
    public final void testCompareValues() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for
     * {@link com.yohostudios.theater.play.Action#freeResources()}.
     */
    @Test
    public final void testFreeResources() {
        fail("Not yet implemented"); // TODO
    }

}
