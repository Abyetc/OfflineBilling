package com.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 读取XLS文件的内容
 * 
 * @author Aby
 * 
 */
@SuppressWarnings("restriction")
public class XlsUtils {

	/**
	 * 读取一个excel文件的内容
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// extractor();
		getUserInfo();
	}

	// 获取用户的信息，包括ID、统计时间、产品规格标识
	public static List<List<String>> getUserInfo() throws Exception {
		String inputFileName = PropertiesUtils.getInputFileName();
		InputStream ips = new FileInputStream(inputFileName);

		HSSFWorkbook wb = new HSSFWorkbook(ips);
		HSSFSheet sheet = wb.getSheetAt(1);

		List<List<String>> result = new LinkedList<>();

		int rowNum = sheet.getLastRowNum() + 1;

		for (int i = 1; i < rowNum; i++) {
			LinkedList<String> data = new LinkedList<String>();
			HSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 4; j++) {
				HSSFCell cell = row.getCell(j);
				if (j < 2) {
					data.add((int)cell.getNumericCellValue() + "");
//					System.out.println((int)cell.getNumericCellValue() + "");
				}else {
					data.add(cell.toString());
//					System.out.println(cell.toString());
				}
			}
//			System.out.println();
			result.add(data);
		}
		return result;
	}

	// 获取用户的使用情况详细数据
	public static List<List<Integer>> getUserData() throws Exception {
		String inputFileName = PropertiesUtils.getInputFileName();
		InputStream ips = new FileInputStream(inputFileName);

		HSSFWorkbook wb = new HSSFWorkbook(ips);
		HSSFSheet sheet = wb.getSheetAt(1);

		List<List<Integer>> result = new LinkedList<>();

		int rowNum = sheet.getLastRowNum() + 1;
		int colNum = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i < rowNum; i++) {
			LinkedList<Integer> data = new LinkedList<Integer>();

			HSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colNum; j++) {
				if ((j >= 4 && j <= 118) || (j >= 122 && j <= 124) || (j >= 156 && j <= 175)) {
					HSSFCell cell = row.getCell(j);

					if (cell == null) {
						data.add(0);
					} else {
						int value = (int) cell.getNumericCellValue();
						data.add(value);
					}
				}
			}
			result.add(data);
		}
		return result;
	}
	
}