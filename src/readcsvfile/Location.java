package readcsvfile;

public class Location {
	
	private String province;
	private String district;
	private String localBody;
	
	public Location() {
		
	}
	
	public Location(String province, String district, String localBody) {
		this.province = province;
		this.district = district;
		this.localBody = localBody;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getLocalBody() {
		return localBody;
	}
	public void setLocalBody(String localBody) {
		this.localBody = localBody;
	}
	
	

}
