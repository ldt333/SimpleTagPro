package com.jsp.function;

import java.util.Collection;

public class Function {

	// 返回对象的长度
	@SuppressWarnings("rawtypes")
	public static int length(Object obj) {
		if (obj == null) {
			return 0;
		}
		if (obj instanceof StringBuffer) {
			return length(((StringBuffer) obj).toString());
		}
		if (obj instanceof String) {
			return ((String) obj).getBytes().length;
		}
		if (obj instanceof Collection) {
			return ((Collection) obj).size();
		}
		return 0;
	}

	// 返回指定长度的字符串，区分中英文
	public static String substring(String str, int byteLength) {
		if (str == null) {
			return "";
		}
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (length(buffer.toString() + ch) > byteLength) {
				break;
			} else {
				buffer.append(ch);
			}
		}
		return buffer.toString();
	}
}
