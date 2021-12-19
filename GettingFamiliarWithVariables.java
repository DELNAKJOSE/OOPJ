package package1;

import java.util.Date;

public class GettingFamiliarWithVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=20;
		byte y=20;
		x=45;  
		                 // we should always initialize our variable before reading them
		System.out.println(x);
		System.out.println(y);
	                 	 //x and y are completely independent
		
		Date now= new Date();     
                      //1st Date is the class that we declare
		             //now is the object name that we give, the variable (now) we've defined is an INSTANCE of Date CLASS.
		            //new: we use new operator to allocate memory for variable.
		           //2nd Date repeat name of our class.
		          // another example: Human John=new Human();
		//now.getTime();          
		        //geTime return time component of object()
		System.out.println(now);
		
		
		
	}

}
