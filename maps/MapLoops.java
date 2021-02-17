package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLoops {
    public static void main(String[] args) {
        //Entry is a class that represents one Entry (key value pair) in a map

        Map<Integer, String> httpStatusCodes = new HashMap<>();

        httpStatusCodes.put(100, "Informational – Communicates transfer protocol-level information.");
        httpStatusCodes.put(200, "Success – Indicates that the client’s request was accepted successfully.");
        httpStatusCodes.put(300, "Redirection – Indicates that the client must take some additional action in order to complete their request.");
        httpStatusCodes.put(400, "Client Error – This category of error status codes points the finger at clients.");
        httpStatusCodes.put(500, "Server Error – The server takes responsibility for these error status codes.");
        httpStatusCodes.put(202, null);
        httpStatusCodes.put(303, null);

        Set<Map.Entry<Integer, String>> allOfTheEntries = httpStatusCodes.entrySet();

        for (Map.Entry<Integer, String> entry : allOfTheEntries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //keySet - returns set of all of the keys
        Set<Integer> allOfTheKeys = httpStatusCodes.keySet();

        //Find if any on values in the Map has null value
        //update the null values to "Iam not null any more"
        for (Integer key : allOfTheKeys) {

            httpStatusCodes.putIfAbsent(key, "I am not null anymore"); //putIfAbsent() - will put new value if the value is null
            System.out.println(httpStatusCodes.get(key));
        }
    }
}