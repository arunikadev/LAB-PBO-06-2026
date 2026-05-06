import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameState myStats = new GameState();
        // Player p1 = Player("Farmer", myStats);
        Player p1 = new Player("Yayat", myStats);
        Fruit apple = new Fruit("Apple");

        System.out.println("GAME START!");
        pembatas();
        while (p1.stats.lives > 0) {
            render(p1, apple);
            System.out.print("Score: " + p1.stats.score + " | Lives: " + p1.stats.lives + " | Move (a/d): ");
            char input = sc.next().charAt(0);            
            p1.move(input);
            apple.fall();
            p1.checkCatch(apple);
            pembatas();
        }
        System.out.println("GAME OVER! Final Score: " + p1.stats.score);
    }

    public static void pembatas() {
        System.out.println("=====================================");
    }

    public static void render(Player p, Fruit f) {
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 4; c++) {
                if (r == f.row && c == f.col) System.out.print(" O ");
                else if (r == 5 && c == p.position) System.out.print("[U]");
                else System.out.print(" . ");
            }
            System.out.println();
        }
    }
}