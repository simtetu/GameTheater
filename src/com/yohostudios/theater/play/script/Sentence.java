package com.yohostudios.theater.play.script;

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
    private int totalChars;
    /** */
    private int amountShown;
    /** */
    private int delay;
    /** */
    private int counter;

    /**
     * @return
     */
    public boolean completelyShown() {
        // is sentence completed?
        return (totalChars == amountShown) ? true : false;
    }

    /**
     * @return
     */
    public String getIncrementalSentence() {
        if (amountShown < totalChars)
            amountShown++;

        return new String(this.sentence.substring(0, amountShown));

    }

    /**
     * @param str
     */
    void initString(String str) {
        this.sentence = str;
        totalChars = (int) str.length();
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
     * @return
     */
    public int getTotalChars() {
        return totalChars;
    }

    /**
     * @param totalChars
     */
    public void setTotalChars(int totalChars) {
        this.totalChars = totalChars;
    }

    /**
     * @return
     */
    public int getAmountShown() {
        return amountShown;
    }

    /**
     * @param amountShown
     */
    public void setAmountShown(int amountShown) {
        this.amountShown = amountShown;
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

    /**
     * @return
     */
    public int getCounter() {
        return counter;
    }

    /**
     * @param counter
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

}
