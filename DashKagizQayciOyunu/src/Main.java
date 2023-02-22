import java.util.Scanner;
import java.util.Random;

class PaperRockScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"kagiz", "dash", "qayci"};

        int playerScore = 0;
        int computerScore = 0;
        int rounds = 0;

        System.out.println("Nece raund oynamag istiyirsiniz?");
        int numRounds = input.nextInt();

        while (rounds < numRounds) {
            System.out.println("gedishi edin: kagiz, dash, yoxsa qayci");
            String player = input.next().toLowerCase();

            String computer = options[rand.nextInt(3)];
            System.out.println("Jacanin gedishi " + computer);

            if (player.equals(computer)) {
                System.out.println("Hec-Hece!");
            } else if (player.equals("kagiz") && computer.equals("dash")) {
                System.out.println("Siz qalib geldiz! Kagiz Dashi Bukdu.");
                playerScore++;
            } else if (player.equals("dash") && computer.equals("qayci")) {
                System.out.println("Siz qalib geldiz! Dash qaycini sindirdi.");
                playerScore++;
            } else if (player.equals("qayci") && computer.equals("kagiz")) {
                System.out.println("Siz qalib geldiz! Qayci kagizi kesdi.");
                playerScore++;
            } else {
                System.out.println("Java qalib geldi.");
                computerScore++;
            }

            rounds++;
        }

        System.out.println("Final xali: Siz " + playerScore + " - " + computerScore + " Java");
        if (playerScore > computerScore) {
            System.out.println("Siz oyunu UDDUZ!");
        } else if (playerScore < computerScore) {
            System.out.println("Java oyunu UDDU.");
        } else {
            System.out.println("Oyun Hec-Hece Oldu.");
        }
    }
}
