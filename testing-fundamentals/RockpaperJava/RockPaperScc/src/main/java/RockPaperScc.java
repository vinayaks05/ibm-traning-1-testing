import java.util.Random;
import java.util.Scanner;

public class RockPaperScc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 Enter name: ");
        String name1 = input.nextLine();
        System.out.println("Player 2 Enter name(leave blank if you want to play with computer): ");
        String name2 = input.nextLine();
        String player2 = "";
        if (name2.equals("")){
            name2 = "computer";
            ComputerPlayer obj = new ComputerPlayer();
            player2 = obj.out();
        }
        // Take input
        System.out.println(name1 + " Enter input: ");
        String player1 = input.nextLine();
        if (name2 != "computer"){
            System.out.println(name2 + " Enter input: ");
            player2 = input.nextLine();
        }
        System.out.println(name1 + " entered " + player1);
        System.out.println(name2 + " entered " + player2);
        if (player1.toUpperCase().equals(player2.toUpperCase())){
            System.out.println("It's a draw");
        }
        if ((player1.toUpperCase().equals("ROCK") && player2.toUpperCase().equals("PAPER")) ||
                (player1.toUpperCase().equals("PAPER") && player2.toUpperCase().equals("SCISSOR")) ||
                (player1.toUpperCase().equals("SCISSOR") && player2.toUpperCase().equals("ROCK"))){
            System.out.println(name2 + " wins ");
        }
        /*else {
            System.out.println(name1 + " wins ");
        }*/

        else if ((player2.toUpperCase().equals("ROCK") && player1.toUpperCase().equals("PAPER")) ||
                (player2.toUpperCase().equals("PAPER") && player1.toUpperCase().equals("SCISSOR")) ||
                (player2.toUpperCase().equals("SCISSOR") && player1.toUpperCase().equals("ROCK"))){
            System.out.println(name1 + " wins ");
        }
        /*else {
            System.out.println(name2 + " wins ");
        }*/
    }
}
