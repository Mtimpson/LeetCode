import java.util.HashMap;

/*
Title: First Unique Character in a String

Instructions: Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/



public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int stringLength = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < stringLength; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < stringLength; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
    public static void main(String args[]) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}
