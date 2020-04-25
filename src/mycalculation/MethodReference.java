package mycalculation;
interface Sayable
{
	void say();
}
public class MethodReference {

	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    } 
	public static void main(String[] args) {
		
		Sayable say =MethodReference::saySomething;
		say.say();
	}

}
