package com.xworkz.exceltodatabase.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.exceltodatabase.entity.PersonalInfo;

public class ExcelToDatabase {
	
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = {"Id", "FirstName", "LastName", "Country", "Telephone"};
	static String SHEET = "Details";
	
	public static boolean forExcelFormat(MultipartFile mfile) {
		
		if(!TYPE.equals(mfile.getContentType())) {
			return false;
		}
		
		return true;
		
	}
	
	
	public static List<PersonalInfo> excelToDatabase(InputStream input) throws IOException{
		
		Workbook work = new XSSFWorkbook(input);
		
		Sheet sheet = work.getSheet(SHEET);
		
		Iterator<Row> rows = sheet.iterator();
		
		List<PersonalInfo> personal = new ArrayList<PersonalInfo>();
		
		int rowNumber = 0;
		while(rows.hasNext()) {
			Row currentRow = rows.next();
			
			 // skiping the header
			if(rowNumber == 0) {
				rowNumber++;
				continue;
			}
			
			
		Iterator<Cell> cellsInRow = currentRow.iterator();
			
		PersonalInfo info = new PersonalInfo();
		
		int cellIdx = 0;
		while(cellsInRow.hasNext()) {
			Cell currentCell = cellsInRow.next();
			
			switch(cellIdx) {
			case 0:
				info.setId((int) currentCell.getNumericCellValue()) ;
				break;
				
			case 1:
				info.setFirstName(currentCell.getStringCellValue());
				break;
				
			case 2:
				info.setLastName(currentCell.getStringCellValue());
				break;
				
			case 3:
				info.setCountry(currentCell.getStringCellValue());
				break;
				
			case 4:
				info.setPhNo((long) currentCell.getNumericCellValue());
				break;
				
				default:
				break;
				
			}
			
			cellIdx++;
			
		}
		
		personal.add(info);
			
	}
		work.close();
		
		return personal;
		
	}	

}
