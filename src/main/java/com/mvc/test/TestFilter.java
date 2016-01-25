package com.mvc.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("过滤处理");
		arg2.doFilter(arg0, arg1);
		System.out.println("继续第二个过滤...直到没有...");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("初始化->进入过滤器");
	}

}
