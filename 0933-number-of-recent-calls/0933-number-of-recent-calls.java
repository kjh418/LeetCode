class RecentCounter {
    
    // 요청 시간을 저장할 큐 선언
    private Queue<Integer> queue;
    
    // 생성자(객체가 생성될 때 큐 초기화)
    public RecentCounter() {
        // LinkedList를 사용하여 큐 초기화
        queue = new LinkedList<>();
    }
    
    // ping 메서드(요청 시간이 주어질 때 최근 3초 내의 요청 수를 반환한다.)
    public int ping(int t) {
        // 현재 요청 시간을 큐에 추가
        queue.add(t);
        
        // queue의 맨 앞에 있는 요소가 현재 시간 t에서 3000밀리초보다 이전인 경우 제거.
        // queue의 맨 앞 요소 (queue.peek())가 t - 3000보다 작으면 while루프를 통해 제거한다. 
        while(queue.peek() < t - 3000){
            // 맨 앞 요소 제거
            queue.poll();
        }
        
        // 최근 3000밀리초 내에 남아있는 요청 수를 반환한다.
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */