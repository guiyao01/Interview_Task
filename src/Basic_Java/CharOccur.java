package Basic_Java;

import java.util.HashMap;
import java.util.Map;

class CharOccur{
    public static void count(String input){
        Map<Character,Integer> map = new HashMap<>();
        for(char c:input.toCharArray()){
            if(c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println("key:"+e.getKey()+" value:"+e.getValue());
        }
    }
    public static void main(String[] args) {
        String input = "hello world";
        count(input);
    }
}
