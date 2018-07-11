package inheritance.abstrct.person;

public class Teacher extends Person {
	
	// 멤버변수 선언부
	String subjet;
	
	// 생성자 선언부
	Teacher() {
		
	}
	
	Teacher(String id, String name, int age, String subjet)	{
		super(id, name, age);
		this.subjet = subjet;
	}

	// 메소드 선언부
	@Override
	public String toString() {
		String teacherStr = String.format(", 과목:%s", this.subjet);
		return "교사 정보[" + super.toString() + teacherStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 교사 ==");
		System.out.println(this);
	}
		
}
