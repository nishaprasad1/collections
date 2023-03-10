package Learn;
import java.util.*;

public class code {

	public static void  main(String args[]) {
		/*creating collection 
		  1) Type safe-same type of elements(objects) are added
		  	type safe collection 
		  	ArrayList<String> names=new ArrayList<String>();
		  	(isme dosre type ka element add karegey toh error aayega)
		  	name.add("Durgesh");
		  	name.add(345);  ======> ERROR
		  2) Un type safe-different type of elements can be added to collection
		  	LinkedList list=new LinkedList();
		  	(isme dosre type ka element add kar sakte hai)
		  	name.add("Durgesh");
		  	name.add(345);=======> allowed
		 */
		ArrayList<String> names=new ArrayList<String>();//type safe
		names.add("Durgesh");
		names.add("nisha");
		names.add("neha");
		names.add("rajeev");
		names.add("bittu");
		names.add("bittu");
		System.out.println(names);
		System.out.println(names.size());
		//		System.out.println(names.get(0));
		//		System.out.println(names.get(1));
		//		System.out.println(names.get(2));
		//		System.out.println(names.get(3));
		//		System.out.println(names.get(4));
		//		System.out.println(names.get(5));
		names.remove("nisha");
		System.out.println(names);
		System.out.println("==============================================================================");
		System.out.println(names.size());
		System.out.println("==============================================================================");
		System.out.println(names.contains("neha"));// type ka equals methods call karta hai
		System.out.println("==============================================================================");
		System.out.println(names.contains("nuis"));
		System.out.println("==============================================================================");
		System.out.println(names.isEmpty());
		System.out.println("==============================================================================");
		//setting value 
		names.set(0,"ram");//replacing durgesh with ram
		System.out.println(names);
		System.out.println("==============================================================================");
		names.add(0, "tina");// adding the element after 0th indexed 
		System.out.println(names);
		System.out.println("==============================================================================");
		//		names.clear();//remove all the element
		//		System.out.println(names);
		System.out.println("==============================================================================");

		Vector<String> vector=new Vector<>();
		vector.addAll(names);
		System.out.println(vector);


		/*LinkedList list=new LinkedList();//un type safe
		list.add("nisha");
		list.add(101);
		list.add(1.2);
		list.add(true);
		System.out.println(list);*/
		System.out.println("############################################################################################");


		HashSet<Double> nams=new HashSet<>();//order preserv
		nams.add(199884.14);//autoboxing--automatically converts into wrapper class primitive type to object
		nams.add(1234.987);
		nams.add(99.3);
		nams.add(99.3);//duplicate are not allowed
		nams.add(10.1);


		System.out.println(nams);
		System.out.println("===================================================");


		TreeSet<Double> tset= new TreeSet<>();
		tset.addAll(nams);
		System.out.println(tset);



	}

}
