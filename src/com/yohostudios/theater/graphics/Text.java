package com.yohostudios.theater.graphics;

import com.yohostudios.theater.AbstractXMLObject;

/**
 * @author simon
 * 
 */
public class Text extends AbstractXMLObject {

    /** */
    private long fontResourceId;
    /** */
    private int x;
    /** */
    private int y;
    /** */
    private int fontFrames;
    /** */
    private int fontResourceWidth;
    /** */
    private int fontResourceHeight;
    /** */
    private String format;
    /** */
    private String text;
    /** */
    private Font font;

    /**
	 * 
	 */
    public void render() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) {
        // TODO Auto-generated method stub

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
    public long getFontResourceId() {
        return fontResourceId;
    }

    /**
     * @param fontResourceId
     */
    public void setFontResourceId(long fontResourceId) {
        this.fontResourceId = fontResourceId;
    }

    /**
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return
     */
    public int getFontFrames() {
        return fontFrames;
    }

    /**
     * @param fontFrames
     */
    public void setFontFrames(int fontFrames) {
        this.fontFrames = fontFrames;
    }

    /**
     * @return
     */
    public int getFontResourceWidth() {
        return fontResourceWidth;
    }

    /**
     * @param fontResourceWidth
     */
    public void setFontResourceWidth(int fontResourceWidth) {
        this.fontResourceWidth = fontResourceWidth;
    }

    /**
     * @return
     */
    public int getFontResourceHeight() {
        return fontResourceHeight;
    }

    /**
     * @param fontResourceHeight
     */
    public void setFontResourceHeight(int fontResourceHeight) {
        this.fontResourceHeight = fontResourceHeight;
    }

    /**
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return
     */
    public Font getFont() {
        return font;
    }

    /**
     * @param font
     */
    public void setFont(Font font) {
        this.font = font;
    }

}
