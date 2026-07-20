import java.util.Scanner;

public class InteractiveGreeting {
    public static void main(String[] args) {

        //create a scanner object to read what user types in the terminal
        Scanner input = new Scanner(System.in);

        System.out.print("お名前をご入力いただけますと幸いです");
        String name = input.nextLine(); //pauses and waits for user to type text

        System.out.print("ご年齢をご入力賜りますようお願い申し上げます。");
        int age = input.nextInt();

        int dogYears = age * 7;

        System.out.println("\n--- お待たせいたしました ---");
        System.out.println(name + "様、ようこそお越しくださいました。");
        System.out.println("恐れながら申し上げますと、もし犬でいらっしゃいましたら、ご年齢は"+dogYears+"歳となります。");

        input.close();
    }
}
