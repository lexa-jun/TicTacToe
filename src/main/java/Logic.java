import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {
    public char [][] field =
            {{'+','+','+'},
             {'+','+','+'},
             {'+','+','+'}};// Field creation

    public void PrintField() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(field[i][j]);
            }
        }
    } //Displaying the playing field on the screen

    public void HumanMove() throws IOException {
        int x = -1, y = -1;
        System.out.println("Enter y (1..3):");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine())-1;
        System.out.println("Enter x (1..3)");
        y = Integer.parseInt(br.readLine())-1;
        while (field[x][y] == '0' || field[x][y] == 'X' || x < 0 || x > 2 || y < 0 || y > 2) {
            System.out.println("Enter y: ");
            x = Integer.parseInt(br.readLine())-1;
            System.out.println("Enter x: ");
            y = Integer.parseInt(br.readLine())-1;
        }
        field[x][y] = 'X';
    } // Human stroke

    public static void CompRondom(){


    }

}
