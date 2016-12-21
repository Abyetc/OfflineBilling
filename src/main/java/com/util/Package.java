package com.util;

import com.aby.model.Record;

public class Package {

	/**
	 * 计算超过免费部分的金额
	 * @param freeAmount	免费数量
	 * @param unitPrice		超过部分的单价
	 * @param amount		所有使用数量
	 * @return				超过部分的金额
	 */
	public static int exceedAmount(long freeAmount, int unitPrice, long amount) {
		if (amount <= freeAmount) {
			return 0;
		} else {
			return (int) (amount - freeAmount) * unitPrice;
		}
	}

	/**
	 *	将byte转为KB 
	 * @param bytes
	 * @return
	 */
	public static long countKB(long bytes) {
		return (long) Math.ceil(bytes / 1024.0);
	}

	/**
	 *	将byte转为MB 
	 * @param bytes
	 * @return
	 */
	public static long countMB(long bytes) {
		long kb = countKB(bytes);
		return (long) Math.ceil(kb / 1024.0);
	}

	/**
	 *	将byte转为GB 
	 * @param bytes
	 * @return
	 */
	public static long countGB(long bytes) {
		long mb = countMB(bytes);
		return (long) Math.ceil(mb / 1024.0);
	}

	/**
	 * 分段收费
	 * 适用场景：流量超过部分，每1M收费0.03元，100M-500M之间不收费。超过500M收费和第一个500M一样
	 * @param total		总使用量
	 * @param free		免费量
	 * @param unit		超过部分单价
	 * @param freeBegin	超过部分，免费开始节点
	 * @param freeEnd	超过部分，免费结束节点
	 * @return			返回应收费用
	 */
	public static int stageCharge(int total, int free, int unit, int freeBegin, int freeEnd) {
		if (total <= free) {
			return 0;
		}

		int exceed = total - free;
		int count = exceed / freeEnd;
		int result = count * (unit * freeBegin);
		result += (exceed % freeEnd) * unit;
		return result;
	}

	/**
	 * 获取本地上网总流量
	 * @param record	一个用户一个月的使用记录
	 * @return
	 */
	public static long getLocalInternetAmount(Record record){
		long amount = record.getI1xLocTotBytes() + record.getI3gLocTotBytes() + record.getI4gLocTotBytes();
		return amount;
	}
	
	/**
	 * 获取漫游上网总流量
	 * @param record	一个用户一个月的使用记录
	 * @return
	 */
	public static long getMyInternetAmount(Record record){
		long amount = record.getI1xMyTotBytes() + record.getI3gMyTotBytes() + record.getI4gMyTotBytesIn();
		return amount;
	}
}
