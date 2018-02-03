package java_oop;

/*
 * this is a person representation you can not instantiate this class
 * it also has an abstract method giveResults which must be implemented 
 * on any class that inherits from this class
 */
public abstract class Person {

	private String name;
	private String address;
	private String sex;

	public Person(String name, String address, String sex) {
		System.out.println("Person constructor");
		this.name = name;
		this.address = address;
		this.sex = sex;
	}

	/*
	 * this is constructor method overloading where only two fields need to be
	 * passed as parameters.
	 */
	public Person(String name, String address) {
		System.out.println("Overloaded Person constructor");
		this.name = name;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	/*
	 * implementation will be on any class that extends this class
	 */
	public abstract String giveResults();

}
