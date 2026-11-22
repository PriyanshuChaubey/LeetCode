class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                List<String> arraylist = new ArrayList<>();
                arraylist.add(str);
                map.put(sorted, arraylist);
            }
        }
        return new ArrayList<>(map.values());
    }
}