package exce;

public class inheretence {
	int x=10;
	public void honk()
	{
		System.out.println("welcome");
	}

public class car extends inheretence{
	int y=15;
}
	public static void main(String[] args) 
	{
		inheretence  mycar=new inheretence();
		mycar.honk();
		System.out.println(mycar.x);
		//System.out.println(mycar.y);
	}

}

