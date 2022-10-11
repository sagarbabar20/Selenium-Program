package Collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DifferenceListAndSet
{
	public static void main(String[] args) 
	{
		List<Integer> x=new LinkedList<Integer>();
		x.add(20);
		x.add(10);
		x.add(20);
		x.add(20);
		x.add(50);
		x.add(null);
		x.add(null);
		
		System.out.println(x);
		
		Set<Integer> y=new HashSet<Integer>();
		y.add(20);
		y.add(10);
		y.add(20);
		y.add(20);
		y.add(50);
		y.add(null);
		y.add(null);
		
		System.out.println(y);
	}

}
