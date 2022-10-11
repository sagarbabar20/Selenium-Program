package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface
{
	public static void main(String[] args) 
	{
		//Up Casting Concept
		//1.list-->Array List
//		List x=new ArrayList();
//		x.add(20);
//		x.add(5.2);
//		x.add("Sagar");
//		x.add('A');
//		System.out.println(x);
//		
//		int Elesize=x.size();
//		System.out.println(Elesize);
//		
//		System.out.println(x.get(2));
//		
//		x.set(1, 500);
//		System.out.println(x);
//		
//		x.remove(0);
//		System.out.println(x);
//		
//		List<Integer> a=new ArrayList<Integer>();
//		a.add(1000);
//		System.out.println(a);
		
		//2.list-->linked List
		List y = new LinkedList();
		y.add(10);
		y.add(20.10);
		y.add('A');
		y.add("ANSH");
		System.out.println(y);
		
		List<Integer> a=new LinkedList<Integer>();
		
		int elesize=y.size();
		System.out.println(elesize);
		
		//3.list-->vector
		List z =new Vector();
		
		List<Integer> b=new Vector<Integer>();
		
		
		//4.list-->stack
		List i =new Stack();
		i.add(550);
		System.out.println(i);
		
		List<Integer> c=new Stack<Integer>();

		
		
		
	}

}
