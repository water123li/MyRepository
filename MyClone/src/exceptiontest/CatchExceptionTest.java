package exceptiontest;

import java.lang.reflect.Constructor;

public class CatchExceptionTest {

	public static void main(String[] args){
		
		try{
			Class throttleClass = Class.forName("ClassA");
			Constructor c = throttleClass.getConstructor();
			ClassA a = (ClassA)c.newInstance();
		
		}catch(RuntimeException ee){
			System.out.println("11111111");
			System.out.println(ee.getMessage());
		}catch(Exception e){
			System.out.println("222222222 " + e.toString());
			System.out.println(e.getMessage());
		}
	}
}

