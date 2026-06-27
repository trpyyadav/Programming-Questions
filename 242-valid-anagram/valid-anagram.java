class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] frq1 = new int[26];
        int[] frq2 = new int[26];

        for(char ch: s.toCharArray()){
            frq1[ch - 'a']++;
        }

        for(char ch: t.toCharArray()){
            frq2[ch - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(frq1[i] != frq2[i]){
                return false;
            }
        }

        return true;

        
    }
}