public class Main {

public static void main(String[] args) {
	MyGeneric <Integer> iObj = new MyGeneric <>(15);
	System.out.println(iObj.getObject());
	
	// instance of String type
	MyGeneric <String> sObj =
			new MyGeneric<String>("Vilnius");
	System.out.println(sObj.getObject());
}
}
