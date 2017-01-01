package com.yc.ccs.web.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

//@Component("pushMsgHandler")
public class PushMsgHandler2 implements WebSocketHandler {

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("========================afterConnectionEstablished()========================");
		TextMessage msg = new TextMessage("我是服务器, 向你推送一条消息...");
		session.sendMessage(msg);
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
//		System.out.println(message.getPayload());
		System.out.println("========================handleMessage()========================");
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		System.out.println("========================handleTransportError()========================");

	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		System.out.println("========================afterConnectionClosed()========================");

	}

	@Override
	public boolean supportsPartialMessages() {
		System.out.println("========================supportsPartialMessages()========================");
		return false;
	}

}
