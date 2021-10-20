package algo.java.inf1;

public class P0105 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = c.length - 1;

        while (lt < rt) {
            if (!isAlpha(c[lt])) {
                lt++;
                rt--;
                continue;
            }

            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++;
            rt--;
        }
        answer = String.valueOf(c);

        return answer;
    }

    //65 ~ 90 대문자 97 ~ 122
    public static boolean isAlpha(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }

        if (c >= 97 && c <= 122) {
            return true;
        }

        return false;
    }
}
