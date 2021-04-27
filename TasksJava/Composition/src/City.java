public class City {
	private String cityname;
	private String citypresident;
	private double city_area_km;

public City(String cityname, String citypresident, double city_area_km) {
	this.cityname=cityname;
	this.citypresident=citypresident;
	this.city_area_km=city_area_km;
}

public String getCityname() {
	return cityname;
}

public void setCityname(String cityname) {
	this.cityname=cityname;
}

public String getCitypresident() {
	return citypresident;
}

public void setCitypresident(String citypresident) {
	this.citypresident=citypresident;
}

public double getCity_area_km() {
	return city_area_km;
}

public void setCity_area_km(double city_area_km) {
	this.city_area_km=city_area_km;
}

//my Method
public void CityMyMethod()
{
	System.out.println("This is my method in City Class");
}
}
