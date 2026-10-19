class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> temp = new ArrayList<>();
            String word = strs[i];

            temp.add(word);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && valid(word, strs[j])) {
                    temp.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(temp);
        }

        return ans;
    }

    public boolean valid(String s, String t) {
        int[] arr = new int[26];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int count : arr) {
            if (count != 0) return false;
        }

        return true;
    }
}