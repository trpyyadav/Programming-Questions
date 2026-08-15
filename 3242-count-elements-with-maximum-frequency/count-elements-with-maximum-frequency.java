class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxFreq = 0;
        for(int freq: map.values()){
            maxFreq = Math.max(freq, maxFreq);
        }

        int result = 0;
        for(int freq: map.values()){
            if(freq==maxFreq){
                result+=freq;
            }
        }

        return result;
    }
}