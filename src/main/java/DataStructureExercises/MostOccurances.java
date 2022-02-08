package DataStructureExercises;

import java.util.HashMap;

public class MostOccurances {
    public HashMap<String, Integer> check(String input){
        HashMap<String, Integer> map = new HashMap<>();
        String [] split = input.split(",");
        for (String e: split){
            if (!map.containsKey(e)){
            map.put(e, 1);
            } else {
                Integer count = map.get(e) + 1;
                map.put(e, count);
            }
        }
        return null;
    }
}
