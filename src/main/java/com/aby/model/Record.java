package com.aby.model;

public class Record implements Cloneable{
	
	public long countKB(long bytes){
		return (long) Math.ceil(bytes / 1024.0);
	}
	
	public long countMB(long bytes){
		long kb = countKB(bytes);
		return (long) Math.ceil(kb / 1024.0);
	}
	
	public long countGB(long bytes){
		long mb = countMB(bytes);
		return (long) Math.ceil(mb / 1024.0);
	}
	
	public static void main(String[] args) {
		Record record = new Record();
		record.setTotalRentalAmt(5900);
		int dur = record.getWlanBilledDur();
		record.setWlanAmt(dur * 3);
		
		long internetTotByte = record.getInternetTotBytes() - record.getWlanTotBytes(); 
		long mb = record.countMB(internetTotByte);
		
		
		
	}
	
	
	
	@Override  
    public Record clone() {  
        Record record = null;  
        try{  
            record = (Record)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return record;  
    }  
	
    private Integer id;

    private String dtaDate;

    private Integer prodSpecId;

    private String integrationCd;

    private String userId;

    private Integer valueAddedAmt;

    private Integer cailingAmt;

    private Integer cailingAmount;

    private Integer spSmsAmt;

    private Integer spSmsAmount;

    private Integer internetAmt;

    private Long internetTotBytes;

    private Integer internetDur;

    private Integer internetOnlineTimes;

    private Integer internetBilledDur;

    private Integer i1xAmt;

    private Long i1xTotBytes;

    private Integer i1xDur;

    private Integer i1xOnlineTimes;

    private Integer i1xBilledDur;

    private Integer i1xLocAmt;

    private Long i1xLocTotBytes;

    private Integer i1xLocDur;

    private Integer i1xLocOnlineTimes;

    private Integer i1xLocBilledDur;

    private Integer i1xMyAmt;

    private Long i1xMyTotBytes;

    private Integer i1xMyDur;

    private Integer i1xMyOnlineTimes;

    private Integer i1xMyBilledDur;

    private Integer wlanAmt;

    private Long wlanTotBytes;

    private Integer wlanDur;

    private Integer wlanOnlineTimes;

    private Integer wlanBilledDur;

    private Integer wlanLocAmt;

    private Long wlanLocTotBytes;

    private Integer wlanLocDur;

    private Integer wlanLocOnlineTimes;

    private Integer wlanLocBilledDur;

    private Integer wlanMyAmt;

    private Long wlanMyTotBytes;

    private Integer wlanMyDur;

    private Integer wlanMyOnlineTimes;

    private Integer wlanMyBilledDur;

    private Integer i3gAmt;

    private Long i3gTotBytes;

    private Integer i3gDur;

    private Integer i3gOnlineTimes;

    private Integer i3gBilledDur;

    private Integer i3gLocAmt;

    private Long i3gLocTotBytes;

    private Integer i3gLocDur;

    private Integer i3gLocOnlineTimes;

    private Integer i3gLocBilledDur;

    private Integer i3gMyAmt;

    private Long i3gMyTotBytes;

    private Integer i3gMyDur;

    private Integer i3gMyOnlineTimes;

    private Integer i3gMyBilledDur;

    private Integer innerSendSmsAmt;

    private Integer innerSendSmsTimes;

    private Integer interSendSmsAmt;

    private Integer interSendSmsTimes;

    private Integer voiceTimes;

    private Integer voiceDur;

    private Integer voiceAmt;

    private Integer voiceBilledDur;

    private Integer voiceCallingTimes;

    private Integer voiceCallingDur;

    private Integer voiceCallingAmt;

    private Integer voiceCallingBilledDur;

    private Integer voiceCalledTimes;

    private Integer voiceCalledDur;

    private Integer voiceCalledAmt;

    private Integer voiceCalledBilledDur;

    private Integer locCallingTimes;

    private Integer locCallingDur;

    private Integer locCallingAmt;

    private Integer locCallingBilledDur;

    private Integer dddCallingTimes;

    private Integer dddCallingDur;

    private Integer dddCallingAmt;

    private Integer dddCallingBilledDur;

    private Integer iddCallingTimes;

    private Integer iddCallingDur;

    private Integer iddCallingAmt;

    private Integer iddCallingBilledDur;

    private Integer gatCallingTimes;

    private Integer gatCallingDur;

    private Integer gatCallingAmt;

    private Integer gatCallingBilledDur;

    private Integer innerMyCallingTimes;

    private Integer innerMyCallingDur;

    private Integer innerMyCallingAmt;

    private Integer innerMyCallingBilledDur;

    private Integer interMyCallingTimes;

    private Integer interMyCallingDur;

    private Integer interMyCallingAmt;

    private Integer interMyCallingBilledDur;

    private Integer gatMyCallingTimes;

    private Integer gatMyCallingDur;

    private Integer gatMyCallingAmt;

    private Integer gatMyCallingBilledDur;

    private Integer locCalledTimes;

    private Integer locCalledDur;

    private Integer locCalledAmt;

    private Integer locCalledBilledDur;

    private Integer innerMyCalledTimes;

    private Integer innerMyCalledDur;

    private Integer innerMyCalledAmt;

    private Integer innerMyCalledBilledDur;

    private Integer interMyCalledTimes;

    private Integer interMyCalledDur;

    private Integer interMyCalledAmt;

    private Integer interMyCalledBilledDur;

    private Integer gatMyCalledTimes;

    private Integer gatMyCalledDur;

    private Integer gatMyCalledAmt;

    private Integer gatMyCalledBilledDur;

    private String prodInstCid;

    private String custCid;

    private String acntCid;

    private Integer totalAmt;

    private Integer totalRentalAmt;

    private Integer totalUseAmt;

    private String itemDeviceModel;

    private String deviceClass;

    private String gType;

    private Integer unitPrice;

    private Integer ifWap;

    private Integer ifNet;

    private Integer wapTimes;

    private Integer netTimes;

    private Long wapGrossBytes;

    private Long netGrossBytes;

    private Integer receive1x;

    private Integer receive1xM;

    private Long send1x;

    private Integer send1xM;

    private Long receiveEvdo;

    private Long receiveEvdoM;

    private Long sendEvdo;

    private Long sendEvdoM;

    private Integer receiveWifi;

    private Integer receiveWifiM;

    private Long sendWifi;

    private Long sendWifiM;

    private Integer ifTysxBillFlag;

    private Integer ifLiveFlag;

    private Integer ifQq;

    private Integer qqDtimes;

    private Integer mmsTimes;

    private Integer spmmsTimes;

    private Integer ifSmsFlag;

    private Integer timesSmsSend;

    private Integer if189mailActiveFlag;

    private Integer i4gAmt;

    private Long i4gTotBytes;

    private Integer i4gDur;

    private Integer i4gOnlineTimes;

    private Integer i4gBilledDur;

    private Integer i4gLocAmt;

    private Long i4gLocTotBytes;

    private Integer i4gLocDur;

    private Integer i4gLocOnlineTimes;

    private Integer i4gLocBilledDur;

    private Long i4gMyAmtIn;

    private Integer i4gMyAmtOut;

    private Long i4gMyTotBytesIn;

    private Integer i4gMyTotBytesOut;

    private Integer i4gMyDurIn;

    private Integer i4gMyDurOut;

    private Integer i4gMyOnlineTimesIn;

    private Integer i4gMyOnlineTimesOut;

    private Integer i4gMyBilledDurIn;

    private Integer i4gMyBilledDurOut;

    private String promNum;

    private String promName;

    private String salePolicyName;

    private String promStartDt;

    private String promEndDt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtaDate() {
        return dtaDate;
    }

    public void setDtaDate(String dtaDate) {
        this.dtaDate = dtaDate == null ? null : dtaDate.trim();
    }

    public Integer getProdSpecId() {
        return prodSpecId;
    }

    public void setProdSpecId(Integer prodSpecId) {
        this.prodSpecId = prodSpecId;
    }

    public String getIntegrationCd() {
        return integrationCd;
    }

    public void setIntegrationCd(String integrationCd) {
        this.integrationCd = integrationCd == null ? null : integrationCd.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getValueAddedAmt() {
        return valueAddedAmt;
    }

    public void setValueAddedAmt(Integer valueAddedAmt) {
        this.valueAddedAmt = valueAddedAmt;
    }

    public Integer getCailingAmt() {
        return cailingAmt;
    }

    public void setCailingAmt(Integer cailingAmt) {
        this.cailingAmt = cailingAmt;
    }

    public Integer getCailingAmount() {
        return cailingAmount;
    }

    public void setCailingAmount(Integer cailingAmount) {
        this.cailingAmount = cailingAmount;
    }

    public Integer getSpSmsAmt() {
        return spSmsAmt;
    }

    public void setSpSmsAmt(Integer spSmsAmt) {
        this.spSmsAmt = spSmsAmt;
    }

    public Integer getSpSmsAmount() {
        return spSmsAmount;
    }

    public void setSpSmsAmount(Integer spSmsAmount) {
        this.spSmsAmount = spSmsAmount;
    }

    public Integer getInternetAmt() {
        return internetAmt;
    }

    public void setInternetAmt(Integer internetAmt) {
        this.internetAmt = internetAmt;
    }

    public Long getInternetTotBytes() {
        return internetTotBytes;
    }

    public void setInternetTotBytes(Long internetTotBytes) {
        this.internetTotBytes = internetTotBytes;
    }

    public Integer getInternetDur() {
        return internetDur;
    }

    public void setInternetDur(Integer internetDur) {
        this.internetDur = internetDur;
    }

    public Integer getInternetOnlineTimes() {
        return internetOnlineTimes;
    }

    public void setInternetOnlineTimes(Integer internetOnlineTimes) {
        this.internetOnlineTimes = internetOnlineTimes;
    }

    public Integer getInternetBilledDur() {
        return internetBilledDur;
    }

    public void setInternetBilledDur(Integer internetBilledDur) {
        this.internetBilledDur = internetBilledDur;
    }

    public Integer getI1xAmt() {
        return i1xAmt;
    }

    public void setI1xAmt(Integer i1xAmt) {
        this.i1xAmt = i1xAmt;
    }

    public Long getI1xTotBytes() {
        return i1xTotBytes;
    }

    public void setI1xTotBytes(Long i1xTotBytes) {
        this.i1xTotBytes = i1xTotBytes;
    }

    public Integer getI1xDur() {
        return i1xDur;
    }

    public void setI1xDur(Integer i1xDur) {
        this.i1xDur = i1xDur;
    }

    public Integer getI1xOnlineTimes() {
        return i1xOnlineTimes;
    }

    public void setI1xOnlineTimes(Integer i1xOnlineTimes) {
        this.i1xOnlineTimes = i1xOnlineTimes;
    }

    public Integer getI1xBilledDur() {
        return i1xBilledDur;
    }

    public void setI1xBilledDur(Integer i1xBilledDur) {
        this.i1xBilledDur = i1xBilledDur;
    }

    public Integer getI1xLocAmt() {
        return i1xLocAmt;
    }

    public void setI1xLocAmt(Integer i1xLocAmt) {
        this.i1xLocAmt = i1xLocAmt;
    }

    public Long getI1xLocTotBytes() {
        return i1xLocTotBytes;
    }

    public void setI1xLocTotBytes(Long i1xLocTotBytes) {
        this.i1xLocTotBytes = i1xLocTotBytes;
    }

    public Integer getI1xLocDur() {
        return i1xLocDur;
    }

    public void setI1xLocDur(Integer i1xLocDur) {
        this.i1xLocDur = i1xLocDur;
    }

    public Integer getI1xLocOnlineTimes() {
        return i1xLocOnlineTimes;
    }

    public void setI1xLocOnlineTimes(Integer i1xLocOnlineTimes) {
        this.i1xLocOnlineTimes = i1xLocOnlineTimes;
    }

    public Integer getI1xLocBilledDur() {
        return i1xLocBilledDur;
    }

    public void setI1xLocBilledDur(Integer i1xLocBilledDur) {
        this.i1xLocBilledDur = i1xLocBilledDur;
    }

    public Integer getI1xMyAmt() {
        return i1xMyAmt;
    }

    public void setI1xMyAmt(Integer i1xMyAmt) {
        this.i1xMyAmt = i1xMyAmt;
    }

    public Long getI1xMyTotBytes() {
        return i1xMyTotBytes;
    }

    public void setI1xMyTotBytes(Long i1xMyTotBytes) {
        this.i1xMyTotBytes = i1xMyTotBytes;
    }

    public Integer getI1xMyDur() {
        return i1xMyDur;
    }

    public void setI1xMyDur(Integer i1xMyDur) {
        this.i1xMyDur = i1xMyDur;
    }

    public Integer getI1xMyOnlineTimes() {
        return i1xMyOnlineTimes;
    }

    public void setI1xMyOnlineTimes(Integer i1xMyOnlineTimes) {
        this.i1xMyOnlineTimes = i1xMyOnlineTimes;
    }

    public Integer getI1xMyBilledDur() {
        return i1xMyBilledDur;
    }

    public void setI1xMyBilledDur(Integer i1xMyBilledDur) {
        this.i1xMyBilledDur = i1xMyBilledDur;
    }

    public Integer getWlanAmt() {
        return wlanAmt;
    }

    public void setWlanAmt(Integer wlanAmt) {
        this.wlanAmt = wlanAmt;
    }

    public Long getWlanTotBytes() {
        return wlanTotBytes;
    }

    public void setWlanTotBytes(Long wlanTotBytes) {
        this.wlanTotBytes = wlanTotBytes;
    }

    public Integer getWlanDur() {
        return wlanDur;
    }

    public void setWlanDur(Integer wlanDur) {
        this.wlanDur = wlanDur;
    }

    public Integer getWlanOnlineTimes() {
        return wlanOnlineTimes;
    }

    public void setWlanOnlineTimes(Integer wlanOnlineTimes) {
        this.wlanOnlineTimes = wlanOnlineTimes;
    }

    public Integer getWlanBilledDur() {
        return wlanBilledDur;
    }

    public void setWlanBilledDur(Integer wlanBilledDur) {
        this.wlanBilledDur = wlanBilledDur;
    }

    public Integer getWlanLocAmt() {
        return wlanLocAmt;
    }

    public void setWlanLocAmt(Integer wlanLocAmt) {
        this.wlanLocAmt = wlanLocAmt;
    }

    public Long getWlanLocTotBytes() {
        return wlanLocTotBytes;
    }

    public void setWlanLocTotBytes(Long wlanLocTotBytes) {
        this.wlanLocTotBytes = wlanLocTotBytes;
    }

    public Integer getWlanLocDur() {
        return wlanLocDur;
    }

    public void setWlanLocDur(Integer wlanLocDur) {
        this.wlanLocDur = wlanLocDur;
    }

    public Integer getWlanLocOnlineTimes() {
        return wlanLocOnlineTimes;
    }

    public void setWlanLocOnlineTimes(Integer wlanLocOnlineTimes) {
        this.wlanLocOnlineTimes = wlanLocOnlineTimes;
    }

    public Integer getWlanLocBilledDur() {
        return wlanLocBilledDur;
    }

    public void setWlanLocBilledDur(Integer wlanLocBilledDur) {
        this.wlanLocBilledDur = wlanLocBilledDur;
    }

    public Integer getWlanMyAmt() {
        return wlanMyAmt;
    }

    public void setWlanMyAmt(Integer wlanMyAmt) {
        this.wlanMyAmt = wlanMyAmt;
    }

    public Long getWlanMyTotBytes() {
        return wlanMyTotBytes;
    }

    public void setWlanMyTotBytes(Long wlanMyTotBytes) {
        this.wlanMyTotBytes = wlanMyTotBytes;
    }

    public Integer getWlanMyDur() {
        return wlanMyDur;
    }

    public void setWlanMyDur(Integer wlanMyDur) {
        this.wlanMyDur = wlanMyDur;
    }

    public Integer getWlanMyOnlineTimes() {
        return wlanMyOnlineTimes;
    }

    public void setWlanMyOnlineTimes(Integer wlanMyOnlineTimes) {
        this.wlanMyOnlineTimes = wlanMyOnlineTimes;
    }

    public Integer getWlanMyBilledDur() {
        return wlanMyBilledDur;
    }

    public void setWlanMyBilledDur(Integer wlanMyBilledDur) {
        this.wlanMyBilledDur = wlanMyBilledDur;
    }

    public Integer getI3gAmt() {
        return i3gAmt;
    }

    public void setI3gAmt(Integer i3gAmt) {
        this.i3gAmt = i3gAmt;
    }

    public Long getI3gTotBytes() {
        return i3gTotBytes;
    }

    public void setI3gTotBytes(Long i3gTotBytes) {
        this.i3gTotBytes = i3gTotBytes;
    }

    public Integer getI3gDur() {
        return i3gDur;
    }

    public void setI3gDur(Integer i3gDur) {
        this.i3gDur = i3gDur;
    }

    public Integer getI3gOnlineTimes() {
        return i3gOnlineTimes;
    }

    public void setI3gOnlineTimes(Integer i3gOnlineTimes) {
        this.i3gOnlineTimes = i3gOnlineTimes;
    }

    public Integer getI3gBilledDur() {
        return i3gBilledDur;
    }

    public void setI3gBilledDur(Integer i3gBilledDur) {
        this.i3gBilledDur = i3gBilledDur;
    }

    public Integer getI3gLocAmt() {
        return i3gLocAmt;
    }

    public void setI3gLocAmt(Integer i3gLocAmt) {
        this.i3gLocAmt = i3gLocAmt;
    }

    public Long getI3gLocTotBytes() {
        return i3gLocTotBytes;
    }

    public void setI3gLocTotBytes(Long i3gLocTotBytes) {
        this.i3gLocTotBytes = i3gLocTotBytes;
    }

    public Integer getI3gLocDur() {
        return i3gLocDur;
    }

    public void setI3gLocDur(Integer i3gLocDur) {
        this.i3gLocDur = i3gLocDur;
    }

    public Integer getI3gLocOnlineTimes() {
        return i3gLocOnlineTimes;
    }

    public void setI3gLocOnlineTimes(Integer i3gLocOnlineTimes) {
        this.i3gLocOnlineTimes = i3gLocOnlineTimes;
    }

    public Integer getI3gLocBilledDur() {
        return i3gLocBilledDur;
    }

    public void setI3gLocBilledDur(Integer i3gLocBilledDur) {
        this.i3gLocBilledDur = i3gLocBilledDur;
    }

    public Integer getI3gMyAmt() {
        return i3gMyAmt;
    }

    public void setI3gMyAmt(Integer i3gMyAmt) {
        this.i3gMyAmt = i3gMyAmt;
    }

    public Long getI3gMyTotBytes() {
        return i3gMyTotBytes;
    }

    public void setI3gMyTotBytes(Long i3gMyTotBytes) {
        this.i3gMyTotBytes = i3gMyTotBytes;
    }

    public Integer getI3gMyDur() {
        return i3gMyDur;
    }

    public void setI3gMyDur(Integer i3gMyDur) {
        this.i3gMyDur = i3gMyDur;
    }

    public Integer getI3gMyOnlineTimes() {
        return i3gMyOnlineTimes;
    }

    public void setI3gMyOnlineTimes(Integer i3gMyOnlineTimes) {
        this.i3gMyOnlineTimes = i3gMyOnlineTimes;
    }

    public Integer getI3gMyBilledDur() {
        return i3gMyBilledDur;
    }

    public void setI3gMyBilledDur(Integer i3gMyBilledDur) {
        this.i3gMyBilledDur = i3gMyBilledDur;
    }

    public Integer getInnerSendSmsAmt() {
        return innerSendSmsAmt;
    }

    public void setInnerSendSmsAmt(Integer innerSendSmsAmt) {
        this.innerSendSmsAmt = innerSendSmsAmt;
    }

    public Integer getInnerSendSmsTimes() {
        return innerSendSmsTimes;
    }

    public void setInnerSendSmsTimes(Integer innerSendSmsTimes) {
        this.innerSendSmsTimes = innerSendSmsTimes;
    }

    public Integer getInterSendSmsAmt() {
        return interSendSmsAmt;
    }

    public void setInterSendSmsAmt(Integer interSendSmsAmt) {
        this.interSendSmsAmt = interSendSmsAmt;
    }

    public Integer getInterSendSmsTimes() {
        return interSendSmsTimes;
    }

    public void setInterSendSmsTimes(Integer interSendSmsTimes) {
        this.interSendSmsTimes = interSendSmsTimes;
    }

    public Integer getVoiceTimes() {
        return voiceTimes;
    }

    public void setVoiceTimes(Integer voiceTimes) {
        this.voiceTimes = voiceTimes;
    }

    public Integer getVoiceDur() {
        return voiceDur;
    }

    public void setVoiceDur(Integer voiceDur) {
        this.voiceDur = voiceDur;
    }

    public Integer getVoiceAmt() {
        return voiceAmt;
    }

    public void setVoiceAmt(Integer voiceAmt) {
        this.voiceAmt = voiceAmt;
    }

    public Integer getVoiceBilledDur() {
        return voiceBilledDur;
    }

    public void setVoiceBilledDur(Integer voiceBilledDur) {
        this.voiceBilledDur = voiceBilledDur;
    }

    public Integer getVoiceCallingTimes() {
        return voiceCallingTimes;
    }

    public void setVoiceCallingTimes(Integer voiceCallingTimes) {
        this.voiceCallingTimes = voiceCallingTimes;
    }

    public Integer getVoiceCallingDur() {
        return voiceCallingDur;
    }

    public void setVoiceCallingDur(Integer voiceCallingDur) {
        this.voiceCallingDur = voiceCallingDur;
    }

    public Integer getVoiceCallingAmt() {
        return voiceCallingAmt;
    }

    public void setVoiceCallingAmt(Integer voiceCallingAmt) {
        this.voiceCallingAmt = voiceCallingAmt;
    }

    public Integer getVoiceCallingBilledDur() {
        return voiceCallingBilledDur;
    }

    public void setVoiceCallingBilledDur(Integer voiceCallingBilledDur) {
        this.voiceCallingBilledDur = voiceCallingBilledDur;
    }

    public Integer getVoiceCalledTimes() {
        return voiceCalledTimes;
    }

    public void setVoiceCalledTimes(Integer voiceCalledTimes) {
        this.voiceCalledTimes = voiceCalledTimes;
    }

    public Integer getVoiceCalledDur() {
        return voiceCalledDur;
    }

    public void setVoiceCalledDur(Integer voiceCalledDur) {
        this.voiceCalledDur = voiceCalledDur;
    }

    public Integer getVoiceCalledAmt() {
        return voiceCalledAmt;
    }

    public void setVoiceCalledAmt(Integer voiceCalledAmt) {
        this.voiceCalledAmt = voiceCalledAmt;
    }

    public Integer getVoiceCalledBilledDur() {
        return voiceCalledBilledDur;
    }

    public void setVoiceCalledBilledDur(Integer voiceCalledBilledDur) {
        this.voiceCalledBilledDur = voiceCalledBilledDur;
    }

    public Integer getLocCallingTimes() {
        return locCallingTimes;
    }

    public void setLocCallingTimes(Integer locCallingTimes) {
        this.locCallingTimes = locCallingTimes;
    }

    public Integer getLocCallingDur() {
        return locCallingDur;
    }

    public void setLocCallingDur(Integer locCallingDur) {
        this.locCallingDur = locCallingDur;
    }

    public Integer getLocCallingAmt() {
        return locCallingAmt;
    }

    public void setLocCallingAmt(Integer locCallingAmt) {
        this.locCallingAmt = locCallingAmt;
    }

    public Integer getLocCallingBilledDur() {
        return locCallingBilledDur;
    }

    public void setLocCallingBilledDur(Integer locCallingBilledDur) {
        this.locCallingBilledDur = locCallingBilledDur;
    }

    public Integer getDddCallingTimes() {
        return dddCallingTimes;
    }

    public void setDddCallingTimes(Integer dddCallingTimes) {
        this.dddCallingTimes = dddCallingTimes;
    }

    public Integer getDddCallingDur() {
        return dddCallingDur;
    }

    public void setDddCallingDur(Integer dddCallingDur) {
        this.dddCallingDur = dddCallingDur;
    }

    public Integer getDddCallingAmt() {
        return dddCallingAmt;
    }

    public void setDddCallingAmt(Integer dddCallingAmt) {
        this.dddCallingAmt = dddCallingAmt;
    }

    public Integer getDddCallingBilledDur() {
        return dddCallingBilledDur;
    }

    public void setDddCallingBilledDur(Integer dddCallingBilledDur) {
        this.dddCallingBilledDur = dddCallingBilledDur;
    }

    public Integer getIddCallingTimes() {
        return iddCallingTimes;
    }

    public void setIddCallingTimes(Integer iddCallingTimes) {
        this.iddCallingTimes = iddCallingTimes;
    }

    public Integer getIddCallingDur() {
        return iddCallingDur;
    }

    public void setIddCallingDur(Integer iddCallingDur) {
        this.iddCallingDur = iddCallingDur;
    }

    public Integer getIddCallingAmt() {
        return iddCallingAmt;
    }

    public void setIddCallingAmt(Integer iddCallingAmt) {
        this.iddCallingAmt = iddCallingAmt;
    }

    public Integer getIddCallingBilledDur() {
        return iddCallingBilledDur;
    }

    public void setIddCallingBilledDur(Integer iddCallingBilledDur) {
        this.iddCallingBilledDur = iddCallingBilledDur;
    }

    public Integer getGatCallingTimes() {
        return gatCallingTimes;
    }

    public void setGatCallingTimes(Integer gatCallingTimes) {
        this.gatCallingTimes = gatCallingTimes;
    }

    public Integer getGatCallingDur() {
        return gatCallingDur;
    }

    public void setGatCallingDur(Integer gatCallingDur) {
        this.gatCallingDur = gatCallingDur;
    }

    public Integer getGatCallingAmt() {
        return gatCallingAmt;
    }

    public void setGatCallingAmt(Integer gatCallingAmt) {
        this.gatCallingAmt = gatCallingAmt;
    }

    public Integer getGatCallingBilledDur() {
        return gatCallingBilledDur;
    }

    public void setGatCallingBilledDur(Integer gatCallingBilledDur) {
        this.gatCallingBilledDur = gatCallingBilledDur;
    }

    public Integer getInnerMyCallingTimes() {
        return innerMyCallingTimes;
    }

    public void setInnerMyCallingTimes(Integer innerMyCallingTimes) {
        this.innerMyCallingTimes = innerMyCallingTimes;
    }

    public Integer getInnerMyCallingDur() {
        return innerMyCallingDur;
    }

    public void setInnerMyCallingDur(Integer innerMyCallingDur) {
        this.innerMyCallingDur = innerMyCallingDur;
    }

    public Integer getInnerMyCallingAmt() {
        return innerMyCallingAmt;
    }

    public void setInnerMyCallingAmt(Integer innerMyCallingAmt) {
        this.innerMyCallingAmt = innerMyCallingAmt;
    }

    public Integer getInnerMyCallingBilledDur() {
        return innerMyCallingBilledDur;
    }

    public void setInnerMyCallingBilledDur(Integer innerMyCallingBilledDur) {
        this.innerMyCallingBilledDur = innerMyCallingBilledDur;
    }

    public Integer getInterMyCallingTimes() {
        return interMyCallingTimes;
    }

    public void setInterMyCallingTimes(Integer interMyCallingTimes) {
        this.interMyCallingTimes = interMyCallingTimes;
    }

    public Integer getInterMyCallingDur() {
        return interMyCallingDur;
    }

    public void setInterMyCallingDur(Integer interMyCallingDur) {
        this.interMyCallingDur = interMyCallingDur;
    }

    public Integer getInterMyCallingAmt() {
        return interMyCallingAmt;
    }

    public void setInterMyCallingAmt(Integer interMyCallingAmt) {
        this.interMyCallingAmt = interMyCallingAmt;
    }

    public Integer getInterMyCallingBilledDur() {
        return interMyCallingBilledDur;
    }

    public void setInterMyCallingBilledDur(Integer interMyCallingBilledDur) {
        this.interMyCallingBilledDur = interMyCallingBilledDur;
    }

    public Integer getGatMyCallingTimes() {
        return gatMyCallingTimes;
    }

    public void setGatMyCallingTimes(Integer gatMyCallingTimes) {
        this.gatMyCallingTimes = gatMyCallingTimes;
    }

    public Integer getGatMyCallingDur() {
        return gatMyCallingDur;
    }

    public void setGatMyCallingDur(Integer gatMyCallingDur) {
        this.gatMyCallingDur = gatMyCallingDur;
    }

    public Integer getGatMyCallingAmt() {
        return gatMyCallingAmt;
    }

    public void setGatMyCallingAmt(Integer gatMyCallingAmt) {
        this.gatMyCallingAmt = gatMyCallingAmt;
    }

    public Integer getGatMyCallingBilledDur() {
        return gatMyCallingBilledDur;
    }

    public void setGatMyCallingBilledDur(Integer gatMyCallingBilledDur) {
        this.gatMyCallingBilledDur = gatMyCallingBilledDur;
    }

    public Integer getLocCalledTimes() {
        return locCalledTimes;
    }

    public void setLocCalledTimes(Integer locCalledTimes) {
        this.locCalledTimes = locCalledTimes;
    }

    public Integer getLocCalledDur() {
        return locCalledDur;
    }

    public void setLocCalledDur(Integer locCalledDur) {
        this.locCalledDur = locCalledDur;
    }

    public Integer getLocCalledAmt() {
        return locCalledAmt;
    }

    public void setLocCalledAmt(Integer locCalledAmt) {
        this.locCalledAmt = locCalledAmt;
    }

    public Integer getLocCalledBilledDur() {
        return locCalledBilledDur;
    }

    public void setLocCalledBilledDur(Integer locCalledBilledDur) {
        this.locCalledBilledDur = locCalledBilledDur;
    }

    public Integer getInnerMyCalledTimes() {
        return innerMyCalledTimes;
    }

    public void setInnerMyCalledTimes(Integer innerMyCalledTimes) {
        this.innerMyCalledTimes = innerMyCalledTimes;
    }

    public Integer getInnerMyCalledDur() {
        return innerMyCalledDur;
    }

    public void setInnerMyCalledDur(Integer innerMyCalledDur) {
        this.innerMyCalledDur = innerMyCalledDur;
    }

    public Integer getInnerMyCalledAmt() {
        return innerMyCalledAmt;
    }

    public void setInnerMyCalledAmt(Integer innerMyCalledAmt) {
        this.innerMyCalledAmt = innerMyCalledAmt;
    }

    public Integer getInnerMyCalledBilledDur() {
        return innerMyCalledBilledDur;
    }

    public void setInnerMyCalledBilledDur(Integer innerMyCalledBilledDur) {
        this.innerMyCalledBilledDur = innerMyCalledBilledDur;
    }

    public Integer getInterMyCalledTimes() {
        return interMyCalledTimes;
    }

    public void setInterMyCalledTimes(Integer interMyCalledTimes) {
        this.interMyCalledTimes = interMyCalledTimes;
    }

    public Integer getInterMyCalledDur() {
        return interMyCalledDur;
    }

    public void setInterMyCalledDur(Integer interMyCalledDur) {
        this.interMyCalledDur = interMyCalledDur;
    }

    public Integer getInterMyCalledAmt() {
        return interMyCalledAmt;
    }

    public void setInterMyCalledAmt(Integer interMyCalledAmt) {
        this.interMyCalledAmt = interMyCalledAmt;
    }

    public Integer getInterMyCalledBilledDur() {
        return interMyCalledBilledDur;
    }

    public void setInterMyCalledBilledDur(Integer interMyCalledBilledDur) {
        this.interMyCalledBilledDur = interMyCalledBilledDur;
    }

    public Integer getGatMyCalledTimes() {
        return gatMyCalledTimes;
    }

    public void setGatMyCalledTimes(Integer gatMyCalledTimes) {
        this.gatMyCalledTimes = gatMyCalledTimes;
    }

    public Integer getGatMyCalledDur() {
        return gatMyCalledDur;
    }

    public void setGatMyCalledDur(Integer gatMyCalledDur) {
        this.gatMyCalledDur = gatMyCalledDur;
    }

    public Integer getGatMyCalledAmt() {
        return gatMyCalledAmt;
    }

    public void setGatMyCalledAmt(Integer gatMyCalledAmt) {
        this.gatMyCalledAmt = gatMyCalledAmt;
    }

    public Integer getGatMyCalledBilledDur() {
        return gatMyCalledBilledDur;
    }

    public void setGatMyCalledBilledDur(Integer gatMyCalledBilledDur) {
        this.gatMyCalledBilledDur = gatMyCalledBilledDur;
    }

    public String getProdInstCid() {
        return prodInstCid;
    }

    public void setProdInstCid(String prodInstCid) {
        this.prodInstCid = prodInstCid == null ? null : prodInstCid.trim();
    }

    public String getCustCid() {
        return custCid;
    }

    public void setCustCid(String custCid) {
        this.custCid = custCid == null ? null : custCid.trim();
    }

    public String getAcntCid() {
        return acntCid;
    }

    public void setAcntCid(String acntCid) {
        this.acntCid = acntCid == null ? null : acntCid.trim();
    }

    public Integer getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Integer totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Integer getTotalRentalAmt() {
        return totalRentalAmt;
    }

    public void setTotalRentalAmt(Integer totalRentalAmt) {
        this.totalRentalAmt = totalRentalAmt;
    }

    public Integer getTotalUseAmt() {
        return totalUseAmt;
    }

    public void setTotalUseAmt(Integer totalUseAmt) {
        this.totalUseAmt = totalUseAmt;
    }

    public String getItemDeviceModel() {
        return itemDeviceModel;
    }

    public void setItemDeviceModel(String itemDeviceModel) {
        this.itemDeviceModel = itemDeviceModel == null ? null : itemDeviceModel.trim();
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass == null ? null : deviceClass.trim();
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType == null ? null : gType.trim();
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getIfWap() {
        return ifWap;
    }

    public void setIfWap(Integer ifWap) {
        this.ifWap = ifWap;
    }

    public Integer getIfNet() {
        return ifNet;
    }

    public void setIfNet(Integer ifNet) {
        this.ifNet = ifNet;
    }

    public Integer getWapTimes() {
        return wapTimes;
    }

    public void setWapTimes(Integer wapTimes) {
        this.wapTimes = wapTimes;
    }

    public Integer getNetTimes() {
        return netTimes;
    }

    public void setNetTimes(Integer netTimes) {
        this.netTimes = netTimes;
    }

    public Long getWapGrossBytes() {
        return wapGrossBytes;
    }

    public void setWapGrossBytes(Long wapGrossBytes) {
        this.wapGrossBytes = wapGrossBytes;
    }

    public Long getNetGrossBytes() {
        return netGrossBytes;
    }

    public void setNetGrossBytes(Long netGrossBytes) {
        this.netGrossBytes = netGrossBytes;
    }

    public Integer getReceive1x() {
        return receive1x;
    }

    public void setReceive1x(Integer receive1x) {
        this.receive1x = receive1x;
    }

    public Integer getReceive1xM() {
        return receive1xM;
    }

    public void setReceive1xM(Integer receive1xM) {
        this.receive1xM = receive1xM;
    }

    public Long getSend1x() {
        return send1x;
    }

    public void setSend1x(Long send1x) {
        this.send1x = send1x;
    }

    public Integer getSend1xM() {
        return send1xM;
    }

    public void setSend1xM(Integer send1xM) {
        this.send1xM = send1xM;
    }

    public Long getReceiveEvdo() {
        return receiveEvdo;
    }

    public void setReceiveEvdo(Long receiveEvdo) {
        this.receiveEvdo = receiveEvdo;
    }

    public Long getReceiveEvdoM() {
        return receiveEvdoM;
    }

    public void setReceiveEvdoM(Long receiveEvdoM) {
        this.receiveEvdoM = receiveEvdoM;
    }

    public Long getSendEvdo() {
        return sendEvdo;
    }

    public void setSendEvdo(Long sendEvdo) {
        this.sendEvdo = sendEvdo;
    }

    public Long getSendEvdoM() {
        return sendEvdoM;
    }

    public void setSendEvdoM(Long sendEvdoM) {
        this.sendEvdoM = sendEvdoM;
    }

    public Integer getReceiveWifi() {
        return receiveWifi;
    }

    public void setReceiveWifi(Integer receiveWifi) {
        this.receiveWifi = receiveWifi;
    }

    public Integer getReceiveWifiM() {
        return receiveWifiM;
    }

    public void setReceiveWifiM(Integer receiveWifiM) {
        this.receiveWifiM = receiveWifiM;
    }

    public Long getSendWifi() {
        return sendWifi;
    }

    public void setSendWifi(Long sendWifi) {
        this.sendWifi = sendWifi;
    }

    public Long getSendWifiM() {
        return sendWifiM;
    }

    public void setSendWifiM(Long sendWifiM) {
        this.sendWifiM = sendWifiM;
    }

    public Integer getIfTysxBillFlag() {
        return ifTysxBillFlag;
    }

    public void setIfTysxBillFlag(Integer ifTysxBillFlag) {
        this.ifTysxBillFlag = ifTysxBillFlag;
    }

    public Integer getIfLiveFlag() {
        return ifLiveFlag;
    }

    public void setIfLiveFlag(Integer ifLiveFlag) {
        this.ifLiveFlag = ifLiveFlag;
    }

    public Integer getIfQq() {
        return ifQq;
    }

    public void setIfQq(Integer ifQq) {
        this.ifQq = ifQq;
    }

    public Integer getQqDtimes() {
        return qqDtimes;
    }

    public void setQqDtimes(Integer qqDtimes) {
        this.qqDtimes = qqDtimes;
    }

    public Integer getMmsTimes() {
        return mmsTimes;
    }

    public void setMmsTimes(Integer mmsTimes) {
        this.mmsTimes = mmsTimes;
    }

    public Integer getSpmmsTimes() {
        return spmmsTimes;
    }

    public void setSpmmsTimes(Integer spmmsTimes) {
        this.spmmsTimes = spmmsTimes;
    }

    public Integer getIfSmsFlag() {
        return ifSmsFlag;
    }

    public void setIfSmsFlag(Integer ifSmsFlag) {
        this.ifSmsFlag = ifSmsFlag;
    }

    public Integer getTimesSmsSend() {
        return timesSmsSend;
    }

    public void setTimesSmsSend(Integer timesSmsSend) {
        this.timesSmsSend = timesSmsSend;
    }

    public Integer getIf189mailActiveFlag() {
        return if189mailActiveFlag;
    }

    public void setIf189mailActiveFlag(Integer if189mailActiveFlag) {
        this.if189mailActiveFlag = if189mailActiveFlag;
    }

    public Integer getI4gAmt() {
        return i4gAmt;
    }

    public void setI4gAmt(Integer i4gAmt) {
        this.i4gAmt = i4gAmt;
    }

    public Long getI4gTotBytes() {
        return i4gTotBytes;
    }

    public void setI4gTotBytes(Long i4gTotBytes) {
        this.i4gTotBytes = i4gTotBytes;
    }

    public Integer getI4gDur() {
        return i4gDur;
    }

    public void setI4gDur(Integer i4gDur) {
        this.i4gDur = i4gDur;
    }

    public Integer getI4gOnlineTimes() {
        return i4gOnlineTimes;
    }

    public void setI4gOnlineTimes(Integer i4gOnlineTimes) {
        this.i4gOnlineTimes = i4gOnlineTimes;
    }

    public Integer getI4gBilledDur() {
        return i4gBilledDur;
    }

    public void setI4gBilledDur(Integer i4gBilledDur) {
        this.i4gBilledDur = i4gBilledDur;
    }

    public Integer getI4gLocAmt() {
        return i4gLocAmt;
    }

    public void setI4gLocAmt(Integer i4gLocAmt) {
        this.i4gLocAmt = i4gLocAmt;
    }

    public Long getI4gLocTotBytes() {
        return i4gLocTotBytes;
    }

    public void setI4gLocTotBytes(Long i4gLocTotBytes) {
        this.i4gLocTotBytes = i4gLocTotBytes;
    }

    public Integer getI4gLocDur() {
        return i4gLocDur;
    }

    public void setI4gLocDur(Integer i4gLocDur) {
        this.i4gLocDur = i4gLocDur;
    }

    public Integer getI4gLocOnlineTimes() {
        return i4gLocOnlineTimes;
    }

    public void setI4gLocOnlineTimes(Integer i4gLocOnlineTimes) {
        this.i4gLocOnlineTimes = i4gLocOnlineTimes;
    }

    public Integer getI4gLocBilledDur() {
        return i4gLocBilledDur;
    }

    public void setI4gLocBilledDur(Integer i4gLocBilledDur) {
        this.i4gLocBilledDur = i4gLocBilledDur;
    }

    public Long getI4gMyAmtIn() {
        return i4gMyAmtIn;
    }

    public void setI4gMyAmtIn(Long i4gMyAmtIn) {
        this.i4gMyAmtIn = i4gMyAmtIn;
    }

    public Integer getI4gMyAmtOut() {
        return i4gMyAmtOut;
    }

    public void setI4gMyAmtOut(Integer i4gMyAmtOut) {
        this.i4gMyAmtOut = i4gMyAmtOut;
    }

    public Long getI4gMyTotBytesIn() {
        return i4gMyTotBytesIn;
    }

    public void setI4gMyTotBytesIn(Long i4gMyTotBytesIn) {
        this.i4gMyTotBytesIn = i4gMyTotBytesIn;
    }

    public Integer getI4gMyTotBytesOut() {
        return i4gMyTotBytesOut;
    }

    public void setI4gMyTotBytesOut(Integer i4gMyTotBytesOut) {
        this.i4gMyTotBytesOut = i4gMyTotBytesOut;
    }

    public Integer getI4gMyDurIn() {
        return i4gMyDurIn;
    }

    public void setI4gMyDurIn(Integer i4gMyDurIn) {
        this.i4gMyDurIn = i4gMyDurIn;
    }

    public Integer getI4gMyDurOut() {
        return i4gMyDurOut;
    }

    public void setI4gMyDurOut(Integer i4gMyDurOut) {
        this.i4gMyDurOut = i4gMyDurOut;
    }

    public Integer getI4gMyOnlineTimesIn() {
        return i4gMyOnlineTimesIn;
    }

    public void setI4gMyOnlineTimesIn(Integer i4gMyOnlineTimesIn) {
        this.i4gMyOnlineTimesIn = i4gMyOnlineTimesIn;
    }

    public Integer getI4gMyOnlineTimesOut() {
        return i4gMyOnlineTimesOut;
    }

    public void setI4gMyOnlineTimesOut(Integer i4gMyOnlineTimesOut) {
        this.i4gMyOnlineTimesOut = i4gMyOnlineTimesOut;
    }

    public Integer getI4gMyBilledDurIn() {
        return i4gMyBilledDurIn;
    }

    public void setI4gMyBilledDurIn(Integer i4gMyBilledDurIn) {
        this.i4gMyBilledDurIn = i4gMyBilledDurIn;
    }

    public Integer getI4gMyBilledDurOut() {
        return i4gMyBilledDurOut;
    }

    public void setI4gMyBilledDurOut(Integer i4gMyBilledDurOut) {
        this.i4gMyBilledDurOut = i4gMyBilledDurOut;
    }

    public String getPromNum() {
        return promNum;
    }

    public void setPromNum(String promNum) {
        this.promNum = promNum == null ? null : promNum.trim();
    }

    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName == null ? null : promName.trim();
    }

    public String getSalePolicyName() {
        return salePolicyName;
    }

    public void setSalePolicyName(String salePolicyName) {
        this.salePolicyName = salePolicyName == null ? null : salePolicyName.trim();
    }

    public String getPromStartDt() {
        return promStartDt;
    }

    public void setPromStartDt(String promStartDt) {
        this.promStartDt = promStartDt == null ? null : promStartDt.trim();
    }

    public String getPromEndDt() {
        return promEndDt;
    }

    public void setPromEndDt(String promEndDt) {
        this.promEndDt = promEndDt == null ? null : promEndDt.trim();
    }

	@Override
	public String toString() {
		return "Record [id=" + id + ", dtaDate=" + dtaDate + ", prodSpecId=" + prodSpecId + ", integrationCd="
				+ integrationCd + ", userId=" + userId + ", valueAddedAmt=" + valueAddedAmt + ", cailingAmt="
				+ cailingAmt + ", cailingAmount=" + cailingAmount + ", spSmsAmt=" + spSmsAmt + ", spSmsAmount="
				+ spSmsAmount + ", internetAmt=" + internetAmt + ", internetTotBytes=" + internetTotBytes
				+ ", internetDur=" + internetDur + ", internetOnlineTimes=" + internetOnlineTimes
				+ ", internetBilledDur=" + internetBilledDur + ", i1xAmt=" + i1xAmt + ", i1xTotBytes=" + i1xTotBytes
				+ ", i1xDur=" + i1xDur + ", i1xOnlineTimes=" + i1xOnlineTimes + ", i1xBilledDur=" + i1xBilledDur
				+ ", i1xLocAmt=" + i1xLocAmt + ", i1xLocTotBytes=" + i1xLocTotBytes + ", i1xLocDur=" + i1xLocDur
				+ ", i1xLocOnlineTimes=" + i1xLocOnlineTimes + ", i1xLocBilledDur=" + i1xLocBilledDur + ", i1xMyAmt="
				+ i1xMyAmt + ", i1xMyTotBytes=" + i1xMyTotBytes + ", i1xMyDur=" + i1xMyDur + ", i1xMyOnlineTimes="
				+ i1xMyOnlineTimes + ", i1xMyBilledDur=" + i1xMyBilledDur + ", wlanAmt=" + wlanAmt + ", wlanTotBytes="
				+ wlanTotBytes + ", wlanDur=" + wlanDur + ", wlanOnlineTimes=" + wlanOnlineTimes + ", wlanBilledDur="
				+ wlanBilledDur + ", wlanLocAmt=" + wlanLocAmt + ", wlanLocTotBytes=" + wlanLocTotBytes
				+ ", wlanLocDur=" + wlanLocDur + ", wlanLocOnlineTimes=" + wlanLocOnlineTimes + ", wlanLocBilledDur="
				+ wlanLocBilledDur + ", wlanMyAmt=" + wlanMyAmt + ", wlanMyTotBytes=" + wlanMyTotBytes + ", wlanMyDur="
				+ wlanMyDur + ", wlanMyOnlineTimes=" + wlanMyOnlineTimes + ", wlanMyBilledDur=" + wlanMyBilledDur
				+ ", i3gAmt=" + i3gAmt + ", i3gTotBytes=" + i3gTotBytes + ", i3gDur=" + i3gDur + ", i3gOnlineTimes="
				+ i3gOnlineTimes + ", i3gBilledDur=" + i3gBilledDur + ", i3gLocAmt=" + i3gLocAmt + ", i3gLocTotBytes="
				+ i3gLocTotBytes + ", i3gLocDur=" + i3gLocDur + ", i3gLocOnlineTimes=" + i3gLocOnlineTimes
				+ ", i3gLocBilledDur=" + i3gLocBilledDur + ", i3gMyAmt=" + i3gMyAmt + ", i3gMyTotBytes=" + i3gMyTotBytes
				+ ", i3gMyDur=" + i3gMyDur + ", i3gMyOnlineTimes=" + i3gMyOnlineTimes + ", i3gMyBilledDur="
				+ i3gMyBilledDur + ", innerSendSmsAmt=" + innerSendSmsAmt + ", innerSendSmsTimes=" + innerSendSmsTimes
				+ ", interSendSmsAmt=" + interSendSmsAmt + ", interSendSmsTimes=" + interSendSmsTimes + ", voiceTimes="
				+ voiceTimes + ", voiceDur=" + voiceDur + ", voiceAmt=" + voiceAmt + ", voiceBilledDur="
				+ voiceBilledDur + ", voiceCallingTimes=" + voiceCallingTimes + ", voiceCallingDur=" + voiceCallingDur
				+ ", voiceCallingAmt=" + voiceCallingAmt + ", voiceCallingBilledDur=" + voiceCallingBilledDur
				+ ", voiceCalledTimes=" + voiceCalledTimes + ", voiceCalledDur=" + voiceCalledDur + ", voiceCalledAmt="
				+ voiceCalledAmt + ", voiceCalledBilledDur=" + voiceCalledBilledDur + ", locCallingTimes="
				+ locCallingTimes + ", locCallingDur=" + locCallingDur + ", locCallingAmt=" + locCallingAmt
				+ ", locCallingBilledDur=" + locCallingBilledDur + ", dddCallingTimes=" + dddCallingTimes
				+ ", dddCallingDur=" + dddCallingDur + ", dddCallingAmt=" + dddCallingAmt + ", dddCallingBilledDur="
				+ dddCallingBilledDur + ", iddCallingTimes=" + iddCallingTimes + ", iddCallingDur=" + iddCallingDur
				+ ", iddCallingAmt=" + iddCallingAmt + ", iddCallingBilledDur=" + iddCallingBilledDur
				+ ", gatCallingTimes=" + gatCallingTimes + ", gatCallingDur=" + gatCallingDur + ", gatCallingAmt="
				+ gatCallingAmt + ", gatCallingBilledDur=" + gatCallingBilledDur + ", innerMyCallingTimes="
				+ innerMyCallingTimes + ", innerMyCallingDur=" + innerMyCallingDur + ", innerMyCallingAmt="
				+ innerMyCallingAmt + ", innerMyCallingBilledDur=" + innerMyCallingBilledDur + ", interMyCallingTimes="
				+ interMyCallingTimes + ", interMyCallingDur=" + interMyCallingDur + ", interMyCallingAmt="
				+ interMyCallingAmt + ", interMyCallingBilledDur=" + interMyCallingBilledDur + ", gatMyCallingTimes="
				+ gatMyCallingTimes + ", gatMyCallingDur=" + gatMyCallingDur + ", gatMyCallingAmt=" + gatMyCallingAmt
				+ ", gatMyCallingBilledDur=" + gatMyCallingBilledDur + ", locCalledTimes=" + locCalledTimes
				+ ", locCalledDur=" + locCalledDur + ", locCalledAmt=" + locCalledAmt + ", locCalledBilledDur="
				+ locCalledBilledDur + ", innerMyCalledTimes=" + innerMyCalledTimes + ", innerMyCalledDur="
				+ innerMyCalledDur + ", innerMyCalledAmt=" + innerMyCalledAmt + ", innerMyCalledBilledDur="
				+ innerMyCalledBilledDur + ", interMyCalledTimes=" + interMyCalledTimes + ", interMyCalledDur="
				+ interMyCalledDur + ", interMyCalledAmt=" + interMyCalledAmt + ", interMyCalledBilledDur="
				+ interMyCalledBilledDur + ", gatMyCalledTimes=" + gatMyCalledTimes + ", gatMyCalledDur="
				+ gatMyCalledDur + ", gatMyCalledAmt=" + gatMyCalledAmt + ", gatMyCalledBilledDur="
				+ gatMyCalledBilledDur + ", prodInstCid=" + prodInstCid + ", custCid=" + custCid + ", acntCid="
				+ acntCid + ", totalAmt=" + totalAmt + ", totalRentalAmt=" + totalRentalAmt + ", totalUseAmt="
				+ totalUseAmt + ", itemDeviceModel=" + itemDeviceModel + ", deviceClass=" + deviceClass + ", gType="
				+ gType + ", unitPrice=" + unitPrice + ", ifWap=" + ifWap + ", ifNet=" + ifNet + ", wapTimes="
				+ wapTimes + ", netTimes=" + netTimes + ", wapGrossBytes=" + wapGrossBytes + ", netGrossBytes="
				+ netGrossBytes + ", receive1x=" + receive1x + ", receive1xM=" + receive1xM + ", send1x=" + send1x
				+ ", send1xM=" + send1xM + ", receiveEvdo=" + receiveEvdo + ", receiveEvdoM=" + receiveEvdoM
				+ ", sendEvdo=" + sendEvdo + ", sendEvdoM=" + sendEvdoM + ", receiveWifi=" + receiveWifi
				+ ", receiveWifiM=" + receiveWifiM + ", sendWifi=" + sendWifi + ", sendWifiM=" + sendWifiM
				+ ", ifTysxBillFlag=" + ifTysxBillFlag + ", ifLiveFlag=" + ifLiveFlag + ", ifQq=" + ifQq + ", qqDtimes="
				+ qqDtimes + ", mmsTimes=" + mmsTimes + ", spmmsTimes=" + spmmsTimes + ", ifSmsFlag=" + ifSmsFlag
				+ ", timesSmsSend=" + timesSmsSend + ", if189mailActiveFlag=" + if189mailActiveFlag + ", i4gAmt="
				+ i4gAmt + ", i4gTotBytes=" + i4gTotBytes + ", i4gDur=" + i4gDur + ", i4gOnlineTimes=" + i4gOnlineTimes
				+ ", i4gBilledDur=" + i4gBilledDur + ", i4gLocAmt=" + i4gLocAmt + ", i4gLocTotBytes=" + i4gLocTotBytes
				+ ", i4gLocDur=" + i4gLocDur + ", i4gLocOnlineTimes=" + i4gLocOnlineTimes + ", i4gLocBilledDur="
				+ i4gLocBilledDur + ", i4gMyAmtIn=" + i4gMyAmtIn + ", i4gMyAmtOut=" + i4gMyAmtOut + ", i4gMyTotBytesIn="
				+ i4gMyTotBytesIn + ", i4gMyTotBytesOut=" + i4gMyTotBytesOut + ", i4gMyDurIn=" + i4gMyDurIn
				+ ", i4gMyDurOut=" + i4gMyDurOut + ", i4gMyOnlineTimesIn=" + i4gMyOnlineTimesIn
				+ ", i4gMyOnlineTimesOut=" + i4gMyOnlineTimesOut + ", i4gMyBilledDurIn=" + i4gMyBilledDurIn
				+ ", i4gMyBilledDurOut=" + i4gMyBilledDurOut + ", promNum=" + promNum + ", promName=" + promName
				+ ", salePolicyName=" + salePolicyName + ", promStartDt=" + promStartDt + ", promEndDt=" + promEndDt
				+ "]";
	}
    
    
}