package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class test008 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;
        System.out.println(solution(arr, k));
    }
        public static int[] solution(int[] arr, int k) {
            int[] answer = {};
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            System.out.println("list : " + list);

            HashSet<Integer> set = new HashSet<>(list);
            System.out.println("set : " + set);

            if (set.size() == k) {
//                answer =
            }
            return answer;
        }
}
