package clone;

public class Test {

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

		Teacher teacher = new Teacher();
		teacher.setId("1");
		teacher.setName("周晓娟");

		teacher.getList().add(student1);
		teacher.getList().add(student2);
		teacher.getList().add(student3);

		Teacher teacher1 = (Teacher) teacher.clone();

		teacher1.setId("teacher1");
		teacher1.getList().get(0).setName("---成龙---");

		System.out.println("teacher:\t" + teacher);
		System.out.println("teacher1:\t" + teacher1);

	}
}
