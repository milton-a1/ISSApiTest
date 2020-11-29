package modelo;

public class IssPosition {
	public String longitude;
	public String latitude;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "IssPosition [longitude=" + longitude + ", latitude=" + latitude + "]";
	}
}
