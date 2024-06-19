class Solution {
    public String decodeMessage(String key, String message) {
        // 암호 해독하기
        // 1. key를 입력하면 입력한 키의 글자 순서대로 각각 abcd로 치환한다.
        // 2. message를 입력하면 메시지와 매칭되는 글자를 해석하면 된다. 

        // 매핑 테이블 생성
        HashMap<Character, Character> map = new HashMap<>();

        // 만일을 위해 중복된 문자는 제거해야 함 
        HashSet<Character> overlap = new HashSet<>();

        // a ~ z까지의 문자
        char alphabet = 'a';

        // 맵핑
        for(char c : key.toCharArray()){
             // 비어있지 않고 중복된 값이 아닐 경우
            if( c!= ' ' && !overlap.contains(c)){
                map.put(c, alphabet);
                overlap.add(c);
                alphabet++;   
            }
        }

        // 암호화된 메시지 해독
        StringBuilder decodeMessage = new StringBuilder();

        for(char c : message.toCharArray()){
            // 문자가 공백이라면
            if(c == ' '){
                // 공백 유지
                decodeMessage.append(' ');
            }else{
                decodeMessage.append(map.get(c));
            }
        }
        return decodeMessage.toString();
    }
}