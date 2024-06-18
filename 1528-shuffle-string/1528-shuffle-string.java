class Solution {
    public String restoreString(String s, int[] indices) {
        
        // 문자열 -> 문자 = toCharArray
        
        
        // 입력된 문자를 char로 변경
        char[] chars = s.toCharArray();
        
        // 결과 저장할 배열
        char[] result = new char[chars.length];
        
        // 인덱스 순으로 배치
        for(int i=0; i<indices.length; i++){
            result[indices[i]] = chars[i];
        }
        return new String(result);
    }
}