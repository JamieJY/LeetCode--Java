class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length() != t.length()){
            return false;
        }
       //create int array with 26 length to record the count of alphabet a-z
       // index 0->a,index 1->b, 2->c, ....,25->z

         int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        //check if each count is zero or not 
        for(int num :count){
            if(num != 0){
                return false;
            }          
        } 
         return true;   
    }     
}