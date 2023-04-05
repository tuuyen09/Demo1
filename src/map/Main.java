package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer > hashMap = new HashMap<>();
        String str = "Hello hello from C0223G1";
        String[] str1 = str.toLowerCase().split( " ");
        String key = "";
        int value ;
        for (String i : str1){
          key = i;
          if(hashMap.containsKey(key)){
              value = hashMap.get(key);
              hashMap.put(key, value + 1);
          }else {
              hashMap.put(key, 1);
          }
        }
        System.out.println(hashMap);





    }
}
