
public class Cat extends Animal{
	

	String Breed = "Cat", Color = "White";
	@Override
	void speak()
	{
		System.out.println("Breed of animal: " + Breed);
		System.out.println("Color of animal: " + Color);
	}
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.speak();

	}

}
