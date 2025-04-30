import java.util.Scanner;

class powerN {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("밑 입력 : ");
        int num = scan.nextInt();
        System.out.print("지수 입력 : ");
        int power = scan.nextInt();
        int powerN = 1;

        if (power == 0) {
            System.out.println("결과 : 1");
            return;
        } else if(power > 0) {
            for (int i = 0; i < power; i++) {
                powerN *= num;
            }
            System.out.println("결과 : " + powerN);
        } else if(power < 0) {
            for (int i = 0; i < -power; i++) {
                powerN *= num;
            }
            System.out.println("결과 : 1 / " + powerN + " = " + (1.0 / powerN));
        }
    }
}