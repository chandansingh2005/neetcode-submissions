class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a Hashmap
        HashMap<String,List<String>>map=new HashMap<>();
        // loop through every word
        for(String str:strs){
            // conver String to char Array
            char [] arr=str.toCharArray();
            // Sort the Character
            Arrays.sort(arr);

            // convert back to string
            String key=new String(arr);
            // check the conditision 
            // if key is not present
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
