import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe{
    public static int row;
    public static int col;
    public static boolean isGameOVer=false;
    public static boolean isXTurn=true;
    public static Character[][] board = new Character[3][3];

    public static void drawBoard(){
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[j][i]==null){
                    System.out.print(' ');
                } else {
                    System.out.print(board[j][i]);
                }

                if(j<board[0].length-1){
                    System.out.print('|');
                }    
            }
            System.out.println();
            if(i<board.length-1){
                    System.out.println("-----");
                }
        }
    }

    public static void play(int col,int row){
        if (isXTurn){
            board[col][row] = 'X'; 
            isXTurn = false;   
        } else {
            board[col][row] = 'O';    
            isXTurn = true;
        }
        
    }

    public static void checkIfGameOver(){

        //Check if O won
        Character toCheck = 'O';
        boolean tracker =true;

        //check rows

        //check columns

        //check diagonals

        //Check if X won
        
    }


    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        while(!isGameOVer){
            System.out.println();
            col = scan.nextInt();
            row = scan.nextInt();
            play(col,row);
            drawBoard();
            System.out.println();
        }

        
    } 
}
