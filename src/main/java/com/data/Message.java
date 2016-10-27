package com.data;

public class Message {
	private int INNER_SEND_SMS_TIMES;		// 国内发送短信条数(次)
	private int INTER_SEND_SMS_TIMES;		// 国际漫游发送短信条数(次)
	
	public Message(int iNNER_SEND_SMS_TIMES, int iNTER_SEND_SMS_TIMES) {
		super();
		INNER_SEND_SMS_TIMES = iNNER_SEND_SMS_TIMES;
		INTER_SEND_SMS_TIMES = iNTER_SEND_SMS_TIMES;
	}

	public int getINNER_SEND_SMS_TIMES() {
		return INNER_SEND_SMS_TIMES;
	}

	public void setINNER_SEND_SMS_TIMES(int iNNER_SEND_SMS_TIMES) {
		INNER_SEND_SMS_TIMES = iNNER_SEND_SMS_TIMES;
	}

	public int getINTER_SEND_SMS_TIMES() {
		return INTER_SEND_SMS_TIMES;
	}

	public void setINTER_SEND_SMS_TIMES(int iNTER_SEND_SMS_TIMES) {
		INTER_SEND_SMS_TIMES = iNTER_SEND_SMS_TIMES;
	}
}
