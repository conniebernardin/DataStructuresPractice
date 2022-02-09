package DataStructureExercises;

import java.util.*;

public class MostOccurances {

    public static HashMap<String, Integer> check(String input) {
        HashMap<String, Integer> map = new HashMap<>(); //create a map to store the key (string) and value (int)
        String[] split = input.split(","); //splits string of numbers into array of numbers at each comma
        for (String e : split) { //looping through each element in split array of numbers
            if (!map.containsKey(e)) { //checking if the array value already has a key in map
                map.put(e, 1); //set value to one for key e
            } else {
                Integer count = map.get(e) + 1; //if element already has a key within the map, then add one to the key
                map.put(e, count);
            }
        }
        return map;
    }

    public List<String> modeNumbers(String input) {
        if (input == null || input.isEmpty()) { //fixing bug in test, so it works when there is no input, or empty input
            return Collections.emptyList();

            //or you can say:
//             new ArrayList<>();
//             Collections.EMPTY_LIST;
// List.of();
        }
        HashMap<String, Integer> map = check(input); //create new hashmap with value of output from previous method called check

        int max = 0; //create placeholder maximum value with int zero
        List<String> maxValues = new ArrayList<>(); //create list for MODE to be stored in. (list in case there are multiple modes)

        for (Map.Entry<String, Integer> entry : map.entrySet()) { //loop through entries (pairs of values and keys) from Hashmap (called map)
            if (entry.getValue() > max) { //check if value is greater than max
//                if (!maxValues.isEmpty()){
//                    maxValues.removeAll(new ArrayList<>());
//                }
                maxValues.clear(); //if value is greater than max, empty list to get rid of lower value elements
                max = entry.getValue(); //resetting max as value
                maxValues.add(entry.getKey()); //then add corresponding key from entry to list called maxValue
            }
            else if (entry.getValue() == max){
                maxValues.add(entry.getKey());
            }
        }

        return maxValues;
        //        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        //        while (iterator.hasNext()){
        //            Map.Entry<String, Integer> entry = iterator.next();
        //            entry.getValue();
        //            entry.getKey();
        //        }
    }
}
