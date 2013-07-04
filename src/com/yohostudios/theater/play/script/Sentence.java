package com.yohostudios.theater.play.script;

import java.util.concurrent.Semaphore;

import com.yohostudios.theater.XMLObject;

/**
 * Sentences are part of a Dialogue and can be printed on screen at any given
 * time.
 * 
 * @author simon
 * 
 */
public class Sentence extends XMLObject {

    /** */
    private String sentence;
    /** */
    private int charAmountShown;
    /** The default increment is 1 character at a time. */
    private int charAmountIncrement = 1;
    /** */
    private int delay;

    /**
     * @return true if the sentence has been fully printed, otherwise false.
     */
    public boolean completelyShown() {
        // is sentence completed?
        if (sentence.length() == charAmountShown) {
            return true;
        }
        return false;
    }

    /**
     * Returns incrementally more of the sentence each time the method is
     * called, up until the complete sentence is revealed.
     * @return the current portion of the sentence driven by the charAmountShown
     *         attribute of this class.
     */
    public String getIncrementalSentence() {

        if ((charAmountShown + charAmountIncrement) < sentence.length()) {
            charAmountShown += charAmountIncrement;
            return new String(this.sentence.substring(0, charAmountShown));
        }
        return this.sentence;

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.XMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) {
        // TODO Auto-generated method stub

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
    public String getSentence() {
        return sentence;
    }

    /**
     * @param sentence
     */
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    /**
     * @return charAmountShown
     */
    public int getCharAmountShown() {
        return charAmountShown;
    }

    /**
     * @param charAmountShown
     */
    public void setCharAmountShown(int charAmountShown) {
        this.charAmountShown = charAmountShown;
    }

    /**
     * @return
     */
    public int getDelay() {
        return delay;
    }

    /**
     * @param delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getCharAmountIncrement() {
        return charAmountIncrement;
    }

    public void setCharAmountIncrement(int charAmountIncrement) {
        this.charAmountIncrement = charAmountIncrement;
    }

}
