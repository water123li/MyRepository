package clone;

public class Em extends Student {
	
	int a;
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}
