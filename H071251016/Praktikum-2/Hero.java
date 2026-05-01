import java.util.Random;

class Hero {
    String name;
    int health;
    int maxHealth;
    Weapon weapon;
    Random rand = new Random();

    Hero() {
    }

    Hero(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.weapon = weapon;
    }

    void attack(Boss enemy) {
        int damage = weapon.getDamage();

        
        if (rand.nextInt(100) < 50) {
            damage *= 2;
            System.out.println("CRITICAL HIT!");
        }

        enemy.health -= damage;
        System.out.println(name + " menyerang " + enemy.name + " (-" + damage + ")");
    }

    void powerStrike(Boss enemy) {
        int damage = weapon.getDamage() + rand.nextInt(10);

        if (rand.nextInt(100) < 50) {
            damage *= 2;
            System.out.println("CRITICAL POWER STRIKE!");
        }

        enemy.health -= damage;
        System.out.println(name + " menggunakan Power Strike (-" + damage + ")");
    }

    void heal() {
        int heal = 20;

        health += heal;

        
        if (health > maxHealth) {
            health = maxHealth;
        }

        System.out.println(name + " heal +" + heal);
    }

    void status() {
        System.out.println(name + " HP: " + health + "/" + maxHealth);
    }
     public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}