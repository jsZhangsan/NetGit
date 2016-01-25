package com.mvc.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("项目销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("项目启动");
	}

}
