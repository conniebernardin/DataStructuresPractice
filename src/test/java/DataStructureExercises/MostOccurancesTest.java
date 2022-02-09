package DataStructureExercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

    @Test
    void itReturnMostCommonNumberWhenOnlyOneMODE() {
        //GIVEN
        MostOccurances mostOccurances = new MostOccurances(); //create instance of the class
        String input = "3,3,4,4,4,6,6,6,6"; //create an input

        //WHEN
        List<String> actual = mostOccurances.modeNumbers(input); //call method and give input, save as List because method returns List

        //THEN
        List <String> expected = Arrays.asList("6");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itReturnMostCommonNumberWhenMoreThanOneMode() {
        //GIVEN
        MostOccurances mostOccurances = new MostOccurances(); //create instance of the class
        String input = "3,3,4,4,6"; //create an input

        //WHEN
        List<String> actual = mostOccurances.modeNumbers(input); //call method and give input, save as List because method returns List

        //THEN
        List <String> expected = Arrays.asList("3", "4");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itShouldReturnEmptyListWhenInputEmpty() {
        //GIVEN
        MostOccurances mostOccurances = new MostOccurances(); //create instance of the class
        String input = ""; //create an input

        //WHEN
        List<String> actual = mostOccurances.modeNumbers(input); //call method and give input, save as List because method returns List

        //THEN
        assertThat(actual).isEmpty();
    }

    @Test
    void itShouldReturnEmptyListWhenInputIsNull() {
        //GIVEN
        MostOccurances mostOccurances = new MostOccurances(); //create instance of the class
        String input = null; //create an input

        //WHEN
        List<String> actual = mostOccurances.modeNumbers(input); //call method and give input, save as List because method returns List

        //THEN
        assertThat(actual).isEmpty();
    }
}