package DataStructureExercises;

import java.util.HashMap;

public class MostOccurances {

    public static HashMap<String, Integer> check(String input){
        HashMap<String, Integer> map = new HashMap<>(); //create a map to store the key (string) and value (int)
        String [] split = input.split(","); //splits string of numbers into array of numbers at each comma
        for (String e: split){ //looping through each element in split array of numbers
            if (!map.containsKey(e)){ //checking if the array value already has a key in map
            map.put(e, 1); //set value to one for key e
            } else {
                Integer count = map.get(e) + 1; //if element already has a key within the map, then add one to the key
                map.put(e, count);
            }
        }
        return map;
    }
}
