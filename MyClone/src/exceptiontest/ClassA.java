package exceptiontest;


public class ClassA {

	public ClassA()throws Exception{
		
		try{
			throw new  RuntimeException("bbbbbbbbbb");
		}catch(RuntimeException e){
			throw new Exception("cccccccc"+ e.getMessage(),e);
		}
	}

}

