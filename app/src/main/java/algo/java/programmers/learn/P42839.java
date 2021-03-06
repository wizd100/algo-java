package algo.java.programmers.learn;

import java.util.*;

public class P42839 {
    private static int cnt = 0;
    private static String[] map;
    private static String[] result;
    private static boolean[] visit;
    private static HashSet<Integer> list;

    public int solution(String numbers) {
        int answer = 0;

        visit = new boolean[numbers.length()];
        map = new String[numbers.length()];
        map = numbers.split("");

        list = new HashSet();

        for (int i=1; i<=numbers.length(); i++) {
            result = new String[i];
            cycle(0, i, numbers.length());
        }

        return list.size();
    }

    public void cycle(int start, int end, int length) {

        if (start == end) {
            findPrime();
        } else {

            for (int i=0; i<length; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    result[start] = map[i];
                    cycle(start+1, end, length);
                    visit[i] = false;
                }
            }

        }

    }

    public void findPrime() {

        // 숫자로 변환
        String str = "";
        for(int i=0; i<result.length; i++)
            str += result[i];
        int num = Integer.parseInt(str);

        // 예외 처리
        if(num == 1 || num == 0)
            return;

        // 소수 인지 검사
        boolean flag = false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0)
                flag = true;
        }

        if(!flag)
            list.add(num);
    }

    public int solution2(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }

    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }
}
