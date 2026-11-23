class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();
        for(int num: nums){
            exploredMap.put(num, false);
        }

        for(int num: nums){
            int currentlen = 1;
            int nextnum = num+1;

            while(exploredMap.containsKey(nextnum) && exploredMap.get(nextnum) == false){
                currentlen++;
                exploredMap.put(nextnum, true);
                nextnum++;
            }


            int prevnum = num-1;
            while(exploredMap.containsKey(prevnum) && !exploredMap.get(prevnum)){
                currentlen++;
                exploredMap.put(prevnum, true);
                prevnum--;
            }
            maxlen = Math.max(maxlen, currentlen);
        }

        return maxlen;
    }
}