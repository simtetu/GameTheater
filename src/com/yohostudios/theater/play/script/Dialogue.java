package com.yohostudios.theater.play.script;

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
    /** Id of Dialogue*/
    private long nextDialogueId;
    /** Spoken Time of dialogue*/
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
        setSentences(getObjectListFromXML(Sentence.class, xmlString));

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
     * @return access values Sentences of Dialogue
     */
    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * @param sentences taint or change the Sentences of dialogue
     */
    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    /**
     * @return access values Next Dialogue Id
     */
    public long getNextDialogueId() {
        return nextDialogueId;
    }

    /**
     * @param nextDialogueId taint or change Next Dialogue Id
     */
    public void setNextDialogueId(long nextDialogueId) {
        this.nextDialogueId = nextDialogueId;
    }

    /**
     * @return access values Spoken Time of Dialogue
     */
    public int getSpokenTime() {
        return spokenTime;
    }

    /**
     * @param spokenTime taint or change Spoken Time of Dialogue
     */
    public void setSpokenTime(int spokenTime) {
        this.spokenTime = spokenTime;
    }

}
