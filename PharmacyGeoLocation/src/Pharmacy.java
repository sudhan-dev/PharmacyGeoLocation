
public class Pharmacy {

	String pharmaName;
	Integer lattitude;
	Integer longitude;
	String contactNumber;
	String address;
	public double distance;

	public String getPharmaName() {
		return pharmaName;
	}

	public void setPharmaName(String pharmaName) {
		this.pharmaName = pharmaName;
	}

	public Integer getLattitude() {
		return lattitude;
	}

	public void setLattitude(Integer lattitude) {
		this.lattitude = lattitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Pharmacy(String pharmaName, Integer lattitude, Integer longitude, String contactNumber, String address) {
		this.pharmaName = pharmaName;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.contactNumber = contactNumber;
		this.address = address;

	}

	public Pharmacy() {

	}

}
