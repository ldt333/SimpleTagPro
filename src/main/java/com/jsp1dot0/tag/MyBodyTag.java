package com.jsp1dot0.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MyBodyTag extends BodyTagSupport {

//	@Override
//	public int doStartTag() throws JspException { 
//		// 直接输出标签体
//		return EVAL_BODY_INCLUDE;
//	}
	
	@Override
	public int doEndTag() throws JspException {
		
		String content = this.getBodyContent().getString();
		try {
			this.pageContext.getOut().print(content.toUpperCase());
		} catch (Exception e) {
			new JspException(e);
		}
		return EVAL_PAGE;
	}
}
