
public class StaticBlock {
	static int i;
	
	static
	{
		i=10;
		System.out.println("Static Block Called.");
	}
	StaticBlock()
	{
		System.out.println("Constructor Called.");
	}

	public static void main(String[] args) {
		
		
		StaticBlock s = new StaticBlock();
		System.out.println("Value of i: " + StaticBlock.i);

	}

}
