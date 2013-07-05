package com.yohostudios.theater.play;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class Condition extends AbstractXMLObject {

    /** ID of AbstractXMLObject targeted.*/
    private String targetObjectId;
    /** Type of AbstractXMLObject targeted. */
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
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
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
     * @return access values Target Object Id
     */
    public String getTargetObjectId() {
        return targetObjectId;
    }

    /**
     * @param targetObjectId taint or change Target Object Id
     */
    public void setTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
    }

    /**
     * @return access values Target Object Type
     */
    public String getTargetObjectType() {
        return targetObjectType;
    }

    /**
     * @param targetObjectType taint or change Target Object Type
     */
    public void setTargetObjectType(String targetObjectType) {
        this.targetObjectType = targetObjectType;
    }

    /**
     * @return access values Param Name
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @param paramName taint or change Param Name
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * @return access values Param Operator
     */
    public Operator getParamOperator() {
        return paramOperator;
    }

    /**
     * @param paramOperator taint or change Param Operator
     */
    public void setParamOperator(Operator paramOperator) {
        this.paramOperator = paramOperator;
    }

    /**
     * @return access values Param Value
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue taint or change Param Value
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

}
