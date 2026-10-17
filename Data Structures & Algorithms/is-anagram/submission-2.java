class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int l1 = s.length();
        int l2 = t.length();

        if(l1!=l2)return false;

        for(int i=0; i<l1; i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            map1.put(x,map1.getOrDefault(x,0)+1);
            map2.put(y,map2.getOrDefault(y,0)+1);
        }
        
        return map1.equals(map2);
    }
}
