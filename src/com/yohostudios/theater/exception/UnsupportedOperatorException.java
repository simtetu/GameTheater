package com.yohostudios.theater.exception;

/**
 * @author simon
 *
 */
public class UnsupportedOperatorException extends XMLParsingException {

    /**
     * 
     */
    private static final long serialVersionUID = 8480641269128403606L;

    /**
     * @param string Return String Exception found
     */
    public UnsupportedOperatorException(String string) {
        super(string);
    }

}
