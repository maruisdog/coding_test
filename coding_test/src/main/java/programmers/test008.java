package programmers;

import java.util.*;
// 무작위로 K개의 수 뽑기
public class test008 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        System.out.println(solution(arr, k));
    }
        public static int[] solution(int[] arr, int k) {
            int[] answer = new int[k];
            Arrays.fill(answer, -1);
            arr = Arrays.stream(arr).distinct().toArray();
            for (int i = 0; i < arr.length && i < k; i++) {
                    answer[i] = arr[i];
            }
            return answer;
        }
}
