class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String l=strs[0],r=strs[strs.length-1];
        int i=0;
        String ans="";
        while(i<l.length() && i<r.length()){
            if(l.charAt(i)!=r.charAt(i)) break;
            i++;
            ans=l.substring(0,i);
        }
        return ans;
        
    }
}