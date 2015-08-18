package com.tecnotree.jms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class JMSController extends AbstractController{

	private static Logger log = Logger.getLogger(JMSController.class);
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		log.info("Invoked the Controller.");
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext()); 
		String action = req.getParameter("action"); // takes value Send/Receive
		String jmsType = req.getParameter("jmsType"); //takes value Queue/Topic
		return perform(jmsType, action, ctx);
	}	
	public ModelAndView perform(String jmsType, String action, WebApplicationContext ctx){
			DoAction doAction = (DoAction)ctx.getBean("jms"+jmsType+action);
			doAction.doAction();
			ModelAndView modelAndView = new ModelAndView(action);
			return modelAndView;
	}

}
