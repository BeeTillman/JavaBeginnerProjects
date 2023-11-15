import java.util.Random;
import java.util.Scanner;

class pig {

    public static int roll(){ // Generate a random number
        int min = 1;
        int max = 6;
        return new Random().nextInt(min,max);
    }
    public static void main(String[] args) {
        int playerCount;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of players (2-4): ");
                playerCount = sc.nextInt();
            if (playerCount <= 4 && playerCount >= 2){
                break;
            }
            else{
                System.out.println("There must be between 2 - 4 players.");
            }
        }
    }
}