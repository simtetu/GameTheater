package com.yohostudios.theater.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author simon
 *
 */
public class FileUtils {

	/**
	 * @param filename The File Name for Utils
	 * @return The String of the File Name
	 */
	public static String getFileContentAsString(String filename) {

		StringBuilder text = new StringBuilder();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(filename), "UTF-8");
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine()).append("\n");

			}
		} catch (FileNotFoundException fnfe) {
		// TODO implement logging other than System.out.println(fnfe.getMessage());
		} finally {
			scanner.close();
		}
		// TODO Implement logging instead of System.out.println(text);

		return text.toString();
	}
}
