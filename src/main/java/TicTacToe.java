import java.io.IOException;

public class TicTacToe {
    public static void main(String[] args) throws IOException {
        Logic log = new Logic();

        System.out.println("Game Started");

        log.PrintField();

        while (log.CheckGame() == ' ' && log.canMove()){
            log.HumanMove();
            log.CompRondom();
            log.PrintField();
        }if(log.CheckGame() == 'X'){
            System.out.println("YOU WIN");
        }if(log.CheckGame() == '0'){
            System.out.println("YOU LOSE");
        }if(log.CheckGame() == ' ' && !log.canMove()){
            System.out.println("STANDOFF");
        }
    }
}
