public class Main {
    //fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 33, 54
    //difference 0, 1, 1, 2, 3,
    // sum      1, 2, 4, 7, 12, 20
    public static int fibonacci(int num) {
        if (num == 0 || num == 1){
            return num;
        }
        return 1 + fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}