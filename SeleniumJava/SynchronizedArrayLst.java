package SeleniumJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayLst {

	public static void main(String[] args) {
	
		
	//1.using Collections.synchronizedList
	List<String> Lstname = Collections.synchronizedList(new ArrayList<String>());
	Lstname.add("Max");
	Lstname.add("Raj");
	Lstname.add("pri");
	
	synchronized(Lstname) {
	Iterator<String> itr=Lstname.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		//Lstname.remove(1);
	}
	}
	
	
	
	//2. by copyonwritearraylist
	
	
	CopyOnWriteArrayList<String> cal = new  CopyOnWriteArrayList<String>();
	cal.add("TOMMY");
	cal.add("Jimmy");
	cal.add("Jerry");
	
	Object obj = new Object();
	String str = new String();
	
	Iterator<String> it=cal.iterator();
	while(it.hasNext())
	{
		cal.add("bean");

		System.out.println(it.next());
	}
	System.out.println(cal);

	}
	
	
	
	
	}


