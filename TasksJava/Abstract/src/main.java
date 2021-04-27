public class main extends MyAbstract {
@Override
public void UseThisMethod() {
	System.out.println("I implement abstract method!");
	
}

public static void main(String[] args) {
	main main1=new main();
	main1.UseThisMethod();
	main1.MyMethod();
}
}
