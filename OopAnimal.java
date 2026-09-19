import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeSound();

    abstract void performRoutine();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

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

    @Override
    void performRoutine() {
        play();
        play("タバコ");
    }
}

class Axolotl extends Animal {
    public Axolotl(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(getName() + "は「ポコポコ」と水音を立てる。");
    }

    void regenerate(String bodyPart) {
        System.out.println(getName() + "は" + bodyPart + "を素早く再生した。");
    }

    @Override
    void performRoutine() {
        regenerate("しっぽ");
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

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

    @Override
    void performRoutine() {
        race();
        race(10);
    }
}

class AnimalService {
    public void printDivider() {
        System.out.println("=".repeat(25));
    }

    public void runDailyRoutine(List<Animal> animals) {
        for (Animal animal : animals) {

            animal.makeSound();
            animal.performRoutine();
            printDivider();
        }
    }
}

public class OopAnimal {

    public static void main(String[] args) {

        List<Animal> farm = new ArrayList<>();
        farm.add(new Dog("ポチタ"));
        farm.add(new Axolotl("ウパ"));
        farm.add(new Horse("フェラーリ"));
        farm.add(new Dog("ハチ公"));

        AnimalService service = new AnimalService();
        service.runDailyRoutine(farm);

    }
}
