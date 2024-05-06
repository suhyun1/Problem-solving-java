class BestSet {
    /* 
     * 최고의 집합
     * https://school.programmers.co.kr/learn/courses/30/lessons/12938
     */
    public int[] solution(int n, int s) {

        int[] answer = new int[n];

        int divide = s / n;
        int mod = s % n;

        if (divide == 0) {
            return new int[]{-1};
        }

        for (int i = 0; i < n - mod; i++) {
            answer[i] = divide;
        }
         for (int i = n - mod; i < n; i++) {
            answer[i] = divide + 1;
        }

        return answer;
    }
}
