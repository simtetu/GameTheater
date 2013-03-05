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
	 * @param filename
	 * @return
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
			System.out.println(fnfe.getMessage());
		} finally {
			scanner.close();
		}
		System.out.println(text);

		return text.toString();
	}
}
