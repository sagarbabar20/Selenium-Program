package Collection;

import java.util.ArrayList;

public class ArrayListTypeAndMethods 
{
public static void main(String[]args)
{
	//1.2 Variables
//	int a=50;
//	int b=100;
	
	//more than 5 variables
//	int a[]= {10,20,30,40,50,60,70};
	
	//Collection concept
	//1.Array List-->Class
//	ArrayList a = new ArrayList();
	
	//1.add Method
//	a.add(10);
//	a.add(20);
//	a.add(30);
//	a.add(40);
//	a.add(50);
//	System.out.println(a);
//	
//	a.add("S");
//	a.add(50.202);
//	a.add("String");
	
	//print all data
	//Reference variable print
//	System.out.println(a);
	
//	       [10, 20, 30, 40, 50, S, 50.202, String]
// Index-->  0   1   2  3   4    5     6      7
//------------------------------------------------------------------	
	//print individual data
	//2.get method + index pass
	
//	System.out.println(a.get(0));
//	System.out.println(a.get(1));
//	System.out.println(a.get(2));
//	System.out.println(a.get(3));
//	System.out.println(a.get(4));
	
//------------------------------------------------------------------
	//3.Size method-->element size
//	System.out.println("element size of arraylist is-"+a.size());
	
	//start index-->0
	//end index-->7
	
	//will discuss this later
//	for(int i=0; i<a.size(); i++)
//	{
//		int result=a.get(i);
//	}
	
	//ele add -> add
	//ele print -> object print statement
	//single el -> get("index")
    //arraylist size -> size 		
//-------------------------------------------------------------------
	//4.element remove
//	a.remove(7);
//	System.out.println(a);
//	System.out.println(a.size());
	
//	       [10, 20, 30, 40, 50, S, 50.202]
// indes-->  0   1   2   3   4   5    6
//-------------------------------------------------------------------
	//5.set method
//	50 ele-->replace-->100
//	a.set(4, 100);
//	System.out.println(a);
//---------------------------------------------------------------------
	//Generalized  syntax
//	ArrayList b = new ArrayList();
	
	//specific syntax
	//we will use specific dataType data
	
	ArrayList<String> x=new ArrayList<String>();

//	x.add("Sagar");
//	x.add("Manoj");
//	x.add("Ranjit");
//	x.add("Pratik");
//	System.out.println(x);
	
//	x.add('s');      not possible
//	x.add(10.525);   not possible
//	x.add(100);      not possible
//	System.out.println(x);
	
	
	ArrayList<Integer> y=new ArrayList<Integer>();
	y.add(10);
	
//	y.add(10.256);   not possible
	
	ArrayList<Double>z=new ArrayList<Double>();
}
}