import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MapsTest {
    @Test
    void mapReturnsNairobiAsCapitalOfKenya() {
        //GIVEN
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Kenya", "Nairobi");

        //WHEN
        String actual = capitals.get("Kenya");

        //THEN
        String expected = "Nairobi";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mapReturnsExpectedMap() {
        //GIVEN
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Kenya", "Nairobi");
        capitals.put("England", "London");
        capitals.put("Norway", "Oslo");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");

        //WHEN
       Map<String, String> expectedMap = new HashMap<>();
       expectedMap.put("Kenya", "Nairobi");
       expectedMap.put("England", "London");
       expectedMap.put("Norway", "Oslo");
       expectedMap.put("France", "Paris");
       expectedMap.put("Germany", "Berlin");

        //THEN
        assertThat(capitals).isEqualTo(expectedMap);
    }

}