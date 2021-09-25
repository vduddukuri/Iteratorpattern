
public class TestIterator {
	
	public static void main(String[] args) {
	      Cars cars = new Cars();
	      CarDetails cd = new CarDetails();

	      for(Iterator iter = cars.createIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Car Name :: " + name + "\nCar Model :: "+ cd.getModel(name) + "\nModel Year :: " + cd.getYear(name) + " \nCar Type :: " + cd.getType(name)+"\n =========================================" );
	      } 	
	   }

}
