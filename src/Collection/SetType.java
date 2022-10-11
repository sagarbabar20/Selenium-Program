package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetType 
{
	public static void main(String[] args)
	{
		HashSet x=new HashSet();
		
		x.add(10);
		x.add(10.22);
		x.add('S');
		x.add("Sagar");
		System.out.println(x);
		
//		int elesize=x.size();
//		System.out.println(elesize);
		
		//index concept not followed
		//we cant use the index related methods
		//not possible

		//not possible
//		a.get(0);
//		a.set(0, 11);
		
		//single single element print
		
//		iterator interface
        //method of HashSet
//		Iterator s= x.iterator();
		
//		System.out.println(s.next());
//		System.out.println(s.next());
//		System.out.println(s.next());
//		System.out.println(s.next());
//		System.out.println(s.next());
//		System.out.println(s.next());
//		System.out.println(s.next());
//       System.out.println("size->"+x.size());       

		
//		for(int i=1; i<=x.size(); i++)
//		{
//			System.out.println(s.next());
//		}
		
		 //generalize syntax
		Set z =new HashSet();
		
		 //specific syntax 
		
		Set<Integer> a=new HashSet<Integer>();
		
		Set<Integer> b=new LinkedHashSet<Integer>();
         b.add(20);
         b.add(50);
         System.out.println(b);
         System.out.println(b.size());
         
         
	
	}

}
