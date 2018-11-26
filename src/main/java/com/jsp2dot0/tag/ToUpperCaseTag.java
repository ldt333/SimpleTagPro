package com.jsp2dot0.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 处理标签体例程
 * 标签内容转大写
 * @author Administrator
 *
 */
public class ToUpperCaseTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		
		StringWriter writer = new StringWriter();  // 将标签体内容读入该writer
		JspFragment jspFragment = this.getJspBody(); // 标签提为JspFragment格式
		
		// 通过invoke输出到指定的writer中
		// 如果参数为null，将输出到默认的writer中（直接输出），即getJspContext().getOut()
		jspFragment.invoke(writer);
		
		String content = writer.getBuffer().toString();
		this.getJspContext().getOut().print(content.toUpperCase());
	}
}
