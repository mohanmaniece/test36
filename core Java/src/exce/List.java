package exce;
import java.util.ArrayList;
	public class List 
	{
		public static void main(String[] args) 
		{		
			ArrayList aList = new ArrayList();
			aList.add("test");
			aList.add(123);
			aList.add(null);
			aList.add(55.22);
			System.out.println("Size of the list " + aList.size());
			
			for(int i=0;i<aList.size();i++)
			{
				System.out.println("Element at index "+ i + " is " + aList.get(i));
			}
			//Printing list of values using Enhanced For loop
			System.out.println("Printing the List of values using for-each");
			for(Object o:aList)
			{
				System.out.println("Element is " + o);
			}
			
		}
	}

