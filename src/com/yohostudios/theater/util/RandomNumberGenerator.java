package com.yohostudios.theater.util;

import java.util.Random;

/**
 * @author simon
 *
 */
public class RandomNumberGenerator {

	/**
	 * @return
	 */
	public static long getRandomLong() {
		 Random random = new Random();
	     return random.nextLong();
	}
}
