package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelSheetReading {
    public static void main(String [] args) throws Exception{
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\XYZ.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        for(int i=0;i<5;i++){
            Row row = sheet.getRow(i);
            System.out.println(i+1 +"th element "+row.getCell(0));
            System.out.println("Loop Entered");
        }
        file.close();
    }
}
