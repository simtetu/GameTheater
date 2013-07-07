package com.yohostudios.theater.play;

import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.util.Timer;

/**
 * Triggers actions, provided that the actions' conditions are all met.
 * @author simon
 * 
 */
public class ActionTrigger extends AbstractXMLObject {

    /** Type of ActionTrigger */
    private String type;
    /** params of ActionTrigger */
    private String params;
    /** List Actions of ActionTrigger */
    private List<Action> actions;
    /** Timer of ActionTrigger */
    private Timer timer;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws XMLParsingException {
        setId(Long.parseLong(getValueFromParam(xmlString, "id")));
        setType(getValueFromParam(xmlString, "type"));
        setParams(getValueFromParam(xmlString, "params"));

        setActions(getObjectListFromXML(Action.class, xmlString));

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#modifyAttribute(java.lang.String
     * , java.lang.String)
     */
    @Override
    public void modifyAttribute(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#getAttribute(java.lang.String)
     */
    @Override
    public String getAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#callMethod(java.lang.String,
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
     * @return access values Type of ActionTrigger
     */
    public String getType() {
        return type;
    }

    /**
     * @param type taint or change Type of ActionTrigger
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return access values Params of ActionTrigger
     */
    public String getParams() {
        return params;
    }

    /**
     * @param params taint or change Params of ActionTrigger
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * @return access values List Actions of ActionTrigger
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * @param actions taint or change List Actions of ActionTrigger
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * @return access values Timer of ActionTrigger
     */
    public Timer getTimer() {
        return timer;
    }

    /**
     * @param timer taint or change Timer of ActionTrigger
     */
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

}
