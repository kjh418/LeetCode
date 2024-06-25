class Solution {
    public int calPoints(String[] operations) {
        // 점수를 저장할 곳
        List<Integer> scoreList = new ArrayList<>();
        
        for(String op : operations){
            if(op.equals("+")){
                // 직전 두 라운드 점수
                // List의 마지막 요소 : size() - 1
                // List의 마지막에서 두번째 요소 : size() - 2
                // 리스트의 현재 요소 개수
                int size = scoreList.size();
                // 마지막 요소와 마지막에서 두번째 요소의 합
                int sizeTo = scoreList.get(size-1) + scoreList.get(size-2);
                // 두 요소를 더한 값을 리스트에 추가
                scoreList.add(sizeTo);
            }else if(op.equals("D")){
                // List의 마지막 요소 값의 두배 값 추가
                int size = scoreList.size();
                scoreList.add(2 * scoreList.get(size-1));
            }else if(op.equals("C")){
                // List의 마지막 요소 제거
                int size = scoreList.size();
                scoreList.remove(scoreList.size() - 1);
            }else{
                // 정수 값을 리스트에 추가
                scoreList.add(Integer.valueOf(op));
            }
        }
        // 최종 점수 계산하기
        int sum = 0;
        for(int score : scoreList){
            sum += score;
        }
        return sum;
    }
}