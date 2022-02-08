import java.util.ArrayList;

public class DataStructures{
    public static void main(String[] args) {
        ArrayList <Number> list = new ArrayList<>(); //creating new list
        list.add(10); //intuitive method recall function
        list.add(20);
        list.add(30);
        list.add(40);
        testingMethods(list);
    }

    private static void testingMethods(ArrayList list) {
        System.out.println(list.size());
        list.remove(1); //removing object at index 1
        System.out.println(list.contains(20)); //checking whether 20 was removed using boolean .contains function

        //looping through list and printing values
        list.forEach(e -> {
            System.out.println("e = " + e);
        });
        //can also use a for each loop
//        for (Object e : list) {
//            System.out.println("e = " + e);
//        }
        //can loop through with for i loop (only used if you need access to index)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Object 30 index = " + list.indexOf(30)); //check index of particular object
    }
}
