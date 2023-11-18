class Solution {
    public boolean isPalindrome(int x) {
       
        if(x<0){
            return false;
        }
        int reversedNumber = 0;
        int tempNumber = x;
        while(tempNumber != 0){
            int lastNumber = tempNumber%10;

            reversedNumber=reversedNumber * 10 +lastNumber;

            tempNumber /= 10;
        }

        return (x==reversedNumber);
    }
}