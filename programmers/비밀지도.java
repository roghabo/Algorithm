package programmers;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = new int[] {9, 20, 28, 18, 11};
        int[] arr2 = new int[] {30, 1, 21, 17, 28};

        for (int i = 0; i < n; i++) {
            String binaryArr1 = Integer.toBinaryString(arr1[i]);
            if(binaryArr1.length() < 5) {
                while (binaryArr1.length() < 5) {
                    binaryArr1 = "0"+binaryArr1;
                }
            }

            String binaryArr2 = Integer.toBinaryString(arr2[i]);
            if(binaryArr2.length() < 5) {
                while (binaryArr2.length() < 5) {
                    binaryArr2 = "0"+binaryArr2;
                }
            }

            char[] charArr1 = binaryArr1.toCharArray();
            char[] charArr2 = binaryArr1.toCharArray();





        }

        String[] answer = {};


    }
}
