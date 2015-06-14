package dataelement;

public class DataElement implements Cloneable{

	String id;
	String name;
	int configId;
	public DataElement(){}
	
	public DataElement(String id, String name, int configId) {
		super();
		this.id = id;
		this.name = name;
		this.configId = configId;
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
	public int getConfigId() {
		return configId;
	}
	public void setConfigId(int configId) {
		this.configId = configId;
	}

	@Override
	public String toString() {
		return "DataElement [id=" + id + ", name=" + name + ", configId="
				+ configId + "]";
	}
	
}
