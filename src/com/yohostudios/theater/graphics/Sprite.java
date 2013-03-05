package com.yohostudios.theater.graphics;

import java.util.List;

import android.graphics.Color;
import android.graphics.Rect;

import com.yohostudios.theater.XMLObject;
import com.yohostudios.theater.fx.EffectFilter;

/**
 * @author simon
 * 
 */
public class Sprite extends XMLObject {

    /** width of the frame. */
    private int width;
    /** height of the frame. */
    private int height;
    /** transparency of the sprite (0 = transparent, 255 = opaque). */
    private int alpha;
    /** amount of frames in animation. */
    private int frames;
    /** resource Id number associated with texture. */
    private int resourceId;
    /** Table Sequence animation. */
    private int[] animSequence;
    /** List Effect Filter. */
    private List<EffectFilter> effectFilters;

    /**
     * Modified the Texture of the Frame.
     * @param resourceId resource Id number associated with texture.
     * @param width width of the frame.
     * @param height height of the frame.
     * @param frames amount of frames in animation.
     * @return True or False
     */
    public boolean setTexture(int resourceId, int width, int height, int frames) {
        // TODO implement this
        return false;
    }

    /**
     * @return transparency of the sprite.
     */
    public int nextAlpha() {
        // TODO implement this
        return -1;
    }

    /**
     * @param destRect Destination Rectangle.
     * @param color Color
     */
    public void fillRectangle(Rect destRect, Color color) {
        // TODO implement this
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
     * @return width of the frame.
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width Modified width of the frame.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return height of the frame.
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height Modified height of the frame.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return transparency of the sprite.
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * @param alpha Modified transparency of the sprite
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
     * @return amount of frames in animation.
     */
    public int getFrames() {
        return frames;
    }

    /**
     * @param frames Modified amount of frames in animation.
     */
    public void setFrames(int frames) {
        this.frames = frames;
    }

    /**
     * @return resource Id number associated with texture.
     */
    public int getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId Modified resource Id number associated with texture.
     */
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return Table Sequence animation.
     */
    public int[] getAnimSequence() {
        return animSequence;
    }

    /**
     * @param animSequence Modified Table Sequence animation.
     */
    public void setAnimSequence(int[] animSequence) {
        this.animSequence = animSequence;
    }

    /**
     * @return List Effect Filter.
     */
    public List<EffectFilter> getEffectFilters() {
        return effectFilters;
    }

    /**
     * @param effectFilters Modified List Effect Filter.
     */
    public void setEffectFilters(List<EffectFilter> effectFilters) {
        this.effectFilters = effectFilters;
    }

}
