package com.yohostudios.theater.play.script;

import java.util.ArrayList;
import java.util.List;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;

/**
 * @author simon
 * 
 */
public class Dialogue extends AbstractXMLObject {

    /** sentences associated with a dialogue. */
    private List<Sentence> sentences;
    /** */
    private long nextDialogueId;
    /** */
    private int spokenTime;

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws XMLParsingException {
        
        setId(Long.parseLong(getValueFromParam(xmlString, "id")));
        setNextDialogueId(Long.parseLong(getValueFromParam(xmlString, "nextDialogueId")));
        setSpokenTime(Integer.parseInt(getValueFromParam(xmlString, "spokenTime")));
        sentences = new ArrayList<Sentence>();
        fillListFromXML(sentences, Sentence.class, xmlString);

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
