public class Battleship {
    public static void main(String[] args){
//        CreateBoard();
        int[][] numbers = {{44, 45, 16, 50},
                {16, 12, 66, 9},
                {52, 83, 3, 37},
                {56, 61, 69, 61}};
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = 0; j < numbers[i].length - 1; j++){
                if (numbers[i][j] < numbers[i][j + 1]){
                    numbers[i][j] = numbers[i][j] + numbers[i + 1][j];
                    numbers[i + 1][j] = numbers[i + 1][j] / 2;
                }
            }
        }
        int[][] a = numbers;
        System.out.print(a);




    }
//    public static void CreateBoard(){
//        System.out.println("**** Welcome to Battle Ship game ****\n");
//        System.out.println("Right now, the sea is empty.\n");
//        String[][] board = new String[10][10];
//        for (int row = 0; row < board.length; row++){
//            System.out.print(row + "|");
//            for (int col = 0; col < board[row].length; col++){
//                if (board[row][col] == null) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print(board[row][col]);
//                }
//            }
//            System.out.println("|" + row);
//        }
//    }
//    public static void DeployShip(){
//
//    }
}
