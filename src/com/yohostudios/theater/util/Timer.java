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
	 * @return access values Start Time
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime taint or change Start Time
	 */
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return access values Time Spent
	 */
	public long getTimeSpent() {
		return timeSpent;
	}

	/**
	 * @param timeSpent taint or change Time Spent
	 */
	public void setTimeSpent(long timeSpent) {
		this.timeSpent = timeSpent;
	}

	/**
	 * @return access values Duration
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration taint or change Duration
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}

	/**
	 * @return access values If is Ticking
	 */
	public boolean isTicking() {
		return ticking;
	}

	/**
	 * @param ticking taint or change Ticking
	 */
	public void setTicking(boolean ticking) {
		this.ticking = ticking;
	}

	/**
	 * @return access values If is Looping
	 */
	public boolean isLooping() {
		return looping;
	}

	/**
	 * @param looping taint or change If is Looping
	 */
	public void setLooping(boolean looping) {
		this.looping = looping;
	}

	/**
	 * @return access values If is Random
	 */
	public boolean isRandom() {
		return random;
	}

	/**
	 * @param random taint or change If is Random
	 */
	public void setRandom(boolean random) {
		this.random = random;
	}

	/**
	 * @return access values If is Ended
	 */
	public boolean isEnded() {
		return ended;
	}

	/**
	 * @param ended taint or change If is Ended
	 */
	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	/**
	 * @return access values Minimum Time
	 */
	public long getMinimumTime() {
		return minimumTime;
	}

	/**
	 * @param minimumTime taint or change Minimum Time
	 */
	public void setMinimumTime(long minimumTime) {
		this.minimumTime = minimumTime;
	}

	/**
	 * @return access values Maximum Time
	 */
	public long getMaximumTime() {
		return maximumTime;
	}

	/**
	 * @param maximumTime taint or change Maximum Time
	 */
	public void setMaximumTime(long maximumTime) {
		this.maximumTime = maximumTime;
	}

}
