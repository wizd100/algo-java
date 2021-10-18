package algo.java.inf1;

public class P0102 {
    public String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            /*if (c < 91) { //대문자일때
                answer += Character.toLowerCase(c);
                continue;
            }*/

            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
                continue;
            }

            answer += Character.toUpperCase(c);
        }

        return answer;
    }
}
