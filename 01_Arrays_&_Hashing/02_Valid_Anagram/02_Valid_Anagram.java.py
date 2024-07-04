import java.util.Arrays;

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // eaay case, if the length isn' the same, is wasn't an anagram

        int[] store = new int[26]; // 26 letters in the alphabet

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++; 
            store[t.charAt(i) - 'a']--;
      // get it now , assending order sorting to check the ascii value ++, verse vurses
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}


class Solution2 {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
