package kata2;

import java.util.HashMap;
import java.util.Map;

public class kata2 {

    public static void main(String[] args) {
        
        int[] data= {2,5,6,8,3,2,2,4,5,6,7,89,2,4,7};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        
        //for (int i = 0; i < data.length; i++) {
        for (int i : data) {
            /*if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
                

            }else{
                histogram.put(data[i],1);
                
            }*/
            histogram.put(i,histogram.containsKey(i) ? histogram.get(i)+1 : 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
        System.out.println("For key = " + entry.getKey() + ", there are " + entry.getValue()+" values");
        } 
        
    }
 
    
    
}
