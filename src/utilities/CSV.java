package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	//helper function: reads the data from CSV file and return the list

	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataRow = br.readLine())!=null)
			{
			String[] dataRecords = dataRow.split(","); 
			data.add(dataRecords);
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could Not find File");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("could not read the file");
			e.printStackTrace();
		}
		
		return data;
	}
}
