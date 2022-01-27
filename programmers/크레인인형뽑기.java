package programmers;

import java.util.ArrayList;
import java.util.List;

public class 크레인인형뽑기 {
    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}};
        int[] moves = new int[]{1, 2, 3, 3, 2, 3, 1};
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int move: moves) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][move-1] != 0) {
                    if(list.isEmpty()) {
                        list.add(board[j][move-1]);
                        board[j][move-1] = 0;
                    } else {
                        int top = list.get(list.size()-1);
                        if(top == board[j][move-1]) {
                            board[j][move-1] = 0;
                            list.remove(list.size() - 1);
                            answer += 2;
                        } else {
                            list.add(board[j][move-1]);
                            board[j][move-1] = 0;
                        }
                    }
                    break;
                }
            }
        }


        System.out.println(answer);
    }
}
