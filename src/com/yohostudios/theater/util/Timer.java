package com.yohostudios.theater.util;

/**
 * A timer class to control duration.
 * 
 * @author simon
 * 
 */
public class Timer {

    /** */
	private long startTime;
	/** */
	private long timeSpent;
	/** */
	private long duration;
	/** */
	private boolean ticking;
	/** */
	private boolean looping;
	/** */
	private boolean random;
	/** */
	private boolean ended;
	/** */
	private long minimumTime;
	/** */
	private long maximumTime;

	/**
	 * Alternate constructor.
	 * 
	 * @param looping
	 * @param durationInMillisec
	 */
	public Timer(boolean looping, long durationInMillisec) {
		this.ticking = false;
		this.looping = looping;
		this.timeSpent = 0;
		this.startTime = 0;
		this.duration = durationInMillisec;
		this.ended = false;
	}

	/**
	 * Alternate constructor.
	 * 
	 * @param looping
	 * @param random
	 * @param minTime
	 * @param maxTime
	 */
	public Timer(boolean looping, boolean random, long minimumTime,
			long maximumTime) {

		this.ticking = false;
		this.looping = looping;
		this.timeSpent = 0;
		this.startTime = 0;
		this.ended = false;
		this.random = random;
		this.minimumTime = minimumTime;
		this.maximumTime = maximumTime;
		this.duration = minimumTime;
		this.ended = false;
	}

	/**
	 * 
	 */
	public void start() {
		startTime = System.currentTimeMillis();
		ended = false;
		if (random) {

			duration = (RandomNumberGenerator.getRandomLong() % ((maximumTime - minimumTime) + 1))
					+ minimumTime;
		}
		ticking = true;
	}

	/**
	 * 
	 */
	public void stop() {
		ticking = false;
	}

	/**
	 * 
	 */
	public void reset() {
		startTime = System.currentTimeMillis();
		ticking = true;
	}

	/**
	 * 
	 */
	public void end() {
		ended = true;
	}

	/**
	 * 
	 * @return
	 */
	public boolean tick() {
		return false;
	}

	/**
	 * 
	 * @param currentTime
	 * @return
	 */
	public boolean tick(long currentTime) {
		return false;
	}

	// ////////////////////////////////////////////////////////////////////////
    // Getters and setters.
    // ////////////////////////////////////////////////////////////////////////
	
	/**
	 * @return
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 */
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return
	 */
	public long getTimeSpent() {
		return timeSpent;
	}

	/**
	 * @param timeSpent
	 */
	public void setTimeSpent(long timeSpent) {
		this.timeSpent = timeSpent;
	}

	/**
	 * @return
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}

	/**
	 * @return
	 */
	public boolean isTicking() {
		return ticking;
	}

	/**
	 * @param ticking
	 */
	public void setTicking(boolean ticking) {
		this.ticking = ticking;
	}

	/**
	 * @return
	 */
	public boolean isLooping() {
		return looping;
	}

	/**
	 * @param looping
	 */
	public void setLooping(boolean looping) {
		this.looping = looping;
	}

	/**
	 * @return
	 */
	public boolean isRandom() {
		return random;
	}

	/**
	 * @param random
	 */
	public void setRandom(boolean random) {
		this.random = random;
	}

	/**
	 * @return
	 */
	public boolean isEnded() {
		return ended;
	}

	/**
	 * @param ended
	 */
	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	/**
	 * @return
	 */
	public long getMinimumTime() {
		return minimumTime;
	}

	/**
	 * @param minimumTime
	 */
	public void setMinimumTime(long minimumTime) {
		this.minimumTime = minimumTime;
	}

	/**
	 * @return
	 */
	public long getMaximumTime() {
		return maximumTime;
	}

	/**
	 * @param maximumTime
	 */
	public void setMaximumTime(long maximumTime) {
		this.maximumTime = maximumTime;
	}

}
