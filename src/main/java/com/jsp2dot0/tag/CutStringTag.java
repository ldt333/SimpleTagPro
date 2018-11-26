package com.jsp2dot0.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * SimpleTagSupport例程
 * 指定长度截取字符串
 * 
 * @author Administrator
 *
 */
public class CutStringTag extends SimpleTagSupport {

	private String value;
	private int maxlen;

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		JspWriter out = this.getJspContext().getOut();
		if (value.length() > maxlen) {
			value = value.substring(0, maxlen)+"...";
		}
		out.print(value);
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getMaxlen() {
		return maxlen;
	}

	public void setMaxlen(int maxlen) {
		this.maxlen = maxlen;
	}

}
