package oopconcepts;

public class Animal {
	private String name;
	private int age;
	static String className="Animal";
	
	Animal(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	Animal()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat()
	{
		System.out.println("Eating");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		Animal.className = className;
	}
	
	
	

}
