package tech.datvu.leetcode.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode_00599MinimumIndexSumofTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> restaurant = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            restaurant.put(list1[i], i);
        }

        Set<String> restaurantName = new HashSet<>();

        for (int i = 0; i < list2.length; i++) {
            if (restaurant.containsKey(list2[i])) {
                restaurant.replace(list2[i], restaurant.get(list2[i]) + i);
                restaurantName.add(list2[i]);
            }
        }

        int min = Integer.MAX_VALUE;

        int cnt = 0;
        for (String key : restaurantName) {
            if (restaurant.get(key) == min) {
                cnt++;
            } else if (restaurant.get(key) < min) {
                cnt = 1;
                min = restaurant.get(key);
            }
        }

        String[] res = new String[cnt];

        cnt = 0;

        for (String key : restaurantName) {
            if (restaurant.get(key) == min) {
                res[cnt++] = key;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
        String[] res = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(res));
    }
}
