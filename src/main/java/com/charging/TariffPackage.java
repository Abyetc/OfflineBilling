package com.charging;

public class TariffPackage {
	private  String packageName;
	private int TOTAL_RENTAL_AMT;	// 设备月租总金额(分)
	private int TOTAL_USE_AMT;				// 总费用
	
	private AdditionAMT ADDITION_AMT;	// 除去语音、短信、流量外的收费
	private CallingAMT CALLING_AMT;		// 语音费用
	private MessageAMT MESSAGE_AMT;		// 短信费用
	private DataTrafficAMT DATATRAFFIC_AMT;	// 数据流量费用
	
	public TariffPackage(String packageName){
		this.packageName = packageName;
		ADDITION_AMT = new AdditionAMT();
		CALLING_AMT = new CallingAMT();
		MESSAGE_AMT = new MessageAMT();
		DATATRAFFIC_AMT = new DataTrafficAMT();
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getTOTAL_RENTAL_AMT() {
		return TOTAL_RENTAL_AMT;
	}
	
	public void setTOTAL_RENTAL_AMT(int tOTAL_RENTAL_AMT) {
		TOTAL_RENTAL_AMT = tOTAL_RENTAL_AMT;
	}

	public int getTOTAL_USE_AMT() {
		return TOTAL_USE_AMT;
	}

	public void setTOTAL_USE_AMT(int tOTAL_USE_AMT) {
		TOTAL_USE_AMT = tOTAL_USE_AMT;
	}

	public AdditionAMT getADDITION_AMT() {
		return ADDITION_AMT;
	}

	public void setADDITION_AMT(AdditionAMT aDDITION_AMT) {
		ADDITION_AMT = aDDITION_AMT;
	}

	public CallingAMT getCALLING_AMT() {
		return CALLING_AMT;
	}

	public void setCALLING_AMT(CallingAMT cALLING_AMT) {
		CALLING_AMT = cALLING_AMT;
	}

	public MessageAMT getMESSAGE_AMT() {
		return MESSAGE_AMT;
	}

	public void setMESSAGE_AMT(MessageAMT mESSAGE_AMT) {
		MESSAGE_AMT = mESSAGE_AMT;
	}

	public DataTrafficAMT getDATATRAFFIC_AMT() {
		return DATATRAFFIC_AMT;
	}

	public void setDATATRAFFIC_AMT(DataTrafficAMT dATATRAFFIC_AMT) {
		DATATRAFFIC_AMT = dATATRAFFIC_AMT;
	}

//	public int getDDD_CALLING_FREE() {
//		return DDD_CALLING_FREE;
//	}
//
//	public void setDDD_CALLING_FREE(int dDD_CALLING_FREE) {
//		DDD_CALLING_FREE = dDD_CALLING_FREE;
//	}
//
//	public int getLOC_CALLING_FREE() {
//		return LOC_CALLING_FREE;
//	}
//
//	public void setLOC_CALLING_FREE(int lOC_CALLING_FREE) {
//		LOC_CALLING_FREE = lOC_CALLING_FREE;
//	}
//
//	public int getI1X_LOC_FREE() {
//		return I1X_LOC_FREE;
//	}
//
//	public void setI1X_LOC_FREE(int i1x_LOC_FREE) {
//		I1X_LOC_FREE = i1x_LOC_FREE;
//	}
//
//	public int getI1X_MY_FREE() {
//		return I1X_MY_FREE;
//	}
//
//	public void setI1X_MY_FREE(int i1x_MY_FREE) {
//		I1X_MY_FREE = i1x_MY_FREE;
//	}
//
//	public int getWLAN_LOC_FREE() {
//		return WLAN_LOC_FREE;
//	}
//
//	public void setWLAN_LOC_FREE(int wLAN_LOC_FREE) {
//		WLAN_LOC_FREE = wLAN_LOC_FREE;
//	}
//
//	public int getWLAN_MY_FREE() {
//		return WLAN_MY_FREE;
//	}
//
//	public void setWLAN_MY_FREE(int wLAN_MY_FREE) {
//		WLAN_MY_FREE = wLAN_MY_FREE;
//	}
//
//	public int getI3G_LOC_FREE() {
//		return I3G_LOC_FREE;
//	}
//
//	public void setI3G_LOC_FREE(int i3g_LOC_FREE) {
//		I3G_LOC_FREE = i3g_LOC_FREE;
//	}
//
//	public int getI3G_MY_FREE() {
//		return I3G_MY_FREE;
//	}
//
//	public void setI3G_MY_FREE(int i3g_MY_FREE) {
//		I3G_MY_FREE = i3g_MY_FREE;
//	}
//
//	public int getI4G_LOC_FREE() {
//		return I4G_LOC_FREE;
//	}
//
//	public void setI4G_LOC_FREE(int i4g_LOC_FREE) {
//		I4G_LOC_FREE = i4g_LOC_FREE;
//	}
//
//	public int getI4G_MY_IN_FREE() {
//		return I4G_MY_IN_FREE;
//	}
//
//	public void setI4G_MY_IN_FREE(int i4g_MY_IN_FREE) {
//		I4G_MY_IN_FREE = i4g_MY_IN_FREE;
//	}
//
//	public int getI4G_MY_OUT_FREE() {
//		return I4G_MY_OUT_FREE;
//	}
//
//	public void setI4G_MY_OUT_FREE(int i4g_MY_OUT_FREE) {
//		I4G_MY_OUT_FREE = i4g_MY_OUT_FREE;
//	}
//
//	public int getINNER_SEND_SMS_FREE() {
//		return INNER_SEND_SMS_FREE;
//	}
//
//	public void setINNER_SEND_SMS_FREE(int iNNER_SEND_SMS_FREE) {
//		INNER_SEND_SMS_FREE = iNNER_SEND_SMS_FREE;
//	}
//
//	public int getINTER_SEND_SMS_FREE() {
//		return INTER_SEND_SMS_FREE;
//	}
//
//	public void setINTER_SEND_SMS_FREE(int iNTER_SEND_SMS_FREE) {
//		INTER_SEND_SMS_FREE = iNTER_SEND_SMS_FREE;
//	}
}
