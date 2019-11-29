package com.ruvents.components.utils;

public class ThreadUtils
{
	/**
	 * Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of
	 * milliseconds, subject to the precision and accuracy of system timers and schedulers. The thread does not lose
	 * ownership of any monitors.
	 */
	public static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
