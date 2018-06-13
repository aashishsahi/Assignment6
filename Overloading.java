
public class Overloading {
	
	void Print()
	{
		System.out.println("No arguments.");
	}
	void Print(int n)
	{
		System.out.println("Integer argument: " + n);
	}
	void Print(float f)
	{
		System.out.println("Float argument: " + f);
	}

	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.Print();
		o.Print(5);
		o.Print(5.5f);
				

	}

}
