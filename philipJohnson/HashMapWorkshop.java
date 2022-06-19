package philipJohnson;

import java.util.HashMap;

public class HashMapWorkshop {
    public static void main(String[] args)
    {
        //maps are simply key value pairs
        //after java 7 the second diamond operator infers you mean the same parameters in first diamond
        //hash maps use Java objects instead of primitive types just like an array list
        //String and Integer are java wrapper classes
        HashMap<String, Integer> employeeIDs = new HashMap<>();
        employeeIDs.put("John", 12345);
        employeeIDs.put("craig", 54321);
        employeeIDs.put("Jerry", 8675309);

        System.out.println(employeeIDs);

        //this will print the value
        System.out.println(employeeIDs.get("craig"));
        //will print out true
        System.out.println(employeeIDs.containsKey("John"));
        //will print out false
        System.out.println(employeeIDs.containsKey("Greg"));
        //will print out true
        System.out.println(employeeIDs.containsValue(8675309));
        //this will simply overwrite the value of the key with the same name
        employeeIDs.put("John", 987654);

        System.out.println(employeeIDs);

        //we can also update values with replace method
        //if the key does not exit then it wont spit out an error it will just do nothing
        employeeIDs.replace("John", 100001);
        //this value does not exit but the replace method simply skips it so no error
        employeeIDs.replace("Kramer", 123654);
        //this will place a key value pair only if it doesn't already exit
        employeeIDs.putIfAbsent("Kramer", 123654);

        System.out.println(employeeIDs);

        //this will remove an entry in the map
        employeeIDs.remove("Kramer");

        System.out.println(employeeIDs);
    }

}
