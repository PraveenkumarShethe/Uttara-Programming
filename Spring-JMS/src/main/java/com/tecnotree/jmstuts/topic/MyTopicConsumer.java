package com.tecnotree.jmstuts.topic;

import org.springframework.jms.core.JmsTemplate;

import com.tecnotree.jms.controller.DoAction;

public class MyTopicConsumer implements DoAction{
	public JmsTemplate jmsTemplate;

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	@Override
	public void doAction() {

	}

}
