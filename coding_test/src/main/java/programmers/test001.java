package programmers;

import java.util.*;

public class test001 {
    class Solution {
        public int solution(int[] nums) {
//        배열의 길이 절반을 저장
            int answer = nums.length / 2;
//        중복값을 제외 저장
            HashSet<Integer> set = new HashSet<>();
//        nums 배열의 숫자를 set 에 추가
            for (int num : nums)
                set.add(num);
//        set 크기가 answer 보다 크면 answer, 아니면 set 크기
            return set.size() > answer ? answer : set.size();
        }
    }
}
