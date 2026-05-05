public class Player {
    public String name;
    public int position; 
    public GameState stats; 
    public Player(String name, GameState stats) {
        this.name = name;
        this.stats = stats;
        this.position = 1;
    }

    public Player() {
        this.name = "Player";
    }

    public void move(char dir) {
        if (dir == 'a' && position > 0) position--;
        if (dir == 'd' && position < 3) position++;
    }

    public void checkCatch(Fruit f) {
        if (f.row == 5) {
            if (this.position == f.col) {
                this.stats.score++;
            } else {
                System.out.println(">> " + name + " MISSED! <<");
                this.stats.lives--;
            }
            f.reset();
        }
    }
}