class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // 행
        int m = mat.length;
        // 열
        int n = mat[0].length;
        // 병사 수 저장
        int[] soldiers = new int[m];
        
        // 각 행의 병사 수
        for(int i=0; i<m; i++){
            // 병사 수
            int count = 0;
            
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    count++;
                }else{
                    break;
                }
            }
            // 행의 병사 수 저장
            soldiers[i] = count;
        }
        
        // 병사 수와 행의 인덱스
        int[][] soldierIndex = new int[m][2];
        for(int i=0; i<m; i++){
            soldierIndex[i][0] = soldiers[i]; // 병사 수
            soldierIndex[i][1] = i; // 인덱스
        }
        
        // 병사 수와 인덱스를 기준으로 정렬하기
        // 병사 수를 기준으로 정렬, 값이 같다면 인덱스로 비교
        Arrays.sort(soldierIndex, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = soldierIndex[i][1];
        }
        return result;
    }
}