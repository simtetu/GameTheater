package com.yohostudios.theater.util;

import java.util.Random;

/**
 * @author simon
 *
 */
public class RandomNumberGenerator {

	/**
	 * @return a random number.
	 */
	public static long getRandomLong() {
		 Random random = new Random();
	     return random.nextLong();
	}
}
