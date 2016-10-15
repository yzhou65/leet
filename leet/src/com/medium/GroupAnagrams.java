package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 * @author yue
 *
 */
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (strs == null) {
            return result;
        }
        if (strs.length == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(strs[0]);
            result.add(list);
            return result;
        }
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        
        for (String str: strs) {
			int[] count = new int[26];
			for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i) - 'a']++;
			}
			
			int hash = getHash(count);
			if (!map.containsKey(hash)) {
				map.put(hash, new ArrayList<String>());
			}
			map.get(hash).add(str);
		}
        
        for (ArrayList<String> tmp : map.values()) {
			if (tmp.size() > 1) {
				result.add(tmp);
			}
		}
        return result;
    }
	
	private int getHash(int[] count){
		int hash = 0;
		int a = 378551;
		int b = 63689;
		for (int num : count) {
			hash = hash * a + num;
			a = a * b;
		}
		return hash;
	}
}
