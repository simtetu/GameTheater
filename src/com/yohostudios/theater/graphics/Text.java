package com.yohostudios.theater.graphics;

import com.yohostudios.theater.AbstractXMLObject;
import com.yohostudios.theater.exception.XMLTagNotFoundException;

/**
 * @author simon
 * 
 */
public class Text extends AbstractXMLObject {

    /** The Font Resource Id */
    private long fontResourceId;
    /** The position X of the object */
    private int x;
    /** The position Y of the object */
    private int y;
    /** The Font Frames */
    private int fontFrames;
    /** The Font Resource Width */
    private int fontResourceWidth;
    /** The Font Resource Height */
    private int fontResourceHeight;
    /** The Format of the object */
    private String format;
    /** The current Text of the history */
    private String content;
    /** The Font for the Text */
    private Font font;

    /**
     * to render your own custom graphics onto a canvas or to modify existing
     * Views to customize their look and feel
     */
    public void render() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.yohostudios.theater.AbstractXMLObject#initFromXML(java.lang.String)
     */
    @Override
    public void initFromXML(String xmlString) throws NumberFormatException,
            XMLTagNotFoundException {

        setId(Integer.parseInt(getValueFromParam(xmlString, "id")));
        setFontResourceId(Long.parseLong(getValueFromParam(xmlString,
                "fontResourceId")));
        setX(Integer.parseInt(getValueFromParam(xmlString, "x")));
        setY(Integer.parseInt(getValueFromParam(xmlString, "y")));
        setFontFrames(Integer.parseInt(getValueFromParam(xmlString,
                "fontFrames")));
        setFontResourceWidth(Integer.parseInt(getValueFromParam(xmlString,
                "fontResourceWidth")));
        setFontResourceHeight(Integer.parseInt(getValueFromParam(xmlString,
                "fontResourceHeight")));
        setFormat(getValueFromParam(xmlString, "format"));
        setContent(getValueFromParam(xmlString, "content"));

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
     * @return access values Font Resource Id
     */
    public long getFontResourceId() {
        return fontResourceId;
    }

    /**
     * @param fontResourceId taint or change Resource Id
     */
    public void setFontResourceId(long fontResourceId) {
        this.fontResourceId = fontResourceId;
    }

    /**
     * @return access values position X
     */
    public int getX() {
        return x;
    }

    /**
     * @param x taint or change position X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return access values position Y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y taint or change position Y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return access values Font Frames
     */
    public int getFontFrames() {
        return fontFrames;
    }

    /**
     * @param fontFrames taint or change Font Frames
     */
    public void setFontFrames(int fontFrames) {
        this.fontFrames = fontFrames;
    }

    /**
     * @return access values Font Resource Width
     */
    public int getFontResourceWidth() {
        return fontResourceWidth;
    }

    /**
     * @param fontResourceWidth taint or change Font Resource Width
     */
    public void setFontResourceWidth(int fontResourceWidth) {
        this.fontResourceWidth = fontResourceWidth;
    }

    /**
     * @return access values Font Resource Height
     */
    public int getFontResourceHeight() {
        return fontResourceHeight;
    }

    /**
     * @param fontResourceHeight taint or change Font Resource Height
     */
    public void setFontResourceHeight(int fontResourceHeight) {
        this.fontResourceHeight = fontResourceHeight;
    }

    /**
     * @return access values Format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format taint or change Format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return access values Text
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content taint or change Text
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return access values Font
     */
    public Font getFont() {
        return font;
    }

    /**
     * @param font taint or change Font
     */
    public void setFont(Font font) {
        this.font = font;
    }

}
