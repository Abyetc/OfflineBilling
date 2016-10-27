package com.data;

public class DataTraffic {
	private int INTERNET_TOT_BYTES;		// 上网总流量(Byte)
	private int I1X_TOT_BYTES;			// cdma 1x总流量(Byte)
	private int I1X_LOC_TOT_BYTES;		// 	cdma 1x本地流量(Byte)
	private int I1X_MY_TOT_BYTES;		// cdma 1x漫游流量(Byte)
	private int WLAN_TOT_BYTES;			// wlan总流量(Byte)
	private int WLAN_LOC_TOT_BYTES;		// wlan本地流量(Byte)
	private int WLAN_MY_TOT_BYTES;		// wlan漫游流量(Byte)
	private int I3G_TOT_BYTES;			// 3G上网总流量(Byte)
	private int I3G_LOC_TOT_BYTES;		// 3G本地上网流量(Byte)
	private int I3G_MY_TOT_BYTES;		// 3G漫游上网流量(Byte)
	private int I4G_TOT_BYTES;			// 4G上网总流量(Byte)_x000D_
	private int I4G_LOC_TOT_BYTES;		// 4G本地上网流量(Byte)_x000D_
	private int I4G_MY_TOT_BYTES_IN;	// 4G非国际漫游上网流量(Byte)_x000D_
	private int I4G_MY_TOT_BYTES_OUT;	// 4G国际漫游上网流量(Byte)_x000D_
	
	
	public DataTraffic(int iNTERNET_TOT_BYTES, int i1x_TOT_BYTES, int i1x_LOC_TOT_BYTES, int i1x_MY_TOT_BYTES,
			int wLAN_TOT_BYTES, int wLAN_LOC_TOT_BYTES, int wLAN_MY_TOT_BYTES, int i3g_TOT_BYTES, int i3g_LOC_TOT_BYTES,
			int i3g_MY_TOT_BYTES, int i4g_TOT_BYTES, int i4g_LOC_TOT_BYTES, int i4g_MY_TOT_BYTES_IN,
			int i4g_MY_TOT_BYTES_OUT) {
		super();
		INTERNET_TOT_BYTES = iNTERNET_TOT_BYTES;
		I1X_TOT_BYTES = i1x_TOT_BYTES;
		I1X_LOC_TOT_BYTES = i1x_LOC_TOT_BYTES;
		I1X_MY_TOT_BYTES = i1x_MY_TOT_BYTES;
		WLAN_TOT_BYTES = wLAN_TOT_BYTES;
		WLAN_LOC_TOT_BYTES = wLAN_LOC_TOT_BYTES;
		WLAN_MY_TOT_BYTES = wLAN_MY_TOT_BYTES;
		I3G_TOT_BYTES = i3g_TOT_BYTES;
		I3G_LOC_TOT_BYTES = i3g_LOC_TOT_BYTES;
		I3G_MY_TOT_BYTES = i3g_MY_TOT_BYTES;
		I4G_TOT_BYTES = i4g_TOT_BYTES;
		I4G_LOC_TOT_BYTES = i4g_LOC_TOT_BYTES;
		I4G_MY_TOT_BYTES_IN = i4g_MY_TOT_BYTES_IN;
		I4G_MY_TOT_BYTES_OUT = i4g_MY_TOT_BYTES_OUT;
	}


	public int getINTERNET_TOT_BYTES() {
		return INTERNET_TOT_BYTES;
	}


	public void setINTERNET_TOT_BYTES(int iNTERNET_TOT_BYTES) {
		INTERNET_TOT_BYTES = iNTERNET_TOT_BYTES;
	}


	public int getI1X_TOT_BYTES() {
		return I1X_TOT_BYTES;
	}


	public void setI1X_TOT_BYTES(int i1x_TOT_BYTES) {
		I1X_TOT_BYTES = i1x_TOT_BYTES;
	}


	public int getI1X_LOC_TOT_BYTES() {
		return I1X_LOC_TOT_BYTES;
	}


	public void setI1X_LOC_TOT_BYTES(int i1x_LOC_TOT_BYTES) {
		I1X_LOC_TOT_BYTES = i1x_LOC_TOT_BYTES;
	}


	public int getI1X_MY_TOT_BYTES() {
		return I1X_MY_TOT_BYTES;
	}


	public void setI1X_MY_TOT_BYTES(int i1x_MY_TOT_BYTES) {
		I1X_MY_TOT_BYTES = i1x_MY_TOT_BYTES;
	}


	public int getWLAN_TOT_BYTES() {
		return WLAN_TOT_BYTES;
	}


	public void setWLAN_TOT_BYTES(int wLAN_TOT_BYTES) {
		WLAN_TOT_BYTES = wLAN_TOT_BYTES;
	}


	public int getWLAN_LOC_TOT_BYTES() {
		return WLAN_LOC_TOT_BYTES;
	}


	public void setWLAN_LOC_TOT_BYTES(int wLAN_LOC_TOT_BYTES) {
		WLAN_LOC_TOT_BYTES = wLAN_LOC_TOT_BYTES;
	}


	public int getWLAN_MY_TOT_BYTES() {
		return WLAN_MY_TOT_BYTES;
	}


	public void setWLAN_MY_TOT_BYTES(int wLAN_MY_TOT_BYTES) {
		WLAN_MY_TOT_BYTES = wLAN_MY_TOT_BYTES;
	}


	public int getI3G_TOT_BYTES() {
		return I3G_TOT_BYTES;
	}


	public void setI3G_TOT_BYTES(int i3g_TOT_BYTES) {
		I3G_TOT_BYTES = i3g_TOT_BYTES;
	}


	public int getI3G_LOC_TOT_BYTES() {
		return I3G_LOC_TOT_BYTES;
	}


	public void setI3G_LOC_TOT_BYTES(int i3g_LOC_TOT_BYTES) {
		I3G_LOC_TOT_BYTES = i3g_LOC_TOT_BYTES;
	}


	public int getI3G_MY_TOT_BYTES() {
		return I3G_MY_TOT_BYTES;
	}


	public void setI3G_MY_TOT_BYTES(int i3g_MY_TOT_BYTES) {
		I3G_MY_TOT_BYTES = i3g_MY_TOT_BYTES;
	}


	public int getI4G_TOT_BYTES() {
		return I4G_TOT_BYTES;
	}


	public void setI4G_TOT_BYTES(int i4g_TOT_BYTES) {
		I4G_TOT_BYTES = i4g_TOT_BYTES;
	}


	public int getI4G_LOC_TOT_BYTES() {
		return I4G_LOC_TOT_BYTES;
	}


	public void setI4G_LOC_TOT_BYTES(int i4g_LOC_TOT_BYTES) {
		I4G_LOC_TOT_BYTES = i4g_LOC_TOT_BYTES;
	}


	public int getI4G_MY_TOT_BYTES_IN() {
		return I4G_MY_TOT_BYTES_IN;
	}


	public void setI4G_MY_TOT_BYTES_IN(int i4g_MY_TOT_BYTES_IN) {
		I4G_MY_TOT_BYTES_IN = i4g_MY_TOT_BYTES_IN;
	}


	public int getI4G_MY_TOT_BYTES_OUT() {
		return I4G_MY_TOT_BYTES_OUT;
	}


	public void setI4G_MY_TOT_BYTES_OUT(int i4g_MY_TOT_BYTES_OUT) {
		I4G_MY_TOT_BYTES_OUT = i4g_MY_TOT_BYTES_OUT;
	}
	
	
}
