class Weapon {
    String name;
    int damage;

    Weapon() {
    }

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}