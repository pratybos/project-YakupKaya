public class Country
{
	private City city;
	private Village village;
	private Home home;

public Country(City city, Village village, Home home) {
	this.city=city;
	this.village=village;
	this.home=home;
}

public City getCity() {
	return city;
}

public void setCity(City city) {
	this.city=city;
}

public Village getVillage() {
	return village;
}

public void setVillage(Village village) {
	this.village=village;
}

public Home getHome() {
	return home;
}

public void setHome(Home home) {
	this.home=home;
}
}
