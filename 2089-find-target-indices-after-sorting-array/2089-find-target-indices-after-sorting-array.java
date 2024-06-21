import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// target의 인덱스 값을 출력하는 문제
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // nums를 작은 순서부터 나열한다.
        Arrays.sort(nums);

        // target의 값을 찾고, 인덱스를 저장할 변수에 추가한다. 
        // 인덱스를 저장할 변수
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}