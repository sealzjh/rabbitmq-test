package com.dada.log.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
 
public class QueueOneLitener implements  MessageListener{
    public void onMessage(Message message) {
    		try {
				String str = new String(message.getBody(),"UTF-8");
				System.out.println(str);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
    }
}