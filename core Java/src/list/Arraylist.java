package list;
	import java.util.ArrayList;

	public class Arraylist {

		public static void main(String[] args) {
			ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
			cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    System.out.println(cars);
		    System.out.println(cars.get(0));
		    
		/*    cars.set(0, "Opel");//modify an element
		    System.out.println(cars.get(0));*/
		    
		    /*cars.remove(0);
		    System.out.println(cars);*/

		   /* System.out.println(cars.size());*/
		    
		    /*cars.clear();
		    System.out.println(cars);*/
		    
		    /*for (int i = 0; i < cars.size(); i++) {
		        System.out.println(cars.get(i));
		}*/

	}
	}
