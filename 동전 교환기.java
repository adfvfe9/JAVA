import java.util.Scanner;

class moneyChanger {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("돈을 입력하세요 : ");
        int money = scan.nextInt();
        int moneys = 0;

        if (money >= 50000) {
            for (int unused = 0; money >= 50000; unused++) {
                money -= 50000;
                moneys++;
            }
            System.out.println("50000원 : " + moneys + "장");
        }
        if (money >= 10000) {
            moneys = 0;
            for (int unused = 0; money >= 10000; unused++) {
                money -= 10000;
                moneys++;
            }
            System.out.println("10000원 : " + moneys + "장");
        }
        if (money >= 5000) {
            moneys = 0;
            for (int unused = 0; money >= 5000; unused++) {
                money -= 5000;
                moneys++;
            }
            System.out.println("5000원 : " + moneys + "장");
        }
        if (money >= 1000) {
            moneys = 0;
            for (int unused = 0; money >= 1000; unused++) {
                money -= 1000;
                moneys++;
            }
            System.out.println("1000원 : " + moneys + "장");
        }
        if (money >= 500) {
            moneys = 0;
            for (int unused = 0; money >= 500; unused++) {
                money -= 500;
                moneys++;
            }
            System.out.println("500원 : " + moneys + "개");
        }
        if (money >= 100) {
            moneys = 0;
            for (int unused = 0; money >= 100; unused++) {
                money -= 100;
                moneys++;
            }
            System.out.println("100원 : " + moneys + "개");
        }
        if (money >= 50) {
            moneys = 0;
            for (int unused = 0; money >= 50; unused++) {
                money -= 50;
                moneys++;
            }
            System.out.println("50원 : " + moneys + "개");
        }
        if (money >= 10) {
            moneys = 0;
            for (int unused = 0; money >= 10; unused++) {
                money -= 10;
                moneys++;
            }
            System.out.println("10원 : " + moneys + "개");
        }
        if (money > 0) {
            moneys = 0;
            for (int unused = 0; money > 0; unused++) {
                money -= 1;
                moneys++;
            }
            System.out.println("남는 돈 : " + moneys + "원");
        } else {
            return;
        }
    }
}