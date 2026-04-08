import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {

            Weapon sword = new Weapon("Sword", 15);
            Weapon claw = new Weapon("Claw", 20);

            Hero hero = new Hero("Knight", 100, sword);
            Boss boss = new Boss("Dragon", 120, claw);

            int turn = 1;

            while (hero.health > 0 && boss.health > 0) {
                System.out.println("\n=== TURN " + turn + " ===");

                hero.status();
                boss.status();

                System.out.println("1. Attack");
                System.out.println("2. Power Strike");
                System.out.println("3. Heal");
                System.out.print("Pilih: ");

                int pilih = input.nextInt();

                if (pilih == 1) hero.attack(boss);
                else if (pilih == 2) hero.powerStrike(boss);
                else if (pilih == 3) hero.heal();
                else System.out.println("Pilihan salah!");

                if (boss.health <= 0) break;

                System.out.println("\nTurn Boss...");
                boss.attack(hero);

                turn++;
            }

            System.out.println("\n=== GAME OVER ===");
            if (hero.health > 0) System.out.println("KAMU MENANG ");
            else System.out.println("KAMU KALAH ");

            
            System.out.print("Main lagi? (y/n): ");
            String jawab = input.next();
            
            if (jawab.equalsIgnoreCase("y")) {
                playAgain = true;
            } else if (jawab.equalsIgnoreCase("n")) {
                playAgain = false;
            } else {
                System.out.println("Input tidak valid, game berhenti.");        
                playAgain = false;
            }
        }

        input.close();
    }
}