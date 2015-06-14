package clone;

public class TeacherOnly implements Cloneable{

	String id;
	String name;
	Student student;
	
	@Override
	public Object clone(){
		TeacherOnly o =null; 
		try {
			o=(TeacherOnly) super.clone();
			o.student = (Student) student.clone();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "TeacherOnly [id=" + id + ", name=" + name + ", student="
				+ student + "]";
	}
	
	
}
