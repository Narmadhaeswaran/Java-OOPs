package oopsconcept;



public class Car {

	public void start() {
		System.out.println("Car Starts");
	}
	
	public void stop() {
		System.out.println("Car Stop");
	}
	
	public void run() {
		System.out.println("Car Running");
	}

}

 class BMW extends Car{
	 
	 //method overriding
	
	 public void start() {
			System.out.println("BMW Starts");
		}
	 
	 public void stop() {
			System.out.println("BMW stop");
		}
	
}
 
class TestCar {
	public static void main(String args[]) {
	
		
		//static polymorphism 
	BMW b= new BMW();
	b.start();
	b.stop();
	b.run();
	
	System.out.println("-----");
	
	Car c= new Car();
	c.start();
	c.stop();
	
	System.out.println("-----");
	
	Car c1= new BMW();//Dynamic or runtime polymorphism
	
	c1.start();
	
	
	}
}
