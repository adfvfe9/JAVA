import java.util.Scanner;

class moneyChanger {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("돈을 입력하세요 : ");
        int money = scan.nextInt();
        int moneys = 0;
        int[] danwi = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        String[] won = {"장", "장", "장", "장", "개", "개", "개", "개", "원"};

        for (int i = 0; money > 0; i++) {
            moneys = 0;
            for (int j = 0; money >= danwi[i]; j++) {
                money -= danwi[i];
                moneys++;
            }
            if (moneys != 0) {
                System.out.println(danwi[i] + "원 : " + moneys + won[i]);
            }
        }
    }
}