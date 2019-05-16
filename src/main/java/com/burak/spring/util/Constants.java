package com.burak.spring.util;

/**
 * Created by burak on 02/27/19
 */
public class Constants {

	private Constants() {
	}

	public static final String CONTROLLER_PREFIX = "";

	public static final String REQUEST_MAP_VALUE_PING = "/ping";
	public static final String REQUEST_MAP_VALUE_GREETING = "/greeting";
	public static final String REQUEST_MAP_VALUE_HIGH_FIVE = "/highFive";
	public static final String REQUEST_MAP_VALUE_QUOTE = "/quote";

	private static final String REQUEST_MAP_VALUE_USER_BASE = "/user";
	public static final String REQUEST_MAP_VALUE_GET_DUMMY_USER =
			REQUEST_MAP_VALUE_USER_BASE + "/dummy";
	public static final String REQUEST_MAP_VALUE_GENERATE_DUMMY_USER =
			REQUEST_MAP_VALUE_USER_BASE + "/new";
	public static final String REQUEST_MAP_VALUE_GET_DUMMY_USER_LIST =
			REQUEST_MAP_VALUE_USER_BASE + "/dummyList";
	public static final String REQUEST_MAP_VALUE_GENERATE_DUMMY_USER_LIST =
			REQUEST_MAP_VALUE_USER_BASE + "/newList/{number}";

	public static final String CONTROLLER_API_VALUE_BASE = "Base Controller";
	public static final String CONTROLLER_API_VALUE_GREETING = "Greeting Controller";
	public static final String CONTROLLER_API_VALUE_USER = "User Controller";

	public static final Integer DEFAULT_DUMMY_USER_LIST_SIZE = 10;

	private static final String JSON_SERVER_BASE_URL = "http://localhost:3000";
	public static final String JSON_SERVER_USERS = JSON_SERVER_BASE_URL + "/users";
}
