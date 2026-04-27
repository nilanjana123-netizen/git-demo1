// ExcelUtils.java

package org.example.cucumber.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

    public static List<String> getAllLinks() {

        List<String> links = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(
                    "src/test/resources/testdata/loginData.xlsx"
            );

            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            int rowCount = sheet.getPhysicalNumberOfRows();

            for (int i = 1; i < rowCount; i++) {

                Row row = sheet.getRow(i);

                if (row != null && row.getCell(0) != null) {

                    String linkName =
                            row.getCell(0).getStringCellValue();

                    links.add(linkName);
                }
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return links;
    }
}