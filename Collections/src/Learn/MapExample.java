package Learn;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void  main(String args[]) {
		HashMap<String ,Integer> cousre=new HashMap<>();
		
		///adding elements
		cousre.put("Core Java", 40000);
		cousre.put("Basic  Python", 35000);
		cousre.put("Spring", 98000);
		cousre.put("Andriod", 40000);
		cousre.put("Andriod", 60000);
		System.out.println(cousre);// sorted 
		cousre.put("PHP", 4567);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(cousre);
		//key orders are not maintained
		System.out.println("+++++++++++++++++++++===========================");
		cousre.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);//e1=key and e2=value
		});
		TreeMap<String,Integer> tre=new TreeMap<>();
		  tre.put("Amit",100);    
	      tre.put("Ravi",102);    
	      tre.put("Vijay",101);    
	      tre.put("Rahul",103);    
	        
	      for(Map.Entry m:tre.entrySet()){        
	       System.out.println(m.getKey()+" "+m.getValue());    
		//System.out.println(tre);
	      }
		
		
		
		
	}

}
