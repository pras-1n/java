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

class Axolotl extends Animal {
    @Override 
    void makeSound() {
        System.out.println(getName() + "は「ポコポコ」と水音を立てる。");
    }

    void regenerate(String bodyPart) {
        System.out.println(getName() + "は" + bodyPart + "を素早く再生した。");
    }
}

class Horse extends Animal {
    @Override 
    void makeSound() {
        System.out.println(getName() + "は「ヒヒーン」といななく。");
    }

    void race() {
        System.out.println(getName() + "は走って戻る。");
    }

    void race(int distance) {
        System.out.println(getName() + "は" + distance + "kmを走る。");
    }
}

public class OopAnimal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("ポチタ");
        myDog.makeSound();
        myDog.play();
        myDog.play("タバコ");

        System.out.println("--------------------");

        Axolotl myAxolotl = new Axolotl();
        myAxolotl.setName("ウパ");
        myAxolotl.makeSound();
        myAxolotl.regenerate("しっぽ");

        System.out.println("--------------------");

        Horse myHorse = new Horse();
        myHorse.setName("フェラーリ");
        myHorse.makeSound();
        myHorse.race();
        myHorse.race(10);
    }
}
