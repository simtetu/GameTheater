package com.yohostudios.theater.play;

import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.util.Timer;

/**
 * @author simon
 * 
 */
public class Trigger extends AbstractXMLObject {

    /** Type of Trigger*/
    private String type;
    /** params of Trigger*/
    private String params;
    /** List Actions of Trigger*/
    private List<Action> actions;
    /** Timer of Trigger*/
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
     * @return access values Type of Trigger
     */
    public String getType() {
        return type;
    }

    /**
     * @param type taint or change Type of Trigger
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return access values Params of Trigger
     */
    public String getParams() {
        return params;
    }

    /**
     * @param params taint or change Params of Trigger
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * @return access values List Actions of Trigger
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * @param actions taint or change List Actions of Trigger
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * @return access values Timer of Trigger
     */
    public Timer getTimer() {
        return timer;
    }

    /**
     * @param timer taint or change Timer of Trigger
     */
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}
