public class Home
{
	private String adress;
	private int door_number;

public Home(String adress, int door_number) {
	
	this.adress=adress;
	this.door_number=door_number;
}

	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress=adress;
	}
	
	public int getDoor_number() {
		return door_number;
	}
	
	public void setDoor_number(int door_number) {
		this.door_number=door_number;
	}
	
	//My method
	public void HomeMyMethod()
	{
		System.out.println("Open the door, knock knock");
	}
}
