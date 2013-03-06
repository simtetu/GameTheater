package com.yohostudios.theater.play.script;

import java.util.List;

import com.yohostudios.theater.XMLObject;

/**
 * @author simon
 * 
 */
public class Dialogue extends XMLObject {

    /** sentences associated with a dialogue. */
    private List<Sentence> sentences; 
    /** */
    private long nextDialogueId;
    /** */
    private int spokenTime;

    /**
     * @return
     */
    public boolean hasSentences() {
        return (sentences.size() > 0) ? true : false;
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
    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * @param sentences
     */
    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    /**
     * @return
     */
    public long getNextDialogueId() {
        return nextDialogueId;
    }

    /**
     * @param nextDialogueId
     */
    public void setNextDialogueId(long nextDialogueId) {
        this.nextDialogueId = nextDialogueId;
    }

    /**
     * @return
     */
    public int getSpokenTime() {
        return spokenTime;
    }

    /**
     * @param spokenTime
     */
    public void setSpokenTime(int spokenTime) {
        this.spokenTime = spokenTime;
    }

}
