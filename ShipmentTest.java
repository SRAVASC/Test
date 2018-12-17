package exceldata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShipmentTest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Workbook wb;
//		Sheet sh1;
//		
//	  } 
//	
	@DataProvider(name = "DDTtest1")
	 public Object[][] createData1() throws IOException   {
		
		ReadExcel dataobject=new ReadExcel();
		//"C:/Selenium jars_QA2QE_LC/Testdata/Shippmentdata.xlsx"
		Sheet st=dataobject.readExcel("C:/Selenium jars_QA2QE_LC/Testdata/","Shippmentdata.xlsx","Sheet1");
	String[][] data1=dataobject.extractdata(st);
	
		String[][] data2=dataobject.UpdateArrivalPort(data1);
		
		return data2;
		
		
	}
	 
	  
	 @Test(dataProvider="DDTtest1")
	public void displayShipmentValues(String ShipmentID,String ShipmentName,String Weight,String ArrivalPort, String Departure,String TotalProfit){
		 
		
		 String output=String.format("%-15s%-25s%-25s%-25s%-15s%15s",ShipmentID,ShipmentName,Weight,ArrivalPort,Departure,TotalProfit) ;
//String output = String.format("%s\t%s\t%s\t%s\t%s\t%s",ShipmentID,ShipmentName,Weight,ArrivalPort,Departure,TotalProfit);
		System.out.println(output);
	}
	}

@test(water)

