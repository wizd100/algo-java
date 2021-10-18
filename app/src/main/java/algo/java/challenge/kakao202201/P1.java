package algo.java.challenge.kakao202201;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, String> reportUser = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String[] reportInfo = report[i].split(" ");

            if (reportUser.get(reportInfo[0]) != null && reportUser.get(reportInfo[0]).contains(reportInfo[1])) {
                continue;
            }

            //유저가 신고한 것 텍스트로 추가
            reportUser.merge(reportInfo[0], reportInfo[1], (a, b) -> a + "," + b);

            //신고당한 횟수 추가
            int value1 = reportCount.get(reportInfo[1]) != null ? reportCount.get(reportInfo[1]) : 0;
            reportCount.put(reportInfo[1], ++value1);
        }

        reportCount.forEach((key, value) -> {
            if (value >= k) {
                reportUser.forEach((key2, value2) -> {
                    if (value2.contains(key)) {
                        for (int i = 0; i < id_list.length; i++) {
                            if (id_list[i].equals(key2)) {
                                answer[i]++;
                            }
                        }
                    }
                });
            }
        });

        return answer;
    }
}
