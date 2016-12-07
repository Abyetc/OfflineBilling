package com.aby.model;

public class Bill extends BillKey {
    private Integer totalRentalAmt;

    private Integer totalUseAmt;

    private Integer totalAmt;

    private Integer valueAddedAmt;

    private Integer cailingAmt;

    private Integer spSmsAmt;

    private Integer internetAmt;

    private Integer wlanAmt;

    private Integer innerSendSmsAmt;

    private Integer interSendSmsAmt;

    private Integer voiceAmt;

    private Integer voiceCallingAmt;

    private Integer voiceCalledAmt;

    private Integer locCallingAmt;

    private Integer dddCallingAmt;

    private Integer iddCallingAmt;

    private Integer gatCallingAmt;

    private Integer innerMyCallingAmt;

    private Integer interMyCallingAmt;

    private Integer gatMyCallingAmt;

    private Integer locCalledAmt;

    private Integer innerMyCalledAmt;

    private Integer interMyCalledAmt;

    private Integer gatMyCalledAmt;

    private Integer mmsAmt;

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

    public Integer getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Integer totalAmt) {
        this.totalAmt = totalAmt;
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

    public Integer getSpSmsAmt() {
        return spSmsAmt;
    }

    public void setSpSmsAmt(Integer spSmsAmt) {
        this.spSmsAmt = spSmsAmt;
    }

    public Integer getInternetAmt() {
        return internetAmt;
    }

    public void setInternetAmt(Integer internetAmt) {
        this.internetAmt = internetAmt;
    }

    public Integer getWlanAmt() {
        return wlanAmt;
    }

    public void setWlanAmt(Integer wlanAmt) {
        this.wlanAmt = wlanAmt;
    }

    public Integer getInnerSendSmsAmt() {
        return innerSendSmsAmt;
    }

    public void setInnerSendSmsAmt(Integer innerSendSmsAmt) {
        this.innerSendSmsAmt = innerSendSmsAmt;
    }

    public Integer getInterSendSmsAmt() {
        return interSendSmsAmt;
    }

    public void setInterSendSmsAmt(Integer interSendSmsAmt) {
        this.interSendSmsAmt = interSendSmsAmt;
    }

    public Integer getVoiceAmt() {
        return voiceAmt;
    }

    public void setVoiceAmt(Integer voiceAmt) {
        this.voiceAmt = voiceAmt;
    }

    public Integer getVoiceCallingAmt() {
        return voiceCallingAmt;
    }

    public void setVoiceCallingAmt(Integer voiceCallingAmt) {
        this.voiceCallingAmt = voiceCallingAmt;
    }

    public Integer getVoiceCalledAmt() {
        return voiceCalledAmt;
    }

    public void setVoiceCalledAmt(Integer voiceCalledAmt) {
        this.voiceCalledAmt = voiceCalledAmt;
    }

    public Integer getLocCallingAmt() {
        return locCallingAmt;
    }

    public void setLocCallingAmt(Integer locCallingAmt) {
        this.locCallingAmt = locCallingAmt;
    }

    public Integer getDddCallingAmt() {
        return dddCallingAmt;
    }

    public void setDddCallingAmt(Integer dddCallingAmt) {
        this.dddCallingAmt = dddCallingAmt;
    }

    public Integer getIddCallingAmt() {
        return iddCallingAmt;
    }

    public void setIddCallingAmt(Integer iddCallingAmt) {
        this.iddCallingAmt = iddCallingAmt;
    }

    public Integer getGatCallingAmt() {
        return gatCallingAmt;
    }

    public void setGatCallingAmt(Integer gatCallingAmt) {
        this.gatCallingAmt = gatCallingAmt;
    }

    public Integer getInnerMyCallingAmt() {
        return innerMyCallingAmt;
    }

    public void setInnerMyCallingAmt(Integer innerMyCallingAmt) {
        this.innerMyCallingAmt = innerMyCallingAmt;
    }

    public Integer getInterMyCallingAmt() {
        return interMyCallingAmt;
    }

    public void setInterMyCallingAmt(Integer interMyCallingAmt) {
        this.interMyCallingAmt = interMyCallingAmt;
    }

    public Integer getGatMyCallingAmt() {
        return gatMyCallingAmt;
    }

    public void setGatMyCallingAmt(Integer gatMyCallingAmt) {
        this.gatMyCallingAmt = gatMyCallingAmt;
    }

    public Integer getLocCalledAmt() {
        return locCalledAmt;
    }

    public void setLocCalledAmt(Integer locCalledAmt) {
        this.locCalledAmt = locCalledAmt;
    }

    public Integer getInnerMyCalledAmt() {
        return innerMyCalledAmt;
    }

    public void setInnerMyCalledAmt(Integer innerMyCalledAmt) {
        this.innerMyCalledAmt = innerMyCalledAmt;
    }

    public Integer getInterMyCalledAmt() {
        return interMyCalledAmt;
    }

    public void setInterMyCalledAmt(Integer interMyCalledAmt) {
        this.interMyCalledAmt = interMyCalledAmt;
    }

    public Integer getGatMyCalledAmt() {
        return gatMyCalledAmt;
    }

    public void setGatMyCalledAmt(Integer gatMyCalledAmt) {
        this.gatMyCalledAmt = gatMyCalledAmt;
    }

    public Integer getMmsAmt() {
        return mmsAmt;
    }

    public void setMmsAmt(Integer mmsAmt) {
        this.mmsAmt = mmsAmt;
    }
    
    
    /**
     *	从原来的一条记录中提取关于金额的部分，存入到新表中，方便做对比，而不用使用join联结两个表 
     * @param record
     * @return
     */
    public static Bill getBillFromRecord(Record record){
    	Bill bill = generateBill(record, record.getPromNum());
    	bill.setTotalRentalAmt(record.getTotalRentalAmt());
    	bill.setWlanAmt(record.getWlanAmt());
    	bill.setInnerSendSmsAmt(record.getInnerSendSmsAmt());
    	bill.setLocCallingAmt(record.getLocCallingAmt());
    	bill.setDddCallingAmt(record.getDddCallingAmt());
    	bill.setInnerMyCallingAmt(record.getInnerMyCallingAmt());
    	bill.setLocCalledAmt(record.getLocCalledAmt());
    	bill.setInnerMyCalledAmt(record.getInnerMyCalledAmt());
    	bill.setMmsAmt(record.getMmsTimes());				// 设置彩信费用
    	
    	int callingAmt = record.getLocCallingAmt() + record.getDddCallingAmt() + record.getIddCallingAmt() + record.getGatCallingAmt() + record.getInnerMyCallingAmt() + record.getInterMyCallingAmt() + record.getGatMyCallingAmt();
    	
    	
    	bill.setVoiceCallingAmt(callingAmt);
    	int calledAmt = record.getLocCalledAmt() + record.getInnerMyCalledAmt() + record.getInterMyCalledAmt() + record.getGatMyCalledAmt();
    	bill.setVoiceCalledAmt(calledAmt);
    	bill.setVoiceAmt(calledAmt + callingAmt);
    	bill.setInternetAmt(record.getInternetAmt());
    	
    	int valueAddedAmt = bill.getCailingAmt() + bill.getSpSmsAmt() + bill.getInternetAmt() + bill.getInnerSendSmsAmt() + bill.getInterSendSmsAmt() + bill.getMmsAmt();
    	bill.setValueAddedAmt(valueAddedAmt);
    	
    	bill.setTotalUseAmt(valueAddedAmt + bill.getVoiceAmt());
    	
    	bill.setTotalAmt(bill.getTotalUseAmt() + bill.getTotalRentalAmt());
    	return bill;
    }
    
    
    /**
     * 从record实例（也就是一条用户话单数据）中产生一个bill
     * @param record
     * @param packageId		新套餐的ID
     * @return
     */
    public static Bill generateBill(Record record, String packageId){
    	Bill bill = new Bill();
    	
    	bill.setRecordId(record.getId());
    	bill.setPackageId(packageId);
    	bill.setCailingAmt(record.getCailingAmt());
    	bill.setSpSmsAmt(record.getSpSmsAmt());
    	bill.setInterSendSmsAmt(record.getInterSendSmsAmt());
    	bill.setGatCallingAmt(record.getGatCallingAmt());
    	bill.setGatMyCalledAmt(record.getGatMyCalledAmt());
    	bill.setGatMyCallingAmt(record.getGatMyCallingAmt());
    	bill.setIddCallingAmt(record.getIddCallingAmt());
    	bill.setInterMyCalledAmt(record.getInterMyCalledAmt());
    	bill.setInterMyCallingAmt(record.getInterMyCallingAmt());
    	
    	return bill;
    }
}