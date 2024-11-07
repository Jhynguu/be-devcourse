package com.exam;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelEx04 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./excel.xls"));

            Sheet sheet = workbook.getSheet(0);

            for (int i = 3; i < sheet.getRows(); i++) {
                // ( 열, 행 )
                Cell cell1 = sheet.getCell(13, i);
                Cell cell2 = sheet.getCell(14, i);
                Cell cell3 = sheet.getCell(15, i);
                System.out.printf("%s %s %s %n",
                        cell1.getContents(), cell2.getContents(), cell3.getContents());
            }

        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (BiffException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if (workbook != null) {
                workbook.close();
            }
        }
    }
}