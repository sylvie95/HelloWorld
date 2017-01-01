package com.yc.ccs.web.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component("pushMsgHandler")
public class PushMsgHandler extends TextWebSocketHandler{

	@Override	//推送
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		session.sendMessage(new TextMessage("您的信用卡欠费10000.00, 两天后后果自负!!!"));
	}


}
