package com.Collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;

public class Collection22 {

	public static void main(String a[]){
		SortedSet<String>arrl = new SortedSet() ;
	
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		
		
		
		
		Collections.swap(arrl, 1, 3);
		System.out.println(arrl);

}
}

