package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;



public class ExcelTest {
	@Test
	
/*public void readExcel(String filePath,String fileName,String sheetName) throws IOException
{
	
	File file=new File(filePath+"\\"+fileName);
	FileInputStream inputStream=new FileInputStream(file);
	Workbook guruBook=null; 
	String fileExtension=fileName.substring(fileName.indexOf("."));
    
	if(fileExtension.equals(".xlsx"))
    {
		
    //	guruBook=new XSSFWorkbook();
    }
    else if(fileExtension.equals(".xls")){
    	
    	guruBook=new HSSFWorkbook(inputStream);
    }
    else
    {
    	System.out.println("Invalid file Extension");
    }
    Sheet guruSheet=guruBook.getSheet(sheetName);
    int rowCount=guruSheet.getLastRowNum()-guruSheet.getFirstRowNum();
      for(int i=0;i<rowCount+1;i++){
    	Row row=guruSheet.getRow(i);
    	for(int j=0;j<row.getLastCellNum();j++){
    		
    		System.out.print(row.getCell(j).getStringCellValue()+"||");
    	}
    	System.out.println();
    }
    guruBook.close();
    inputStream.close();
    
}
*/
	public void writeExcel() throws Exception
			//String filePath,String fileName,String sheetName,String[] data) throws IOException
	{
		String fileName="NamesXLSFile.xls";
		//String[] data1 ={"Balamani","Sandri","India"};
		String[] data ={"Balamani","Sandri","India"};
		String sheetName="Sheet1";
		String filePath=System.getProperty("user.dir")+"\\input_files";
		File file=new File(filePath+"\\"+fileName);
		FileInputStream inputStream=new FileInputStream(file);
		Workbook guruBook=null; 
		String fileExtension=fileName.substring(fileName.indexOf("."));
	    
		if(fileExtension.equals(".xlsx"))
	    {
			
	    //guruBook=new XSSFWorkbook();
	    }
	    else if(fileExtension.equals(".xls")){
	    	
	    	guruBook=new HSSFWorkbook(inputStream);
	    }
	    else
	    {
	    	System.out.println("Invalid file Extension");
	    }
	    Sheet guruSheet=guruBook.getSheet(sheetName);
	    int rowCount=guruSheet.getLastRowNum()-guruSheet.getFirstRowNum();
	    //System.out.println("RowCOunt:"+rowCount);
	    //System.out.println(row);
	    Row row=guruSheet.getRow(0);
	    Cell celd=guruSheet.getRow(3).getCell(0);
	    String cellvalue=celd.getStringCellValue();
	    System.out.println(cellvalue);
	    
	      Row newRow=guruSheet.createRow(rowCount+1);
	    	for(int j=0;j<row.getLastCellNum();j++){
	    		
	    		Cell newCell=newRow.createCell(j);
	    		newCell.setCellValue(data[j]);
	    		
	    	}
	    	//inputStream.close();
	    	FileOutputStream outputStream=new FileOutputStream(file);
	    	guruBook.write(outputStream);
	    	outputStream.close();
	    
	}


/*public static void main(String args[])throws Exception{
	String filePath=System.getProperty("user.dir")+"\\input_files";
			//"C:\\Users\\RaviKiran\\Documents\\Selenium2\\Project2\\input_files";
			String fileName="NamesXLSFile.xls";
			String[] data1 ={"Balamani","Sandri","India"};
			ExcelTest objref=new ExcelTest();
			//objref.readExcel(filePath,fileName,"Sheet1");
			objref.writeExcel(filePath, fileName, "Sheet1", data1);
			
}*/
}