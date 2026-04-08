import java.util.Random;

class Boss {
    String name;
    int health;
    int maxHealth;
    Weapon weapon;
    Random rand = new Random();

     Boss() {

    }

    Boss(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.weapon = weapon;
    }

    void attack(Hero hero) {
        int damage = weapon.getDamage();

        if (rand.nextInt(100) < 25) {
            damage *= 2;
            System.out.println("BOSS CRITICAL!");
        }

        hero.health -= damage;
        System.out.println(name + " menyerang (-" + damage + ")");
    }

    void status() {
        System.out.println(name + " HP: " + health + "/" + maxHealth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}