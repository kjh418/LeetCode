// 조건 : nums의 값이 2개 이하일 때는 최대, 최소값을 구할 수 없다. 

class Solution {
    public int findNonMinOrMax(int[] nums) {
        // nums의 길이가 2이하면 최대, 최소값을 찾을 수 없다.
        if(nums.length <= 2){
            return -1;
        }
        
        // 최대, 최소값 초기화
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int n : nums){
            if(max < n){
                max = n;
            }
            if(min > n){
                min = n;
            }
        }
        
        // nums 배열에서 최대, 최소값이 아닌 값 찾기
        for(int n : nums){
            if(n != max && n != min){
                return n;
            }
        }
        
        // 값이 없으면 -1 리턴
        return -1;
    }
}