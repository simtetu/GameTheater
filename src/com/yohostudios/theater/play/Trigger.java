package com.yohostudios.theater.play;

import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.util.Timer;

/**
 * @author simon
 * 
 */
public class Trigger extends AbstractXMLObject {

    /** */
    private String type;
    /** */
    private String params;
    /** */
    private List<Action> actions;
    /** */
    private Timer timer;

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#modifyAttribute(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void modifyAttribute(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#getAttribute(java.lang.String)
     */
    @Override
    public String getAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#callMethod(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void callMethod(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#freeResources()
     */
    @Override
    public void freeResources() {
        // TODO Auto-generated method stub

    }

    // ////////////////////////////////////////////////////////////////////////
    // Getters and setters.
    // ////////////////////////////////////////////////////////////////////////

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public String getParams() {
        return params;
    }

    /**
     * @param params
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * @return
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * @param actions
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * @return
     */
    public Timer getTimer() {
        return timer;
    }

    /**
     * @param timer
     */
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}
