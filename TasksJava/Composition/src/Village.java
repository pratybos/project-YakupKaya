public class Village {
	private String villagename;
	private String villagepresident;
	private double area_km;

public Village(String villagename, String villagepresident, double area_km) {
	this.villagename=villagename;
	this.villagepresident=villagepresident;
	this.area_km=area_km;
}

public String getVillagename() {
	return villagename;
}

public void setVillagename(String villagename) {
	this.villagename=villagename;
}

public String getVillagepresident() {
	return villagepresident;
}

public void setVillagepresident(String villagepresident) {
	this.villagepresident=villagepresident;
}

public double getArea_km() {
	return area_km;
}

public void setArea_km(double area_km) {
	this.area_km=area_km;
}
//my Method

public void VillageMyMethod(){
	System.out.println("This is my Village Method");
}
}
