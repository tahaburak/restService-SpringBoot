package com.burak.spring.util;

/**
 * Created by TCTAHKOC on 02/27/19
 */
public class Constants {

	private Constants() {

	}

	public static final String CONTROLLER_PREFIX = "";

	public static final String REQUEST_MAP_VALUE_PING = "/ping";
	public static final String REQUEST_MAP_VALUE_GREETING = "/greeting";
	private static final String REQUEST_MAP_VALUE_USER_BASE = "/user";
	public static final String REQUEST_MAP_VALUE_GET_DUMMY_USER = REQUEST_MAP_VALUE_USER_BASE + "/dummy";
	public static final String REQUEST_MAP_VALUE_GENERATE_DUMMY_USER = REQUEST_MAP_VALUE_USER_BASE + "/new";
	public static final String REQUEST_MAP_VALUE_GET_DUMMY_USER_LIST = REQUEST_MAP_VALUE_USER_BASE + "/dummyList";
	public static final String REQUEST_MAP_VALUE_GENERATE_DUMMY_USER_LIST = REQUEST_MAP_VALUE_USER_BASE + "/newList/{number}";

	public static final String CONTROLLER_API_VALUE_BASE = "Base Controller";
	public static final String CONTROLLER_API_VALUE_GREETING = "Greeting Controller";
	public static final String CONTROLLER_API_VALUE_USER = "User Controller";

	public static final Integer DEFAULT_DUMMY_USER_LIST_SIZE = 10;

}
