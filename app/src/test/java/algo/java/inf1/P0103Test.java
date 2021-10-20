package algo.java.inf1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0103Test {

    @Test
    void solution() {
        P0103 p = new P0103();
        assertEquals("study", p.solution("it is time to study"));
        assertEquals("witouweiotwiowioei", p.solution("eitoiw iruow witouweiotwiowioei eiiuow e"));
    }
}