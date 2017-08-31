/**
 * 
 */
package io.github.biezhi.wechat.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author libing
 *
 */
public class ThreadPoolExecutorUtils {
	private static final ExecutorService cacheExecutorService = Executors
			.newCachedThreadPool();
	private static final ScheduledExecutorService scheduleExecutorService = Executors
			.newScheduledThreadPool(100);

	/**
	 * @return the cacheExecutorService
	 */
	public static ExecutorService getCacheExecutorService() {
		return cacheExecutorService;
	}

	public static ScheduledExecutorService getScheduledExecutorService() {
		return scheduleExecutorService;
	}

}
