import ru.stqa.pft.sandbox.Rectangle;
import ru.stqa.pft.sandbox.Square;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Alexander");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area()); // s.area())   "s" это метод, когда джава видит эту конструкцию, она находит
		// функцию соответствующую объекту Square  и вызывает ее

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь квадрата со сторонами " + r.a +" и " + r.b + " = " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello," + somebody + "!") ;
	}
}