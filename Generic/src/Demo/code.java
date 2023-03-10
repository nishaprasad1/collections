package Demo;
import java.util.*;

public class code {
 public static void main(String args[]) {
	 
	 List<String> list =new ArrayList<>();
	 /*	Generic type->this type of object 
	 *	actually handling a type (i.e string type)
	 *	##TYPE SAFE##-->it provide type safty at compile
	 *	time not at run time */
	 list.add("nisha");
	 //list.add(123);----->Error strict type -string type only no other type
	 System.out.println(list);
	 List<Integer> list2 =new ArrayList<>();
	 list2.add(123);
	 //list2.add("nisha");---->Error Integer type only no string type
	 
	 
	 System.out.println("=================================================================");
	 List list1 =new ArrayList();
	 /*non generic type->not a safe type
	  * us as object class .Run time error aane ke zadaya chances hai
	  * 
	  **/
	 list1.add("neha");
	 list1.add(123);
	 
	 
	 System.out.println(list1);
	 
 }
	

}
