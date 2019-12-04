package kata2;

import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        
        String[] data= {"francesco","ilenia","francesco","francesco","boh","boh"};
        Histogram histo= new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
        System.out.println("For key = " + entry.getKey() + ", there are " + entry.getValue()+" values");
        } 
        
    }
 
    
    
}
