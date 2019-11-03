package exce;

public class trycatch {
public static void main(String[] args) {
		    try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } 
		    
		    catch (ArrayIndexOutOfBoundsException e) {
		    	
		     System.out.println("ArrayIndexOutOfBoundsException");
		    }
		    catch (Exception e) {
		    	e.printStackTrace();
		     System.out.println("Something went wrong.");
		    }		
}
		}


