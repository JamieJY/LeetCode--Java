class Solution {
    public boolean isAnagram(String s, String t) {
        
        //return false if the length of two string are different
        if(s.length() != t.length()){
            return false;
        }
      
       // use map to store char and its count
        Map<Character,Integer> charAndNum = new HashMap<>();
       
        //loop first string s and add to map
        for(int i = 0; i < s.length(); i++){
            if(charAndNum.containsKey(s.charAt(i))){
                charAndNum.put(s.charAt(i),charAndNum.get(s.charAt(i))+1);
            }
            else{
                charAndNum.put(s.charAt(i),1);
                }
            }
        
        //loop second string t and subtract char count from map
         for(int i = 0; i < s.length(); i++){
            if(charAndNum.containsKey(t.charAt(i))){
                charAndNum.put(t.charAt(i),charAndNum.get(t.charAt(i))-1);
            }
            else{
                return false;
               }
            }
        
        // check if all the count is zero or not
        for(Character alphabet : charAndNum.keySet()){
            if(charAndNum.get(alphabet) != 0){
                return false;
            }
        }

        return true;
        
    }
}