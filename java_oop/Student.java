package java_oop;

/*
 * A student is essentially a person, because it extends that class
 * all the data of Person class is available on this class.
 */
public class Student extends Person {
	private char grade;

	public Student(String name, String address, String sex, int grade) {
		super(name, address, sex);
		this.setGrade(grade);
	}
	
	/*
	 * this is constructor method overloading where only two fields need to be
	 * passed as parameters.
	 */
	public Student(String name, String address, int grade) {
		super(name, address);
		this.setGrade(grade);

	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if(grade > 75){
			this.grade = 'A';
		}else if( grade < 74 && grade > 65){
			this.grade = 'B';
		}else {
			this.grade = 'C';
		}
			
	}
	
	/*
	 * (non-Javadoc)
	 * @see java_oop_concepts.Person#giveResults()
	 * 
	 * the method giveResults is overridden and its implementation is defined in this class
	 */

	@Override
	public String giveResults(){
		return "Hi " +this.getName() +", you scored grade " + this.getGrade();
		
	}

}
