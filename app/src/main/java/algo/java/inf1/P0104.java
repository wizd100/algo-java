package algo.java.inf1;

import java.util.Arrays;

public class P0104 {
    public String[] solution(int n, String[] arr) {
        String[] reverseArr = new String[n];

        /*Arrays.fill(reverseArr, "");
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                reverseArr[i] += arr[i].charAt(j);
            }
        }*/

        /*for (int i = 0; i < n; i++) {
            reverseArr[i] = new StringBuilder(arr[i]).reverse().toString();
        }*/

        for (int i = 0; i < n; i++) {
            char[] c = arr[i].toCharArray();
            int lt = 0;
            int rt = arr[i].length() - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            reverseArr[i] = String.valueOf(c);
        }

        for (int i = 0; i < reverseArr.length; i++) {
            System.out.println(reverseArr[i]);
        }

        return reverseArr;
    }
}
