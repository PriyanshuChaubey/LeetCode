// class Solution {
//     public int compress(char[] chars) {
//         HashMap<Character, Integer> mapp = new HashMap<>();
//         for(char ch: chars){
//             mapp.put(ch, mapp.getOrDefault(ch, 0)+1);
            
//         }
//         int idx = 0;
//         for(Map.Entry<Character, Integer> entry: mapp.entrySet()){
//             chars[idx++] = entry.getKey();
//             int count = entry.getValue();
//             if(count > 1){
//                 String st = Integer.toString(count);
//                 for(char digit: st.toCharArray()){
//                     chars[idx++] = digit;
//                 }
//             }
//         }

//         return idx;
//      }
// }



class Solution {
    public int compress(char[] chars) {
        int write = 0; // Where we write the compressed result
        int read = 0;  // Where we read the original characters

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count how many times currentChar repeats consecutively
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // 1. Write the character
            chars[write++] = currentChar;

            // 2. Write the count digits if count > 1
            if (count > 1) {
                String st = Integer.toString(count);
                for (char digit : st.toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;
    }
}
