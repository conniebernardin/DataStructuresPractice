import java.util.HashMap;
public class Maps {

        public static void main(String[] args) {
            // Create a HashMap object called capitalCities. Key and values both Strings
            HashMap<String, String> capitalCities = new HashMap<String, String>();

            // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
            capitalCities.put("France", "Paris");
            capitalCities.put("Kenya", "Nairobi");
            capitalCities.put("Iran", "Tehran");
            System.out.println(capitalCities);
        }
    }

