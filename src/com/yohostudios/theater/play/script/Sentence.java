package com.yohostudios.theater.play.script;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;

/**
 * Sentences are part of a Dialogue and can be printed on screen at any given
 * time.
 * 
 * @author simon
 * 
 */
public class Sentence extends AbstractXMLObject {

    /** The content of the sentence*/
    private String content;
    /** The Amount Sentence Shown*/
    private int charAmountShown;
    /** The default increment is 1 character at a time. */
    private int charAmountIncrement = 1;
    /** Delay for the Sentence  Shown*/
    private int delay;

    /**
     * @return true if the sentence should be completely shown, otherwise false.
     */
    public boolean isCompletelyShown() {
        
        if (charAmountShown == content.length()) {
            return true;
        }
        return false;
    }

    /**
     * Returns incrementally more of the sentence each time the method is
     * called, up until the complete sentence is revealed.
     * @return the portion of the sentence to be shown so far.
     */
    public String getIncrementalSentence() {

        if ((charAmountShown + charAmountIncrement) < content.length()) {
            charAmountShown += charAmountIncrement;

        } else {
            charAmountShown = content.length();
        }

        return new String(this.content.substring(0, charAmountShown));

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws XMLParsingException {
        setId(Long.parseLong(getValueFromParam(xmlString, "id")));
        setContent(getValueFromParam(xmlString, "content"));

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
     * @return access values the Content.
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content taint or change Content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return access values Char Amount Shown
     */
    public int getCharAmountShown() {
        return charAmountShown;
    }

    /**
     * @param charAmountShown taint or change Char Amount Shown
     */
    public void setCharAmountShown(int charAmountShown) {
        this.charAmountShown = charAmountShown;
    }

    /**
     * @return access values Delay
     */
    public int getDelay() {
        return delay;
    }

    /**
     * @param delay taint or change Delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }

    /**
     * @return access values Char Amount Increment
     */
    public int getCharAmountIncrement() {
        return charAmountIncrement;
    }

    /**
     * @param charAmountIncrement taint or change Char Amount Increment
     */
    public void setCharAmountIncrement(int charAmountIncrement) {
        this.charAmountIncrement = charAmountIncrement;
    }

}
