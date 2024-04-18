import java.util.Random;

public class ComputerPlayer {
    public String out() {
        String [] Computer = {"rock", "paper", "scissor"};
        Random randomno = new Random();
        int comp = randomno.nextInt(3);
        String out = Computer[comp];
        //System.out.print(out);
        return out;
    }

}
