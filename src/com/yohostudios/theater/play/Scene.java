package com.yohostudios.theater.play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.graphics.Canvas;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.util.FileUtils;

/**
 * A container for Actors represented on screen.
 * 
 * @author simon
 * 
 */
public class Scene extends AbstractXMLObject {

    /** */
    private List<Actor> actors;
    /** */
    private boolean visible;
    /** */
    private boolean fadingIn;
    /** */
    private boolean fadingOut;

    /**
     * Default constructor.
     */
    public Scene() {
    }

    /**
     * Constructs a Scene using XML data from a resource file.
     * 
     * @param resourceFileName the filename of the resource file.
     */
    public Scene(String resourceFileName) {
        setXmlData(FileUtils.getFileContentAsString(resourceFileName));
        actors = new ArrayList<Actor>();
        setId(1); // TODO implement
        actors = new ArrayList<Actor>();
        fillListFromXML(actors, Actor.class, getXmlData());
        
    }

    /**
     * Loads and parses an XML file to create a Scene.
     */
    private void loadScene(int sceneId) {

        initFromXML(getXmlData());      
        // TODO implement this
    }

    /**
     * Draws actors in the room.
     */
    public void draw(Canvas canvas) {
        // TODO implement this
    }

    /**
     * Sort actors by their Z coordinate (ascending or descending).
     * 
     * @param ascending is true, descending is false.
     */
    public void orderActorsFromZ(boolean ascending) {

        if (ascending) {
            Collections.sort(actors, Actor.getZComparator());
        } else {
            Collections.sort(actors,
                    Collections.reverseOrder(Actor.getZComparator()));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) {
        actors = new ArrayList<Actor>();
        fillListFromXML(actors, Actor.class, xmlString);
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
    public List<Actor> getActors() {
        return actors;
    }

    /**
     * @param actors
     */
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    /**
     * @return
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * @return
     */
    public boolean isFadingIn() {
        return fadingIn;
    }

    /**
     * @param fadingIn
     */
    public void setFadingIn(boolean fadingIn) {
        this.fadingIn = fadingIn;
    }

    /**
     * @return
     */
    public boolean isFadingOut() {
        return fadingOut;
    }

    /**
     * @param fadingOut
     */
    public void setFadingOut(boolean fadingOut) {
        this.fadingOut = fadingOut;
    }

}
