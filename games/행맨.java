import java.util.Scanner;
import java.util.Random;

class HangMan {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        String words[] = {"apple", "banana", "carrot", "durian", "eggplant", "fig", "grape", "honey", "icecream", "jambalaya", "kitkat", "lemon", "mentos", "nachos", "orange", "pickle", "quesadilla", "radish", "steak", "toast", "udon", "vanila", "watermelon", "xiaolongbao", "yogurt", "zucchini"};
        String word = words[ran.nextInt(words.length)];
        String outputWord = "_".repeat(word.length());
        int wrongGuesses = 0;
        int i = 0;
        String inputWords[] = new String[100];

        //System.out.println(word);       디버깅용

        while (true) {
            System.out.print("글자 / 단어 입력 : ");
            String inputWord = scan.next();
            inputWords[i] = inputWord;

            if (inputWord.length() == 1) {
                StringBuilder sb = new StringBuilder(outputWord);
                boolean found = false;

                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == inputWord.charAt(0) && outputWord.charAt(j) == '_') {
                        sb.setCharAt(j, inputWord.charAt(0));
                        found = true;
                    }
                }

                outputWord = sb.toString();

                if (found) {
                    System.out.println(inputWord + "는 맞습니다!");
                } else {
                    wrongGuesses++;
                    System.out.println(inputWord + "는 틀렸습니다!");
                }
            } else if (inputWord.equals(word)) {
                outputWord = word;
                System.out.println("정답입니다!");
                break;
            }

            System.out.println(outputWord);

            switch (wrongGuesses) {
                case 0:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    break;
                case 1:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    break;
                case 2:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |     |");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    break;
                case 3:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    break;
                case 4:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |");
                    System.out.println(" |");
                    System.out.println("_|_");
                    break;
                case 5:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |    /");
                    System.out.println(" |");
                    System.out.println("_|_");
                    break;
                case 6:
                    System.out.println("  _____");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |    / \\");
                    System.out.println(" |");
                    System.out.println("_|_");
                    System.out.println("게임 오버!");
                    break;
            }

            if (wrongGuesses >= 6) {
                System.out.println("게임 오버! 정답은 " + word + " 입니다");
                break;
            }

            i++;
        }
    }
}
