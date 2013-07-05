package com.yohostudios.theater.play;

import com.yohostudios.theater.AbstractXMLObject;

/**
 * @author simon
 * 
 */
public class Property extends AbstractXMLObject {

    /** */
    private String name;
    /** */
    private String value;

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
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
