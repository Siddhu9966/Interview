package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelSheetWriting {
    public static void main(String[] args) throws Exception {
        String[] names={"Vijay","ravi","sadiq","harish","krishna"};
        FileInputStream inputStream = new FileInputStream("C:\\Users\\SAI SIDDHARDHA\\IdeaProjects\\SeleniumFirstProject\\src\\main\\resources\\XYZ.xlsx");
        Workbook book = new XSSFWorkbook(inputStream);
        Sheet sheet1= book.getSheet("Sheet1");
        for(int i=0;i<names.length;i++) {
            Row row1 = sheet1.createRow(i);
            Cell cell = row1.createCell(0);
            cell.setCellValue(names[i]);
            System.out.println("For Loop Entered");
        }

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\SAI SIDDHARDHA\\IdeaProjects\\SeleniumFirstProject\\src\\main\\resources\\XYZ.xlsx");
        book.write(outputStream);
        outputStream.close();
        System.out.println("Completed!!");
        System.out.println("Present Working Directory "+System.getProperty("user.dir"));
    }
}
