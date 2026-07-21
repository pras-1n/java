import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;

        int userGuess = 0;
        int attempts = 0;

        System.out.println("ようこそ、数字当てゲームへ！");
        System.out.println("1から100の数学を1つ思い浮かべています。");

        while (userGuess != secretNumber) {
            System.out.print("予想した数学を入力してください：");
            userGuess = input.nextInt();
            attempts++; //adds 1 to the attempts variable

            if (userGuess < secretNumber) {
                System.out.println("小さすぎ！もう一度入力してください。\n");
            }
            else if (userGuess > secretNumber){
                System.out.println("大きすぎ！もう一度入力してください。\n");
            }
            else {
                System.out.println("\n 正解！当たりです。");
                System.out.println(attempts + "回て当てました");
            }
        }

        input.close();
    }
}
