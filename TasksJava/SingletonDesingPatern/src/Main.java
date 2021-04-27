// Singleton is a creational design pattern!

public class Main {
public static void main(String[] args) {
	
	Singleton add= Singleton.NewObject(); //No new key because it is static
	System.out.println(add.Addition(35,5));
	
	
	Singleton sub= Singleton.NewObject();
	System.out.println(sub.Subtraction(35,5));
	
	Singleton multi= Singleton.NewObject();
	System.out.println(multi.Multiplication(35,5));
	
	Singleton div= Singleton.NewObject();
	System.out.println(div.Division(35,5));
	
}
}
