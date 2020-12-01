package lab;

public class Lab1 {

	public static void main(String[] args) {
		Student stu1 = new Student("Tahseen","263464778");
		Student stu2 = new Student("Fatma","2634645990");
		Student stu3 = new Student("Mansuri","263464123");
		stu1.enroll("Math251");
		stu1.enroll("Eng355");
		stu1.enroll("Art233");
		//stu1.checkBalance();
		//stu1.showCourses();
		stu1.payTution(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		stu1.setPhone("98373893138");
		
		
	}

}


class Student {
	//properties
	private static int iD=0;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private String courses="";
	private static final int costOfCourse=800;
	private int balance=0;
	
	//constructor
	public Student(String name, String ssn) {  //name and ssn as arguments
		iD++;
		this.name = name;  //instance variable to local variable
		this.ssn = ssn;
		setEmail();
		setUserId();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("Contact:"+ phone);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private void setEmail() {
		email = name.toLowerCase()+iD+"@testmail.com";
		System.out.println("Your Email:" + email);
		}
	
	private void setUserId() {
		int min = 1000;
		int max = 9000;
		int randnum = (int) (Math.random()*((max-min)));
		randnum = randnum+min;
		userId = iD+""+randnum+ssn.substring(5);
		System.out.println("Your User ID:" +userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses+"\n" + course;
		balance =  balance+ costOfCourse;
		
	}
	
	public void payTution(int amount) {
		System.out.println("payment:$" +amount);
		balance = balance - amount;
			
	}
	
	public void checkBalance() {
		
		System.out.println("Balance:$"+ balance);
		
	}
	
	public String toString() {
		return "[NAME:"+name+ "]\n[COURSES:"  + courses + "]\n[BALANCE:" +balance+"]";
		
	}
	
	public void showCourses() {
		System.out.println(courses);
		
	}


}
