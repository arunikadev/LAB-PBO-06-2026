import java.util.Random;

public class Fruit {
    public String type;
    public int col;
    public int row;
    public Fruit(String type) {
        this.type = type;
        this.row = 0;
        this.col = new Random().nextInt(4);
    }
    public void fall() {
        this.row++;
    }
    public void reset() {
        this.row = 0;
        this.col = new Random().nextInt(4);
    }
}