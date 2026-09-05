class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        for(int i=1; i<s.length(); i++){
            int a = s.charAt(i-1);
            int b = s.charAt(i);
            int diff = Math.abs(b-a);
            sum += diff;
        }
        return sum;
    }
}