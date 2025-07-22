package problems;
import java.util.*;

public class NoDupMemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> memo = new LinkedHashSet<>();     // 중복 자동으로 제거해주고 입력 순서 저장해주는 자료구조
        while (true) {
            System.out.print("단어를 입력하세요 : ");
            String input = scan.nextLine();
            if (input.equals("끝")) {
                for (String i : memo) {
                    System.out.println(i);
                }
                break;
            }
            memo.add(input);
        }
        scan.close();
    }
}
