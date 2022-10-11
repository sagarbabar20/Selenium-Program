package Collection;

import java.util.LinkedList;

public class LinkedListTypeAndMethods 
{
public static void main(String[] args) 
{
	//Generalized syntax
//	LinkedList x=new LinkedList();
//	
//	//1.add method
//	x.add(20);
//	x.add(10.20);
//	x.add('S');
//	x.add("SAGAR");
//	System.out.println(x);
//	
//	//2.Size Method
//	int elesize = x.size();
//	System.out.println(elesize);
//	
//	//3.get method
//	System.out.println(x.get(3));
//	
//	//4.remove method
//     x.remove(1);
//     System.out.println(x);
//     
//     //5.replace method
//     x.set(2, 'B');
//     System.out.println(x);
     
     //spacific syntax
     LinkedList<Integer> y =new LinkedList<Integer>();
     y.add(50);
     System.out.println(y);
     
     System.out.println(y.size());
     
     y.set(0, 100);
     System.out.println(y);
     
     LinkedList<String> z=new LinkedList<String>();
     z.add("Sagar");
     System.out.println(z);
     
     
	
}
}
