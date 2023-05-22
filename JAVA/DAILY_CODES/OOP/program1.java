class Core2Web {

	int noOfCourses = 5;
	private String favCourse = "Operating System";

	void display() {
	
		System.out.println(noOfCourses);
		System.out.println(favCourse);
	}
}

class Student {

	public static void main(String[] args) {
	
		Core2Web u1 = new Core2Web();
		u1.display();
		System.out.println(u1.noOfCourses);
		System.out.println(u1.favCourse);

	}
}
