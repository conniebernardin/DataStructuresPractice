import java.util.HashMap;
public class Maps {

        public static void main(String[] args) {
            // Create a HashMap object called capitalCities. Key and values both Strings
            capitalCities();
        }

    private static void capitalCities() {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("France", "Paris");
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Iran", "Tehran");
        capitalCities.put("Egypt", "Cairo");
        capitalCities.put("Hungary", "Budapest");

        //retrieve capital for Kenya
        System.out.println(capitalCities.get("Kenya"));

        //adding new country to capitals
        capitalCities.put(("Poland"), "Warsaw");
        capitalCities.put(("Peru"), "Lima");
        capitalCities.put(("New Zealand"), "Wellington");

        System.out.println(capitalCities.size());

        //looping through countries in map
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}

