package algo.java.challenge.kakao202201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1Test {

    @Test
    void solution() {
        P1 p = new P1();
        assertArrayEquals(new int[]{2,1,1,0}, p.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2));
        assertArrayEquals(new int[]{0,0}, p.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3));
    }
}