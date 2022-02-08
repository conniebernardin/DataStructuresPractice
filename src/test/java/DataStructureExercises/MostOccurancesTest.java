package DataStructureExercises;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class MostOccurancesTest {

    @Test
    void itShouldCheckForMostCommonNumber() {
        //GIVEN
        MostOccurances mostOccurances = new MostOccurances(); //create instance of the class
        String input = "3,3,4,6"; //create an input

        //WHEN
        HashMap <String, Integer> actual = mostOccurances.check(input); //call method and give input, save as Hashmap because method returns Hashmap

        //THEN
        HashMap <String, Integer> expected = new HashMap<>();
        expected.put("3", 2);
        expected.put("4", 1);
        expected.put("6", 1);

        assertThat(actual).isEqualTo(expected);
    }
}