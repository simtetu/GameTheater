package com.yohostudios.theater;

import java.util.ArrayList;
import java.util.List;

import com.yohostudios.theater.exception.XMLParsingException;
import com.yohostudios.theater.exception.XMLTagNotFoundException;
import com.yohostudios.theater.play.Property;
import com.yohostudios.theater.util.Operator;
import com.yohostudios.theater.util.StringUtils;

/**
 * The base class for all types of objects constructed from XML.
 * @author simon
 */

public abstract class AbstractXMLObject {

    /** A unique AbstractXMLObject identifier. */
    private long id;
    /** The XML data used that describes the AbstractXMLObject. **/
    private String xmlData;
    /**
     * List of dynamic properties of an AbstractXMLObject. These are not the
     * declared members of a class, they are dynamic properties of an object
     * that can be added at runtime.
     **/
    private List<Property> properties;
    /**
     * List of modified members of an AbstractXMLObject. An attribute is a
     * declared member of a class which is part of the object at compile time.
     **/
    private final transient List<String> modifiedAttributes = new ArrayList<String>();
   
    /**
     * Parses an xml string, constructs objects that match the provided tag and
     * returns them as a List of type T.
     * @param <T> is the template for the class type.
     * @param object the Class of object which will be instantiated and added to
     *            the List.
     * @param xmlString the XML data
     * @return a list of objects of type T.
     */
    public final <T extends AbstractXMLObject> List<T> getObjectListFromXML(
            Class<T> object, String xmlString) {

        List<T> objectList = new ArrayList<T>(); 
        
        String tagName = object.getSimpleName();
        String startTag = "<" + tagName;
        String endTag = "</" + tagName + ">";

        String token;
        int startIndex = xmlString.indexOf('<', 0);
        int endIndex = xmlString.indexOf('>', 0);

        // while there are tags to read
        while (true) {

            if (startIndex == -1) { // if there is no more tags to be read, exit
                break;
            }

            token = xmlString.substring(startIndex, endIndex); // read xml tag

            if (token.indexOf(startTag, 0) == 0) { // if we found a tag
                                                   // corresponding a tagName

                token = xmlString.substring(startIndex,
                        xmlString.indexOf(endTag, startIndex));

                try {

                    T extendsXMLObject = object.newInstance();
                    extendsXMLObject.initFromXML(token);
                    objectList.add(extendsXMLObject);

                } catch (Exception e) {
                    // TODO: use a logger
                    e.printStackTrace();
                }
            }

            startIndex = xmlString.indexOf('<', endIndex); // move forward to
                                                           // finding next tag
            endIndex = xmlString.indexOf('>', ++endIndex); // find end of tag
        }
        modifiedAttributes.clear();
        return objectList;
    }

    
    /**
     * Get the value for the param from the xmlString.
     * @param xmlString the XML string.
     * @param param the parameter to match.
     * @return the value of the matched param.
     * @throws XMLTagNotFoundException if the param is not found in the
     *             xmlString.
     */
    public static String getValueFromParam(String xmlString, String param)
            throws XMLTagNotFoundException {

        int startIndex;
        int endIndex;

        String tag = new StringBuilder(" ").append(param).append("=\"")
                .toString();

        if (xmlString.indexOf(tag) < 0) {
            throw new XMLTagNotFoundException("Cannot find tag: " + tag);
        }

        startIndex = xmlString.indexOf(tag, 0) + tag.length();
        endIndex = xmlString.indexOf('"', startIndex);

        return xmlString.substring(startIndex, endIndex);
    }

    /**
     * Returns a list of values associated to a parameter of an XML string. Ex:
     * getValuesFromParam("<Actor childs=\"Alice,Bob,Charles\">", "childs")
     * would return a List containing "Alice", "Bob" and "Charles".
     * 
     * @param xmlString the XML string.
     * @param param the param to get the values from.
     * @return a list of strings.
     * @throws XMLTagNotFoundException if param cannot be found.
     */
    public static List<String> getValuesFromParam(String xmlString, String param)
            throws XMLTagNotFoundException {

        String value = getValueFromParam(xmlString, param);
        return StringUtils.tokenize(value, ",");
    }

    /**
     * Compares two numerical values together with the specified operator.
     * Supported operators strings are: "eq" for equals, "lt" for lower, "gt"
     * for greater, "lteq" for lower than or equals, "gteq" for greater than or
     * equals.
     * 
     * @param firstValue the first value.
     * @param operator the comparison operator.
     * @param secondValue the second value.
     * @return true if the comparison is numerically true, otherwise false.
     */
    public static final boolean compareNumerical(double firstValue,
            Operator operator, double secondValue) {

        if ((operator.equals(Operator.EQUALS) && firstValue == secondValue)
                || (operator.equals(Operator.LOWER_THAN_OR_EQUALS) && firstValue <= secondValue)
                || (operator.equals(Operator.GREATER_THAN_OR_EQUALS) && firstValue >= secondValue)
                || (operator.equals(Operator.GREATER_THAN) && firstValue > secondValue)
                || (operator.equals(Operator.LOWER_THAN) && firstValue < secondValue)) {
            return true;
        }

        return false;
    }

    /**
     * Compares the first value against the second value using the specified
     * operator. If values only contain digits they will be compared
     * numerically, otherwise they will be compared lexicographically, similarly
     * to the compareTo method of the String class.
     * @param firstValue the first value.
     * @param operator the comparison operator.
     * @param secondValue the second value.
     * @return true if the comparison is numerically true, otherwise false.
     */
    public static final boolean compare(Object firstValue, Operator operator,
            Object secondValue) {

        // if we're dealing with strings that are not numeric, use
        // String.compareTo.
        if (firstValue instanceof String && secondValue instanceof String
                && !StringUtils.isNumeric((String) firstValue)
                && !StringUtils.isNumeric((String) secondValue)) {

            String firstString = (String) firstValue;
            String secondString = (String) secondValue;

            if ((operator.equals(Operator.EQUALS) && firstString
                    .compareTo(secondString) == 0)
                    || (operator.equals(Operator.LOWER_THAN_OR_EQUALS) && firstString
                            .compareTo(secondString) <= 0)
                    || (operator.equals(Operator.GREATER_THAN_OR_EQUALS) && firstString
                            .compareTo(secondString) >= 0)
                    || (operator.equals(Operator.GREATER_THAN) && firstString
                            .compareTo(secondString) > 0)
                    || (operator.equals(Operator.LOWER_THAN) && firstString
                            .compareTo(secondString) < 0)) {
                return true;
            }

        } else { // if we are dealing with numerical values, compare
                 // numerically.
            try {
                double firstInt = Double.valueOf(firstValue.toString());
                double secondInt = Double.valueOf(secondValue.toString());
                return compareNumerical(firstInt, operator, secondInt);
            } catch (NumberFormatException nfe) {
                // TODO log error
                throw nfe;
            }
        }
        return false;
    }

    /**
     * @param attributeName the name of the attribute to evaluate.
     * @return true if the attribute is modified, otherwise false.
     */
    public final boolean isAttributeModified(String attributeName) {

        if (modifiedAttributes.contains(attributeName)) {
            return true;
        }
        return false;
    }

    /*
     * @param name the string name of the Property
     * 
     * @param operatorType the operator type of the Property
     * 
     * @param comparisonValue the comparison value of the Property
     * 
     * @return true if the value of the attribute referred by attributeName
     * compares with the comparisonValue, using the operatorType
     * 
     * public final boolean compareProperty(String name, String operatorType,
     * String comparisonValue) {
     * 
     * // TODO Implement this
     * 
     * return false;
     * 
     * }
     */

    /**
     * Searches for a Property by "propertyName" in AbstractXMLObject's
     * properties and if found, assigns it an "attributeValue".
     * @param name the key of the Property to look for in the list of
     *            properties.
     * @param value modifies the current value of the Property.
     * @param operator determines how the value modifies the current value of
     *            the Property.
     */
    public final void modifyProperty(String name, String value,
            Operator operator) {

        for (Property property : properties) {
            if (property.getName().equals(name)) {
                if (operator == null) {
                    property.setValue(value);
                } else if (operator.equals(Operator.ADD_ASSIGN)) {
                    // TODO add assignment
                } else if (operator.equals(Operator.SUB_ASSIGN)) {
                    // TODO sub assignment
                }
            }
        }
    }

    /**
     * Find object of type T with the specified if from the specified list.
     * @param objects the list of objects of type T
     * @param id the id of the object we want to find in the list.
     * @param <T> any AbstractXMLObject.
     * @return the object if any found, otherwise null.
     */
    public final <T extends AbstractXMLObject> T findXMLObjectById(
            final List<T> objects, final long id) {
        for (T object : objects) {
            if (object.getId() == id) {
                return object;
            }
        }
        return null;
    }

    // ////////////////////////////////////////////////////////////////////////
    // Abstract methods.
    // ////////////////////////////////////////////////////////////////////////

    /**
     * 
     * @param xmlString the XML used to build an object.
     * @throws XMLParsingException if the XML cannot be parsed correctly.
     */
    public abstract void initFromXML(String xmlString)
            throws XMLParsingException;

    /**
     * 
     * @param attributeName the class attribute name
     * @param attributeValue the class attribute value
     */
    public abstract void modifyAttribute(String attributeName,
            String attributeValue);

    /**
     * 
     * @param attributeName the class attribute name
     * @return the class attribute name
     */
    public abstract String getAttribute(String attributeName);

    /**
     * 
     * @param attributeName the class attribute name
     * @param attributeValue the class attribute value
     */
    public abstract void callMethod(String attributeName, String attributeValue);

    /**
	 * 
	 */
    public abstract void freeResources();

    // ////////////////////////////////////////////////////////////////////////
    // Getters and setters.
    // ////////////////////////////////////////////////////////////////////////

    /**
     * @return access values identifier
     */
    public final long getId() {
        return id;
    }

    /**
     * @param id taint or change identifier
     */
    public final void setId(long id) {
        this.id = id;
    }

    /**
     * @return xmlData access value Xml Data
     */
    public final String getXmlData() {
        return xmlData;
    }

    /**
     * @param xmlData taint or change Xml Data.
     */
    public final void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    /**
     * @return properties
     */
    public final List<Property> getProperties() {
        return properties;
    }

    /**
     * @param properties a list of properties
     */
    public final void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    /**
     * @return modifiedAttributes
     */
    public final List<String> getModifiedAttributes() {
        return modifiedAttributes;
    }

}
