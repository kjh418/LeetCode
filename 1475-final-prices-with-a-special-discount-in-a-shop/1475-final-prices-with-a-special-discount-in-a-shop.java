class Solution {
    public int[] finalPrices(int[] prices) {
        // 배열의 길이
        int n = prices.length;
        // 결과
        int[] result = new int[n];
        
        for(int i=0; i<n; i++){
            // 초기값 (조건에 해당하는 값이 없으면 원래값으로 출력)
            result[i] = prices[i];
            
            // j는 i 다음 인덱스
            for(int j=i+1; j<n; j++){
                // 인덱스에 해당하는 값이 작거나 같다면~
                if(prices[j] <= prices[i]){
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return result;
    }
}