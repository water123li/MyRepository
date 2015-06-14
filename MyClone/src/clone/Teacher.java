package clone;

import java.util.LinkedList;
import java.util.List;

public class Teacher implements Cloneable{

	String id;
	String name;
	List<Student> list = new LinkedList<Student>();
	
	@Override
	public Object clone(){
		Teacher o =null; 
		try {
			o=(Teacher) super.clone();
//			o.list  = new LinkedList<Student>(list);
			o.list  = new LinkedList<Student>();
			for (Student student : list) {
				student = (Student) student.clone();
				o.list.add(student);
			}
			
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
	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
	
}
