package fr.ca.java.schoolexercise6;

public class Person {
	
	protected String name; // name of the person
	protected int age; // person�s age
	protected String gender; // �M� for male, �F� for female
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person : His name is " + name + ", " + age + " years old , his gender is " + gender;
	}
	

	
	
}
