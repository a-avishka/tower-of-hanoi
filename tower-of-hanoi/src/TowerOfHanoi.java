import java.util.Scanner;

public class TowerOfHanoi {
    private static int counter = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Objective of the game is to move all disks to the third tower without placing a larger disk on top of a smaller disk.");
        System.out.println("Enter the number of disks: ");
        int discs = sc.nextInt();
        System.out.println("Enter the destination Tower: (Usually 3) ");
        int destPeg = sc.nextInt();

        while ((destPeg!=2) && (destPeg!=3)){
            System.out.println("Please enter either 2 or 3 as destination Tower!");
            destPeg = sc.nextInt();
        }

        System.out.println();



        Tower(discs, 1, destPeg, (destPeg == 3 ? 2 : 3)); //The game body

        System.out.println();
        System.out.println("That's it, now all discs are in Tower " + destPeg);

    }

    private static void Tower(int n, int sourcePeg, int destinationPeg, int sparePeg) {

        if (n == 1) {
            System.out.println(counter + ": Move disc from Tower " + sourcePeg + " to Tower " + destinationPeg);
            counter++;

        } else {
            Tower(n - 1, sourcePeg, sparePeg, destinationPeg);
            System.out.println(counter + ": Move disc from Tower " + sourcePeg + " to Tower " + destinationPeg);
            counter++;
            Tower(n - 1, sparePeg, destinationPeg, sourcePeg);
        }
    }
}
