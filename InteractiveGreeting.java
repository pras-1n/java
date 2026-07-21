import java.util.Scanner;

public class InteractiveGreeting {
    public static void main(String[] args) {

        //create a scanner object to read what user types in the terminal
        Scanner input = new Scanner(System.in);

        System.out.print("お名前を入力してください：");
        String name = input.nextLine(); //pauses and waits for user to type text

        System.out.print("ご年齢を入力してください：");
        int age = input.nextInt();

        int dogYears = age * 7;

        System.out.println("\n--- ジャーン ---");
        System.out.println("こんにちは" + name + "さん、はじめまして。");
        System.out.println("もし" + name + "さんが犬だったら、年齢は"+dogYears+"歳になるんです。");

        input.close();
    }
}
