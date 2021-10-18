package algo.java.inf1;

import java.util.Locale;
import java.util.Scanner;

public class P0101 {
    public static void main(String[] args) {
        P0101 T = new P0101();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.print(T.solution(str, c));
    }

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }*/

        for (char x : str.toCharArray()) {
            if (x == c) {
                answer++;
            }
        }

        return answer;
    }
}
