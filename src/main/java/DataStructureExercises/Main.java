package DataStructureExercises;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MostOccurances mostOccurances = new MostOccurances(); //creating new instance of class
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        System.out.println(mostOccurances.check(input)); //calling method and inputting string

        System.out.println(mostOccurances.modeNumbers(input));
    }

}