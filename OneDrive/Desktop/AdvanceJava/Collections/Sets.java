//set is mainly used because it wont allow duplicate values 

import java.util.*;

public class  Sets{
    public static void main (String args[]){

        // Set <Integer> marks = new HashSet<>();   // it does not follow insertion order & sorted order
        
        // Set<Integer> marks = new TreeSet<>();  // this sorts the values

         Set<Integer> marks = new LinkedHashSet<>();   // this follows the insertion order 

        marks.add(20);
        marks.add(21);
        marks.add(07);
        marks.add(03);
         marks.add(03);

        // System.out.println(marks);

    Iterator <Integer> m =  marks.iterator();

    while  (m.hasNext()){
        System.out.println(m.next());
    }
    }


    // to sort use TreeSet


    
}