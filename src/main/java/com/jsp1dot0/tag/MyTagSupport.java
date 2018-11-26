package com.jsp1dot0.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * TagSupport模板类例程
 * @author Administrator
 *
 */
public class MyTagSupport extends TagSupport{

	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print("MyTagSupport");
	
		} catch (Exception e) {
			throw new JspException(e);
		}

		return EVAL_PAGE;
	}

}
