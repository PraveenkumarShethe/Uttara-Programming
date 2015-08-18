package com.tecnotree.jmstuts;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

public class MyMessageListener implements MessageListener {

	private static Logger log = Logger.getLogger(MyMessageListener.class);
			
	String messageListenerId;
	
	@Override
	public void onMessage(Message message) {
		try{
			TextMessage textMessage = (TextMessage) message;
			log.info("Message Id :  " + textMessage.getJMSMessageID() + " on " + messageListenerId);
			log.info("Message Listener Received " + textMessage.getText());
		}catch(Exception exception){
			log.error("Error : Message Listener, and i have a complain to report " + exception.getMessage());
		}
	}

	public void setMessageListenerId(String messageListenerId) {
		this.messageListenerId = messageListenerId;
	}

}
