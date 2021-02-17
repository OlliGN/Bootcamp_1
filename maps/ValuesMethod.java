package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValuesMethod {
    public static void main(String[] args){
        Map<Integer, String> httpStatusCodes = new HashMap<>();

        httpStatusCodes.put(100, "Informational – Communicates transfer protocol-level information.");
        httpStatusCodes.put(200, "Success – Indicates that the client’s request was accepted successfully.");
        httpStatusCodes.put(300, "Redirection – Indicates that the client must take some additional action in order to complete their request.");
        httpStatusCodes.put(400, "Client Error – This category of error status codes points the finger at clients.");
        httpStatusCodes.put(500, "Server Error – The server takes responsibility for these error status codes.");
        httpStatusCodes.put(202, null);

        Collection<String> allOfTheValues = httpStatusCodes.values();

        //this is not a common practice
        for(String value : allOfTheValues){
            System.out.println(value);
        }
    }
}
