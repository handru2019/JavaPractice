package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */

    public static Map<String, String> mapBully(Map<String, String> map) {

        if(map.get("a") != null){
            String bValue = map.get("a");
            map.put("b", bValue);
            map.put("a", "");
        }

        return map;
    }

    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b","dirt");

        System.out.println(mapBully(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");

        System.out.println();
        System.out.println(mapBully(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b","dirt");
        map3.put("c","meh");

        System.out.println();
        System.out.println(mapBully(map3));

    }
}
