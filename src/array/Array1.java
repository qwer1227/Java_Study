package array;

public class Array1 {
    public static void main(String[] args){
        // 2x3 2차원 배열

        int[][] arr = new int[2][3]; //행2,열3

        int index = 1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = index;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
