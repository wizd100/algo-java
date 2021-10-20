package algo.java.inf1;

public class P0106 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            //System.out.printf("%s %d %d\n", str.charAt(i), i, str.indexOf(str.charAt(i)));
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
