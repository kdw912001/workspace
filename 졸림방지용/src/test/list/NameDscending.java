package test.list;
import java.util.*;
public class NameDscending implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Person && o2 instanceof Person) {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			if(p1.getName().compareTo(p2.getName())>0)
				result = -1;
			else if(p1.getName().compareTo(p2.getName())<0)
				result = 1;
		}
		
		return result;
	}
}
