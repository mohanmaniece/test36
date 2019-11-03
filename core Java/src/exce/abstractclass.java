package exce;


	// Abstract class
	abstract class Animal1 {
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	// Subclass (inherit from Animal)
	class Pig1 extends Animal1 {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	}

	public class abstractclass {
	  public static void main(String[] args) {
	    Pig1 myPig1 = new Pig1(); // Create a Pig object
	    myPig1.animalSound();
	    myPig1.sleep();
	  }
	

}
