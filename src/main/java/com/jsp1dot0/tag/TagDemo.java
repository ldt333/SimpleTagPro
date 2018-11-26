package com.jsp1dot0.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

/**
 * Tag接口例程
 * @author Administrator
 *
 */
public class TagDemo implements Tag{

	private Tag parent; // 父标签 
	private PageContext pageContext; // Jsp内容

	@Override
	public int doStartTag() throws JspException {
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print("hello");
	
		} catch (Exception e) {
			throw new JspException(e);
		}
		return EVAL_PAGE;
	}

	@Override
	public Tag getParent() {
		return this.parent;
	}

	@Override
	public void release() {}

	@Override
	public void setPageContext(PageContext arg0) {
		this.pageContext = arg0;
	}

	@Override
	public void setParent(Tag arg0) {
		this.parent = arg0;
	}

}
