

package test2;
import java.io.FileInputStream;
import java.io.IOException;


public class Datadriventestforexcelutils {
	//datadriven for excel
    public static String[][] getData(String filePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        fordvisit2024 workbook = fordvisit2024("\"D:Fordlogin.xlsx\"");
        Sheet sheet = workbook.getSheet("sheet1");

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        String[][] data = new String[rows - 1][cols];
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
        workbook.close();
        return data;
    }

	
}