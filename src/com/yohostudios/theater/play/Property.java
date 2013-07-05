package com.yohostudios.theater.play;

import com.yohostudios.theater.AbstractXMLObject;

/**
 * @author simon
 * 
 */
public class Property extends AbstractXMLObject {

    /** ID of Property*/
    private String name;
    /** Value of Property*/
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
     * @return access values Name of Property
     */
    public String getName() {
        return name;
    }

    /**
     * @param name taint or change Name of Property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return access values Value of Property
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value taint or change Value of Property
     */
    public void setValue(String value) {
        this.value = value;
    }

}
