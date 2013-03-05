package com.yohostudios.theater.play;

import com.yohostudios.theater.XMLObject;
import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class Condition extends XMLObject {

    private String targetObjectId;
    private String targetObjectType;
    /** name of the attribute to compare. */
    private String paramName;
    /** comparison operator (ie: ==,<=,>=). */
    private Operator paramOperator;
    /** value of the attribute to compare. */
    private String paramValue;

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#initFromXML(java.lang.String)
     */
    @Override
    public final void initFromXML(String xmlString) throws XMLParsingException {

        setId(Long.parseLong(getValueFromParam(xmlString, "id")));
        setParamName(getValueFromParam(xmlString, "paramName"));
        setParamValue(getValueFromParam(xmlString, "paramValue"));
        setParamOperator(Operator.getOperator(getValueFromParam(xmlString,
                "paramOperator")));
        setTargetObjectId(getValueFromParam(xmlString, "targetObjectId"));
        setTargetObjectType(getValueFromParam(xmlString, "targetObjectType"));

    }

    @Override
    public void modifyAttribute(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#getAttribute(java.lang.String)
     */
    @Override
    public String getAttribute(String attributeName) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#callMethod(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void callMethod(String attributeName, String attributeValue) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#freeResources()
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
    public String getTargetObjectId() {
        return targetObjectId;
    }

    /**
     * @param targetObjectId
     */
    public void setTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
    }

    /**
     * @return
     */
    public String getTargetObjectType() {
        return targetObjectType;
    }

    /**
     * @param targetObjectType
     */
    public void setTargetObjectType(String targetObjectType) {
        this.targetObjectType = targetObjectType;
    }

    /**
     * @return
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @param paramName
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * @return
     */
    public Operator getParamOperator() {
        return paramOperator;
    }

    /**
     * @param paramOperator
     */
    public void setParamOperator(Operator paramOperator) {
        this.paramOperator = paramOperator;
    }

    /**
     * @return
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

}
