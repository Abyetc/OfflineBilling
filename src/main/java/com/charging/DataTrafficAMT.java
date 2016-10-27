package com.charging;

public class DataTrafficAMT {
	private int I1X_LOC_AMT = 0;		// cdma本地金额(分)
	private int I1X_MY_AMT = 0;			// cdma 1x漫游金额(分)
	
	private int WLAN_LOC_AMT = 0;		// wlan本地金额(分)
	private int WLAN_MY_AMT = 0;		// wlan漫游金额(分)
	
	private int I3G_LOC_AMT = 0;		// 3G本地上网金额(分)
	private int I3G_MY_AMT = 0;			// 3G漫游上网金额(分)
	
	private int I4G_LOC_AMT = 0;		// 4G本地上网金额(分)_x000D_
	private int I4G_MY_AMT_IN = 0;		// 4G非国际漫游上网金额(分)_x000D_
	private int I4G_MY_AMT_OUT = 0;		// 4G国际漫游上网金额(分)_x000D_
	
	public DataTrafficAMT() {
		super();
	}

	// 获取上网总金额
	public int getINTERNET_AMT() {
		return getI1X_AMT() + getWLAN_AMT() + getI3G_AMT() + getI4G_AMT();
	}

	//	获取cdma上网总金额
	public int getI1X_AMT() {
		return I1X_LOC_AMT + I1X_MY_AMT;
	}

	public int getI1X_LOC_AMT() {
		return I1X_LOC_AMT;
	}

	public void setI1X_LOC_AMT(int i1x_LOC_AMT) {
		I1X_LOC_AMT = i1x_LOC_AMT;
	}

	public int getI1X_MY_AMT() {
		return I1X_MY_AMT;
	}

	public void setI1X_MY_AMT(int i1x_MY_AMT) {
		I1X_MY_AMT = i1x_MY_AMT;
	}

	// 获取wlan上网总金额
	public int getWLAN_AMT() {
		return getWLAN_LOC_AMT() + getWLAN_MY_AMT();
	}

	public int getWLAN_LOC_AMT() {
		return WLAN_LOC_AMT;
	}

	public void setWLAN_LOC_AMT(int wLAN_LOC_AMT) {
		WLAN_LOC_AMT = wLAN_LOC_AMT;
	}

	public int getWLAN_MY_AMT() {
		return WLAN_MY_AMT;
	}

	public void setWLAN_MY_AMT(int wLAN_MY_AMT) {
		WLAN_MY_AMT = wLAN_MY_AMT;
	}

	
	// 获取3G上网总金额
	public int getI3G_AMT() {
		return I3G_LOC_AMT + I3G_MY_AMT;
	}


	public int getI3G_LOC_AMT() {
		return I3G_LOC_AMT;
	}

	public void setI3G_LOC_AMT(int i3g_LOC_AMT) {
		I3G_LOC_AMT = i3g_LOC_AMT;
	}

	public int getI3G_MY_AMT() {
		return I3G_MY_AMT;
	}

	public void setI3G_MY_AMT(int i3g_MY_AMT) {
		I3G_MY_AMT = i3g_MY_AMT;
	}

	// 获取4G上网总金额
	public int getI4G_AMT() {
		return I4G_LOC_AMT + I4G_MY_AMT_IN + I4G_MY_AMT_OUT;
	}

	public int getI4G_LOC_AMT() {
		return I4G_LOC_AMT;
	}

	public void setI4G_LOC_AMT(int i4g_LOC_AMT) {
		I4G_LOC_AMT = i4g_LOC_AMT;
	}

	public int getI4G_MY_AMT_IN() {
		return I4G_MY_AMT_IN;
	}

	public void setI4G_MY_AMT_IN(int i4g_MY_AMT_IN) {
		I4G_MY_AMT_IN = i4g_MY_AMT_IN;
	}

	public int getI4G_MY_AMT_OUT() {
		return I4G_MY_AMT_OUT;
	}

	public void setI4G_MY_AMT_OUT(int i4g_MY_AMT_OUT) {
		I4G_MY_AMT_OUT = i4g_MY_AMT_OUT;
	}

	
}
