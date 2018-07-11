package inheritance.basic.person;

public class Employee extends Person {
	// 멤버변수 선언부
	String dept;
	
	// 생성자 선언부
	Employee() {
		
	}
	
	Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
		
	}
	
	// 메소드 선언부
	public String toString() {
		String employeeStr = String.format(", 부서:%s", this.dept);
		return "직원 정보[" + super.toString() + employeeStr + "]";
	}
}
