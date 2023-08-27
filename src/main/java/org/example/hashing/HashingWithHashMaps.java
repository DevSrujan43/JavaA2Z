package org.example.hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashingWithHashMaps {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{1,2,2,3,4};
        Map<Integer,Integer> hmap = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (hmap.containsKey(arr[i])) {
                hmap.put(arr[i], hmap.get(arr[i])+ 1);
            } else {
                hmap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
