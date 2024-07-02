package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        String [][] name = {
                {"kim","jeong","yoon"},
                {"geun","seong","deok"},
                {"0","min","jin"}
        };

        for(int i=0; i<name.length; i++) {
            System.out.println("");
            for(int j=0; j<name[i].length; j++) {
                System.out.println(name[i][j]);
            }
        }
    }


}
