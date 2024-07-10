package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : programmers
 * fileName : test009
 * author : gumiji
 * date : 7/6/24
 * description : 배열 만들기 2
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 7/6/24         gumiji          최초 생성
 */
public class test009 {
    public static void main(String[] args) {
        int l = 10;
        int r = 20;
        System.out.println(solution(l, r));
    }
    public static int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r ; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                list.add(i);
            }
        }
        if (list.isEmpty()){
            return new int[]{-1};
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
