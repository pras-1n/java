class Hero {
    String name;
    int health;
    int attackDamage;
    boolean isAlive;

    //spawn mechanic (constructor)
    public Hero(String heroName, int startingHealth, int damageCount) {
        name = heroName;
        health = startingHealth;
        attackDamage = damageCount;
        isAlive = true;
    }

    //damage and kill mechanic
    public void takeDamage(int damage) {
        if (isAlive == false) {
            System.out.println(name + "はもう倒れている！");
            return;
        }

        health = health - damage;
        System.out.println( name + "は" + damage + "のダメージを受けた！(残り体力：" + health + ")");

        if (health <= 0) {
            health = 0;
            isAlive = false;
            System.out.println("💀　" + name + "が倒された！");
        }
    }

    public void heal(int amount ) {
        if (isAlive == true) {
            health = health + amount;
            System.out.println("💚　" + name + "の体力が" + amount + "回復した！(残り体力：" + health + ")");
        } else {
            System.out.println("倒れたヒーローは回復できない");
        }
    }

    //object interaction: one hero attacks another
    public void attack(Hero target) {
        if(isAlive == true) {
            System.out.println("\n⚔️" + name + "が" + target.name + "を攻撃する！");
            target.takeDamage(attackDamage);
        }
    }
}

public class SuperHeroArena {
    public static void main(String[] args) {
        Hero[] roster = {
            new Hero("Batman",  100,  25),
            new Hero("Spiderman",  60,  15),
            new Hero("Captain America",  85,  20),
            new Hero("Daredevil",  50,  30),
            new Hero("One Punch Man",  2147483647,  2147483647)
        };

        System.out.println("--- スーパーヒーローアレナへようこそ！ ---");
        System.out.println("使用可能なヒーロー：" + roster.length);

        Hero bruce = roster[0];
        Hero peter = roster[1];
        Hero steve = roster[2];
        Hero matt = roster[3];
        Hero saitama = roster[4];

        bruce.attack(peter);
        steve.attack(bruce);

        peter.heal(10);

        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);
        steve.attack(saitama);

        saitama.attack(steve);

        steve.heal(50);
    }   
}