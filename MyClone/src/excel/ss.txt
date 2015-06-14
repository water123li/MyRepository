package clone;

public class Student implements Cloneable{

	String id;
	String name;
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
