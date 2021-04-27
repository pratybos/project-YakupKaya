public class main
{
	public static void main(String[] args)
	{
		City city=new City("Vilnius","Yakup KAYA",145.85); //City Obj
		Village village=new Village("Trakai","Marius Teacher",12.785);
		Home home =new Home("street 85",45);
		
		Country country=new Country(city,village,home);
		country.getCity().CityMyMethod();
		country.getVillage().VillageMyMethod();
		country.getHome().HomeMyMethod();
	
	}
}
