public class Battleship {
    public static void main(String[] args){
        CreateBoard();

    }
public static void CreateBoard(){
    System.out.println("**** Welcome to Battle Ship game ****\n");
    System.out.println("Right now, the sea is empty.\n");
    String[][] board = new String[10][10];
    for (int row = 0; row < board.length; row++){
        System.out.print(row + "|");
        for (int col = 0; col < board[row].length; col++){
            if (board[row][col] == null) {
                   System.out.print(" ");
               } else {
                  System.out.print(board[row][col]);
              }
           }
           System.out.println("|" + row);
        }
   }
    public static void DeployShip(){

    }
}
