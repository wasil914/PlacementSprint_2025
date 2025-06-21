public class isAnaggr {
    public boolean isAnagram(String s, String t) {
        // Step 1: If lengths don't match, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a count array for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Loop through both strings
        for (int i = 0; i < s.length(); i++) {
            // Increase count for character from s
            count[s.charAt(i) - 'a']++;

            // Decrease count for character from t
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false; // mismatch found
            }
        }

        // All counts matched — strings are anagrams
        return true;
    }
}
 {
    
}
