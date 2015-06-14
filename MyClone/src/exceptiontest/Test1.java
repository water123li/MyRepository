package exceptiontest;

public class Test1 {

	 public static void main(String[] args){
	        Test2 test2 = new Test2();
	        try{
	           System.out.println("invoke the method begin!");
	           test2.method();
	           System.out.println("invoke the method end!");
//	           throw new RuntimeException();
	        }catch(Exception e){
	           System.out.println("catch Exception!");
	        
	           
	        }
	    }
}

class Test2{
    public void method() throws Exception{
        System.out.println("method begin!");
        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println("method end!");
    }
}