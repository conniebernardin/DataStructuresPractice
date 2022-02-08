package DataStructureExercises;

import java.util.*;

public class ExerciseOne<input> {
public static void main(String[] args) {
/*   Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    Find the element that has the most occurrences
    Your method should return something like the 1 since it occurs 4 times
    Think about the data structure that you should use
    Create a method. Think about the return type and parameters
    Write unit tests for your method */
    List<Integer> list = Arrays.asList(1,1,1,1,3,4,5,6,7,7,7,8,8); //creating integer list from array using .aslist function
}

public Map<Integer, Integer> mostCommon(List<Integer> list) {
    Map<Integer, Integer> map =  new HashMap<Integer, Integer>(); //create the map to store the result with key and value both as integers

    for (Integer i: list) { //loop through list
        Integer integer = map.get(i); //make each element in the list a key in the map we are creating
    }
    Map.Entry<Integer, Integer> max = null;

    return map;
} }

