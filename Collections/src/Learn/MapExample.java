package Learn;

import java.util.HashMap;

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
		
		
	}

}
