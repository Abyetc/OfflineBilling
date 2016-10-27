package com.charging;

public class AdditionAMT {
	private int CAILING_AMT = 0;			// 订购彩铃金额(分)
	private int SP_SMS_AMT = 0;				// 订购SP短信金额(分)
	
	public AdditionAMT() {
		super();
	}

	// 获取增值业务总金额
	public int getVALUE_ADDED_AMT() {
		return CAILING_AMT + SP_SMS_AMT;
	}

	public int getCAILING_AMT() {
		return CAILING_AMT;
	}

	public void setCAILING_AMT(int cAILING_AMT) {
		CAILING_AMT = cAILING_AMT;
	}

	public int getSP_SMS_AMT() {
		return SP_SMS_AMT;
	}

	public void setSP_SMS_AMT(int sP_SMS_AMT) {
		SP_SMS_AMT = sP_SMS_AMT;
	}
}
