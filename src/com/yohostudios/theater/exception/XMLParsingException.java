package com.yohostudios.theater.exception;

/**
 * @author simon
 *
 */
public class XMLParsingException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -6558675862877558157L;
    
    /**
     * @param string  Return String Exception found
     */
    public XMLParsingException(String string) {
        super(string);
    }

}
