package Pages;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrailandErrorClass {
	public static void main(String[] args) throws IOException {
		// Getting into a Book 
/*		XSSFWorkbook book = new  XSSFWorkbook();
		
		// Create the using the book's object name : 
		XSSFSheet sheet = book.createSheet();
		
		// Storing the data in 2 dimensional array : 
		Object [] [] data = {
				{"Name", "Age", "Salary"},
				{"Ranjith", 25 , 39000},
				{"Vicky ",25,24000},
				{"Kamal",22,19000}
		};
		
		int rowcount = 0;
		int coulmncount = 0;
		
		// Using For each for getting into each row : 
		for (Object [] row1 : data) {
			XSSFRow createRow = sheet.createRow(rowcount++);
			
			// For each to get into the column : 
			for (Object col : row1) {
			XSSFCell cell =	createRow.createCell(coulmncount++);
			
			// Checking the type of data and making entry  : 
				if (col instanceof String ) {
					cell.setCellValue((String)col);
					
				}else if (col instanceof Integer) {
					cell.setCellValue((Integer)col);
				}
			}
		}
		FileOutputStream output = new FileOutputStream("C:\\Users\\ralaguchamy\\OneDrive - IGT PLC\\Desktop\\Learning\\Eclipse 9  9 2024\\MiniProject1DemoBlaze\\src\\test\\resources//studentdetails.xlsx");
		book.write(output);
	book.close();  */
		
		// Reading the data from Excel sheet : 
		XSSFWorkbook book = new XSSFWorkbook("C:\\\\Users\\\\ralaguchamy\\\\OneDrive - IGT PLC\\\\Desktop\\\\Learning\\\\Eclipse 9  9 2024\\\\MiniProject1DemoBlaze\\\\src\\\\test\\\\resources//studentdetails.xlsx");
		
		// Getting into the sheet : 
		XSSFSheet sheet = book.getSheet("Sheet0");
		
		// Get the no of rows :
		int rowcount  = sheet.getLastRowNum();
		
		// Get the number of Column : 
		int columncount = sheet.getRow(0).getLastCellNum();
		
		// Creating the 2 dimensional array :
		String [] [] data = new String [rowcount] [columncount];
		
		// Getting inside the row using the For and inner for loop :
		
		for (int i=1 ; i<=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			// get into the column :
			for (int j = 0; j<columncount; j++){
				XSSFCell cell = row.getCell(j);
				
				// Read the value :
				//  System.out.print( cell.getStringCellValue() + " ");
				
				// To store it in 2 dimensional Array :
				data [i-1] [j] = cell.getStringCellValue();
				
			}
			//  System.out.println();
		}
		// Printing the 2 dimensional array :
		
		for (String [] row : data) {
			for (String x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		book.close();
	}
}

