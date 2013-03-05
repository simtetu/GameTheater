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
	 * Return String Exception found. 
	 * @param string 
	 */
	public XMLTagNotFoundException(String string) {
		super(string);
	}





}
