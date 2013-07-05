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
     * List of dynamic properties of an AbstractXMLObject. These are not the declared
     * members of a class, they are dynamic properties of an object that can be
     * added at runtime.
     **/
    private List<Property> properties;
    /**
     * List of modified members of an AbstractXMLObject. An attribute is a declared
     * member of a class which is part of the object at compile time.
     **/
    private final List<String> modifiedAttributes = new ArrayList<String>();

    /**
     * Parses an xml string, constructs objects that match the provided tag and
     * adds them to a List of type T.
     * @param <T> is the template for the class type.
     * @param objectList a List of objects that extend AbstractXMLObject.
     * @param object the Class of object which will be instantiated and added to
     *            the List.
     * @param xmlString the XML data
     */
    public final <T extends AbstractXMLObject> void fillListFromXML(List<T> objectList,
            Class<T> object, String xmlString) {

        String tagName = object.getSimpleName();
        String token = "";
        String startTag = "<" + tagName;
        String endTag = "</" + tagName + ">";
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
                    e.printStackTrace();
                }
            }

            startIndex = xmlString.indexOf('<', endIndex); // move forward to finding next tag
            endIndex = xmlString.indexOf('>', ++endIndex); // find end of tag
        }
        modifiedAttributes.clear();
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

        int startIndex = 0;
        int endIndex = 0;

        StringBuilder sb = new StringBuilder(" ");
        sb.append(param).append("=\"");

        String tag = sb.toString();

        int i = xmlString.indexOf(tag);

        if (i < 0) {
            throw new XMLTagNotFoundException("Cannot find tag: " + tag);
        }

        startIndex = xmlString.indexOf(tag, 0) + tag.length();
        endIndex = xmlString.indexOf('"', startIndex);

        return xmlString.substring(startIndex, endIndex);
    }

    /**
     * 
     * @param xmlString
     * @param param
     * @return
     * @throws XMLTagNotFoundException
     */
    public static List<String> getValuesFromParam(String xmlString, String param)
            throws XMLTagNotFoundException {

        String value = getValueFromParam(xmlString, param);
        List<String> values = StringUtils.tokenize(value, ",");
        return values;
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
    public static final boolean compareNumerical(final double firstValue,
            final Operator operator, final double secondValue) {

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
    public static final boolean compare(final Object firstValue,
            final Operator operator, final Object secondValue) {

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
    public final boolean isAttributeModified(final String attributeName) {

        if (modifiedAttributes.contains(attributeName)) {
            return true;
        }
        return false;
    }

    /**
     * 
     * @param name
     * @param operatorType
     * @param comparisonValue
     * @return true if the value of the attribute referred by attributeName
     *         compares with the comparisonValue, using the operatorType
     */
    public final boolean compareProperty(String name, String operatorType,
            String comparisonValue) {

        // for (Pro)
        int i = 0; //TODO Implement this

        return false;

    }

    public final void modifyProperty(String propertyName, String propertyValue,
            Operator operator) {

        for (Property property : properties) {
            if (property.getName().equals(propertyName)) {
                if (operator == null) {
                    property.setValue(propertyValue);
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
     * @param attributeValue
     */
    public abstract void modifyAttribute(String attributeName,
            String attributeValue);

    /**
     * 
     * @param attributeName
     * @return
     */
    public abstract String getAttribute(String attributeName);

    /**
     * 
     * @param attributeName
     * @param attributeValue
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
     * @return id
     */
    public final long getId() {
        return id;
    }

    /**
     * @param id
     */
    public final void setId(long id) {
        this.id = id;
    }

    /**
     * @return xmlData
     */
    public final String getXmlData() {
        return xmlData;
    }

    /**
     * @param xMLData
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
     * @param properties
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