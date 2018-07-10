package stepDefs;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

import org.jruby.ir.operands.Array;

public class EneiTestAru {

	public static void main(String[] args) {

		// Memory Management
		Runtime r = Runtime.getRuntime();
		System.out.println((r.freeMemory()) / (1024 * 1024));
		System.out.println((r.maxMemory()) / (1024 * 1024));
		System.out.println((r.totalMemory()) / (1024 * 1024));
		System.out.println(r.availableProcessors());
		System.out.println(Runtime.version());
		System.out.println(r.freeMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.freeMemory());

		// Vector
		Vector<Object> v = new Vector<Object>(5);
		v.add("10");
		v.add(2);
		v.add(r);
		v.add(null);
		System.out.println(v.get(0).toString());
		
		//Enumeration
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// Iterator
		ArrayList al = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
		}
		System.out.println(al);

		// ListIterator
		LinkedList ls = new LinkedList();
		ls.add("Gautam");
		ls.add("Deka");
		ls.add("Sonajuli");
		ls.add("Guwahati");
		ls.add("Mumbai");
		System.out.println(ls);

		ListIterator litr = ls.listIterator();

		while (litr.hasNext()) {
			String name = (String) litr.next();
			if (name.equals("Mumbai")) {
				litr.set("CurrentResidence");
			} else if (litr.equals("Deka")) {
				litr.remove();
			}

		}
		System.out.println(ls);
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
		
	}

}
