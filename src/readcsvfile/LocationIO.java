package readcsvfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocationIO {
	
	public List<Location> readLocations(){
		try {
			List<Location> locationList = new ArrayList<Location>();
			String filePath = "C:/Users/hp/Downloads/location.csv";
			File csvFile = Paths.get(filePath).toFile();
			Scanner scanner = new Scanner(csvFile);
			while(scanner.hasNext()) {
			     String lineData = scanner.nextLine();
			     String[] splitedData =  lineData.split(",");
			     Location location = new Location();
			     location.setProvince(splitedData[0]);
			     location.setDistrict(splitedData[1]);
			     location.setLocalBody(splitedData[3]);
			     
			     locationList.add(location);
			}
			scanner.close();
			return locationList;
		}catch (FileNotFoundException fileNotFoundException) {
			return new ArrayList<Location>();
		}
	}

}
