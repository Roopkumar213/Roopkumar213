import java.util.*;

public class ArrList{
    public static void main(String[] args) {
        

        List<Integer> salary = new ArrayList<Integer>(); 

        salary.add(100);
        salary.add(20000);
        salary.add(25000);

    //     System.out.println(salary);  // it prints entire ArrayList

    //     System.out.println("Element at index of 2 is "+salary.get(2));   // used to get element at index of 2

    //     salary.set(1,4500);   // used  to replace  the data in the specfic index

    //    salary.remove(1);


        for (int n :salary){
            System.out.println(n);
        }
    }
}