//https://school.programmers.co.kr/learn/courses/30/lessons/12977 

class Solution {
    public int solution(int[] nums) {
        return getCount(nums);
    }
    
    private int getCount(int[] nums) {
        int count = 0 ;
        for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        count ++;
                    }
                } 
            } 
        }
        return count;
    }
    
    private boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
          if (number % i == 0) {
            return false;
          }
        }
        return true;
    }
}