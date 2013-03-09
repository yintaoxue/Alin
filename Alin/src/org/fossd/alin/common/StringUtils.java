package org.fossd.alin.common;

/**
 * @author Talin
 * @version 0.1 2013.3.9
 */
public class StringUtils {
	public static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public static boolean parseBool(String s) throws Exception {
		if (s != null) {
			if (s.startsWith("true") || s.startsWith("on") || s.startsWith("yes")) {
				return true;
			}
			if (s.startsWith("false") || s.startsWith("off") || s.equals("no")) {
				return false;
			}
		}
		throw new Exception("invalid boolean value: " + s);
	}

	public static boolean parseBool(String s, boolean def) {
		if (s != null) {
			if (s.startsWith("true") || s.startsWith("on") || s.startsWith("yes")) {
				return true;
			}
			if (s.startsWith("false") || s.startsWith("off") || s.equals("no")) {
				return false;
			}
		}
		return def;
	}
}
