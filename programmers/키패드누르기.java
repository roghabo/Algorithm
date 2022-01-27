package programmers;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String answer = "";

        int right = 10;
        int left = 12;

        for(int number: numbers) {
            switch (number) {
                case 1:
                case 4:
                case 7:
                    answer = answer.concat("L");
                    left = number;
                    break;
                case 3:
                case 6:
                case 9:
                    answer = answer.concat("R");
                    right = number;
                    break;

                case 2:
                case 5:
                case 8:
                case 0:
                    int l_x = (left-1) / 3;
                    int l_y = (left-1) % 3;
                    int r_x = (right-1) / 3;
                    int r_y = (right-1) % 3;
                    int n_x = (number-1) / 3;
                    int n_y = (number-1) % 3;

                    if(number == 0) {
                        n_x = 3;
                        n_y = 1;
                    }

                    if(left == 0) {
                        l_x = 3;
                        l_y = 1;
                    }

                    if(right == 0) {
                        r_x = 3;
                        r_y = 1;
                    }
                    double l_d = Math.ceil(Math.sqrt(Math.pow(n_x - l_x, 2) + Math.pow(n_y - l_y, 2)));
                    double r_d = Math.ceil(Math.sqrt(Math.pow(n_x - r_x, 2) + Math.pow(n_y - r_y, 2)));

                    if(l_d > r_d) {
                        answer = answer.concat("R");
                        right = number;
                    } else if (l_d < r_d) {
                        answer = answer.concat("L");
                        left = number;
                    } else {
                        if(hand.equals("right")) {
                            answer = answer.concat("R");
                            right = number;
                        } else {
                            answer = answer.concat("L");
                            left = number;
                        }
                    }
                    break;

                default:

                    break;
            }
        }

        System.out.println(answer);
    }
}
