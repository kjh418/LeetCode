class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // 학생 리스트 초기화
        List<Integer> studentList = new ArrayList<>();
        for (int student : students) {
            studentList.add(student);
        }

        // 샌드위치 리스트 초기화
        List<Integer> sandwichList = new ArrayList<>();
        for (int sandwich : sandwiches) {
            sandwichList.add(sandwich);
        }

        int attempts = 0; // 학생들이 샌드위치를 고르지 못한 시도 횟수

        while (!studentList.isEmpty() && attempts < studentList.size()) {
            // 현재 학생이 현재 샌드위치를 선호하는 경우
            if (studentList.get(0).equals(sandwichList.get(0))) {
                // 학생과 샌드위치를 리스트에서 제거
                studentList.remove(0);
                sandwichList.remove(0);
                attempts = 0; // 시도 횟수 초기화
            } else {
                // 학생을 리스트 끝으로 이동
                studentList.add(studentList.remove(0));
                attempts++;
            }
        }

        // 남아있는 학생 수 반환
        return studentList.size();
    }
}