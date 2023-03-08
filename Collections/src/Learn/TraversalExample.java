package Learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraversalExample {

	public static void  main(String args[]) {
		ArrayList<String> names=new ArrayList<String>();//type safe
		names.add("Durgesh");
		names.add("nisha");
		names.add("neha");
		names.add("rajeev");
		names.add("bittu");
		names.add("bittu");
		//System.out.println(names);


		//for each loop ===>iterable
		for(String str:names)
		{
			System.out.println(str+"\t"+str.length()+"\t");
			StringBuffer br=new StringBuffer(str);
			System.out.println(br.reverse());
		}		
		System.out.println("==============================================================================");

		//traversing using iterator

		Iterator<String>itr =names.iterator();// forward traverser
		while(itr.hasNext()) {
			String next= itr.next();
			System.out.println(next);
		}
		System.out.println("+++++++++++++++++++++++++BACKWARD TRAVERSAL+++++++++++++++++++++++++++++++++++");
		//backward traversal of collection LISTITERATOR
		ListIterator<String> litr=names.listIterator(names.size());//cursor piche hoona chahiye
		while(litr.hasPrevious()) {
			String prev=litr.previous();
			System.out.println(prev);


		}

		//Enuermation
		//homework






		System.out.println("++++++++++++++++++++++++++++FOE EACH METHOD++++++++++++++++++++++++++++++++");

		//for each method
		names.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("+++++++++++++++++++++++++sorting of elements+++++++++++++++++++++++++++++++++++");
		TreeSet<String> tre=new TreeSet<>();
		tre.addAll(names);
		tre.forEach(e->{
			System.out.println(e);
		});
//		comparable
//		compartor

	}
}
