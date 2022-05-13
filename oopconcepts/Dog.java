package oopconcepts;

public class Dog extends Animal{
	public void play()
	{
		System.out.println("Playing");
	}
	
	public void eat()
	{
		System.out.println("Eating dog food.");
	}
	
	public void eat(String food)
	{
		System.out.println("Eating "+food);
	}
}
