public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String word : strs) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        // Create key like "a2b1c0...z0"
        StringBuilder sb = new StringBuilder();
        for (int freq : count) {
            sb.append("#"); // delimiter to avoid confusion
            sb.append(freq);
        }
        String key = sb.toString();

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
    }

    return new ArrayList<>(map.values());
}
