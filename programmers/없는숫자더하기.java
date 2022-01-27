package programmers;

import java.util.Arrays;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = new int[] {5,8,4,0,6,7,9};
        int answer = 0;
        boolean flag = false;

        for(int i=0; i<10; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j] == i) {
                    flag = true;
                }
            }
            if(!flag) {
                answer +=i;
            }
            flag = false;
        }

        System.out.println(answer);

    }
}
