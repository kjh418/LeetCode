class Solution {
    public String maximumOddBinaryNumber(String s) {
        // 0의 개수
        int count0 = 0;
        
        // 1의 개수
        int count1 = 0;
        
        // 0과 1의 개수 구하기
        for(char c : s.toCharArray()){
            if(c == '1'){
                count1++;
            }else if(c == '0'){
                count0++;
            }
        }
        
        // 가장 큰 홀수 이진수 만들기
        StringBuilder result = new StringBuilder();
        
        // 가장 큰 이진수는 앞에 1이 있고 
        // 홀수는 마지막이 1로 끝나야 함.
        // 원래 가지고 있는 1의 개수만큼 앞에 배치.(단 홀수를 위해 1개는 남김)
        for(int i=0; i<count1-1; i++){
            result.append('1');
        }
        
        // 나머지 자리는 0으로 채움 (0의 개수만큼 뒤에 배치)
        for(int i=0; i<count0; i++){
            result.append('0');
        }
        
        // 마지막 자리에 1 배치
        result.append('1');
        
        return result.toString();
    }
}