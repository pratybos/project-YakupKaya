
import java.util.function.*;


public class main  {
public static void main(String[] args) {
	
	DoubleToIntFunction value = a -> (int) a;
	System.out.println();
	System.out.println("DoubleToIntFunction: " + value.applyAsInt(10.6));
	
	IntToDoubleFunction value2= x->(double) x;
	System.out.println();
	System.out.println("IntToDoubleFunction: "+value2.applyAsDouble(72));
	
	
	MyInterface myCustomInterface = new MyInterface() {
		@Override
		public void IntToDouble(int value) {
			double x= (double)value;
			System.out.println("Myınterface IntoDouble: "+x);
		}
		
		@Override
		public void DoubleToInt(double value) {
			int x2= (int)value;
			System.out.println("MyInterface doubletoInt "+x2);
		}
	};
	
	myCustomInterface.IntToDouble(27);
	myCustomInterface.DoubleToInt(12.0);
	
	
	
	DefaultAndStatic ds= new DefaultAndStatic() {
		@Override
		public void mymethod() {
			System.out.println("my method working");
		}
	};
	
}
}
