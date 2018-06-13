
public class Dog extends Animal{
	
	String Breed = "Dog", Color = "Black";
	@Override
	void speak()
	{
		System.out.println("Breed of animal: " + Breed);
		System.out.println("Color of animal: " + Color);
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.speak();

	}

}
