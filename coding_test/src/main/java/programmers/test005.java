package programmers;

import java.util.ArrayList;
import java.util.List;

public class test005 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
        public static int[] solution(int n) {
            int[] answer = {};
            List<Integer> x = new ArrayList<>();
            x.add(n);
            while (n!=1)
            {
                if (n%2==0){
                    n = n/2;
                } else{
                    n = 3*n+1;
                }
                x.add(n);
            }
            answer = new int[x.size()];
            for (int i = 0; i < x.size(); i++) {
                answer[i] = x.get(i);
            }
            System.out.println(x);
            return answer;
    }
}
