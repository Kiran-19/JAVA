package com.Basentjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class J69_CollectionsClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();  
        list.add(6);  
        list.add(2);  
        list.add(5);  
        list.add(3);  
        list.add(4);  
        list.add(1);  
        System.out.println("maximum element from the collection is: "+Collections.max(list)); 
        System.out.println("minimum element from the collection is: "+Collections.min(list));
       
        Collections.addAll(list, 7,8,9);
        System.out.println("After adding elements to collection:"+list);
        
        System.out.println("==================================");
        //to sort in ascending order
        Collections.sort(list);
        System.out.println(list);
       
        System.out.println("==================================");
        
      //to sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
      /*  Iterator<Integer> itr1 = list.iterator();
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        }
        System.out.println("==================================");
        */
      //to sort in reverse order
        Collections.reverse(list);
        Iterator<Integer> itr2 = list.iterator();
        while(itr2.hasNext())
        {
        	System.out.println(itr2.next());
        }
        
        List<Integer> list1 = new ArrayList<Integer>(); 
        list1.add(51);
        list1.add(52);
        list1.add(53);
        Collections.copy(list, list1);
        System.out.println(list);
        

	}

}
