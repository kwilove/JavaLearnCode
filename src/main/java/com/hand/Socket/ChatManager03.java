package com.hand.Socket;

import java.util.Vector;

public class ChatManager03 {

	Vector<ChatSocket03> vector = new Vector<>();

	private ChatManager03() {
	}

	private static final ChatManager03 cm = new ChatManager03();

	public static ChatManager03 getChatManager03() {
		return cm;
	}

	public void add(ChatSocket03 cs) {
		vector.add(cs);
	}

	public void publish(ChatSocket03 cs, String out) {
		for (int i = 0; i < vector.size(); i++) {
			ChatSocket03 cs_all = vector.get(i);
			if (!cs.equals(cs_all)) {
				cs_all.out(out);
			}
		}
	}

}
