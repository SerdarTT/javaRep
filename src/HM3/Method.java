package HM3;

import java.time.Instant;
import java.util.*;

public class Method {

    /**
     * Question 1:
     * Create a method, that will PRINT all duplicate values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "HappY", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     */


    public static void main(String[] args) {
       String[] myList1 = {"happy", "peace", "joy", "grow", "joy", "laugh", "HappY", "laugh", "joy"};
        checkForDuplicates(myList1);




    }
    public static void checkForDuplicates(String[] myArray){
        Map<String,Integer> myList = new HashMap<>();
        Integer lp=1;
        for (int i=0;i< myArray.length;i++){
            if(!myList.containsKey(myArray[i])){
                myList.put(myArray[i], lp);

            }else{
                myList.put(myArray[i], myList.get(myArray[i])+1);
            }
        }
        for(String nap:myList.keySet()){
            System.out.println(nap+" = "+myList.get(nap));
        }


    }



}
