class Student {

	String name;
	int rollno;

	Student(String str, int rollno){
		this.name = str;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
	
		Student s1 = new Student("Shashi",101);
		Student s2 = new Student("Sachin",102);

		System.out.println(s1.name);
		System.out.println(s2.name);
	}
}
