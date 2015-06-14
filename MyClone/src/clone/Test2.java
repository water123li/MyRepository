package clone;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId("1");
		student1.setName("李名");

		Student student2 = new Student();
		student2.setId("2");
		student2.setName("陈好");

		Student student3 = new Student();
		student3.setId("3");
		student3.setName("范冰冰");

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		System.out.println("hh");

	}
}
