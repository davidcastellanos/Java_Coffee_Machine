import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int refNum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num != 0) {
                refNum = Math.max(num, refNum);
            } else {
                break;
            }
        }

        System.out.println(refNum);
    }
}