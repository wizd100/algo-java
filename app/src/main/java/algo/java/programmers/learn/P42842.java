package algo.java.programmers.learn;

public class P42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer;
        int width = 0;
        int height = 0;

        for (height = 3; height <= (int)(brown + 4) / 2; height++) {
            width = ((brown + 4) / 2) - height;

            if (width < height) {
                break;
            }

            int yellowCount = (width - 2) * (height - 2);

            if (yellow == yellowCount) {
                break;
            }
        }

        answer = new int[]{width, height};

        return answer;
    }
}
