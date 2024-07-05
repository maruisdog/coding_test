package programmers;

import java.util.HashSet;

public class test002 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
//            String answer = "";
            HashSet<String> set = new HashSet<>();
            for (String player : participant){
                set.add(player);
            }
            for (String player : completion) {
                set.remove(player);
            }

            String result = new String();
            for (String player : set) {
                result = player;
            }
            return result;
        }
    }
}
