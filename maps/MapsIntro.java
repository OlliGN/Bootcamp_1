package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsIntro {
    public static void main(String[] args) {

        //HashMap is unordered

        //we have provide 2 data types :
        //1 for the key
        //2 for the value
        Map<Integer, String> httpStatusCodes = new HashMap<>();

        //put(key,value); ---> for adding object to the map
        httpStatusCodes.put(100, "Informational – Communicates transfer protocol-level information.");
        httpStatusCodes.put(200, "Success – Indicates that the client’s request was accepted successfully.");
        httpStatusCodes.put(300, "Redirection – Indicates that the client must take some additional action in order to complete their request.");
        httpStatusCodes.put(400, "Client Error – This category of error status codes points the finger at clients.");
        httpStatusCodes.put(500, "Server Error – The server takes responsibility for these error status codes.");
        System.out.println(httpStatusCodes);

        //get(key) ---> returns the value associated with the key, if the key does not exist - it returns null

        if (httpStatusCodes.get(201) == null) {
            System.out.println("Given status does not exist");
        } else {
            System.out.println(httpStatusCodes.get(201));
        }

    }
}
