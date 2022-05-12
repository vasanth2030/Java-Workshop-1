package oopconcepts;

public class Main {
	public static void main(String[] args) {
		Animal animal= new Animal();
		animal.setAge(10);
		animal.setName("Cat");
		
//		animal.eat();
//		animal.sleep();
		
		System.out.println(animal.getAge());
		System.out.println(animal.getName());
		System.out.println();
		
		Animal animal2=new Animal(5,"Dog");
		System.out.println(animal2.getAge());
		System.out.println(animal2.getName());
		
		System.out.println();
		Animal.setClassName("Another class name");
		
		System.out.println(animal.getClassName());
		
		System.out.println(animal2.getClassName());
	}
}
