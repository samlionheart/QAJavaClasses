package day1tutorial;

public class Day1Tutorial {

    public static void main(String[] args) {

        String[] names = {"Mary", "Todd", "John", "man", "Rodger"};

        for (int var = names.length - 1; var >= 0; var--) {
            greet(names[var]);
        }
        
        System.out.println(blackBox(6));
      
        System.out.println(isOdd(10));
        
        displayEvenNumbers(35, 105);
        
        for(int K = 1; K <= 3; K++){
            System.out.println("outer" + K);
            for (int j = 1; j <=5; j++){
                System.out.println("inner" + j);
            }
        }
    }
    private static void generateLotteryNumber(){
        double x = Math.random();
    }

    private static void greet(String name) {
        if (name.equals("man")) {
            System.out.println("Hey " + name + "!");
        } else {
            System.out.println("Hello " + name);
        }
    }
    private static void displayEvenNumbers(int start, int end) {
        for (int k = start; k <= end; k++){
            if (!isOdd(k)){
                System.out.println(k);
            }
        }
    }

    private static int blackBox(int y) {
        return 2 * y;
    }

    private static boolean isOdd(int i) {
        return (i%2 == 1);
    }
}
