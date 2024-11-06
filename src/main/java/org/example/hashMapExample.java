package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
	public static void main(String[] args) {
	       Map<Integer,String> map = new HashMap<Integer,String>();
	       map.put(10,"USA");
	       map.put(5,"UK");
	       map.put(11,"INDIA");
	       map.put(25,"CA");
	       map.put(1,"AUS");
	       map.put(100,"NZ");
	       map.put(11,"");
	       System.out.println(map.get(11));
	       
	       
	       Set s = map.entrySet();
	       Iterator it = s.iterator();
	       
	       while(it.hasNext()){
	          Map.Entry m = (Map.Entry)it.next();
//	          int n = (int) m.getKey();
	          if((int) m.getKey()<=10){
	              System.out.println(m.getValue());
	          }
	       }
	    }
}
