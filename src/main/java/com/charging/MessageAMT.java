package com.charging;

public class MessageAMT {
	private int INNER_SEND_SMS_AMT = 0;		// 国内发送短信金额(分)
	private int INTER_SEND_SMS_AMT = 0;		// 国际漫游发送短信金额(分)
	
	public MessageAMT() {
		super();
	}

	public int getINNER_SEND_SMS_AMT() {
		return INNER_SEND_SMS_AMT;
	}

	public void setINNER_SEND_SMS_AMT(int iNNER_SEND_SMS_AMT) {
		INNER_SEND_SMS_AMT = iNNER_SEND_SMS_AMT;
	}

	public int getINTER_SEND_SMS_AMT() {
		return INTER_SEND_SMS_AMT;
	}

	public void setINTER_SEND_SMS_AMT(int iNTER_SEND_SMS_AMT) {
		INTER_SEND_SMS_AMT = iNTER_SEND_SMS_AMT;
	}
}
