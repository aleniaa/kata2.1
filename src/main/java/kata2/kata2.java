package kata2;

import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        
        int[] data= {2,5,6,8,3,2,2,4,5,6,7,89,2,4,7};
        Histogram histo= new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
        System.out.println("For key = " + entry.getKey() + ", there are " + entry.getValue()+" values");
        } 
        
    }
 
    
    
}
