package com.yohostudios.theater.exception;

/**
 * Exception thrown when a tag is not found in XML data.
 * @author simon
 *
 */
public class XMLTagNotFoundException extends XMLParsingException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6558675862877558157L;
	
	/**
	 * @param string Return String Exception found 
	 */
	public XMLTagNotFoundException(String string) {
		super(string);
	}





}
