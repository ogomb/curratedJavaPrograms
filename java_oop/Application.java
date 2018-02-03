package java_oop_concepts;

public class Application {

	public static void main(String[] args) {
		// a student class instantiation
		Student studentOne = new Student("Kelvin", "1251 Nairobi", "Male", 67);
		 
		// this constructor invocation accepts only two parameters
		Student studentTwo = new Student("Helvitica", "75363 Kisumu", 77);
		
		//a student is also a person. this is polymorphism.
		Person studentThree = new Student("Mary", "5454 Mombasa", "Female", 89);
		
		System.out.println(studentOne.giveResults());
		System.out.println(studentTwo.giveResults());
		System.out.println(studentThree.giveResults());

	}

}
