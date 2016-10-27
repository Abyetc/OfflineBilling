package com.charging;

public class CallingAMT {
//	private int VOICE_CALLING_AMT = 0;		// 主叫总话费金额(分)
//	private int VOICE_CALLED_AMT = 0;		// 被叫总话费金额(分)
	
	private int LOC_CALLING_AMT = 0;		// 本地主叫话费金额(分)
	private int DDD_CAING_AMT = 0;			// 国内主叫话费金额(分)
	private int IDD_CALLING_AMT = 0;		// 国际主叫话费金额(分)
	private int GAT_CALLING_AMT = 0;		// 港澳台主叫话费金额(分)
	private int INNER_MY_CALLING_AMT = 0;	// 国内漫游主叫话费金额(分)
	private int INTER_MY_CALLING_AMT = 0;	// 国际漫游主叫话费金额(分)
	private int GAT_MY_CALLING_AMT = 0;		// 港澳台漫游主叫话费金额(分)
	private int LOC_CALLED_AMT = 0;			// 本地被叫话费金额(分)
	private int INNER_MY_CALLED_AMT = 0;	// 国内漫游被叫话费金额(分)
	private int INTER_MY_CALLED_AMT = 0;	// 国际漫游被叫话费金额(分)
	private int GAT_MY_CALLED_AMT = 0;		// 港澳台漫游被叫话费金额(分)
//	private int VOICE_AMT;				// 总话费金额(分)

	public CallingAMT() {
		super();
	}

	// 获取话费总金额
	public int getVOICE_AMT() {
		return getVOICE_CALLING_AMT() + getVOICE_CALLED_AMT();
	}

	// 获取主叫话费总金额
	public int getVOICE_CALLING_AMT() {
		return LOC_CALLING_AMT + DDD_CAING_AMT + IDD_CALLING_AMT + GAT_CALLING_AMT + 
				INNER_MY_CALLING_AMT + INTER_MY_CALLING_AMT + GAT_MY_CALLING_AMT;
	}

	// 获取被叫话费总金额
	public int getVOICE_CALLED_AMT() {
		return LOC_CALLED_AMT + INNER_MY_CALLED_AMT + INTER_MY_CALLED_AMT + GAT_MY_CALLED_AMT;
	}

	// 获取
	public int getLOC_CALLING_AMT() {
		return LOC_CALLING_AMT;
	}



	public int getDDD_CAING_AMT() {
		return DDD_CAING_AMT;
	}

	public void setDDD_CAING_AMT(int dDD_CAING_AMT) {
		DDD_CAING_AMT = dDD_CAING_AMT;
	}

	public int getIDD_CALLING_AMT() {
		return IDD_CALLING_AMT;
	}

	public void setIDD_CALLING_AMT(int iDD_CALLING_AMT) {
		IDD_CALLING_AMT = iDD_CALLING_AMT;
	}

	public int getGAT_CALLING_AMT() {
		return GAT_CALLING_AMT;
	}

	public void setGAT_CALLING_AMT(int gAT_CALLING_AMT) {
		GAT_CALLING_AMT = gAT_CALLING_AMT;
	}

	public int getINNER_MY_CALLING_AMT() {
		return INNER_MY_CALLING_AMT;
	}

	public void setINNER_MY_CALLING_AMT(int iNNER_MY_CALLING_AMT) {
		INNER_MY_CALLING_AMT = iNNER_MY_CALLING_AMT;
	}

	public int getINTER_MY_CALLING_AMT() {
		return INTER_MY_CALLING_AMT;
	}

	public void setINTER_MY_CALLING_AMT(int iNTER_MY_CALLING_AMT) {
		INTER_MY_CALLING_AMT = iNTER_MY_CALLING_AMT;
	}

	public int getGAT_MY_CALLING_AMT() {
		return GAT_MY_CALLING_AMT;
	}

	public void setGAT_MY_CALLING_AMT(int gAT_MY_CALLING_AMT) {
		GAT_MY_CALLING_AMT = gAT_MY_CALLING_AMT;
	}

	public int getLOC_CALLED_AMT() {
		return LOC_CALLED_AMT;
	}

	public void setLOC_CALLED_AMT(int lOC_CALLED_AMT) {
		LOC_CALLED_AMT = lOC_CALLED_AMT;
	}

	public int getINNER_MY_CALLED_AMT() {
		return INNER_MY_CALLED_AMT;
	}

	public void setINNER_MY_CALLED_AMT(int iNNER_MY_CALLED_AMT) {
		INNER_MY_CALLED_AMT = iNNER_MY_CALLED_AMT;
	}

	public int getINTER_MY_CALLED_AMT() {
		return INTER_MY_CALLED_AMT;
	}

	public void setINTER_MY_CALLED_AMT(int iNTER_MY_CALLED_AMT) {
		INTER_MY_CALLED_AMT = iNTER_MY_CALLED_AMT;
	}

	public int getGAT_MY_CALLED_AMT() {
		return GAT_MY_CALLED_AMT;
	}

	public void setGAT_MY_CALLED_AMT(int gAT_MY_CALLED_AMT) {
		GAT_MY_CALLED_AMT = gAT_MY_CALLED_AMT;
	}
	
	
	
}
