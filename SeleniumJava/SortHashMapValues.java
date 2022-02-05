package SeleniumJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapValues {

	public static void main(String[] args) {

		Map<Integer,Employee> map=new HashMap<Integer,Employee>();
		map.put(10423,new Employee(5,"Max",500));
		map.put(10427,new Employee(3,"Cax",300));
		map.put(10920,new Employee(1,"aax",100));
		map.put(10422,new Employee(2,"Bax",200));
		map.put(10345,new Employee(4,"Dax",400));
		
		System.out.println("---------BEFORE SORTING-----------");
		map.forEach((k,v)->System.out.println(k+" : "+v.getempid()+","+v.getname()+","+v.getsalary()));
		
		Set<Entry<Integer,Employee>> entry =map.entrySet();
		System.out.println("---------CONTENT OF ENTRY-----------");

		entry.forEach(e->{System.out.println(e.getKey()+" : "+e.getValue().getname());
		});
		List<Entry<Integer,Employee>> lst = new ArrayList<>(entry);
		
		Collections.sort(lst, (o1, o2) -> o1.getValue().getname().toLowerCase().compareTo(o2.getValue().getname().toLowerCase()));
		
		System.out.println("---------AFTER SORTING BY NAME ASCENDING-----------");

		lst.forEach(e->{
			System.out.println(e.getKey()+" : "+e.getValue().getempid()+","+e.getValue().getname()+","+e.getValue().getsalary());
			});		
		
		System.out.println("---------AFTER SORTING BY NAME- DESCENDING----------");

		Collections.sort(lst, (o1, o2) -> o2.getValue().getname().toLowerCase().compareTo(o1.getValue().getname().toLowerCase()));

		lst.forEach(e->{
			System.out.println(e.getKey()+" : "+e.getValue().getempid()+","+e.getValue().getname()+","+e.getValue().getsalary());
			});	
		
		

	}



}
