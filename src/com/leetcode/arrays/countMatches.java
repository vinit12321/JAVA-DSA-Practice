package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class countMatches {
    public static void main(String[] args) {

        String arr[][] = {{"phone", "blue", "pixel"}, {"computer", "silver", "phone"}, {"phone", "gold", "iphone"}};
        List<List<String>> items = new ArrayList<List<String>>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<String> list1 = new ArrayList<String>();
            for (int j = 0; j < arr[i].length; j++) {

                list1.add(arr[i][j]);
            }
            items.add(list1);
        }
        System.out.println(items);
        //System.out.println(items.size());
        System.out.println(countMatches(items, "type", "phone"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                count++;

            } else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
