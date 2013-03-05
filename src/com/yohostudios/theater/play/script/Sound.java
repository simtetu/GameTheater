package com.yohostudios.theater.play.script;

import com.yohostudios.theater.XMLObject;

/**
 * @author simon
 * 
 */
public class Sound extends XMLObject {

    private float volume;
    private float pitch;
    private int resourceId;
    private boolean looping;

    /**
     * @param resourceId
     * @return
     */
    public boolean load(int resourceId) {
        // TODO implement this
        return false;
    }

    /**
     * @return
     */
    boolean play() {
        // TODO implement this
        return false;
    }

    /**
     * @return
     */
    boolean stop() {
        // TODO implement this
        return false;
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
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }

    /**
     * @return
     */
    public float getPitch() {
        return pitch;
    }

    /**
     * @param pitch
     */
    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    /**
     * @return
     */
    public boolean isLooping() {
        return looping;
    }

    /**
     * @param looping
     */
    public void setLooping(boolean looping) {
        this.looping = looping;
    }

    /**
     * @return
     */
    public int getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId
     */
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

}
