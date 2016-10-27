package com.data;

public class Addition {
	private int VALUE_ADDED_AMT;	// 增值业务总金额（分）
	private int CAILING_AMT;		// 订购彩铃金额（分）
	private int SP_SMS_AMT;			// 订购SP短信金额(分)
	
	
	public Addition(int vALUE_ADDED_AMT, int cAILING_AMT, int sP_SMS_AMT) {
		super();
		VALUE_ADDED_AMT = vALUE_ADDED_AMT;
		CAILING_AMT = cAILING_AMT;
		SP_SMS_AMT = sP_SMS_AMT;
	}
	
	public int getVALUE_ADDED_AMT() {
		return VALUE_ADDED_AMT;
	}
	public void setVALUE_ADDED_AMT(int vALUE_ADDED_AMT) {
		VALUE_ADDED_AMT = vALUE_ADDED_AMT;
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
