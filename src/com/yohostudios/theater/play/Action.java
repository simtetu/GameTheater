package com.yohostudios.theater.play;

import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.util.Operator;

/**
 * @author simon
 * 
 */
public class Action extends AbstractXMLObject {

    /** */
    private List<String> types;
    /** ID of AbstractXMLObject targeted. */
    private List<String> targetObjectIds;
    /** Type of AbstractXMLObject targeted. */
    private List<String> targetObjectTypes;
    /** name of the attribute to compare. */
    private List<String> paramNames;
    /** values of the attribute to compare. */
    private List<String> paramValues;
    /** operators of the attribute to compare. */
    private List<Operator> paramOperators;
    /** List of conditionds of AbstractXMLObject */
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
     * @see
     * com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws XMLParsingException {

        setId(Long.parseLong(getValueFromParam(xmlString, "id")));

        setTypes(getValuesFromParam(xmlString, "type"));
        setParamNames(getValuesFromParam(xmlString, "paramName"));
        setParamValues(getValuesFromParam(xmlString, "paramValue"));

        List<String> operatorValues = getValuesFromParam(xmlString,
                "paramOperator");

        setParamOperators(Operator.getOperators(operatorValues));

        setTargetObjectIds(getValuesFromParam(xmlString, "targetObjectId"));
        setTargetObjectTypes(getValuesFromParam(xmlString, "targetObjectType"));
        setConditions(getObjectListFromXML(Condition.class, xmlString));
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
     * @return access values List of Conditions
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * @param conditions taint or change List of Conditions
     */
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    /**
     * @return access values List of Types
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * @param types taint or change List of Types
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * @return access values List of Target Object Ids
     */
    public List<String> getTargetObjectIds() {
        return targetObjectIds;
    }

    /**
     * @param targetObjectIds taint or change List Target Object Ids
     */
    public void setTargetObjectIds(List<String> targetObjectIds) {
        this.targetObjectIds = targetObjectIds;
    }

    /**
     * @return access values List of Target Object Types
     */
    public List<String> getTargetObjectTypes() {
        return targetObjectTypes;
    }

    /**
     * @param targetObjectTypes taint or change List Target Object Types
     */
    public void setTargetObjectTypes(List<String> targetObjectTypes) {
        this.targetObjectTypes = targetObjectTypes;
    }

    /**
     * @return access values List Param Names
     */
    public List<String> getParamNames() {
        return paramNames;
    }

    /**
     * @param paramNames taint or change List Param Names
     */
    public void setParamNames(List<String> paramNames) {
        this.paramNames = paramNames;
    }

    /**
     * @return access values List Param Values
     */
    public List<String> getParamValues() {
        return paramValues;
    }

    /**
     * @param paramValues taint or change List of Param Values
     */
    public void setParamValues(List<String> paramValues) {
        this.paramValues = paramValues;
    }

    /**
     * @return access values List Param Operators
     */
    public List<Operator> getParamOperators() {
        return paramOperators;
    }

    /**
     * @param paramOperators taint or change List of Param Operators
     */
    public void setParamOperators(List<Operator> paramOperators) {
        this.paramOperators = paramOperators;
    }

}
