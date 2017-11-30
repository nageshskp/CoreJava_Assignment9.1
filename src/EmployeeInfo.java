//Import all the class from util package.
import java.util.*;

//Declared the EmployeeInfo Class
public class EmployeeInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring HashMap signature using Generic EmpCode as key and EmpName as value
		
		HashMap<Integer,String> employee = new HashMap<Integer,String>();
		
		// Putting all key and value
		
		employee.put(1, "John");
		
		employee.put(3, "Akbar");
		
		employee.put(2, "Rupesh");
		
		//To use iterator convert to Set 
		
		Set<Integer> name = employee.keySet();
		
		//using for each loop to iterate employee name
		
		for(Integer code : name){
			
			// Print the Employee Names
			System.out.println(employee.get(code));	
		}

	}

}