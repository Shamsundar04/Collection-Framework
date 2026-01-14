package com.sham.classroom;

//import java.util.Enumeration;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Spliterator;
import java.util.Vector;
//import java.util.function.Consumer;
//import java.util.stream.Stream;


public class WayToRetriveObjectFromCollection {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		vector.add(12);
		vector.add(13);
		vector.add(14);
		vector.add(15);

//		System.out.println(vector.toString());

//		Enumeration<Integer> elements = vector.elements();
//		while (elements.hasMoreElements()) {
//			System.out.println(elements.nextElement());
//		}

//		Iterator<Integer> itr = vector.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ListIterator<Integer> ltr = vector.listIterator();
//		System.out.println("Forward direction:");
//		while (ltr.hasNext()) {
//			System.out.println(ltr.next());
//		}
//
//		System.out.println("Backward direction:");
//		while (ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
//		}

//		Spliterator<Integer> spliterator = vector.spliterator();
//		spliterator.forEachRemaining(c->System.out.println(c));

//		Consumer<Integer> cons = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};

//		Consumer<Integer> cons=(c)->System.out.println(c);

//		vector.forEach(c -> System.out.println(c));
		
//		Stream<Integer> stream = vector.stream();
//		stream.forEach(System.out::println);
		
		vector.parallelStream().forEach(System.out::println);
		
	}
}
