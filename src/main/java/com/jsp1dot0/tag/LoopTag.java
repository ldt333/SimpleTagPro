package com.jsp1dot0.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class LoopTag extends BodyTagSupport {

	private int times;
	
	@Override
	public int doStartTag() throws JspException {
		times = 5;
		return super.doStartTag();
	}
	
	@Override
	public int doAfterBody() throws JspException {
		if(times-- > 0){
			try {
				System.out.println(this.getBodyContent().getString());
				this.getPreviousOut().println(this.getBodyContent().getString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return EVAL_BODY_AGAIN;
		}
		return SKIP_BODY;
	}
}
