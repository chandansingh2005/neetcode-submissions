class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a Hashmap
        HashMap<String, List<String>> map = new HashMap<>();
        // loop through every word
        for (String str : strs) {
            //    create count frequncy
            int[] count = new int[26];
            // count frequency
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            // Build unique key
            StringBuilder sb=new StringBuilder();
            for(int num:count){
                sb.append(num);
                sb.append("#");
            }
            // convet back to string
            String key=sb.toString();

            // check the conditision
            // if key is not present
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
