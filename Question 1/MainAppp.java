package Q1;

import java.util.ArrayList;

public class MainAppp {
	public static void main(String[] args) {
		ArrayList<Item> alist = new ArrayList<Item>();
		
		Book b1 = new Book("123", "new arrilval", 130.00, "tets", "tesr", 12);
		Book b2 = new Book("566", "new ddd", 160.00, "pp", "qq", 20);
		Car c1 = new Car("8520", "Suv", 6542.00, "P", "Toyota");
		Car c2 = new Car("987", "Peesd", 98989.00, "D", "Mazda");
		
		alist.add(b1);
		alist.add(b2);
		alist.add(c1);
		alist.add(c2);
		
		for(Item m : alist)
		{
			m.Display();
		}
	
	}
}
