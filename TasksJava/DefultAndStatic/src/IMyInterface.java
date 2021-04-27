public interface IMyInterface {
default void show() {
	System.out.println("MyInterface show method");
}
static void display() {
	System.out.println("MyInterface display method");
}
}
