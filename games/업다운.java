import java.util.Scanner;
import java.util.Random;

class UpDown{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int ranNum = ran.nextInt(100) + 1;

        while (true) {
            System.out.print("수 입력 : ");
            int num = scan.nextInt();
            if (num > ranNum) {
                System.out.println("다운");
            } else if (num < ranNum) {
                System.out.println("업");
            } else if (num == ranNum) {
                System.out.println("정답");
                break;
            }
        }
    }
}
