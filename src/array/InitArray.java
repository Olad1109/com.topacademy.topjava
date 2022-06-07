package array;

public class InitArray {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        arr[0][0] = 14;
        arr[0][1] = 29;
        arr[1][0] = 0;
        arr[1][1] = 42;
        arr[0][2] = 40;
        arr[1][2] = 2;
        arr[2][0] = 6;
        arr[2][1] = 7;
        arr[2][2] = 27;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


