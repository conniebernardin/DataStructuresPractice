import org.junit.jupiter.api.Test;

import java.util.HashMap;

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

}