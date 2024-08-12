package readcsvfile;

import java.util.List;

public class LocationExecutor {

	public static void main(String[] args) {
		LocationIO locationIO = new LocationIO();
		List<Location> location = locationIO.readLocations();
	}
}
