import java.util.LinkedList;

public class Solution {

    public int solution(int N) {

        // decimal to binary list
        LinkedList<Integer> binary = new LinkedList<>();
        while (N > 0) {
            binary.add(N % 2);
            N = N / 2;
        }

        int flag = 0;
        int count = 0;
        int max = 0;

        for (int bit : binary) {

            if (bit == 1) {
                if (flag == 0) {
                    flag = 1;
                } else {
                    if (count > max) {
                        max = count;

                    }
                    count = 0;
                }
            } else {
                if (flag == 1) {
                    count++;
                }

            }
        }

        return max;
    }
}
