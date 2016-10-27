package com.data;

public class Info {
	private String DTA_DATE;
	private String PROD_SPEC_ID;
	private String INTEGRATION_CD;
	private String USER_ID;
	
	public Info(String dTA_DATE, String pROD_SPEC_ID, String iNTEGRATION_CD, String uSER_ID) {
		super();
		DTA_DATE = dTA_DATE;
		PROD_SPEC_ID = pROD_SPEC_ID;
		INTEGRATION_CD = iNTEGRATION_CD;
		USER_ID = uSER_ID;
	}

	public String getDTA_DATE() {
		return DTA_DATE;
	}

	public void setDTA_DATE(String dTA_DATE) {
		DTA_DATE = dTA_DATE;
	}

	public String getPROD_SPEC_ID() {
		return PROD_SPEC_ID;
	}

	public void setPROD_SPEC_ID(String pROD_SPEC_ID) {
		PROD_SPEC_ID = pROD_SPEC_ID;
	}

	public String getINTEGRATION_CD() {
		return INTEGRATION_CD;
	}

	public void setINTEGRATION_CD(String iNTEGRATION_CD) {
		INTEGRATION_CD = iNTEGRATION_CD;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	
}
