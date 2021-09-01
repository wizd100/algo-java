package algo.java.programmers.learn;

public class P62048 {
    public long solution(int w, int h) {
        long answer = 1;
        long gcd = 0;
        long max = Math.max(w, h);
        long min = Math.min(w, h);
        long tmp = 1;

        //최대공약수 구하기
        while (tmp > 0) {
            tmp = max % min;
            max = min;
            min = tmp;
        }

        gcd = max;

        answer = (long)w * (long)h - ((long)w + (long)h - gcd);

        return answer;
    }
}
