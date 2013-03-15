package com.yohostudios.theater.play;

import java.util.ArrayList;
import java.util.List;

import com.yohostudios.theater.XMLObject;
import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class Action extends XMLObject {

    /** */
    private List<String> types;
    /** ID of XMLObject targeted. */
    private List<String> targetObjectIds;
    /** Type of XMLObject targeted. */
    private List<String> targetObjectTypes;
    /** */
    private List<String> paramNames;
    /** */
    private List<String> paramValues;
    /** */
    private List<Operator> paramOperators;
    /** */
    private List<Condition> conditions;

    /**
     * 
     * @return true is the action has conditions, otherwise false.
     */
    public final boolean hasConditions() {

        if (conditions != null && !conditions.isEmpty()) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws XMLParsingException {

        conditions = new ArrayList<Condition>();
        fillListFromXML(conditions, Condition.class, xmlString);

        setId(Long.parseLong(getValueFromParam(xmlString, "id")));

        setTypes(getValuesFromParam(xmlString, "type"));
        setParamNames(getValuesFromParam(xmlString, "paramName"));
        setParamValues(getValuesFromParam(xmlString, "paramValue"));

        List<String> operatorValues = getValuesFromParam(xmlString,
                "paramOperator");

        setParamOperators(Operator.getOperators(operatorValues));

        setTargetObjectIds(getValuesFromParam(xmlString, "targetObjectId"));
        setTargetObjectTypes(getValuesFromParam(xmlString, "targetObjectType"));

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#modifyAttribute(java.lang.String,
     * java.lang.String)
     */
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
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * @param conditions
     */
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    /**
     * @return
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * @param types
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * @return
     */
    public List<String> getTargetObjectIds() {
        return targetObjectIds;
    }

    /**
     * @param targetObjectIds
     */
    public void setTargetObjectIds(List<String> targetObjectIds) {
        this.targetObjectIds = targetObjectIds;
    }

    /**
     * @return
     */
    public List<String> getTargetObjectTypes() {
        return targetObjectTypes;
    }

    /**
     * @param targetObjectTypes
     */
    public void setTargetObjectTypes(List<String> targetObjectTypes) {
        this.targetObjectTypes = targetObjectTypes;
    }

    /**
     * @return
     */
    public List<String> getParamNames() {
        return paramNames;
    }

    /**
     * @param paramNames
     */
    public void setParamNames(List<String> paramNames) {
        this.paramNames = paramNames;
    }

    /**
     * @return
     */
    public List<String> getParamValues() {
        return paramValues;
    }

    /**
     * @param paramValues
     */
    public void setParamValues(List<String> paramValues) {
        this.paramValues = paramValues;
    }

    /**
     * @return
     */
    public List<Operator> getParamOperators() {
        return paramOperators;
    }

    /**
     * @param paramOperators
     */
    public void setParamOperators(List<Operator> paramOperators) {
        this.paramOperators = paramOperators;
    }

}
