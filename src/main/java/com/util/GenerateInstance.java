package com.util;
import java.util.List;

import com.data.Addition;
import com.data.Calling;
import com.data.DataTraffic;
import com.data.Info;
import com.data.Message;
import com.data.UserData;

public class GenerateInstance {
	public static Message generateMessageInstance(List<Integer> list){
		int INNER_SEND_SMS_TIMES = list.get(56);	// 国内短信条数
		int INTER_SEND_SMS_TIMES = list.get(58);	// 国外漫游短信条数
		Message message = new Message(INNER_SEND_SMS_TIMES, INTER_SEND_SMS_TIMES);
		return message;
	}
	
	public static Addition generateAdditionInstance(List<Integer> list){
		int VALUE_ADDED_AMT = list.get(0);		// 增值业务总金额（分）
		int CAILING_AMT = list.get(1);			// 订购彩铃金额
		int SP_SMS_AMT = list.get(3);			// 订购sp短信金额（分）
		Addition addition = new Addition(VALUE_ADDED_AMT, CAILING_AMT, SP_SMS_AMT);
		return addition;
	}

	
	public static Calling generateCallingInstance(List<Integer> list){
		int VOICE_CALLING_BILLED_DUR = list.get(66);	// 主叫计费总时长（分）
		int VOICE_CALLED_BILLED_DUR = list.get(70);		// 被叫话费总计费时长（分）
		int LOC_CALLING_BILLED_DUR = list.get(74);		// 本地主叫计费时长(分钟)
		int DDD_CALLING_BILLED_DUR = list.get(78);		// 国内主叫计费时长(分钟)
		int IDD_CALLING_BILLED_DUR = list.get(82);		// 国际主叫计费时长(分钟)
		int GAT_CALLING_BILLED_DUR = list.get(86);		// 港澳台主叫计费时长(分钟)
		int INNER_MY_CALLING_BILLED_DUR = list.get(90);	// 国内漫游主叫计费时长(分钟)
		int INTER_MY_CALLING_BILLED_DUR = list.get(94);	// 国际漫游主叫计费时长(分钟)
		int GAT_MY_CALLING_BILLED_DUR = list.get(98);	// 港澳台漫游主叫计费时长(分钟)
		int LOC_CALLED_BILLED_DUR = list.get(102);		// 本地被叫计费时长(分钟)
		int INNER_MY_CALLED_BILLED_DUR = list.get(106);	// 国内漫游被叫计费时长(分钟)
		int INTER_MY_CALLED_BILLED_DUR = list.get(110);	// 国际漫游被叫计费时长(分钟)
		int GAT_MY_CALLED_BILLED_DUR = list.get(114);	// 港澳台漫游被叫计费时长(分钟)
		
		Calling calling = new Calling(VOICE_CALLING_BILLED_DUR, VOICE_CALLED_BILLED_DUR, LOC_CALLING_BILLED_DUR, DDD_CALLING_BILLED_DUR, IDD_CALLING_BILLED_DUR, GAT_CALLING_BILLED_DUR, INNER_MY_CALLING_BILLED_DUR, INTER_MY_CALLING_BILLED_DUR, GAT_MY_CALLING_BILLED_DUR, LOC_CALLED_BILLED_DUR, INNER_MY_CALLED_BILLED_DUR, INTER_MY_CALLED_BILLED_DUR, GAT_MY_CALLED_BILLED_DUR, GAT_MY_CALLED_BILLED_DUR);
		return calling;
	}
	
	
	public static DataTraffic generateDataTrafficInstance(List<Integer> list){
		int INTERNET_TOT_BYTES = list.get(6);	// 上网总流量(Byte)
		int I1X_TOT_BYTES = list.get(11);		// cdma 1x总流量(Byte)
		int I1X_LOC_TOT_BYTES = list.get(16);	// cdma 1x本地流量(Byte)
		int I1X_MY_TOT_BYTES = list.get(21);	// cdma 1x漫游流量(Byte)
		int WLAN_TOT_BYTES = list.get(26);		// wlan总流量(Byte)
		int WLAN_LOC_TOT_BYTES = list.get(31);	// wlan本地流量(Byte)
		int WLAN_MY_TOT_BYTES = list.get(36);	// wlan漫游流量(Byte)
		int I3G_TOT_BYTES = list.get(41);		// 3G上网总流量(Byte)
		int I3G_LOC_TOT_BYTES = list.get(46);	// 3G本地上网流量(Byte)
		int I3G_MY_TOT_BYTES = list.get(51);	// 3G漫游上网流量(Byte)
		int I4G_TOT_BYTES = list.get(119);		// 4G上网总流量(Byte)
		int I4G_LOC_TOT_BYTES = list.get(124);	// 4G本地上网流量(Byte)
		int I4G_MY_TOT_BYTES_IN = list.get(130);	// 4G非国际漫游上网流量(Byte)
		int I4G_MY_TOT_BYTES_OUT = list.get(131);	// 4G国际漫游上网流量(Byte)
		
		DataTraffic dataTraffic = new DataTraffic(INTERNET_TOT_BYTES, I1X_TOT_BYTES, I1X_LOC_TOT_BYTES, I1X_MY_TOT_BYTES, WLAN_TOT_BYTES, WLAN_LOC_TOT_BYTES, WLAN_MY_TOT_BYTES, I3G_TOT_BYTES, I3G_LOC_TOT_BYTES, I3G_MY_TOT_BYTES, I4G_TOT_BYTES, I4G_LOC_TOT_BYTES, I4G_MY_TOT_BYTES_IN, I4G_MY_TOT_BYTES_OUT);
		return dataTraffic;
	}
	
	
	public static Info generateInfoInstance(List<String> list) {
		String DTA_DATE = list.get(0);			// 统计时间
		String PROD_SPEC_ID = list.get(1);		// 产品规格标识
		String INTEGRATION_CD = list.get(2);	// 资产集成编号
		String USER_ID = list.get(3);			// 用户标识
		
		Info info = new Info(DTA_DATE, PROD_SPEC_ID, INTEGRATION_CD, USER_ID);
		return info;
	}
	
	
	public static UserData generateUserDataInstance(List<String> infoList, List<Integer> dataList){
		Info info = generateInfoInstance(infoList);
		Addition addition = generateAdditionInstance(dataList);
		Calling calling = generateCallingInstance(dataList);
		DataTraffic dataTraffic = generateDataTrafficInstance(dataList);
		Message message = generateMessageInstance(dataList);
		UserData userData = new UserData(info, addition, calling, dataTraffic, message);
		
		return userData;
	}
}
