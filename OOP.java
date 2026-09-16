abstract class Animal {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    abstract void makeSound();
}

class Dog extends Animal {
    @Override 
    void makeSound() {
        System.out.println(getName() + "は「ワンワン」と鳴く。");
    }

    void play() {
        System.out.println(getName() + "は棒を取ってくる。");
    }

    void play(String item) {
        System.out.println(getName() + "は" + item + "を取ってくる。");
    }
}

public class OOP {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("ポチタ");
        myDog.makeSound();
        myDog.play();
        myDog.play("タバコ");
    }
}
