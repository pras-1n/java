public class VirtualPet {
    
    // 1. Attribute: The data every pet will have
    String name;
    int hunger;

    // 2. Constructor: The setup instruction for building a new pet
    // Runs exactly ONCE when you type the keyword "new"
    public VirtualPet(String petName) {
        name = petName;
        hunger = 5;
        System.out.println(name + "というペットが生まれた!");
    }

    //3. Methods: The action your pet can take
    public void feed() {
        hunger = hunger - 2;
        if (hunger < 0) {
            hunger = 0;
        }
        System.out.println(name + "がおやつを食べた。空腹度は" + hunger + "になった。");
    }

    public void play() {
        hunger = hunger + 2;
        System.out.println(name + "が「取ってこい」をして遊んだ！空腹度は" + hunger + "まで上がった。");
    }

    // Main method
    public static void main(String[] args) {
        VirtualPet cat = new VirtualPet("イト");
        VirtualPet dog= new VirtualPet("ルドルフ");

        System.out.println("\n--- イトと遊ぶ ---");
        cat.play();
        cat.play();
        cat.feed();

        System.out.println("\n--- ルドルフと遊ぶ ---");
        dog.feed();
        dog.feed();
    }

}
