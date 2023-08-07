package hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class H1 {

	public static void main(String[] args) {
        HashMap map= new HashMap();
        map.put("101", "King");
        map.put("102", "Prince");
        map.put("103", "Queen");
        map.put("104", "Princess");
        System.out.println(map);
        
         // to access induvisually
        Set entries = map.entrySet();
        for (Object object : entries);
		System.out.println(object);
	}
	// to access using iterator
	
	Iterator i = entries.terator();
	while (i.hasNext()) {
		System.out.println(i.next());                                                                                        	}
	
	// to create all the values of map using
	Set s = map.keySet();
	Iterator i1 = entries.terator();
	while (i.hasNext()) 
	{
		int a= i1.next();
		System.out.println(a + ":" + map.get(a) );
			
		}
	}

}
