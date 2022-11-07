public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        arr = new int[9];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        processingMassive(arr);
    }

    public static int processingMassive(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            if (i >= 2 && i < 7) {
                System.out.println(arr[i]);
            }
        }
        return 0;
    }
}
