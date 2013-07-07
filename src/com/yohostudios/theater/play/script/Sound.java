package com.yohostudios.theater.play.script;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLParsingException;

/**
 * @author simon
 * 
 */
public class Sound extends AbstractXMLObject {

    /** Volume of Sound */
    private float volume;
    /** Pitch of Sound */
    private float pitch;
    /** Resource Id of Sound */
    private int resourceId;
    /** identify whether the sound will be in loop or not */
    private boolean looping;

    /**
     * @param resourceId the Resource Id of the Sound
     * @return true if the sound was loaded, otherwise false.
     */
    public boolean load(int resourceId) {
        // TODO implement this
        return false;
    }

    /**
     * @return true if the sound is played successfully, otherwise false.
     */
    boolean play() {
        // TODO implement this
        return false;
    }

    /**
     * @return true if the sound is stopped successfully, otherwise false.
     */
    boolean stop() {
        // TODO implement this
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
        setVolume(Float.parseFloat(getValueFromParam(xmlString, "volume")));
        setPitch(Float.parseFloat(getValueFromParam(xmlString, "pitch")));
        setResourceId(Integer.parseInt(getValueFromParam(xmlString,
                "resourceId")));
        setLooping(Boolean
                .parseBoolean(getValueFromParam(xmlString, "looping")));

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
     * @return access values Volume of the Sound
     */
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume taint or change Volume of the Sound
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * @return access values Pitch
     */
    public float getPitch() {
        return pitch;
    }

    /**
     * @param pitch taint or change Pitch
     */
    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    /**
     * @return access values If the Sound is Looping
     */
    public boolean isLooping() {
        return looping;
    }

    /**
     * @param looping taint or change If the Sound is Looping
     */
    public void setLooping(boolean looping) {
        this.looping = looping;
    }

    /**
     * @return access values Resource Id
     */
    public int getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId taint or change Resource Id
     */
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

}
