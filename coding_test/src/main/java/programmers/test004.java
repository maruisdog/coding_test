package programmers;

import java.util.ArrayList;
import java.util.List;

public class test004 {
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            int[] answer = {};
//            query 길이만큼 반복문
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            for (int i = 0; i < query.length; i++) {
                if (i%2==0) {
                    list.subList(query[i]+1, list.size()).clear();
                } else {
                    list.subList(0, query[i]).clear();
                }
            }
            answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}