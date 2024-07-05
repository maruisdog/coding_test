package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test003 {
    public static void main(String[] args) {
        int[] array ={1, 5, 2, 6, 3, 7, 4};
        int[][] commands  = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array,commands);

    }
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = {};

        List<Integer> result = new ArrayList();
        for (int i = 0; i < commands.length; i++) {
            // arrays 의 크기 자르기
            List<Integer> list = new ArrayList();
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                list.add(array[j]);
                list.sort(Comparator.naturalOrder());
            }
            System.out.println(list);
            result.add(list.get(commands[i][2]-1));
        }
        System.out.println(result);
        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
